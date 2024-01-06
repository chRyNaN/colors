//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[OkLabColorSpace](index.md)/[fromXyz](from-xyz.md)

# fromXyz

[common]\
open override fun [fromXyz](from-xyz.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)

Converts tristimulus values from the CIE XYZ space to this color space's color model. The resulting value is passed back in the specified array.

The specified array's length  must be at least equal to to the number of color components as returned by [ColorModel.componentCount](../-color-model/component-count.md), and its first 3 values must be the XYZ components to convert from.

#### Return

The array passed in parameter [v](from-xyz.md).

#### Parameters

common

| | |
|---|---|
| v | An array of color components containing the XYZ values to convert from, and large enough to hold the number of components of this color space's model. The minimum size is 3, but most color spaces have 4 components. |

#### See also

| |
|---|
| [OkLabColorSpace.fromXyz](from-xyz.md) |
| [OkLabColorSpace.toXyz](to-xyz.md) |
