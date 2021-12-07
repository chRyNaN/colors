//[colors-core](../../index.md)/[com.chrynan.colors](index.md)/[toHexString](to-hex-string.md)

# toHexString

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
