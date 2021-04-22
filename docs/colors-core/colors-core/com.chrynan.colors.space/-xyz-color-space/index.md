//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[XyzColorSpace](index.md)



# XyzColorSpace  
 [common] class [XyzColorSpace](index.md)(**name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **id**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [ColorSpace](../-color-space/index.md)

Implementation of the CIE XYZ color space. Assumes the white point is D50.

   


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/XyzColorSpace/XyzColorSpace/#kotlin.String#kotlin.Int/PointingToDeclaration/"></a>[XyzColorSpace](-xyz-color-space.md)| <a name="com.chrynan.colors.space/XyzColorSpace/XyzColorSpace/#kotlin.String#kotlin.Int/PointingToDeclaration/"></a> [common] fun [XyzColorSpace](-xyz-color-space.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), id: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.space/XyzColorSpace.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.colors.space/XyzColorSpace.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.space/ColorSpace/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](../-color-space/equals.md)| <a name="com.chrynan.colors.space/ColorSpace/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator override fun [equals](../-color-space/equals.md)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>|
| <a name="com.chrynan.colors.space/XyzColorSpace/fromXyz/#kotlin.FloatArray/PointingToDeclaration/"></a>[fromXyz](from-xyz.md)| <a name="com.chrynan.colors.space/XyzColorSpace/fromXyz/#kotlin.FloatArray/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [fromXyz](from-xyz.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  <br>fun [fromXyz](../-color-space/from-xyz.md)(x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), z: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  <br>More info  <br>Converts tristimulus values from the CIE XYZ space to this color space's color model.  <br><br><br>|
| <a name="com.chrynan.colors.space/XyzColorSpace/getMaxValue/#kotlin.Int/PointingToDeclaration/"></a>[getMaxValue](get-max-value.md)| <a name="com.chrynan.colors.space/XyzColorSpace/getMaxValue/#kotlin.Int/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [getMaxValue](get-max-value.md)(component: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)  <br>More info  <br>Returns the maximum valid value for the specified component of this color space's color model.  <br><br><br>|
| <a name="com.chrynan.colors.space/XyzColorSpace/getMinValue/#kotlin.Int/PointingToDeclaration/"></a>[getMinValue](get-min-value.md)| <a name="com.chrynan.colors.space/XyzColorSpace/getMinValue/#kotlin.Int/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [getMinValue](get-min-value.md)(component: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)  <br>More info  <br>Returns the minimum valid value for the specified component of this color space's color model.  <br><br><br>|
| <a name="com.chrynan.colors.space/ColorSpace/hashCode/#/PointingToDeclaration/"></a>[hashCode](../-color-space/hash-code.md)| <a name="com.chrynan.colors.space/ColorSpace/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [hashCode](../-color-space/hash-code.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>|
| <a name="com.chrynan.colors.space/ColorSpace/toString/#/PointingToDeclaration/"></a>[toString](../-color-space/to-string.md)| <a name="com.chrynan.colors.space/ColorSpace/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [toString](../-color-space/to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br>More info  <br>Returns a string representation of the object.  <br><br><br>|
| <a name="com.chrynan.colors.space/XyzColorSpace/toXyz/#kotlin.FloatArray/PointingToDeclaration/"></a>[toXyz](to-xyz.md)| <a name="com.chrynan.colors.space/XyzColorSpace/toXyz/#kotlin.FloatArray/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [toXyz](to-xyz.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  <br>fun [toXyz](../-color-space/to-xyz.md)(r: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), g: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), b: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  <br>More info  <br>Converts a color value from this color space's model to tristimulus CIE XYZ values.  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.space/XyzColorSpace/componentCount/#/PointingToDeclaration/"></a>[componentCount](index.md#%5Bcom.chrynan.colors.space%2FXyzColorSpace%2FcomponentCount%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F988389714)| <a name="com.chrynan.colors.space/XyzColorSpace/componentCount/#/PointingToDeclaration/"></a> [common] val [componentCount](index.md#%5Bcom.chrynan.colors.space%2FXyzColorSpace%2FcomponentCount%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F988389714): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)Returns the number of components that form a color value according to this color space's color model.   <br>|
| <a name="com.chrynan.colors.space/XyzColorSpace/id/#/PointingToDeclaration/"></a>[id](index.md#%5Bcom.chrynan.colors.space%2FXyzColorSpace%2Fid%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F988389714)| <a name="com.chrynan.colors.space/XyzColorSpace/id/#/PointingToDeclaration/"></a> [common] val [id](index.md#%5Bcom.chrynan.colors.space%2FXyzColorSpace%2Fid%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F988389714): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)The ID of this color space.   <br>|
| <a name="com.chrynan.colors.space/XyzColorSpace/isSrgb/#/PointingToDeclaration/"></a>[isSrgb](index.md#%5Bcom.chrynan.colors.space%2FXyzColorSpace%2FisSrgb%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F988389714)| <a name="com.chrynan.colors.space/XyzColorSpace/isSrgb/#/PointingToDeclaration/"></a> [common] open val [isSrgb](index.md#%5Bcom.chrynan.colors.space%2FXyzColorSpace%2FisSrgb%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F988389714): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)Indicates whether this color space is the sRGB color space or equivalent to the sRGB color space.   <br>|
| <a name="com.chrynan.colors.space/XyzColorSpace/isWideGamut/#/PointingToDeclaration/"></a>[isWideGamut](is-wide-gamut.md)| <a name="com.chrynan.colors.space/XyzColorSpace/isWideGamut/#/PointingToDeclaration/"></a> [common] open override val [isWideGamut](is-wide-gamut.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)Returns whether this color space is a wide-gamut color space.   <br>|
| <a name="com.chrynan.colors.space/XyzColorSpace/model/#/PointingToDeclaration/"></a>[model](index.md#%5Bcom.chrynan.colors.space%2FXyzColorSpace%2Fmodel%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F988389714)| <a name="com.chrynan.colors.space/XyzColorSpace/model/#/PointingToDeclaration/"></a> [common] val [model](index.md#%5Bcom.chrynan.colors.space%2FXyzColorSpace%2Fmodel%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F988389714): [ColorModel](../-color-model/index.md)The color model of this color space.   <br>|
| <a name="com.chrynan.colors.space/XyzColorSpace/name/#/PointingToDeclaration/"></a>[name](index.md#%5Bcom.chrynan.colors.space%2FXyzColorSpace%2Fname%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F988389714)| <a name="com.chrynan.colors.space/XyzColorSpace/name/#/PointingToDeclaration/"></a> [common] val [name](index.md#%5Bcom.chrynan.colors.space%2FXyzColorSpace%2Fname%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F988389714): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Returns the name of this color space.   <br>|
