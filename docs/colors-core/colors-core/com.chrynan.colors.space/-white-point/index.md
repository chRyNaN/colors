//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[WhitePoint](index.md)



# WhitePoint  
 [common] data class [WhitePoint](index.md)(**x**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), **y**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))

Class for constructing white points used in [RGB](../-rgb-color-space/index.md) color space. The value is stored in the CIE xyY color space. The Y component of the white point is assumed to be 1.



A [WhitePoint](index.md) is used to determine the coordinate of a base white value for an image. It should be the coordinate within an image, or 2-D pixel matrix, that contains the color that is the closest to white within the image. This is useful when converting between Color Spaces for different conversion algorithms and [RenderIntent](../-render-intent/index.md)s.

   


## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/WhitePoint///PointingToDeclaration/"></a>| <a name="com.chrynan.colors.space/WhitePoint///PointingToDeclaration/"></a><br><br>[Definition Two](https://en.wikipedia.org/wiki/White_point)<br><br>|
| <a name="com.chrynan.colors.space/WhitePoint///PointingToDeclaration/"></a>[com.chrynan.colors.space.Illuminant](../-illuminant/index.md)| <a name="com.chrynan.colors.space/WhitePoint///PointingToDeclaration/"></a>|
  


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/WhitePoint/WhitePoint/#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>[WhitePoint](-white-point.md)| <a name="com.chrynan.colors.space/WhitePoint/WhitePoint/#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a> [common] fun [WhitePoint](-white-point.md)(x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), z: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))Illuminant for CIE XYZ white point   <br>|
| <a name="com.chrynan.colors.space/WhitePoint/WhitePoint/#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>[WhitePoint](-white-point.md)| <a name="com.chrynan.colors.space/WhitePoint/WhitePoint/#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a> [common] fun [WhitePoint](-white-point.md)(x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))   <br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.space/WhitePoint/toXyz/#/PointingToDeclaration/"></a>[toXyz](to-xyz.md)| <a name="com.chrynan.colors.space/WhitePoint/toXyz/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [toXyz](to-xyz.md)(): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  <br>More info  <br>Converts a value from CIE xyY to CIE XYZ.  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.space/WhitePoint/x/#/PointingToDeclaration/"></a>[x](x.md)| <a name="com.chrynan.colors.space/WhitePoint/x/#/PointingToDeclaration/"></a> [common] val [x](x.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)   <br>|
| <a name="com.chrynan.colors.space/WhitePoint/y/#/PointingToDeclaration/"></a>[y](y.md)| <a name="com.chrynan.colors.space/WhitePoint/y/#/PointingToDeclaration/"></a> [common] val [y](y.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)   <br>|

