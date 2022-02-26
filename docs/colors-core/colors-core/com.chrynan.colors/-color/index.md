//[colors-core](../../../index.md)/[com.chrynan.colors](../index.md)/[Color](index.md)

# Color

[common]\
interface [Color](index.md)

A representation of a Color.

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [component1](component1.md) | [common]<br>abstract operator fun [component1](component1.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>The first component of this [Color](index.md) defined by the [colorSpace](color-space.md)s [ColorModel](../../com.chrynan.colors.space/-color-model/index.md). |
| [component2](component2.md) | [common]<br>abstract operator fun [component2](component2.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>The second component of this [Color](index.md) defined by the [colorSpace](color-space.md)s [ColorModel](../../com.chrynan.colors.space/-color-model/index.md). |
| [component3](component3.md) | [common]<br>abstract operator fun [component3](component3.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>The third component of this [Color](index.md) defined by the [colorSpace](color-space.md)s [ColorModel](../../com.chrynan.colors.space/-color-model/index.md). |
| [component4](component4.md) | [common]<br>abstract operator fun [component4](component4.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>The fourth component of this [Color](index.md) defined by the [colorSpace](color-space.md)s [ColorModel](../../com.chrynan.colors.space/-color-model/index.md). |
| [convert](convert.md) | [common]<br>abstract fun [convert](convert.md)(colorSpace: [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md), renderIntent: [RenderIntent](../../com.chrynan.colors.space/-render-intent/index.md) = RenderIntent.PERCEPTUAL): [Color](index.md)<br>Converts this [Color](index.md) value to a [Color](index.md) value in the provided [colorSpace](convert.md) using the provided [renderIntent](convert.md). |
| [copy](copy.md) | [common]<br>abstract fun [copy](copy.md)(alpha: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = this.alpha): [Color](index.md)<br>abstract fun [copy](copy.md)(component1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = this.component1(), component2: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = this.component2(), component3: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = this.component3(), component4: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = this.component4()): [Color](index.md)<br>Copies the existing color, changing only the provided values. The [ColorSpace](color-space.md) of the returned [Color](index.md) is the same as this [colorSpace](color-space.md). |
| [luminance](luminance.md) | [common]<br>abstract fun [luminance](luminance.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Returns the relative luminance of this color. |
| [toRgbaColor](to-rgba-color.md) | [common]<br>abstract fun [toRgbaColor](to-rgba-color.md)(destinationColorSpace: [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md) = ColorSpaces.SRGB, renderIntent: [RenderIntent](../../com.chrynan.colors.space/-render-intent/index.md) = RenderIntent.PERCEPTUAL): [RgbaColor](../-rgba-color/index.md)<br>Converts this [Color](index.md) instance into a [RgbaColor](../-rgba-color/index.md). If this [Color](index.md) instance is already an [RgbaColor](../-rgba-color/index.md), then it should simply be returned. |

## Properties

| Name | Summary |
|---|---|
| [alpha](alpha.md) | [common]<br>abstract val [alpha](alpha.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>A value between 0.0 and 1.0 representing the opacity value of this Color instance. A value of 0.0 is completely transparent. A value of 1.0 is completely opaque. |
| [colorInt](color-int.md) | [common]<br>abstract val [colorInt](color-int.md): [ColorInt](../-color-int/index.md)<br>The [ColorInt](../-color-int/index.md) representation of this [Color](index.md) value. |
| [colorLong](color-long.md) | [common]<br>abstract val [colorLong](color-long.md): [ColorLong](../-color-long/index.md)<br>The [ColorLong](../-color-long/index.md) representation of this [Color](index.md) value. |
| [colorSpace](color-space.md) | [common]<br>abstract val [colorSpace](color-space.md): [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md)<br>The [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md) that this [Color](index.md) belongs to. |
| [components](components.md) | [common]<br>abstract val [components](components.md): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>Returns this color's components as a new array. The last element of the array is always the [alpha](alpha.md) component. |
| [cssValue](css-value.md) | [common]<br>abstract val [cssValue](css-value.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>A [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) CSS value representation of this [Color](index.md) value. For example: "#FFFFFF" or "rgba(255, 255, 255, 255)". This [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) value should be usable in CSS. For example: "background-color: ${color.cssValue}". |

## Inheritors

| Name |
|---|
| [BaseColor](../-base-color/index.md) |
| [HexadecimalColor](../-hexadecimal-color/index.md) |
| [LabColor](../-lab-color/index.md) |
| [RgbaColor](../-rgba-color/index.md) |
| [XyzColor](../-xyz-color/index.md) |

## Extensions

| Name | Summary |
|---|---|
| [compositeOver](../composite-over.md) | [common]<br>fun [Color](index.md).[compositeOver](../composite-over.md)(background: [Color](index.md)): [Color](index.md)<br>Composites [this](../../../../colors-core/com.chrynan.colors/index.md) color on top of [background](../composite-over.md) using the Porter-Duff 'source over' mode. |
| [contrast](../contrast.md) | [common]<br>fun [Color](index.md).[contrast](../contrast.md)(other: [Color](index.md)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Retrieves a [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), in the range of 0.0f to 1.0f, indicating the amount of contrast between this [Color](index.md) and the provided [other](index.md). A value of 0.0f indicates the lowest contrast value, and a value of 1.0f indicates the highest contrast value. |
| [contrasting](../contrasting.md) | [common]<br>fun [Color](index.md).[contrasting](../contrasting.md)(factor: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = 0.5f, conditional: [Color](index.md) = Color.White, default: [Color](index.md) = Color.Black): [Color](index.md)<br>Retrieves the most contrasting [Color](index.md) with this [Color](index.md) from the provided values. |
| [isOpaque](../is-opaque.md) | [common]<br>val [Color](index.md).[isOpaque](../is-opaque.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Determines whether this [Color](index.md) is completely opaque, meaning that it has a [Color.alpha](alpha.md) value of 1.0f. |
| [isTranslucent](../is-translucent.md) | [common]<br>val [Color](index.md).[isTranslucent](../is-translucent.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Determines whether this [Color](index.md) is translucent, meaning that it has a [Color.alpha](alpha.md) value between, but not including, 0.0f and 1.0f. |
| [isTransparent](../is-transparent.md) | [common]<br>val [Color](index.md).[isTransparent](../is-transparent.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Determines whether this [Color](index.md) is completely transparent, meaning that it has a [Color.alpha](alpha.md) value of 0.0f. |
| [toAndroidColor](../to-android-color.md) | [android]<br>@[RequiresApi](https://developer.android.com/reference/kotlin/androidx/annotation/RequiresApi.html)(value = 26)<br>fun [Color](index.md#-1744101215%2FExtensions%2F747183510).[toAndroidColor](../to-android-color.md)(): [Color](https://developer.android.com/reference/kotlin/android/graphics/Color.html)<br>Converts this [Color](index.md#-1744101215%2FExtensions%2F747183510) instance into an [android.graphics.Color](https://developer.android.com/reference/kotlin/android/graphics/Color.html) instance. |
| [toHexString](../to-hex-string.md) | [common]<br>fun [Color](index.md).[toHexString](../to-hex-string.md)(includePrefix: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, uppercase: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = true, alwaysIncludeAlpha: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = false, destinationColorSpace: [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md) = ColorSpaces.SRGB, renderIntent: [RenderIntent](../../com.chrynan.colors.space/-render-intent/index.md) = RenderIntent.PERCEPTUAL): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Converts this [Color](index.md) to a Hexadecimal [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) representation. For example, the Color White, RgbaColor(red = 255, green = 255, blue = 255, alpha = 255), would return a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) representation similar to the following: '#FFFFFF'. |
| [toUIColor](../to-u-i-color.md) | [ios]<br>fun [Color](index.md#-1744101215%2FExtensions%2F1322278016).[toUIColor](../to-u-i-color.md)(destinationColorSpace: [ColorSpace](../../../../colors-core/colors-core/com.chrynan.colors.space/-color-space/index.md) = ColorSpaces.SRGB, renderIntent: [RenderIntent](../../../../colors-core/colors-core/com.chrynan.colors.space/-render-intent/index.md) = RenderIntent.PERCEPTUAL): <!---  GfmCommand {"@class":"org.jetbrains.dokka.gfm.ResolveLinkGfmCommand","dri":{"packageName":"","classNames":"<ERROR CLASS>","callable":null,"target":{"@class":"org.jetbrains.dokka.links.PointingToDeclaration"},"extra":null}} --->&lt;ERROR CLASS&gt;<!--- ---><br>Converts this [Color](index.md#-1744101215%2FExtensions%2F1322278016) instance into a UIColor from UIKit. |
