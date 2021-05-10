@file:Suppress("MemberVisibilityCanBePrivate", "unused")

package com.chrynan.colors

import com.chrynan.colors.space.ColorModel
import com.chrynan.colors.space.ColorSpace
import com.chrynan.colors.space.ColorSpaces
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min
import kotlin.math.round

/**
 * Retrieves the [Int] opacity value for this [Color]. This is similar to the
 * [Color.alpha] value but is an [Int] in the range of 0 to 255, instead of a
 * [Float] in the range of 0 to 1.
 */
val Color.opacityInt: Int
    get() = (255f * alpha).toInt().coerceIn(Color.MIN_INT_OPACITY, Color.MAX_INT_OPACITY)

/**
 * Retrieves the Hue, or H, value from the HSL Color Space for this [RgbaColor].
 */
val RgbaColor.hue: Float
    get() = toHslComponents()[0]

/**
 * Retrieves the Saturation, or S, value from the HSL Color Space for this [RgbaColor].
 */
val RgbaColor.saturation: Float
    get() = toHslComponents()[1]

/**
 * Retrieves the Lightness, or L, value from the HSL Color Space for this [RgbaColor].
 */
val RgbaColor.lightness: Float
    get() = toHslComponents()[2]

/**
 * Creates a [ColorInt] from this [Int] value.
 */
fun Int.toColorInt(): ColorInt = ColorInt(value = this)

/**
 * Creates a [ColorLong] from this [Long] value.
 */
fun Long.toColorLong(): ColorLong = ColorLong(value = this)

/**
 * Converts this [Int] to an [RgbaColor].
 *
 * Note that this [Int] is expected to be valid.
 */
@ExperimentalUnsignedTypes
fun Int.toColor(): RgbaColor = Color(int = this)

/**
 * Converts this [ColorInt] to an [RgbaColor].
 *
 * Note that this [ColorInt] is expected to be valid.
 */
@ExperimentalUnsignedTypes
fun ColorInt.toColor(): RgbaColor = Color(colorInt = this)

/**
 * Converts this [Long] to an [RgbaColor].
 *
 * Note that this [Long] is expected to be valid.
 */
@ExperimentalUnsignedTypes
fun Long.toColor(): RgbaColor = Color(long = this)

/**
 * Converts this [ColorLong] to an [Color].
 *
 * Note that this [ColorLong] is expected to be valid.
 */
@ExperimentalUnsignedTypes
fun ColorLong.toColor(): Color = Color(colorLong = this)

/**
 * Linear interpolate between two [Colors][Color], [start] and [stop] with [fraction] fraction
 * between the two. The [ColorSpace] of the result is always the [ColorSpace][Color.colorSpace]
 * of [stop]. [fraction] should be between 0 and 1, inclusive.
 */
@ExperimentalUnsignedTypes
fun lerp(start: Color, stop: Color, fraction: Float): Color {
    require(fraction in 0f..1f) {
        "Provided fraction should be in between 0f and 1f."
    }

    val colorSpace = ColorSpaces.OK_LAB
    val startColor = start.convert(colorSpace)
    val endColor = stop.convert(colorSpace)
    val startAlpha = startColor.alpha
    val startL = startColor.component1()
    val startA = startColor.component2()
    val startB = startColor.component3()
    val endAlpha = endColor.alpha
    val endL = endColor.component1()
    val endA = endColor.component2()
    val endB = endColor.component2()

    val interpolated = RgbaColor(
        alpha = lerp(startAlpha, endAlpha, fraction),
        red = lerp(startL, endL, fraction),
        green = lerp(startA, endA, fraction),
        blue = lerp(startB, endB, fraction),
        colorSpace = colorSpace
    )

    return interpolated.convert(stop.colorSpace)
}

/**
 * Converts this [Color] to a [FloatArray] of HSL Color components. The resulting [FloatArray]
 * should have a size of 3 for the H (Hue), S (Saturation), and L (Lightness) components.
 */
