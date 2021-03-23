@file:Suppress("FunctionName")

package com.chrynan.colors

import com.chrynan.colors.space.ColorModel
import com.chrynan.colors.space.ColorSpace
import com.chrynan.colors.space.ColorSpaces
import com.chrynan.colors.space.Float16
import kotlin.math.max
import kotlin.math.min

@ExperimentalUnsignedTypes
fun Color(
    component1: Float,
    component2: Float,
    component3: Float,
    component4: Float,
    colorSpace: ColorSpace
): Color {
    if (colorSpace.model == ColorModel.RGB) {
        return RgbaColor(
            red = component1,
            green = component2,
            blue = component3,
            alpha = component4,
            colorSpace = colorSpace
        )
    }

    TODO()
}

/**
 * Create a [RgbaColor] by passing individual [red], [green], [blue], [alpha], and [colorSpace]
 * components. The default [color space][ColorSpace] is [SRGB][ColorSpaces.Srgb] and
 * the default [alpha] is `1.0` (opaque). [colorSpace] must have a [ColorSpace.componentCount] of
 * 3.
 */
@ExperimentalUnsignedTypes
fun RgbaColor(
    red: Float,
    green: Float,
    blue: Float,
    alpha: Float = Color.OPAQUE_ALPHA,
    colorSpace: ColorSpace = ColorSpaces.SRGB
): RgbaColor {
    require(
        red in colorSpace.getMinValue(0)..colorSpace.getMaxValue(0) &&
                green in colorSpace.getMinValue(1)..colorSpace.getMaxValue(1) &&
                blue in colorSpace.getMinValue(2)..colorSpace.getMaxValue(2) &&
                alpha in Color.MIN_ALPHA..Color.MAX_ALPHA
    ) {
        "red = $red, green = $green, blue = $blue, alpha = $alpha outside the range for $colorSpace"
    }

    if (colorSpace.isSrgb) {
        val argb = (((alpha * 255.0f + 0.5f).toInt() shl 24) or
                ((red * 255.0f + 0.5f).toInt() shl 16) or
                ((green * 255.0f + 0.5f).toInt() shl 8) or
                (blue * 255.0f + 0.5f).toInt())

        return BaseULongColor(value = (argb.toULong() and 0xffffffffUL) shl 32)
    }

    require(colorSpace.componentCount == 3) {
        "Color only works with ColorSpaces with 3 components"
    }

    val id = colorSpace.id
    require(id != ColorSpace.MIN_ID) {
        "Unknown color space, please use a color space in ColorSpaces"
    }

    val r = Float16(red)
    val g = Float16(green)
    val b = Float16(blue)
    val a = (max(0.0f, min(alpha, 1.0f)) * 1023.0f + 0.5f).toInt()

    // Suppress sign extension
    return BaseULongColor(
        value = (((r.halfValue.toULong() and 0xffffUL) shl 48)
                or ((g.halfValue.toULong() and 0xffffUL) shl 32)
                or ((b.halfValue.toULong() and 0xffffUL) shl 16)
                or ((a.toULong() and 0x3ffUL) shl 6)
                or (id.toULong() and 0x3fUL))
    )
}

/**
 * Retrieves a [RgbaColor] from the provided color values.
 *
 * Note that the provided values will be coerced into the SRGB Color Range.
 *
 * @see [RgbaColor]
 */
@ExperimentalUnsignedTypes
fun RgbaColor(
    red: Int,
    green: Int,
    blue: Int,
    alpha: Int = Color.OPAQUE_INT_OPACITY
): RgbaColor {
    val a = alpha.coerceInSRGBColorRange()
    val r = red.coerceInSRGBColorRange()
    val g = green.coerceInSRGBColorRange()
    val b = blue.coerceInSRGBColorRange()

    return RgbaColor(
        red = r.toFloat(),
        green = g.toFloat(),
        blue = b.toFloat(),
        alpha = a.toFloat(),
        colorSpace = ColorSpaces.SRGB
    )
}

/**
 * Creates a new [RgbaColor] instance from an ARGB [ColorInt].
 * The resulting color is in the [sRGB][ColorSpaces.SRGB]
 * color space.
 *
 * @param [colorInt] The ARGB color int to create a [RgbaColor] from.
 */
@ExperimentalUnsignedTypes
fun Color(colorInt: ColorInt): RgbaColor = BaseULongColor(value = colorInt.value.toULong() shl 32)

/**
 * Creates a new [RgbaColor] instance from an ARGB color [Int].
 * The resulting color is in the [sRGB][ColorSpaces.SRGB]
 * color space.
 *
 * @param [int] The ARGB color int to create a [RgbaColor] from.
 */
@ExperimentalUnsignedTypes
fun Color(int: Int): RgbaColor = BaseULongColor(value = int.toULong() shl 32)

/**
 * Creates a new [RgbaColor] instance from an ARGB color int.
 * The resulting color is in the [sRGB][ColorSpaces.SRGB]
 * color space. This is useful for specifying colors with alpha
 * greater than 0x80 in numeric form without using [Long.toInt]:
 *
 *     val color = Color(0xFF000080)
 *
 * @param [long] The 32-bit ARGB color int to create a [RgbaColor] from.
 *
 * Note that this function does not use a [ColorLong] and is different
 * than one that does. This is more similar to the [RgbaColor] function.
 */
@ExperimentalUnsignedTypes
fun Color(long: Long): RgbaColor = BaseULongColor(value = (long.toULong() and 0xffffffffUL) shl 32)

/**
 * Creates a new [RgbaColor] instance from the provided [ColorLong] value.
 * The provided [colorLong] value should contain all of the [RgbaColor]
 * information encoded properly in it.
 *
 * @see [ColorLong]
 */
fun Color(colorLong: ColorLong): Color = TODO()

/**
 * Retrieves a [HexadecimalColor] from the provided [hexadecimalString]. The provided [hexadecimalString] must be in a
 * valid Hex Color format, with or without the preceeding '#' character.
 *
 * @throws [IllegalArgumentException] if the provided [hexadecimalString] is not in a valid Hex Color
 * format.
 */
@ExperimentalUnsignedTypes
fun Color(hexadecimalString: String): HexadecimalColor {
    require(HexadecimalColor.REGEX.matches(hexadecimalString))
    require(hexadecimalString.length in HexadecimalColor.LENGTH_WITHOUT_ALPHA..HexadecimalColor.LENGTH_WITH_ALPHA) {
        "Unexpected hexadecimal string format."
    }

    val hexStringInt =
        if (hexadecimalString[HexadecimalColor.HEX_CHAR_LOCATION] == HexadecimalColor.HEX_CHAR) {
            hexadecimalString.subSequence(
                startIndex = 1,
                endIndex = hexadecimalString.length
            ).toString()
        } else {
            hexadecimalString
        }

    var colorInt = hexStringInt.toInt(radix = HexadecimalColor.BIT_COUNT)

    if (hexadecimalString.length == HexadecimalColor.LENGTH_WITHOUT_ALPHA) {
        // Set the alpha value
        colorInt = colorInt or -0x1000000
    }

    return BaseULongColor(value = colorInt.toULong() shl 32, hexColorString = hexadecimalString)
}
