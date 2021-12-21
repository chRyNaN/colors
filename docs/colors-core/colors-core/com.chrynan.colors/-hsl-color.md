//[colors-core](../../index.md)/[com.chrynan.colors](index.md)/[HslColor](-hsl-color.md)

# HslColor

[common]\
fun [HslColor](-hsl-color.md)(hue: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), saturation: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), lightness: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), alpha: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = 1f, colorSpace: [ColorSpace](../com.chrynan.colors.space/-color-space/index.md) = ColorSpaces.SRGB): [Color](-color/index.md)

Creates a [Color](-color/index.md) from the provided HSL components.

**Note:** This was adapted from the open source Jetpack Compose library.

[hue](-hsl-color.md) The color value in the range (0..360), where 0 is red, 120 is green, and 240 is blue [saturation](-hsl-color.md) The amount of hue represented in the color in the range (0..1), where 0 has no color and 1 is fully saturated. [lightness](-hsl-color.md) A range of (0..1) where 0 is black, 0.5 is fully colored, and 1 is white. [colorSpace](-hsl-color.md) The RGB color space used to calculate the Color from the HSL values.
