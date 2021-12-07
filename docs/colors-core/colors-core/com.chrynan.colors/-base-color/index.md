//[colors-core](../../../index.md)/[com.chrynan.colors](../index.md)/[BaseColor](index.md)

# BaseColor

[common]\
interface [BaseColor](index.md) : [Color](../-color/index.md)

## Functions

| Name | Summary |
|---|---|
| [component1](component1.md) | [common]<br>open operator override fun [component1](component1.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>The first component of this [Color](../-color/index.md) defined by the [colorSpace](color-space.md)s [ColorModel](../../com.chrynan.colors.space/-color-model/index.md). |
| [component2](component2.md) | [common]<br>open operator override fun [component2](component2.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>The second component of this [Color](../-color/index.md) defined by the [colorSpace](color-space.md)s [ColorModel](../../com.chrynan.colors.space/-color-model/index.md). |
| [component3](component3.md) | [common]<br>open operator override fun [component3](component3.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>The third component of this [Color](../-color/index.md) defined by the [colorSpace](color-space.md)s [ColorModel](../../com.chrynan.colors.space/-color-model/index.md). |
| [component4](component4.md) | [common]<br>open operator override fun [component4](component4.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>The fourth component of this [Color](../-color/index.md) defined by the [colorSpace](color-space.md)s [ColorModel](../../com.chrynan.colors.space/-color-model/index.md). |
| [convert](convert.md) | [common]<br>open override fun [convert](convert.md)(colorSpace: [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md), renderIntent: [RenderIntent](../../com.chrynan.colors.space/-render-intent/index.md)): [Color](../-color/index.md)<br>Converts this [Color](../-color/index.md) value to a [Color](../-color/index.md) value in the provided [colorSpace](convert.md) using the provided [renderIntent](convert.md). |
| [copy](copy.md) | [common]<br>open override fun [copy](copy.md)(component1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), component2: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), component3: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), component4: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [Color](../-color/index.md)<br>Copies the existing color, changing only the provided values. The [ColorSpace](color-space.md) of the returned [Color](../-color/index.md) is the same as this [colorSpace](color-space.md). |
| [luminance](luminance.md) | [common]<br>open override fun [luminance](luminance.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Returns the relative luminance of this color. |
| [toRgbaColor](to-rgba-color.md) | [common]<br>open override fun [toRgbaColor](to-rgba-color.md)(destinationColorSpace: [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md), renderIntent: [RenderIntent](../../com.chrynan.colors.space/-render-intent/index.md)): [RgbaColor](../-rgba-color/index.md)<br>Converts this [Color](../-color/index.md) instance into a [RgbaColor](../-rgba-color/index.md). If this [Color](../-color/index.md) instance is already an [RgbaColor](../-rgba-color/index.md), then it should simply be returned. |

## Properties

| Name | Summary |
|---|---|
| [alpha](alpha.md) | [common]<br>open override val [alpha](alpha.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>A value between 0.0 and 1.0 representing the opacity value of this Color instance. A value of 0.0 is completely transparent. A value of 1.0 is completely opaque. |
| [colorInt](color-int.md) | [common]<br>open override val [colorInt](color-int.md): [ColorInt](../-color-int/index.md)<br>The [ColorInt](../-color-int/index.md) representation of this [Color](../-color/index.md) value. |
| [colorLong](color-long.md) | [common]<br>open override val [colorLong](color-long.md): [ColorLong](../-color-long/index.md)<br>The [ColorLong](../-color-long/index.md) representation of this [Color](../-color/index.md) value. |
| [colorSpace](color-space.md) | [common]<br>open override val [colorSpace](color-space.md): [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md)<br>The [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md) that this [Color](../-color/index.md) belongs to. |
| [components](components.md) | [common]<br>open override val [components](components.md): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>Returns this color's components as a new array. |
| [cssValue](../-color/css-value.md) | [common]<br>abstract val [cssValue](../-color/css-value.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>A [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) CSS value representation of this [Color](../-color/index.md) value. For example: "#FFFFFF" or "rgba(255, 255, 255, 255)". This [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) value should be usable in CSS. For example: "background-color: ${color.cssValue}". |
| [value](value.md) | [common]<br>abstract val [value](value.md): [ULong](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-long/index.html) |
