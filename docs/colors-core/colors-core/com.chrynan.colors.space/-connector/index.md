//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[Connector](index.md)

# Connector

[common]\
open class [Connector](index.md)

A connector transforms colors from a source color space to a destination color space.

A source color space is connected to a destination color space using the color transform C computed from their respective transforms noted Tsrc and Tdst in the following equation:

[See equation](https://developer.android.com/reference/android/graphics/ColorSpace.Connector)

The transform C shown above is only valid when the source and destination color spaces have the same profile connection space (PCS). We know that instances of [ColorSpace](../-color-space/index.md) always use CIE XYZ as their PCS but their white points might differ. When they do, we must perform a chromatic adaptation of the color spaces' transforms. To do so, we use the von Kries method described in the documentation of [Adaptation](../-adaptation/index.md), using the CIE standard illuminant [D50](../-illuminant/-d50.md) as the target white point.

Example of conversion from [sRGB](../-color-spaces/-s-r-g-b.md) to [DCI-P3](../-color-spaces/-d-c-i_-p3.md):

    val connector = ColorSpaces.Srgb.connect(ColorSpaces.DciP3);
    val p3 = connector.transform(1.0f, 0.0f, 0.0f);
    // p3 contains { 0.9473, 0.2740, 0.2076 }

## See also

common

| | |
|---|---|
| [com.chrynan.colors.space.Adaptation](../-adaptation/index.md) |  |
| [ColorSpace.adapt](../adapt.md) |  |
| [ColorSpace.connect](../connect.md) |  |

## Functions

| Name | Summary |
|---|---|
| [transform](transform.md) | [common]<br>open fun [transform](transform.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>Transforms the specified color from the source color space to a color in the destination color space.<br>[common]<br>fun [transform](transform.md)(componentOne: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), componentTwo: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), componentThree: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>Transforms the specified color from the source color space to a color in the destination color space. This convenience function assumes a source color model with 3 components (typically RGB). To transform from color models with more than 3 components, such as [CMYK](../-color-model/-c-m-y-k/index.md), use [transform](transform.md) instead. |

## Properties

| Name | Summary |
|---|---|
| [destination](destination.md) | [common]<br>val [destination](destination.md): [ColorSpace](../-color-space/index.md) |
| [renderIntent](render-intent.md) | [common]<br>val [renderIntent](render-intent.md): [RenderIntent](../-render-intent/index.md) |
| [source](source.md) | [common]<br>val [source](source.md): [ColorSpace](../-color-space/index.md) |
