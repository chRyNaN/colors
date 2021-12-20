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
fun Color(
    component1: Float,
    component2: Float,
    component3: Float,
    component4: Float,
    colorSpace: ColorSpace
): Color =
    when (colorSpace.model) {
        ColorModel.RGB -> RgbaColor(
            red = component1,
            green = component2,
            blue = component3,
            alpha = component4,
            colorSpace = colorSpace
        )
        ColorModel.XYZ -> XyzColor(
            x = component1,
            y = component2,
            z = component3,
            alpha = component4,
            colorSpace = colorSpace
        )
        ColorModel.LAB -> LabColor(
            l = component1,
            a = component2,
            b = component3,
            alpha = component4,
            colorSpace = colorSpace
        )
        // For now we just delegate to the RgbaColor function since the CMYK Color Model is not
        // supported. But in the future, this logic could be updated to support Color Models with four
        // components.
        else -> RgbaColor(
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
fun Color(colorInt: ColorInt): RgbaColor =
    BaseRgbaColor(value = (colorInt.value.toULong() and 0xffffffffUL) shl 32)

/**
 * Creates a new [RgbaColor] instance from an ARGB color [Int].
 * The resulting color is in the [sRGB][ColorSpaces.SRGB]
 * color space.
 *
 * @param [int] The ARGB color int to create a [RgbaColor] from.
 */
fun Color(int: Int): RgbaColor = BaseRgbaColor(value = (int.toULong() and 0xffffffffUL) shl 32)

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
fun Color(long: Long): RgbaColor = BaseRgbaColor(value = (long.toULong() and 0xffffffffUL) shl 32)

/**
 * Creates a new [Color] instance from the provided [ColorLong] value.
 * The provided [colorLong] value should contain all of the [Color] information encoded properly in
 * it.
 *
 * @see [ColorLong]
 */
fun Color(colorLong: ColorLong): Color =
    Color(colorULong = (colorLong.value.toULong() and 0xffffffffUL) shl 32)

/**
 * Creates a new [Color] instance from the provided [ULong] [colorULong] value.
 * The provided [colorULong] value should contain all of the [Color] information encoded properly
 * in it. The [colorULong] should be encoded like a [ColorLong] value.
 *
 * @see [Color]
 * @see [ColorLong]
 */
fun Color(colorULong: ULong): Color {
    val colorSpace = ColorSpaces.getColorSpaceById((colorULong and 0x3fUL).toInt())
    val component1 = if (colorSpace.isSrgb) {
        ((colorULong shr 48) and 0xffUL).toFloat() / 255.0f
    } else {
        Float16(((colorULong shr 48) and 0xffffUL).toShort())
            .toFloat()
    }
    val component2 = if (colorSpace.isSrgb) {
        ((colorULong shr 40) and 0xffUL).toFloat() / 255.0f
    } else {
        Float16(((colorULong shr 32) and 0xffffUL).toShort())
            .toFloat()
    }
    val component3 = if (colorSpace.isSrgb) {
        ((colorULong shr 32) and 0xffUL).toFloat() / 255.0f
    } else {
        Float16(((colorULong shr 16) and 0xffffUL).toShort())
            .toFloat()
    }
    val component4 = if (colorSpace.isSrgb) {
        ((colorULong shr 56) and 0xffUL).toFloat() / 255.0f
    } else {
        ((colorULong shr 6) and 0x3ffUL).toFloat() / 1023.0f
    }

    return Color(
        component1 = component1,
        component2 = component2,
        component3 = component3,
        component4 = component4,
        colorSpace = colorSpace
    )
}

/**
 * Retrieves a [HexadecimalColor] from the provided [hex]. The provided [hex] must be in a
 * valid Hex Color format, with or without the preceeding '#' character.
 *
 * @throws [IllegalArgumentException] if the provided [hex] is not in a valid Hex Color
 * format.
 */
fun Color(hex: String): HexadecimalColor {
    var formattedHexString = hex.trim()
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

    return BaseHexadecimalColor(
        value = (colorInt.toULong() and 0xffffffffUL) shl 32,
        hexColorString = formattedHexString
    )
}

/**
 * Retrieves a [RgbaColor] from the provided color values.
 *
 * Note that the provided values will be coerced into the SRGB Color Range.
 *
 * @see [RgbaColor]
 */
fun Color(
    red: Int,
    green: Int,
    blue: Int,
    alpha: Int = Color.OPAQUE_INT_OPACITY,
    colorSpace: ColorSpace = ColorSpaces.SRGB
): RgbaColor =
    RgbaColor(red = red, green = green, blue = blue, alpha = alpha, colorSpace = colorSpace)

/**
 * Create a [RgbaColor] by passing individual [red], [green], [blue], [alpha], and [colorSpace]
 * components. The default [color space][ColorSpace] is [SRGB][ColorSpaces.SRGB] and
 * the default [alpha] is `1.0` (opaque). [colorSpace] must have a [ColorSpace.componentCount] of
 * 3.
 */
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

        return BaseRgbaColor(value = (argb.toULong() and 0xffffffffUL) shl 32)
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
    return BaseRgbaColor(
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
 * Creates a [Color] from the provided HSL components.
 *
 * **Note:** This was adapted from the open source Jetpack Compose library.
 *
 * [hue] The color value in the range (0..360), where 0 is red, 120 is green, and 240 is blue
 * [saturation] The amount of hue represented in the color in the range (0..1), where 0 has no color
 * and 1 is fully saturated.
 * [lightness] A range of (0..1) where 0 is black, 0.5 is fully colored, and 1 is white.
 * [colorSpace] The RGB color space used to calculate the Color from the HSL values.
 */
fun HslColor(
    hue: Float,
    saturation: Float,
    lightness: Float,
    alpha: Float = 1f,
    colorSpace: ColorSpace = ColorSpaces.SRGB
): Color {
    require(hue in 0f..360f && saturation in 0f..1f && lightness in 0f..1f) {
        "HSL ($hue, $saturation, $lightness) must be in range (0..360, 0..1, 0..1)"
    }

    val red = hslToRgbComponent(0, hue, saturation, lightness)
    val green = hslToRgbComponent(8, hue, saturation, lightness)
    val blue = hslToRgbComponent(4, hue, saturation, lightness)

    return Color(red, green, blue, alpha, colorSpace)
}

/**
 * Creates a [Color] from the provided HSV components.
 *
 * **Note:** This was adapted from the open source Jetpack Compose library.
 *
 * @param hue The color value in the range (0..360), where 0 is red, 120 is green, and
 * 240 is blue
 * @param saturation The amount of [hue] represented in the color in the range (0..1),
 * where 0 has no color and 1 is fully saturated.
 * @param value The strength of the color, where 0 is black.
 * @param colorSpace The RGB color space used to calculate the Color from the HSV values.
 */
fun HsvColor(
    hue: Float,
    saturation: Float,
    value: Float,
    alpha: Float = 1f,
    colorSpace: ColorSpace = ColorSpaces.SRGB
): Color {
    require(hue in 0f..360f && saturation in 0f..1f && value in 0f..1f) {
        "HSV ($hue, $saturation, $value) must be in range (0..360, 0..1, 0..1)"
    }

    val red = hsvToRgbComponent(5, hue, saturation, value)
    val green = hsvToRgbComponent(3, hue, saturation, value)
    val blue = hsvToRgbComponent(1, hue, saturation, value)

    return Color(red, green, blue, alpha, colorSpace)
}

/**
 * Creates a [LabColor] with the provided values.
 *
 * Note [colorSpace] must have a [ColorSpace.componentCount] of 3.
 */
fun LabColor(
    l: Float,
    a: Float,
    b: Float,
    alpha: Float = Color.OPAQUE_ALPHA,
    colorSpace: ColorSpace
): LabColor {
    require(
        l in colorSpace.getMinValue(0)..colorSpace.getMaxValue(0) &&
                a in colorSpace.getMinValue(1)..colorSpace.getMaxValue(1) &&
                b in colorSpace.getMinValue(2)..colorSpace.getMaxValue(2) &&
                alpha in Color.MIN_ALPHA..Color.MAX_ALPHA
    ) {
        "l = $l, a = $a, b = $b, alpha = $alpha outside the range for $colorSpace"
    }

    require(colorSpace.componentCount == 3) {
        "Color only works with ColorSpaces with 3 components"
    }

    val id = colorSpace.id

    require(id != ColorSpace.MIN_ID) {
        "Unknown color space, please use a color space in ColorSpaces"
    }

    val l16 = Float16(l)
    val a16 = Float16(a)
    val b16 = Float16(b)
    val formattedAlpha = (max(0.0f, min(alpha, 1.0f)) * 1023.0f + 0.5f).toInt()

    return BaseLabColor(
        value = (((l16.halfValue.toULong() and 0xffffUL) shl 48)
                or ((a16.halfValue.toULong() and 0xffffUL) shl 32)
                or ((b16.halfValue.toULong() and 0xffffUL) shl 16)
                or ((formattedAlpha.toULong() and 0x3ffUL) shl 6)
                or (id.toULong() and 0x3fUL))
    )
}

/**
 * Creates an [XyzColor] with the provided values.
 *
 * Note [colorSpace] must have a [ColorSpace.componentCount] of 3.
 */
fun XyzColor(
    x: Float,
    y: Float,
    z: Float,
    alpha: Float = Color.OPAQUE_ALPHA,
    colorSpace: ColorSpace
): XyzColor {
    require(
        x in colorSpace.getMinValue(0)..colorSpace.getMaxValue(0) &&
                y in colorSpace.getMinValue(1)..colorSpace.getMaxValue(1) &&
                z in colorSpace.getMinValue(2)..colorSpace.getMaxValue(2) &&
                alpha in Color.MIN_ALPHA..Color.MAX_ALPHA
    ) {
        "x = $x, y = $y, z = $z, alpha = $alpha outside the range for $colorSpace"
    }

    require(colorSpace.componentCount == 3) {
        "Color only works with ColorSpaces with 3 components"
    }

    val id = colorSpace.id

    require(id != ColorSpace.MIN_ID) {
        "Unknown color space, please use a color space in ColorSpaces"
    }

    val x16 = Float16(x)
    val y16 = Float16(y)
    val z16 = Float16(z)
    val a = (max(0.0f, min(alpha, 1.0f)) * 1023.0f + 0.5f).toInt()

    return BaseXyzColor(
        value = (((x16.halfValue.toULong() and 0xffffUL) shl 48)
                or ((y16.halfValue.toULong() and 0xffffUL) shl 32)
                or ((z16.halfValue.toULong() and 0xffffUL) shl 16)
                or ((a.toULong() and 0x3ffUL) shl 6)
                or (id.toULong() and 0x3fUL))
    )
}
