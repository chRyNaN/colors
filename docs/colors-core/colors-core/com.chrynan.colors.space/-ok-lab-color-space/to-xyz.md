//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[OkLabColorSpace](index.md)/[toXyz](to-xyz.md)

# toXyz

[common]\
open override fun [toXyz](to-xyz.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)

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
| [OkLabColorSpace.toXyz](to-xyz.md) |
| [OkLabColorSpace.fromXyz](from-xyz.md) |
