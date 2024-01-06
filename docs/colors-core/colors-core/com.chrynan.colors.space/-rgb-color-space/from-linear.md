//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[RgbColorSpace](index.md)/[fromLinear](from-linear.md)

# fromLinear

[common]\
fun [fromLinear](from-linear.md)(r: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), g: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), b: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)

Encodes an RGB value from linear space to this color space's &quot;gamma space&quot;. This is achieved by applying this color space's opto-electronic transfer function to the supplied values.

Refer to the documentation of [RgbColorSpace](index.md) for more information about transfer functions and their use for encoding and decoding RGB values.

#### Return

A new array of 3 floats containing non-linear RGB values

#### Parameters

common

| | |
|---|---|
| r | The red component to encode from linear space |
| g | The green component to encode from linear space |
| b | The blue component to encode from linear space |

#### See also

| |
|---|
| [RgbColorSpace.fromLinear](from-linear.md) |
| [RgbColorSpace.toLinear](to-linear.md) |

[common]\
fun [fromLinear](from-linear.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)

Encodes an RGB value from linear space to this color space's &quot;gamma space&quot;. This is achieved by applying this color space's opto-electronic transfer function to the first 3 values of the supplied array. The result is stored back in the input array.

Refer to the documentation of [RgbColorSpace](index.md) for more information about transfer functions and their use for encoding and decoding RGB values.

#### Return

[v](from-linear.md), containing non-linear RGB values

#### Parameters

common

| | |
|---|---|
| v | A non-null array of linear RGB values, its length must be at least 3 |

#### See also

| |
|---|
| [RgbColorSpace.fromLinear](from-linear.md) |
| [RgbColorSpace.toLinear](to-linear.md) |
