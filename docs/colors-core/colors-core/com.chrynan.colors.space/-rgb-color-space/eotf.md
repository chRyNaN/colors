//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[RgbColorSpace](index.md)/[eotf](eotf.md)



# eotf  
[common]  
Content  
val [eotf](eotf.md): ([Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)) -> [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)  
More info  


Returns the electro-optical transfer function (EOTF) of this color space. The inverse function is the opto-electronic transfer function (OETF) returned by [oetf](oetf.md). These functions are defined to satisfy the following equality for x in [0..1]:

    OETF(EOTF(x) = EOTF(OETF(x)) = x

For RGB colors, this function can be used to convert from "gamma space" (gamma encoded) to linear space. The terms gamma space and gamma encoded are frequently used because many EOTFs can be closely approximated using a simple power function of the form x^γ (the approximation of the [sRGB](../-color-spaces/-s-r-g-b.md) EOTF uses γ = 2.2 for instance).



#### Return  


A transfer function that converts from "gamma space" to linear space



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/eotf/#/PointingToDeclaration/"></a>[com.chrynan.colors.space.RgbColorSpace](transfer-parameters.md)| <a name="com.chrynan.colors.space/RgbColorSpace/eotf/#/PointingToDeclaration/"></a>|
  
  



