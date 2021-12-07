//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[ColorSpaces](index.md)/[match](match.md)

# match

[common]\
fun [match](match.md)(toXYZD50: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html), function: [TransferParameters](../-transfer-parameters/index.md)): [ColorSpace](../-color-space/index.md)?

Returns a [ColorSpaces](index.md) instance of [ColorSpace](../-color-space/index.md) that matches the specified RGB to CIE XYZ transform and transfer functions. If no instance can be found, this method returns null.

The color transform matrix is assumed to target the CIE XYZ space a [D50](../-illuminant/-d50.md) standard illuminant.

#### Return

A non-null [ColorSpace](../-color-space/index.md) if a match is found, null otherwise

## Parameters

common

| | |
|---|---|
| toXYZD50 | 3x3 column-major transform matrix from RGB to the profile connection space CIE XYZ as an array of 9 floats, cannot be null |
| function | Parameters for the transfer functions |
