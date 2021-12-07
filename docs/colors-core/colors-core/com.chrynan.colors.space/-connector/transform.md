//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[Connector](index.md)/[transform](transform.md)

# transform

[common]\
fun [transform](transform.md)(componentOne: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), componentTwo: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), componentThree: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)

Transforms the specified color from the source color space to a color in the destination color space. This convenience function assumes a source color model with 3 components (typically RGB). To transform from color models with more than 3 components, such as [CMYK](../-color-model/-c-m-y-k/index.md), use [transform](transform.md) instead.

#### Return

A new array of 3 floats containing the specified color transformed from the source space to the destination space

## See also

common

| | |
|---|---|
| [com.chrynan.colors.space.Connector](transform.md) |  |

## Parameters

common

| | |
|---|---|
| componentOne | The first component in the [ColorModel](../-color-model/index.md). For [ColorModel.RGB](../-color-model/-r-g-b/index.md) this would be the red component of the color to transform |
| componentTwo | The second component in the [ColorModel](../-color-model/index.md). For [ColorModel.RGB](../-color-model/-r-g-b/index.md) this would be the green component of the color to transform |
| componentThree | The third component in the [ColorModel](../-color-model/index.md). For [ColorModel.RGB](../-color-model/-r-g-b/index.md) this would be the blue component of the color to transform |

[common]\
open fun [transform](transform.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)

Transforms the specified color from the source color space to a color in the destination color space.

#### Return

The [v](transform.md) array passed as a parameter, containing the specified color transformed from the source space to the destination space

## See also

common

| | |
|---|---|
| [com.chrynan.colors.space.Connector](transform.md) |  |

## Parameters

common

| | |
|---|---|
| v | A non-null array of 3 floats containing the value to transform and that will hold the result of the transform |
