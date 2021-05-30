//[colors-core](../../../index.md)/[com.chrynan.colors](../index.md)/[XyzColor](index.md)



# XyzColor  
 [common] interface [XyzColor](index.md) : [Color](../-color/index.md)

A [Color](../-color/index.md) interface that represents a [Color](../-color/index.md) within a [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md) with a [ColorModel.XYZ](../../com.chrynan.colors.space/-color-model/-x-y-z/index.md) color model.



**Note:** Do **not** perform an instance check (ex: color is RgbaColor) to determine if a [Color](../-color/index.md) instance is really a particular [Color](../-color/index.md) subtype. Instead refer to the [colorSpace](index.md#%5Bcom.chrynan.colors%2FXyzColor%2FcolorSpace%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1235785652) property. This is because different [Color](../-color/index.md) subtypes, such as [RgbaColor](../-rgba-color/index.md), can share the same class implementation.

   


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors/XyzColor.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.colors/XyzColor.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors/Color/component1/#/PointingToDeclaration/"></a>[component1](../-color/component1.md)| <a name="com.chrynan.colors/Color/component1/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract operator fun [component1](../-color/component1.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)  <br>More info  <br>The first component of this [Color](../-color/index.md) defined by the [colorSpace](../-color/color-space.md)s [ColorModel](../../com.chrynan.colors.space/-color-model/index.md).  <br><br><br>|
| <a name="com.chrynan.colors/Color/component2/#/PointingToDeclaration/"></a>[component2](../-color/component2.md)| <a name="com.chrynan.colors/Color/component2/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract operator fun [component2](../-color/component2.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)  <br>More info  <br>The second component of this [Color](../-color/index.md) defined by the [colorSpace](../-color/color-space.md)s [ColorModel](../../com.chrynan.colors.space/-color-model/index.md).  <br><br><br>|
| <a name="com.chrynan.colors/Color/component3/#/PointingToDeclaration/"></a>[component3](../-color/component3.md)| <a name="com.chrynan.colors/Color/component3/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract operator fun [component3](../-color/component3.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)  <br>More info  <br>The third component of this [Color](../-color/index.md) defined by the [colorSpace](../-color/color-space.md)s [ColorModel](../../com.chrynan.colors.space/-color-model/index.md).  <br><br><br>|
| <a name="com.chrynan.colors/Color/component4/#/PointingToDeclaration/"></a>[component4](../-color/component4.md)| <a name="com.chrynan.colors/Color/component4/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract operator fun [component4](../-color/component4.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)  <br>More info  <br>The fourth component of this [Color](../-color/index.md) defined by the [colorSpace](../-color/color-space.md)s [ColorModel](../../com.chrynan.colors.space/-color-model/index.md).  <br><br><br>|
| <a name="com.chrynan.colors/Color/convert/#com.chrynan.colors.space.ColorSpace#com.chrynan.colors.space.RenderIntent/PointingToDeclaration/"></a>[convert](../-color/convert.md)| <a name="com.chrynan.colors/Color/convert/#com.chrynan.colors.space.ColorSpace#com.chrynan.colors.space.RenderIntent/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [convert](../-color/convert.md)(colorSpace: [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md), renderIntent: [RenderIntent](../../com.chrynan.colors.space/-render-intent/index.md) = RenderIntent.PERCEPTUAL): [Color](../-color/index.md)  <br>More info  <br>Converts this [Color](../-color/index.md) value to a [Color](../-color/index.md) value in the provided [colorSpace](../-color/convert.md) using the provided [renderIntent](../-color/convert.md).  <br><br><br>|
| <a name="com.chrynan.colors/Color/copy/#kotlin.Float#kotlin.Float#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>[copy](../-color/copy.md)| <a name="com.chrynan.colors/Color/copy/#kotlin.Float#kotlin.Float#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [copy](../-color/copy.md)(component1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = this.component1(), component2: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = this.component2(), component3: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = this.component3(), component4: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = this.component4(), alpha: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = this.alpha): [Color](../-color/index.md)  <br>More info  <br>Copies the existing color, changing only the provided values.  <br><br><br>|
| <a name="com.chrynan.colors/Color/luminance/#/PointingToDeclaration/"></a>[luminance](../-color/luminance.md)| <a name="com.chrynan.colors/Color/luminance/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [luminance](../-color/luminance.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)  <br>More info  <br>Returns the relative luminance of this color.  <br><br><br>|
| <a name="com.chrynan.colors/Color/toRgbaColor/#com.chrynan.colors.space.ColorSpace#com.chrynan.colors.space.RenderIntent/PointingToDeclaration/"></a>[toRgbaColor](../-color/to-rgba-color.md)| <a name="com.chrynan.colors/Color/toRgbaColor/#com.chrynan.colors.space.ColorSpace#com.chrynan.colors.space.RenderIntent/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [toRgbaColor](../-color/to-rgba-color.md)(destinationColorSpace: [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md) = ColorSpaces.SRGB, renderIntent: [RenderIntent](../../com.chrynan.colors.space/-render-intent/index.md) = RenderIntent.PERCEPTUAL): [RgbaColor](../-rgba-color/index.md)  <br>More info  <br>Converts this [Color](../-color/index.md) instance into a [RgbaColor](../-rgba-color/index.md).  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors/XyzColor/alpha/#/PointingToDeclaration/"></a>[alpha](index.md#%5Bcom.chrynan.colors%2FXyzColor%2Falpha%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1235785652)| <a name="com.chrynan.colors/XyzColor/alpha/#/PointingToDeclaration/"></a> [common] abstract val [alpha](index.md#%5Bcom.chrynan.colors%2FXyzColor%2Falpha%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1235785652): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)A value between 0.0 and 1.0 representing the opacity value of this Color instance.   <br>|
| <a name="com.chrynan.colors/XyzColor/colorInt/#/PointingToDeclaration/"></a>[colorInt](index.md#%5Bcom.chrynan.colors%2FXyzColor%2FcolorInt%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1235785652)| <a name="com.chrynan.colors/XyzColor/colorInt/#/PointingToDeclaration/"></a> [common] abstract val [colorInt](index.md#%5Bcom.chrynan.colors%2FXyzColor%2FcolorInt%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1235785652): [ColorInt](../-color-int/index.md)The [ColorInt](../-color-int/index.md) representation of this [Color](../-color/index.md) value.   <br>|
| <a name="com.chrynan.colors/XyzColor/colorLong/#/PointingToDeclaration/"></a>[colorLong](index.md#%5Bcom.chrynan.colors%2FXyzColor%2FcolorLong%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1235785652)| <a name="com.chrynan.colors/XyzColor/colorLong/#/PointingToDeclaration/"></a> [common] abstract val [colorLong](index.md#%5Bcom.chrynan.colors%2FXyzColor%2FcolorLong%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1235785652): [ColorLong](../-color-long/index.md)The [ColorLong](../-color-long/index.md) representation of this [Color](../-color/index.md) value.   <br>|
| <a name="com.chrynan.colors/XyzColor/colorSpace/#/PointingToDeclaration/"></a>[colorSpace](index.md#%5Bcom.chrynan.colors%2FXyzColor%2FcolorSpace%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1235785652)| <a name="com.chrynan.colors/XyzColor/colorSpace/#/PointingToDeclaration/"></a> [common] abstract val [colorSpace](index.md#%5Bcom.chrynan.colors%2FXyzColor%2FcolorSpace%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1235785652): [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md)The [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md) that this [Color](../-color/index.md) belongs to.   <br>|
| <a name="com.chrynan.colors/XyzColor/components/#/PointingToDeclaration/"></a>[components](index.md#%5Bcom.chrynan.colors%2FXyzColor%2Fcomponents%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1235785652)| <a name="com.chrynan.colors/XyzColor/components/#/PointingToDeclaration/"></a> [common] abstract val [components](index.md#%5Bcom.chrynan.colors%2FXyzColor%2Fcomponents%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1235785652): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)Returns this color's components as a new array.   <br>|
| <a name="com.chrynan.colors/XyzColor/cssValue/#/PointingToDeclaration/"></a>[cssValue](index.md#%5Bcom.chrynan.colors%2FXyzColor%2FcssValue%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1235785652)| <a name="com.chrynan.colors/XyzColor/cssValue/#/PointingToDeclaration/"></a> [common] abstract val [cssValue](index.md#%5Bcom.chrynan.colors%2FXyzColor%2FcssValue%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1235785652): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)A [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) CSS value representation of this [Color](../-color/index.md) value.   <br>|
| <a name="com.chrynan.colors/XyzColor/x/#/PointingToDeclaration/"></a>[x](x.md)| <a name="com.chrynan.colors/XyzColor/x/#/PointingToDeclaration/"></a> [common] open val [x](x.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)This is the first component in a [Color](../-color/index.md) with a [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md) that has a [ColorModel.XYZ](../../com.chrynan.colors.space/-color-model/-x-y-z/index.md) color model.   <br>|
| <a name="com.chrynan.colors/XyzColor/y/#/PointingToDeclaration/"></a>[y](y.md)| <a name="com.chrynan.colors/XyzColor/y/#/PointingToDeclaration/"></a> [common] open val [y](y.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)This is the second component in a [Color](../-color/index.md) with a [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md) that has a [ColorModel.XYZ](../../com.chrynan.colors.space/-color-model/-x-y-z/index.md) color model.   <br>|
| <a name="com.chrynan.colors/XyzColor/z/#/PointingToDeclaration/"></a>[z](z.md)| <a name="com.chrynan.colors/XyzColor/z/#/PointingToDeclaration/"></a> [common] open val [z](z.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)This is the second component in a [Color](../-color/index.md) with a [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md) that has a [ColorModel.XYZ](../../com.chrynan.colors.space/-color-model/-x-y-z/index.md) color model.   <br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="com.chrynan.colors/BaseColor///PointingToDeclaration/"></a>[BaseColor](../-base-color/index.md)|


## Extensions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors//blueYellow/com.chrynan.colors.XyzColor#/PointingToDeclaration/"></a>[blueYellow](../blue-yellow.md)| <a name="com.chrynan.colors//blueYellow/com.chrynan.colors.XyzColor#/PointingToDeclaration/"></a>[common]  <br>Content  <br>val [XyzColor](index.md).[blueYellow](../blue-yellow.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)  <br><br><br>|
| <a name="com.chrynan.colors//greenRed/com.chrynan.colors.XyzColor#/PointingToDeclaration/"></a>[greenRed](../green-red.md)| <a name="com.chrynan.colors//greenRed/com.chrynan.colors.XyzColor#/PointingToDeclaration/"></a>[common]  <br>Content  <br>val [XyzColor](index.md).[greenRed](../green-red.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)  <br><br><br>|
| <a name="com.chrynan.colors//lightness/com.chrynan.colors.XyzColor#/PointingToDeclaration/"></a>[lightness](../lightness.md)| <a name="com.chrynan.colors//lightness/com.chrynan.colors.XyzColor#/PointingToDeclaration/"></a>[common]  <br>Content  <br>val [XyzColor](index.md).[lightness](../lightness.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)  <br><br><br>|

