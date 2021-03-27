//[colors-core](../../../index.md)/[com.chrynan.colors](../index.md)/[ColorInt](index.md)



# ColorInt  
 [common] inline class [ColorInt](index.md)(**value**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))

An inline class wrapping an [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) that is meant to represent a [Color](../-color/index.md) value in an [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) form. This [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) should have all of the necessary color information encoded into it. The [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) should be a packed color value, in the SRGB Color Space, in the form AARRGGBB. This is similar to the "ColorInt" native representation on the Android platform.



##  ColorInt Components:  
  
|  Component |  Name |  Size |  Range | 
|---|---|---|---|
| <a name="com.chrynan.colors/ColorInt///PointingToDeclaration/"></a>A| <a name="com.chrynan.colors/ColorInt///PointingToDeclaration/"></a>Alpha| <a name="com.chrynan.colors/ColorInt///PointingToDeclaration/"></a>8 Bits| <a name="com.chrynan.colors/ColorInt///PointingToDeclaration/"></a>0...255|
| <a name="com.chrynan.colors/ColorInt///PointingToDeclaration/"></a>R| <a name="com.chrynan.colors/ColorInt///PointingToDeclaration/"></a>Red| <a name="com.chrynan.colors/ColorInt///PointingToDeclaration/"></a>8 Bits| <a name="com.chrynan.colors/ColorInt///PointingToDeclaration/"></a>0...255|
| <a name="com.chrynan.colors/ColorInt///PointingToDeclaration/"></a>G| <a name="com.chrynan.colors/ColorInt///PointingToDeclaration/"></a>Green| <a name="com.chrynan.colors/ColorInt///PointingToDeclaration/"></a>8 Bits| <a name="com.chrynan.colors/ColorInt///PointingToDeclaration/"></a>0...255|
| <a name="com.chrynan.colors/ColorInt///PointingToDeclaration/"></a>B| <a name="com.chrynan.colors/ColorInt///PointingToDeclaration/"></a>Blue| <a name="com.chrynan.colors/ColorInt///PointingToDeclaration/"></a>8 Bits| <a name="com.chrynan.colors/ColorInt///PointingToDeclaration/"></a>0...255|


The components in the above table are listed in encoding order, which is why [ColorInt](index.md)s are called "ARGB" colors.

   


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.colors/ColorInt/ColorInt/#kotlin.Int/PointingToDeclaration/"></a>[ColorInt](-color-int.md)| <a name="com.chrynan.colors/ColorInt/ColorInt/#kotlin.Int/PointingToDeclaration/"></a> [common] fun [ColorInt](-color-int.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))   <br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors/ColorInt/value/#/PointingToDeclaration/"></a>[value](value.md)| <a name="com.chrynan.colors/ColorInt/value/#/PointingToDeclaration/"></a> [common] val [value](value.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)   <br>|


## Extensions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors//toColor/com.chrynan.colors.ColorInt#/PointingToDeclaration/"></a>[toColor](../to-color.md)| <a name="com.chrynan.colors//toColor/com.chrynan.colors.ColorInt#/PointingToDeclaration/"></a>[common]  <br>Content  <br>@[ExperimentalUnsignedTypes](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-experimental-unsigned-types/index.html)()  <br>  <br>fun [ColorInt](index.md).[toColor](../to-color.md)(): [RgbaColor](../-rgba-color/index.md)  <br>More info  <br>Converts this [ColorInt](index.md) to an [RgbaColor](../-rgba-color/index.md).  <br><br><br>|

