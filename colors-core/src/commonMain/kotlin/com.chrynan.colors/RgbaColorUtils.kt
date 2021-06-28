@file:Suppress("unused")

package com.chrynan.colors

import com.chrynan.colors.space.ColorModel
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min
import kotlin.math.round

/**
 * Retrieves the SRGB Color [Int] value for this color component. This returns a color [Int] value
 * between 0 and 255.
 */
val RgbaColor.redInt: Int
    get() =
        coerceInRange(
            value = red,
            newMin = 0f,
            newMax = 255f,
            oldMin = colorSpace.getMinValue(0),
            oldMax = colorSpace.getMaxValue(0)
        ).toInt()
            .coerceInSRGBColorRange()

/**
 * Retrieves the SRGB Color [Int] value for this color component. This returns a color [Int] value
 * between 0 and 255.
 */
val RgbaColor.greenInt: Int
    get() =
        coerceInRange(
            value = green,
            newMin = 0f,
            newMax = 255f,
            oldMin = colorSpace.getMinValue(1),
            oldMax = colorSpace.getMaxValue(1)
        ).toInt()
            .coerceInSRGBColorRange()

/**
 * Retrieves the SRGB Color [Int] value for this color component. This returns a color [Int] value
 * between 0 and 255.
 */
val RgbaColor.blueInt: Int
    get() =
        coerceInRange(
            value = blue,
            newMin = 0f,
            newMax = 255f,
            oldMin = colorSpace.getMinValue(2),
            oldMax = colorSpace.getMaxValue(2)
        ).toInt()
            .coerceInSRGBColorRange()

/**
 * Retrieves the [Int] opacity value for this [Color]. This is similar to the
 * [Color.alpha] value but is an [Int] in the range of 0 to 255, instead of a
 * [Float] in the range of 0 to 1.
 */
val RgbaColor.alphaInt: Int
    get() = coerceInRange(
        value = alpha,
        newMin = 0f,
        newMax = 255f,
        oldMin = colorSpace.getMinValue(3),
        oldMax = colorSpace.getMaxValue(3)
    ).toInt()
        .coerceInSRGBColorRange()

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
 * Converts this [RgbaColor] to a Hexadecimal [String] representation. For example, the Color
 * White, RgbaColor(red = 255, green = 255, blue = 255, alpha = 255), would return a [String]
 * representation similar to the following: '#FFFFFF'.
 *
 * @param [includePrefix] Whether to include the Hexadecimal prefix character, '#', in the output.
 *
 * @param [uppercase] Whether all of the letters in the output should be uppercase.
 *
 * @param [alwaysIncludeAlpha] Whether to include the alpha component even when the color is
 * completely opaque.
 */
fun RgbaColor.toHexString(
    includePrefix: Boolean = true,
    uppercase: Boolean = true,
    alwaysIncludeAlpha: Boolean = false
): String {
    val alphaHexString = componentToHexString(alphaInt)
    val redHexString = componentToHexString(redInt)
    val greenHexString = componentToHexString(greenInt)
    val blueHexString = componentToHexString(blueInt)

    val result = buildString {
        if (includePrefix) {
            append('#')
        }

        if (alwaysIncludeAlpha || alphaInt != 255) {
            append(alphaHexString)
        }

        append(redHexString)
        append(greenHexString)
        append(blueHexString)
    }

    return if (uppercase) result.uppercase() else result.lowercase()
}

private fun componentToHexString(component: Int): String {
    val hex = component.toString(16)

    return if (hex.length == 1) "0$hex" else hex
}
