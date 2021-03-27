//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[ColorSpace](index.md)/[fromXyz](from-xyz.md)



# fromXyz  
[common]  
Content  
fun [fromXyz](from-xyz.md)(x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), z: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  
More info  


Converts tristimulus values from the CIE XYZ space to this color space's color model.



#### Return  


A new array whose size is equal to the number of color components as returned by [ColorModel.componentCount](../-color-model/component-count.md).



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/ColorSpace/fromXyz/#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>[com.chrynan.colors.space.ColorSpace](to-xyz.md)| <a name="com.chrynan.colors.space/ColorSpace/fromXyz/#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>|
  


## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/ColorSpace/fromXyz/#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>x| <a name="com.chrynan.colors.space/ColorSpace/fromXyz/#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a><br><br>The X component of the color value<br><br>|
| <a name="com.chrynan.colors.space/ColorSpace/fromXyz/#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>y| <a name="com.chrynan.colors.space/ColorSpace/fromXyz/#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a><br><br>The Y component of the color value<br><br>|
| <a name="com.chrynan.colors.space/ColorSpace/fromXyz/#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>z| <a name="com.chrynan.colors.space/ColorSpace/fromXyz/#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a><br><br>The Z component of the color value<br><br>|
  
  


[common]  
Content  
abstract fun [fromXyz](from-xyz.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  
More info  


Converts tristimulus values from the CIE XYZ space to this color space's color model. The resulting value is passed back in the specified array.



The specified array's length  must be at least equal to to the number of color components as returned by [ColorModel.componentCount](../-color-model/component-count.md), and its first 3 values must be the XYZ components to convert from.



#### Return  


The array passed in parameter [v](from-xyz.md).



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/ColorSpace/fromXyz/#kotlin.FloatArray/PointingToDeclaration/"></a>[com.chrynan.colors.space.ColorSpace](to-xyz.md)| <a name="com.chrynan.colors.space/ColorSpace/fromXyz/#kotlin.FloatArray/PointingToDeclaration/"></a>|
  


## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/ColorSpace/fromXyz/#kotlin.FloatArray/PointingToDeclaration/"></a>v| <a name="com.chrynan.colors.space/ColorSpace/fromXyz/#kotlin.FloatArray/PointingToDeclaration/"></a><br><br>An array of color components containing the XYZ values to convert from, and large enough to hold the number of components of this color space's model. The minimum size is 3, but most color spaces have 4 components.<br><br>|
  
  



