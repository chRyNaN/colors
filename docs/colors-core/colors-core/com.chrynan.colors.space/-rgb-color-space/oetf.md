//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[RgbColorSpace](index.md)/[oetf](oetf.md)



# oetf  
[common]  
Content  
val [oetf](oetf.md): ([Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)) -> [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)  
More info  


Returns the opto-electronic transfer function (OETF) of this color space. The inverse function is the electro-optical transfer function (EOTF) returned by [eotf](eotf.md). These functions are defined to satisfy the following equality for x ∈ [0..1]:

    OETF(EOTF(x) = EOTF(OETF(x)) = x

For RGB colors, this function can be used to convert from linear space to "gamma space" (gamma encoded). The terms gamma space and gamma encoded are frequently used because many OETFs can be closely approximated using a simple power function of the form x^γ (the approximation of the [sRGB](../-color-spaces/-s-r-g-b.md) OETF uses γ = 2.2 for instance).



#### Return  


A transfer function that converts from linear space to "gamma space"



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/oetf/#/PointingToDeclaration/"></a>[com.chrynan.colors.space.RgbColorSpace](transfer-parameters.md)| <a name="com.chrynan.colors.space/RgbColorSpace/oetf/#/PointingToDeclaration/"></a>|
  
  



