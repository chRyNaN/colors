//[colors-core](../../index.md)/[com.chrynan.colors](index.md)/[toHexString](to-hex-string.md)

# toHexString

[common]\
fun [Color](-color/index.md).[toHexString](to-hex-string.md)(includePrefix: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, uppercase: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, alwaysIncludeAlpha: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, destinationColorSpace: [ColorSpace](../com.chrynan.colors.space/-color-space/index.md) = ColorSpaces.SRGB, renderIntent: [RenderIntent](../com.chrynan.colors.space/-render-intent/index.md) = RenderIntent.PERCEPTUAL): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

Converts this [Color](-color/index.md) to a Hexadecimal [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) representation. For example, the Color White, RgbaColor(red = 255, green = 255, blue = 255, alpha = 255), would return a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) representation similar to the following: '#FFFFFF'.

**Note:** This function will convert this [Color](-color/index.md) to an [RgbaColor](-rgba-color/index.md) if it is not one already.

## See also

common

| | |
|---|---|
| [com.chrynan.colors.Color](-color/to-rgba-color.md) |  |
| [RgbaColor.toHexString](to-hex-string.md) |  |

## Parameters

common

| | |
|---|---|
| includePrefix | Whether to include the Hexadecimal prefix character, '#', in the output. |
| uppercase | Whether all of the letters in the output should be uppercase. |
| alwaysIncludeAlpha | Whether to include the alpha component even when the color is completely opaque. |
| destinationColorSpace | The [ColorSpace](../com.chrynan.colors.space/-color-space/index.md) used if this color is not an [RgbaColor](-rgba-color/index.md) and has to be converted with the [Color.toRgbaColor](-color/to-rgba-color.md) function. |
| renderIntent | The [RenderIntent](../com.chrynan.colors.space/-render-intent/index.md) used if this color is not an [RgbaColor](-rgba-color/index.md) and has to be converted with the [Color.toRgbaColor](-color/to-rgba-color.md) function. |

[common]\
fun [RgbaColor](-rgba-color/index.md).[toHexString](to-hex-string.md)(includePrefix: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, uppercase: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, alwaysIncludeAlpha: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

Converts this [RgbaColor](-rgba-color/index.md) to a Hexadecimal [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) representation. For example, the Color White, RgbaColor(red = 255, green = 255, blue = 255, alpha = 255), would return a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) representation similar to the following: '#FFFFFF'.

## Parameters

common

| | |
|---|---|
| includePrefix | Whether to include the Hexadecimal prefix character, '#', in the output. |
| uppercase | Whether all of the letters in the output should be uppercase. |
| alwaysIncludeAlpha | Whether to include the alpha component even when the color is completely opaque. |