fun RgbaColor.toHslComponents(): FloatArray {
    val hsl = FloatArray(3)

    // Get the RGBA Color version of this Color.
    val rgbaColor = if (colorSpace.model == ColorModel.RGB) this else toRgbaColor()

    // Convert the color ranges from 0-255 to 0-1.
    val rf = rgbaColor.component1() / 255f
    val gf = rgbaColor.component2() / 255f
    val bf = rgbaColor.component3() / 255f

    val max: Float = max(rf, max(gf, bf))
    val min: Float = min(rf, min(gf, bf))
    val deltaMaxMin = max - min

    val h: Float
    val s: Float
    val l = (max + min) / 2f

    if (max == min) {
        // Monochromatic
        s = 0f
        h = s
    } else {
        h = when (max) {
            rf -> (gf - bf) / deltaMaxMin % 6f
            gf -> (bf - rf) / deltaMaxMin + 2f
            else -> (rf - gf) / deltaMaxMin + 4f
        }

        s = deltaMaxMin / (1f - abs(2f * l - 1f))
    }

    hsl[0] = h * 60f % 360f
    hsl[1] = s
    hsl[2] = l

    return hsl
}

/**
 * Converts the provided [FloatArray] of HSL Color Components to an [RgbaColor].
 *
 * Note that an exception is thrown if the provided [FloatArray] size is not 3.
 */
@ExperimentalUnsignedTypes
fun convertHslComponentsToColor(hsl: FloatArray): RgbaColor {
    require(hsl.size == 3) {
        "There must be exactly three components for an HSL component FloatArray to be converted into a Color."
    }

    val h = hsl[0]
    val s = hsl[1]
    val l = hsl[2]

    val c: Float = (1f - abs(2 * l - 1f)) * s
    val m = l - 0.5f * c
    val x: Float = c * (1f - abs(h / 60f % 2f - 1f))
    val hueSegment = h.toInt() / 60

    var r = 0f
    var g = 0f
    var b = 0f

    when (hueSegment) {
        0 -> {
            r = round(255f * (c + m))
            g = round(255f * (x + m))
            b = round(255f * m)
        }
        1 -> {
            r = round(255f * (x + m))
            g = round(255f * (c + m))
            b = round(255f * m)
        }
        2 -> {
            r = round(255f * m)
            g = round(255f * (c + m))
            b = round(255f * (x + m))
        }
        3 -> {
            r = round(255f * m)
            g = round(255f * (x + m))
            b = round(255f * (c + m))
        }
        4 -> {
            r = round(255f * (x + m))
            g = round(255f * m)
            b = round(255f * (c + m))
        }
        5, 6 -> {
            r = round(255f * (c + m))
            g = round(255f * m)
            b = round(255f * (x + m))
        }
    }

    r = max(0f, min(255f, r))
    g = max(0f, min(255f, g))
    b = max(0f, min(255f, b))

    return RgbaColor(red = r, green = g, blue = b)
}

/**
 * Retrieves a [Float], in the range of 0.0f to 1.0f, indicating the amount of contrast between
 * this [Color] and the provided [other] [Color]. A value of 0.0f indicates the lowest contrast
 * value, and a value of 1.0f indicates the highest contrast value.
 *
 * Note that this compares the [Color.luminance] values of the [Color]s.
 *
 * @see [Color.luminance]
 */
fun Color.contrast(other: Color): Float =
    abs(luminance() - other.luminance()).coerceIn(0.0f, 1.0f)

/**
 * Linearly interpolate between [start] and [stop] with [fraction] fraction between them.
 */
internal fun lerp(start: Float, stop: Float, fraction: Float): Float =
    (1 - fraction) * start + fraction * stop

/**
 * Coerces this [Int] value within the SRGB Color Range of 0 to 255.
 */
internal fun Int.coerceInSRGBColorRange(): Int = this.coerceIn(0, 255)

/**
 * Coerces this [Float] value within the SRGB Color Range of 0f to 255f.
 */
internal fun Float.coerceInSRGBColorRange(): Float = this.coerceIn(0f, 255f)
