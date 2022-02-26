//[colors-core](../../index.md)/[com.chrynan.colors](index.md)/[HsvColor](-hsv-color.md)

# HsvColor

[common]\
fun [HsvColor](-hsv-color.md)(hue: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), saturation: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), value: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), alpha: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = 1.0f, colorSpace: [ColorSpace](../com.chrynan.colors.space/-color-space/index.md) = ColorSpaces.SRGB): [Color](-color/index.md)

Creates a [Color](-color/index.md) from the provided HSV components.

**Note:** This was adapted from the open source Jetpack Compose library.

## Parameters

common

| | |
|---|---|
| hue | The color value in the range (0..360), where 0 is red, 120 is green, and 240 is blue |
| saturation | The amount of [hue](-hsv-color.md) represented in the color in the range (0..1), where 0 has no color and 1 is fully saturated. |
| value | The strength of the color, where 0 is black. |
| colorSpace | The RGB color space used to calculate the Color from the HSV values. |
