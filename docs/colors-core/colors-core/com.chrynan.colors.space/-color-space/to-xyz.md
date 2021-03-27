//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[ColorSpace](index.md)/[toXyz](to-xyz.md)



# toXyz  
[common]  
Content  
fun [toXyz](to-xyz.md)(r: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), g: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), b: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  
More info  


Converts a color value from this color space's model to tristimulus CIE XYZ values. If the color model of this color space is not [RGB](../-color-model/-r-g-b/index.md), it is assumed that the target CIE XYZ space uses a [D50](../-illuminant/-d50.md) standard illuminant.



This method is a convenience for color spaces with a model of 3 components ([RGB](../-color-model/-r-g-b/index.md) or [ColorModel.LAB](../-color-model/-l-a-b/index.md) for instance). With color spaces using fewer or more components, use [toXyz](to-xyz.md) instead.



#### Return  


A new array of 3 floats, containing tristimulus XYZ values



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/ColorSpace/toXyz/#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>[com.chrynan.colors.space.ColorSpace](from-xyz.md)| <a name="com.chrynan.colors.space/ColorSpace/toXyz/#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>|
  


## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/ColorSpace/toXyz/#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>r| <a name="com.chrynan.colors.space/ColorSpace/toXyz/#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a><br><br>The first component of the value to convert from (typically R in RGB)<br><br>|
| <a name="com.chrynan.colors.space/ColorSpace/toXyz/#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>g| <a name="com.chrynan.colors.space/ColorSpace/toXyz/#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a><br><br>The second component of the value to convert from (typically G in RGB)<br><br>|
| <a name="com.chrynan.colors.space/ColorSpace/toXyz/#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>b| <a name="com.chrynan.colors.space/ColorSpace/toXyz/#kotlin.Float#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a><br><br>The third component of the value to convert from (typically B in RGB)<br><br>|
  
  


[common]  
Content  
abstract fun [toXyz](to-xyz.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  
More info  


Converts a color value from this color space's model to tristimulus CIE XYZ values. If the color model of this color space is not [RGB](../-color-model/-r-g-b/index.md), it is assumed that the target CIE XYZ space uses a [D50](../-illuminant/-d50.md) standard illuminant.



The specified array's length  must be at least equal to to the number of color components as returned by [ColorModel.componentCount](../-color-model/component-count.md).



#### Return  


The array passed in parameter [v](to-xyz.md).



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/ColorSpace/toXyz/#kotlin.FloatArray/PointingToDeclaration/"></a>[com.chrynan.colors.space.ColorSpace](from-xyz.md)| <a name="com.chrynan.colors.space/ColorSpace/toXyz/#kotlin.FloatArray/PointingToDeclaration/"></a>|
  


## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/ColorSpace/toXyz/#kotlin.FloatArray/PointingToDeclaration/"></a>v| <a name="com.chrynan.colors.space/ColorSpace/toXyz/#kotlin.FloatArray/PointingToDeclaration/"></a><br><br>An array of color components containing the color space's color value to convert to XYZ, and large enough to hold the resulting tristimulus XYZ values, at least 3 values.<br><br>|
  
  



