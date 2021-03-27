//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[RgbColorSpace](index.md)/[getInverseTransform](get-inverse-transform.md)



# getInverseTransform  
[common]  
Content  
fun [getInverseTransform](get-inverse-transform.md)(): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  
More info  


Returns the inverse transform of this color space as a new array. The inverse transform is used to convert from XYZ to RGB (with the same white point as this color space). To connect color spaces, you must first [adapt](../adapt.md) them to the same white point.



It is recommended to use [ColorSpace.connect](../connect.md) to convert between color spaces.



#### Return  


A new array of 9 floats



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/getInverseTransform/#/PointingToDeclaration/"></a>[com.chrynan.colors.space.RgbColorSpace](get-transform.md)| <a name="com.chrynan.colors.space/RgbColorSpace/getInverseTransform/#/PointingToDeclaration/"></a>|
  
  


[common]  
Content  
fun [getInverseTransform](get-inverse-transform.md)(inverseTransform: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  
More info  


Copies the inverse transform of this color space in specified array. The inverse transform is used to convert from XYZ to RGB (with the same white point as this color space). To connect color spaces, you must first [adapt](../adapt.md) them to the same white point.



It is recommended to use [ColorSpace.connect](../connect.md) to convert between color spaces.



#### Return  


The [inverseTransform](get-inverse-transform.md) array passed as a parameter, modified to contain the inverse transform of this color space.



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/getInverseTransform/#kotlin.FloatArray/PointingToDeclaration/"></a>[com.chrynan.colors.space.RgbColorSpace](get-transform.md)| <a name="com.chrynan.colors.space/RgbColorSpace/getInverseTransform/#kotlin.FloatArray/PointingToDeclaration/"></a>|
  


## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/getInverseTransform/#kotlin.FloatArray/PointingToDeclaration/"></a>inverseTransform| <a name="com.chrynan.colors.space/RgbColorSpace/getInverseTransform/#kotlin.FloatArray/PointingToDeclaration/"></a><br><br>The destination array, cannot be null, its length must be >= 9<br><br>|
  
  



