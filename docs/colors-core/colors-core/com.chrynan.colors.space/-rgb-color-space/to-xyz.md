//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[RgbColorSpace](index.md)/[toXyz](to-xyz.md)



# toXyz  
[common]  
Content  
open override fun [toXyz](to-xyz.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  
More info  


Converts a color value from this color space's model to tristimulus CIE XYZ values. If the color model of this color space is not [RGB](../-color-model/-r-g-b/index.md), it is assumed that the target CIE XYZ space uses a [D50](../-illuminant/-d50.md) standard illuminant.



The specified array's length  must be at least equal to to the number of color components as returned by [ColorModel.componentCount](../-color-model/component-count.md).



#### Return  


The array passed in parameter [v](to-xyz.md).



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/toXyz/#kotlin.FloatArray/PointingToDeclaration/"></a>[com.chrynan.colors.space.RgbColorSpace](from-xyz.md)| <a name="com.chrynan.colors.space/RgbColorSpace/toXyz/#kotlin.FloatArray/PointingToDeclaration/"></a>|
  


## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/toXyz/#kotlin.FloatArray/PointingToDeclaration/"></a>v| <a name="com.chrynan.colors.space/RgbColorSpace/toXyz/#kotlin.FloatArray/PointingToDeclaration/"></a><br><br>An array of color components containing the color space's color value to convert to XYZ, and large enough to hold the resulting tristimulus XYZ values, at least 3 values.<br><br>|
  
  



