@file:Suppress("MemberVisibilityCanBePrivate", "unused")

package com.chrynan.colors

import com.chrynan.colors.space.ColorSpace
import com.chrynan.colors.space.ColorSpaces

/**
 * Retrieves the [Int] opacity value for this [Color]. This is similar to the
 * [Color.alpha] value but is an [Int] in the range of 0 to 255, instead of a
 * [Float] in the range of 0 to 1.
 */
val Color.opacityInt: Int
    get() = (255f * alpha).toInt().coerceIn(Color.MIN_INT_OPACITY, Color.MAX_INT_OPACITY)

/**
 * Creates a [ColorInt] from this [Int] value.
 */
fun Int.toColorInt(): ColorInt = ColorInt(value = this)

/**
 * Creates a [ColorLong] from this [Long] value.
 */
fun Long.toColorLong(): ColorLong = ColorLong(value = this)

/**
 * Converts this [Int] to an [BaseRgbaColor].
 *
 * Note that this [Int] is expected to be valid.
 */
@ExperimentalUnsignedTypes
fun Int.toColor(): BaseRgbaColor = Color(int = this)

/**
 * Converts this [ColorInt] to an [BaseRgbaColor].
 *
 * Note that this [ColorInt] is expected to be valid.
 */
@ExperimentalUnsignedTypes
fun ColorInt.toColor(): BaseRgbaColor = Color(colorInt = this)

/**
 * Converts this [Long] to an [BaseRgbaColor].
 *
 * Note that this [Long] is expected to be valid.
 */
@ExperimentalUnsignedTypes
fun Long.toColor(): BaseRgbaColor = Color(long = this)

/**
 * Converts this [ColorLong] to an [BaseRgbaColor].
 *
 * Note that this [ColorLong] is expected to be valid.
 */
@ExperimentalUnsignedTypes
fun ColorLong.toColor(): Color = Color(colorLong = this)

/**
 * Converts this [Color] into an [RgbaColor] performing any conversion
 * if necessary.
 */
@ExperimentalUnsignedTypes
fun Color.toRgbaColor(): BaseRgbaColor = Color(colorInt = this.colorInt)

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

    val interpolated = Color(
        alpha = lerp(startAlpha, endAlpha, fraction),
        red = lerp(startL, endL, fraction),
        green = lerp(startA, endA, fraction),
        blue = lerp(startB, endB, fraction),
        colorSpace = colorSpace
    )

    return interpolated.convert(stop.colorSpace)
}

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
