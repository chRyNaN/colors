//[colors-core](../../../index.md)/[com.chrynan.colors](../index.md)/[LabColor](index.md)

# LabColor

[common]\
interface [LabColor](index.md) : [Color](../-color/index.md)

A [Color](../-color/index.md) interface that represents a [Color](../-color/index.md) within a [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md) with a [ColorModel.LAB](../../com.chrynan.colors.space/-color-model/-l-a-b/index.md) color model.

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [component1](../-color/component1.md) | [common]<br>abstract operator fun [component1](../-color/component1.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>The first component of this [Color](../-color/index.md) defined by the [colorSpace](../-color/color-space.md)s [ColorModel](../../com.chrynan.colors.space/-color-model/index.md). |
| [component2](../-color/component2.md) | [common]<br>abstract operator fun [component2](../-color/component2.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>The second component of this [Color](../-color/index.md) defined by the [colorSpace](../-color/color-space.md)s [ColorModel](../../com.chrynan.colors.space/-color-model/index.md). |
| [component3](../-color/component3.md) | [common]<br>abstract operator fun [component3](../-color/component3.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>The third component of this [Color](../-color/index.md) defined by the [colorSpace](../-color/color-space.md)s [ColorModel](../../com.chrynan.colors.space/-color-model/index.md). |
| [component4](../-color/component4.md) | [common]<br>abstract operator fun [component4](../-color/component4.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>The fourth component of this [Color](../-color/index.md) defined by the [colorSpace](../-color/color-space.md)s [ColorModel](../../com.chrynan.colors.space/-color-model/index.md). |
| [convert](../-color/convert.md) | [common]<br>abstract fun [convert](../-color/convert.md)(colorSpace: [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md), renderIntent: [RenderIntent](../../com.chrynan.colors.space/-render-intent/index.md) = RenderIntent.PERCEPTUAL): [Color](../-color/index.md)<br>Converts this [Color](../-color/index.md) value to a [Color](../-color/index.md) value in the provided [colorSpace](../-color/convert.md) using the provided [renderIntent](../-color/convert.md). |
| [copy](../-color/copy.md) | [common]<br>abstract fun [copy](../-color/copy.md)(alpha: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = this.alpha): [Color](../-color/index.md)<br>abstract fun [copy](../-color/copy.md)(component1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = this.component1(), component2: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = this.component2(), component3: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = this.component3(), component4: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = this.component4()): [Color](../-color/index.md)<br>Copies the existing color, changing only the provided values. The [ColorSpace](../-color/color-space.md) of the returned [Color](../-color/index.md) is the same as this [colorSpace](../-color/color-space.md). |
| [luminance](../-color/luminance.md) | [common]<br>abstract fun [luminance](../-color/luminance.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Returns the relative luminance of this color. |
| [toRgbaColor](../-color/to-rgba-color.md) | [common]<br>abstract fun [toRgbaColor](../-color/to-rgba-color.md)(destinationColorSpace: [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md) = ColorSpaces.SRGB, renderIntent: [RenderIntent](../../com.chrynan.colors.space/-render-intent/index.md) = RenderIntent.PERCEPTUAL): [RgbaColor](../-rgba-color/index.md)<br>Converts this [Color](../-color/index.md) instance into a [RgbaColor](../-rgba-color/index.md). If this [Color](../-color/index.md) instance is already an [RgbaColor](../-rgba-color/index.md), then it should simply be returned. |

## Properties

| Name | Summary |
|---|---|
| [a](a.md) | [common]<br>open val [a](a.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>This is the second component in a [Color](../-color/index.md) with a [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md) that has a [ColorModel.LAB](../../com.chrynan.colors.space/-color-model/-l-a-b/index.md) color model. This should be the same as calling [component2](../../../../colors-core/com.chrynan.colors/-lab-color/component2.md). |
| [alpha](../-color/alpha.md) | [common]<br>abstract val [alpha](../-color/alpha.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>A value between 0.0 and 1.0 representing the opacity value of this Color instance. A value of 0.0 is completely transparent. A value of 1.0 is completely opaque. |
| [b](b.md) | [common]<br>open val [b](b.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>This is the second component in a [Color](../-color/index.md) with a [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md) that has a [ColorModel.LAB](../../com.chrynan.colors.space/-color-model/-l-a-b/index.md) color model. This should be the same as calling [component2](../../../../colors-core/com.chrynan.colors/-lab-color/component2.md). |
| [colorInt](../-color/color-int.md) | [common]<br>abstract val [colorInt](../-color/color-int.md): [ColorInt](../-color-int/index.md)<br>The [ColorInt](../-color-int/index.md) representation of this [Color](../-color/index.md) value. |
| [colorLong](../-color/color-long.md) | [common]<br>abstract val [colorLong](../-color/color-long.md): [ColorLong](../-color-long/index.md)<br>The [ColorLong](../-color-long/index.md) representation of this [Color](../-color/index.md) value. |
| [colorSpace](../-color/color-space.md) | [common]<br>abstract val [colorSpace](../-color/color-space.md): [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md)<br>The [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md) that this [Color](../-color/index.md) belongs to. |
| [components](../-color/components.md) | [common]<br>abstract val [components](../-color/components.md): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>Returns this color's components as a new array. The last element of the array is always the [alpha](../-color/alpha.md) component. |
| [cssValue](../-color/css-value.md) | [common]<br>abstract val [cssValue](../-color/css-value.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>A [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) CSS value representation of this [Color](../-color/index.md) value. For example: &quot;#FFFFFF&quot; or &quot;rgba(255, 255, 255, 255)&quot;. This [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) value should be usable in CSS. For example: &quot;background-color: ${color.cssValue}&quot;. |
| [l](l.md) | [common]<br>open val [l](l.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>This is the first component in a [Color](../-color/index.md) with a [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md) that has a [ColorModel.LAB](../../com.chrynan.colors.space/-color-model/-l-a-b/index.md) color model. This should be the same as calling [component1](../../../../colors-core/com.chrynan.colors/-lab-color/component1.md). |

## Extensions

| Name | Summary |
|---|---|
| [blueYellow](../blue-yellow.md) | [common]<br>val [LabColor](index.md).[blueYellow](../blue-yellow.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [greenRed](../green-red.md) | [common]<br>val [LabColor](index.md).[greenRed](../green-red.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [lightness](../lightness.md) | [common]<br>val [LabColor](index.md).[lightness](../lightness.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
