//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[WhitePoint](index.md)

# WhitePoint

[common]\
data class [WhitePoint](index.md)(val x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), val y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))

Class for constructing white points used in [RGB](../-rgb-color-space/index.md) color space. The value is stored in the CIE xyY color space. The Y component of the white point is assumed to be 1.

A [WhitePoint](index.md) is used to determine the coordinate of a base white value for an image. It should be the coordinate within an image, or 2-D pixel matrix, that contains the color that is the closest to white within the image. This is useful when converting between Color Spaces for different conversion algorithms and [RenderIntent](../-render-intent/index.md)s.

## See also

common

| | |
|---|---|
|  | [Definition Two](https://en.wikipedia.org/wiki/White_point) |
| [com.chrynan.colors.space.Illuminant](../-illuminant/index.md) |  |

## Constructors

| | |
|---|---|
| [WhitePoint](-white-point.md) | [common]<br>fun [WhitePoint](-white-point.md)(x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), z: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))<br>Illuminant for CIE XYZ white point |
| [WhitePoint](-white-point.md) | [common]<br>fun [WhitePoint](-white-point.md)(x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)) |

## Functions

| Name | Summary |
|---|---|
| [toXyz](to-xyz.md) | [common]<br>fun [toXyz](to-xyz.md)(): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>Converts a value from CIE xyY to CIE XYZ. Y is assumed to be 1 so the input xyY array only contains the x and y components. |

## Properties

| Name | Summary |
|---|---|
| [x](x.md) | [common]<br>val [x](x.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [y](y.md) | [common]<br>val [y](y.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
