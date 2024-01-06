//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[ColorSpace](index.md)/[fromXyz](from-xyz.md)

# fromXyz

[common]\
fun [fromXyz](from-xyz.md)(x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), z: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)

Converts tristimulus values from the CIE XYZ space to this color space's color model.

#### Return

A new array whose size is equal to the number of color components as returned by [ColorModel.componentCount](../-color-model/component-count.md).

#### Parameters

common

| | |
|---|---|
| x | The X component of the color value |
| y | The Y component of the color value |
| z | The Z component of the color value |

#### See also

| |
|---|
| [ColorSpace.fromXyz](from-xyz.md) |
| [ColorSpace.toXyz](to-xyz.md) |

[common]\
abstract fun [fromXyz](from-xyz.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)

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
| [ColorSpace.fromXyz](from-xyz.md) |
| [ColorSpace.toXyz](to-xyz.md) |
