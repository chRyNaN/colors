//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[RgbColorSpace](index.md)/[getPrimaries](get-primaries.md)



# getPrimaries  
[common]  
Content  
fun [getPrimaries](get-primaries.md)(): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  
More info  


Returns the primaries of this color space as a new array of 6 floats. The Y component is assumed to be 1 and is therefore not copied into the destination. The x and y components of the first primary are written in the array at positions 0 and 1 respectively.



#### Return  


A new non-null array of 2 floats



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/getPrimaries/#/PointingToDeclaration/"></a>[com.chrynan.colors.space.RgbColorSpace](white-point.md)| <a name="com.chrynan.colors.space/RgbColorSpace/getPrimaries/#/PointingToDeclaration/"></a>|
  
  


[common]  
Content  
fun [getPrimaries](get-primaries.md)(primaries: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  
More info  


Copies the primaries of this color space in specified array. The Y component is assumed to be 1 and is therefore not copied into the destination. The x and y components of the first primary are written in the array at positions 0 and 1 respectively.



#### Return  


[primaries](get-primaries.md) array, modified to contain the primaries of this color space.



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/getPrimaries/#kotlin.FloatArray/PointingToDeclaration/"></a>[com.chrynan.colors.space.RgbColorSpace](get-primaries.md)| <a name="com.chrynan.colors.space/RgbColorSpace/getPrimaries/#kotlin.FloatArray/PointingToDeclaration/"></a>|
  


## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/getPrimaries/#kotlin.FloatArray/PointingToDeclaration/"></a>primaries| <a name="com.chrynan.colors.space/RgbColorSpace/getPrimaries/#kotlin.FloatArray/PointingToDeclaration/"></a><br><br>The destination array, cannot be null, its length must be >= 6<br><br>|
  
  



