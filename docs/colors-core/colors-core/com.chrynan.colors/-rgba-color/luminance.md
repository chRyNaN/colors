//[colors-core](../../../index.md)/[com.chrynan.colors](../index.md)/[RgbaColor](index.md)/[luminance](luminance.md)



# luminance  
[common]  
Content  
abstract fun [luminance](luminance.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)  
More info  


Returns the relative luminance of this color.



Based on the formula for relative luminance defined in WCAG 2.0, W3C Recommendation 11 December 2008.



#### Return  


A value between 0 (darkest black) and 1 (lightest white)



#### Throws  
  
| | |
|---|---|
| <a name="com.chrynan.colors/RgbaColor/luminance/#/PointingToDeclaration/"></a>[kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html)| <a name="com.chrynan.colors/RgbaColor/luminance/#/PointingToDeclaration/"></a><br><br>If the this color's color space does not use the [RGB](../../com.chrynan.colors.space/-color-model/-r-g-b/index.md) color model<br><br>|
  



