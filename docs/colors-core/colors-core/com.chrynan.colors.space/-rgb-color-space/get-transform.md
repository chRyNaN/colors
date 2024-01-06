//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[RgbColorSpace](index.md)/[getTransform](get-transform.md)

# getTransform

[common]\
fun [getTransform](get-transform.md)(): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)

Returns the transform of this color space as a new array. The transform is used to convert from RGB to XYZ (with the same white point as this color space). To connect color spaces, you must first [adapt](../adapt.md) them to the same white point.

It is recommended to use [ColorSpace.connect](../connect.md) to convert between color spaces.

#### Return

A new array of 9 floats

#### See also

| |
|---|
| [RgbColorSpace.getInverseTransform](get-inverse-transform.md) |

[common]\
fun [getTransform](get-transform.md)(transform: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)

Copies the transform of this color space in specified array. The transform is used to convert from RGB to XYZ (with the same white point as this color space). To connect color spaces, you must first [adapt](../adapt.md) them to the same white point.

It is recommended to use [ColorSpace.connect](../connect.md) to convert between color spaces.

#### Return

[transform](get-transform.md), modified to contain the transform for this color space.

#### Parameters

common

| | |
|---|---|
| transform | The destination array, cannot be null, its length must be >= 9 |

#### See also

| |
|---|
| [RgbColorSpace.getInverseTransform](get-inverse-transform.md) |
