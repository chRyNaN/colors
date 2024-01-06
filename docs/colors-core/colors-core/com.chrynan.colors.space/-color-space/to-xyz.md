//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[ColorSpace](index.md)/[toXyz](to-xyz.md)

# toXyz

[common]\
fun [toXyz](to-xyz.md)(r: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), g: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), b: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)

Converts a color value from this color space's model to tristimulus CIE XYZ values. If the color model of this color space is not [RGB](../-color-model/-r-g-b/index.md), it is assumed that the target CIE XYZ space uses a [D50](../-illuminant/-d50.md) standard illuminant.

This method is a convenience for color spaces with a model of 3 components ([RGB](../-color-model/-r-g-b/index.md) or [ColorModel.LAB](../-color-model/-l-a-b/index.md) for instance). With color spaces using fewer or more components, use [toXyz](to-xyz.md) instead.

#### Return

A new array of 3 floats, containing tristimulus XYZ values

#### Parameters

common

| | |
|---|---|
| r | The first component of the value to convert from (typically R in RGB) |
| g | The second component of the value to convert from (typically G in RGB) |
| b | The third component of the value to convert from (typically B in RGB) |

#### See also

| |
|---|
| [ColorSpace.toXyz](to-xyz.md) |
| [ColorSpace.fromXyz](from-xyz.md) |

[common]\
abstract fun [toXyz](to-xyz.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)

Converts a color value from this color space's model to tristimulus CIE XYZ values. If the color model of this color space is not [RGB](../-color-model/-r-g-b/index.md), it is assumed that the target CIE XYZ space uses a [D50](../-illuminant/-d50.md) standard illuminant.

The specified array's length  must be at least equal to to the number of color components as returned by [ColorModel.componentCount](../-color-model/component-count.md).

#### Return

The array passed in parameter [v](to-xyz.md).

#### Parameters

common

| | |
|---|---|
| v | An array of color components containing the color space's color value to convert to XYZ, and large enough to hold the resulting tristimulus XYZ values, at least 3 values. |

#### See also

| |
|---|
| [ColorSpace.toXyz](to-xyz.md) |
| [ColorSpace.fromXyz](from-xyz.md) |
