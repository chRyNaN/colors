//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[RgbColorSpace](index.md)/[getTransform](get-transform.md)



# getTransform  
[common]  
Content  
fun [getTransform](get-transform.md)(): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  
More info  


Returns the transform of this color space as a new array. The transform is used to convert from RGB to XYZ (with the same white point as this color space). To connect color spaces, you must first [adapt](../adapt.md) them to the same white point.



It is recommended to use [ColorSpace.connect](../connect.md) to convert between color spaces.



#### Return  


A new array of 9 floats



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/getTransform/#/PointingToDeclaration/"></a>[com.chrynan.colors.space.RgbColorSpace](get-inverse-transform.md)| <a name="com.chrynan.colors.space/RgbColorSpace/getTransform/#/PointingToDeclaration/"></a>|
  
  


[common]  
Content  
fun [getTransform](get-transform.md)(transform: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  
More info  


Copies the transform of this color space in specified array. The transform is used to convert from RGB to XYZ (with the same white point as this color space). To connect color spaces, you must first [adapt](../adapt.md) them to the same white point.



It is recommended to use [ColorSpace.connect](../connect.md) to convert between color spaces.



#### Return  


[transform](get-transform.md), modified to contain the transform for this color space.



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/getTransform/#kotlin.FloatArray/PointingToDeclaration/"></a>[com.chrynan.colors.space.RgbColorSpace](get-inverse-transform.md)| <a name="com.chrynan.colors.space/RgbColorSpace/getTransform/#kotlin.FloatArray/PointingToDeclaration/"></a>|
  


## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/getTransform/#kotlin.FloatArray/PointingToDeclaration/"></a>transform| <a name="com.chrynan.colors.space/RgbColorSpace/getTransform/#kotlin.FloatArray/PointingToDeclaration/"></a><br><br>The destination array, cannot be null, its length must be >= 9<br><br>|
  
  



