//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[RgbColorSpace](index.md)/[toLinear](to-linear.md)



# toLinear  
[common]  
Content  
fun [toLinear](to-linear.md)(r: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), g: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), b: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  
More info  


Decodes an RGB value to linear space. This is achieved by applying this color space's electro-optical transfer function to the supplied values.



Refer to the documentation of [RgbColorSpace](index.md) for more information about transfer functions and their use for encoding and decoding RGB values.



#### Return  


A new array of 3 floats containing linear RGB values



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/toLinear/#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>[com.chrynan.colors.space.RgbColorSpace](from-linear.md)| <a name="com.chrynan.colors.space/RgbColorSpace/toLinear/#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>|
  


## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/toLinear/#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>r| <a name="com.chrynan.colors.space/RgbColorSpace/toLinear/#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a><br><br>The red component to decode to linear space<br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/toLinear/#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>g| <a name="com.chrynan.colors.space/RgbColorSpace/toLinear/#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a><br><br>The green component to decode to linear space<br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/toLinear/#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>b| <a name="com.chrynan.colors.space/RgbColorSpace/toLinear/#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a><br><br>The blue component to decode to linear space<br><br>|
  
  


[common]  
Content  
fun [toLinear](to-linear.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  
More info  


Decodes an RGB value to linear space. This is achieved by applying this color space's electro-optical transfer function to the first 3 values of the supplied array. The result is stored back in the input array.



Refer to the documentation of [RgbColorSpace](index.md) for more information about transfer functions and their use for encoding and decoding RGB values.



#### Return  


[v](to-linear.md), containing linear RGB values



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/toLinear/#kotlin.FloatArray/PointingToDeclaration/"></a>[com.chrynan.colors.space.RgbColorSpace](from-linear.md)| <a name="com.chrynan.colors.space/RgbColorSpace/toLinear/#kotlin.FloatArray/PointingToDeclaration/"></a>|
  


## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/toLinear/#kotlin.FloatArray/PointingToDeclaration/"></a>v| <a name="com.chrynan.colors.space/RgbColorSpace/toLinear/#kotlin.FloatArray/PointingToDeclaration/"></a><br><br>A non-null array of non-linear RGB values, its length must be at least 3<br><br>|
  
  



