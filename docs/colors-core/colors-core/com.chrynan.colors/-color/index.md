//[colors-core](../../../index.md)/[com.chrynan.colors](../index.md)/[Color](index.md)



# Color  
 [common] interface [Color](index.md)

A representation of a Color.

   


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors/Color.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.colors/Color.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors/Color/component1/#/PointingToDeclaration/"></a>[component1](component1.md)| <a name="com.chrynan.colors/Color/component1/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract operator fun [component1](component1.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)  <br>More info  <br>The first component of this [Color](index.md) defined by the [colorSpace](color-space.md)s [ColorModel](../../com.chrynan.colors.space/-color-model/index.md).  <br><br><br>|
| <a name="com.chrynan.colors/Color/component2/#/PointingToDeclaration/"></a>[component2](component2.md)| <a name="com.chrynan.colors/Color/component2/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract operator fun [component2](component2.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)  <br>More info  <br>The second component of this [Color](index.md) defined by the [colorSpace](color-space.md)s [ColorModel](../../com.chrynan.colors.space/-color-model/index.md).  <br><br><br>|
| <a name="com.chrynan.colors/Color/component3/#/PointingToDeclaration/"></a>[component3](component3.md)| <a name="com.chrynan.colors/Color/component3/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract operator fun [component3](component3.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)  <br>More info  <br>The third component of this [Color](index.md) defined by the [colorSpace](color-space.md)s [ColorModel](../../com.chrynan.colors.space/-color-model/index.md).  <br><br><br>|
| <a name="com.chrynan.colors/Color/component4/#/PointingToDeclaration/"></a>[component4](component4.md)| <a name="com.chrynan.colors/Color/component4/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract operator fun [component4](component4.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)  <br>More info  <br>The fourth component of this [Color](index.md) defined by the [colorSpace](color-space.md)s [ColorModel](../../com.chrynan.colors.space/-color-model/index.md).  <br><br><br>|
| <a name="com.chrynan.colors/Color/convert/#com.chrynan.colors.space.ColorSpace#com.chrynan.colors.space.RenderIntent/PointingToDeclaration/"></a>[convert](convert.md)| <a name="com.chrynan.colors/Color/convert/#com.chrynan.colors.space.ColorSpace#com.chrynan.colors.space.RenderIntent/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [convert](convert.md)(colorSpace: [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md), renderIntent: [RenderIntent](../../com.chrynan.colors.space/-render-intent/index.md) = RenderIntent.PERCEPTUAL): [Color](index.md)  <br>More info  <br>Converts this [Color](index.md) value to a [Color](index.md) value in the provided [colorSpace](convert.md) using the provided [renderIntent](convert.md).  <br><br><br>|
| <a name="com.chrynan.colors/Color/copy/#kotlin.Float#kotlin.Float#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>[copy](copy.md)| <a name="com.chrynan.colors/Color/copy/#kotlin.Float#kotlin.Float#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [copy](copy.md)(component1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = this.component1(), component2: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = this.component2(), component3: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = this.component3(), component4: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = this.component4(), alpha: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = this.alpha): [Color](index.md)  <br>More info  <br>Copies the existing color, changing only the provided values.  <br><br><br>|
| <a name="com.chrynan.colors/Color/luminance/#/PointingToDeclaration/"></a>[luminance](luminance.md)| <a name="com.chrynan.colors/Color/luminance/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [luminance](luminance.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)  <br>More info  <br>Returns the relative luminance of this color.  <br><br><br>|
| <a name="com.chrynan.colors/Color/toRgbaColor/#com.chrynan.colors.space.ColorSpace#com.chrynan.colors.space.RenderIntent/PointingToDeclaration/"></a>[toRgbaColor](to-rgba-color.md)| <a name="com.chrynan.colors/Color/toRgbaColor/#com.chrynan.colors.space.ColorSpace#com.chrynan.colors.space.RenderIntent/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [toRgbaColor](to-rgba-color.md)(destinationColorSpace: [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md) = ColorSpaces.SRGB, renderIntent: [RenderIntent](../../com.chrynan.colors.space/-render-intent/index.md) = RenderIntent.PERCEPTUAL): [RgbaColor](../-rgba-color/index.md)  <br>More info  <br>Converts this [Color](index.md) instance into a [RgbaColor](../-rgba-color/index.md).  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors/Color/alpha/#/PointingToDeclaration/"></a>[alpha](alpha.md)| <a name="com.chrynan.colors/Color/alpha/#/PointingToDeclaration/"></a> [common] abstract val [alpha](alpha.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)A value between 0.0 and 1.0 representing the opacity value of this Color instance.   <br>|
| <a name="com.chrynan.colors/Color/colorInt/#/PointingToDeclaration/"></a>[colorInt](color-int.md)| <a name="com.chrynan.colors/Color/colorInt/#/PointingToDeclaration/"></a> [common] abstract val [colorInt](color-int.md): [ColorInt](../-color-int/index.md)The [ColorInt](../-color-int/index.md) representation of this [Color](index.md) value.   <br>|
| <a name="com.chrynan.colors/Color/colorLong/#/PointingToDeclaration/"></a>[colorLong](color-long.md)| <a name="com.chrynan.colors/Color/colorLong/#/PointingToDeclaration/"></a> [common] abstract val [colorLong](color-long.md): [ColorLong](../-color-long/index.md)The [ColorLong](../-color-long/index.md) representation of this [Color](index.md) value.   <br>|
| <a name="com.chrynan.colors/Color/colorSpace/#/PointingToDeclaration/"></a>[colorSpace](color-space.md)| <a name="com.chrynan.colors/Color/colorSpace/#/PointingToDeclaration/"></a> [common] abstract val [colorSpace](color-space.md): [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md)The [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md) that this [Color](index.md) belongs to.   <br>|
| <a name="com.chrynan.colors/Color/components/#/PointingToDeclaration/"></a>[components](components.md)| <a name="com.chrynan.colors/Color/components/#/PointingToDeclaration/"></a> [common] abstract val [components](components.md): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)Returns this color's components as a new array.   <br>|
| <a name="com.chrynan.colors/Color/cssValue/#/PointingToDeclaration/"></a>[cssValue](css-value.md)| <a name="com.chrynan.colors/Color/cssValue/#/PointingToDeclaration/"></a> [common] abstract val [cssValue](css-value.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)A [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) CSS value representation of this [Color](index.md) value.   <br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="com.chrynan.colors/BaseColor///PointingToDeclaration/"></a>[BaseColor](../-base-color/index.md)|
| <a name="com.chrynan.colors/HexadecimalColor///PointingToDeclaration/"></a>[HexadecimalColor](../-hexadecimal-color/index.md)|
| <a name="com.chrynan.colors/LabColor///PointingToDeclaration/"></a>[LabColor](../-lab-color/index.md)|
| <a name="com.chrynan.colors/RgbaColor///PointingToDeclaration/"></a>[RgbaColor](../-rgba-color/index.md)|
| <a name="com.chrynan.colors/XyzColor///PointingToDeclaration/"></a>[XyzColor](../-xyz-color/index.md)|


## Extensions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors//contrast/com.chrynan.colors.Color#com.chrynan.colors.Color/PointingToDeclaration/"></a>[contrast](../contrast.md)| <a name="com.chrynan.colors//contrast/com.chrynan.colors.Color#com.chrynan.colors.Color/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [Color](index.md).[contrast](../contrast.md)(other: [Color](index.md)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)  <br>More info  <br>Retrieves a [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), in the range of 0.0f to 1.  <br><br><br>|
| <a name="com.chrynan.colors//opacityInt/com.chrynan.colors.Color#/PointingToDeclaration/"></a>[opacityInt](../opacity-int.md)| <a name="com.chrynan.colors//opacityInt/com.chrynan.colors.Color#/PointingToDeclaration/"></a>[common]  <br>Content  <br>val [Color](index.md).[opacityInt](../opacity-int.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br>More info  <br>Retrieves the [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) opacity value for this [Color](index.md).  <br><br><br>|

