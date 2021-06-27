@file:Suppress("FunctionName", "unused")

package com.chrynan.colors

import com.chrynan.colors.space.ColorModel
import com.chrynan.colors.space.ColorSpace
import com.chrynan.colors.space.ColorSpaces
import com.chrynan.colors.space.Float16
import kotlin.math.max
import kotlin.math.min


/**
 * Creates a [Color] from the provided components and [colorSpace].
 *
 * Typically, the [component4] value is the [Color.alpha] value.
 *
 * Note that currently this only works with [ColorSpace]s that have a [ColorModel.componentCount]
 * of 3.
 *
 * If you prefer to use more specific component names and get a more specific [Color] instance, use
 * the other constructor functions, such as [RgbaColor], [RgbaColor], [LabColor], or [XyzColor].
 */
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

    // For now we just delegate to the RgbaColor function since the CMYK Color Model is not
    // supported. But in the future, this logic could be updated to support Color Models with four
    // components.
    return RgbaColor(
        red = component1,
        green = component2,
        blue = component3,
        alpha = component4,
        colorSpace = colorSpace
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
 * Creates a new [Color] instance from the provided [ColorLong] value.
 * The provided [colorLong] value should contain all of the [Color] information encoded properly in
 * it.
 *
 * @see [ColorLong]
 */
@ExperimentalUnsignedTypes
fun Color(colorLong: ColorLong): Color = BaseULongColor(value = colorLong.value.toULong())

/**
 * Creates a new [Color] instance from the provided [ULong] [colorULong] value.
 * The provided [colorULong] value should contain all of the [Color] information encoded properly
 * in it. The [colorULong] should be encoded like a [ColorLong] value.
 *
 * @see [Color]
 * @see [ColorLong]
 */
@ExperimentalUnsignedTypes
fun Color(colorULong: ULong): Color = BaseULongColor(value = colorULong)

/**
 * Retrieves a [HexadecimalColor] from the provided [hexadecimalString]. The provided [hexadecimalString] must be in a
 * valid Hex Color format, with or without the preceeding '#' character.
 *
 * @throws [IllegalArgumentException] if the provided [hexadecimalString] is not in a valid Hex Color
 * format.
 */
@ExperimentalUnsignedTypes
fun Color(hexadecimalString: String): HexadecimalColor {
    var formattedHexString = hexadecimalString.trim()
        .removePrefix("${HexadecimalColor.HEX_CHAR}")
        .lowercase()

    if (formattedHexString.length == 3) {
        // Shorthand hex value was used so expand it
        val chars = formattedHexString.toCharArray()
        formattedHexString = "${chars[0]}${chars[0]}${chars[1]}${chars[1]}${chars[2]}${chars[2]}"
    }

    var colorInt = formattedHexString.toLong(radix = HexadecimalColor.BIT_COUNT).toInt()

    if (formattedHexString.length == 6) {
        // Add the alpha channel
        colorInt = colorInt or -0x1000000
    }

    return BaseULongColor(
        value = (colorInt.toULong() and 0xffffffffUL) shl 32,
        hexColorString = hexadecimalString
    )
}

/**
 * Create a [RgbaColor] by passing individual [red], [green], [blue], [alpha], and [colorSpace]
 * components. The default [color space][ColorSpace] is [SRGB][ColorSpaces.SRGB] and
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
    alpha: Int = Color.OPAQUE_INT_OPACITY,
    colorSpace: ColorSpace = ColorSpaces.SRGB
): RgbaColor {
    val a = alpha.coerceInSRGBColorRange()
    val r = red.coerceInSRGBColorRange()
    val g = green.coerceInSRGBColorRange()
    val b = blue.coerceInSRGBColorRange()

    val newR = coerceInRange(
        value = r.toFloat(),
        newMin = colorSpace.getMinValue(0),
        newMax = colorSpace.getMaxValue(0),
        oldMin = 0f,
        oldMax = 255f
    )
    val newG = coerceInRange(
        value = g.toFloat(),
        newMin = colorSpace.getMinValue(1),
        newMax = colorSpace.getMaxValue(1),
        oldMin = 0f,
        oldMax = 255f
    )
    val newB = coerceInRange(
        value = b.toFloat(),
        newMin = colorSpace.getMinValue(2),
        newMax = colorSpace.getMaxValue(2),
        oldMin = 0f,
        oldMax = 255f
    )
    val newA = coerceInRange(
        value = a.toFloat(),
        newMin = colorSpace.getMinValue(3),
        newMax = colorSpace.getMaxValue(3),
        oldMin = 0f,
        oldMax = 255f
    )

    return RgbaColor(
        red = newR,
        green = newG,
        blue = newB,
        alpha = newA,
        colorSpace = colorSpace
    )
}

/**
 * Creates a [LabColor] with the provided values.
 *
 * Note [colorSpace] must have a [ColorSpace.componentCount] of 3.
 */
@ExperimentalUnsignedTypes
fun LabColor(
    l: Float,
    a: Float,
    b: Float,
    alpha: Float = Color.OPAQUE_ALPHA,
    colorSpace: ColorSpace
): LabColor =
    Color(
        component1 = l,
        component2 = a,
        component3 = b,
        component4 = alpha,
        colorSpace = colorSpace
    ) as LabColor

/**
 * Creates an [XyzColor] with the provided values.
 *
 * Note [colorSpace] must have a [ColorSpace.componentCount] of 3.
 */
@ExperimentalUnsignedTypes
fun XyzColor(
    x: Float,
    y: Float,
    z: Float,
    alpha: Float = Color.OPAQUE_ALPHA,
    colorSpace: ColorSpace
): XyzColor =
    Color(
        component1 = x,
        component2 = y,
        component3 = z,
        component4 = alpha,
        colorSpace = colorSpace
    ) as XyzColor
