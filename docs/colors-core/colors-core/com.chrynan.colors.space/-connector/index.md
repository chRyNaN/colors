//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[Connector](index.md)



# Connector  
 [common] open class [Connector](index.md)

A connector transforms colors from a source color space to a destination color space.



A source color space is connected to a destination color space using the color transform C computed from their respective transforms noted Tsrc and Tdst in the following equation:



[See equation](https://developer.android.com/reference/android/graphics/ColorSpace.Connector)



The transform C shown above is only valid when the source and destination color spaces have the same profile connection space (PCS). We know that instances of [ColorSpace](../-color-space/index.md) always use CIE XYZ as their PCS but their white points might differ. When they do, we must perform a chromatic adaptation of the color spaces' transforms. To do so, we use the von Kries method described in the documentation of [Adaptation](../-adaptation/index.md), using the CIE standard illuminant [D50](../-illuminant/-d50.md) as the target white point.



Example of conversion from [sRGB](../-color-spaces/-s-r-g-b.md) to [DCI-P3](../-color-spaces/-d-c-i_-p3.md):

    val connector = ColorSpaces.Srgb.connect(ColorSpaces.DciP3);
    val p3 = connector.transform(1.0f, 0.0f, 0.0f);
    // p3 contains { 0.9473, 0.2740, 0.2076 }   


## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/Connector///PointingToDeclaration/"></a>[com.chrynan.colors.space.Adaptation](../-adaptation/index.md)| <a name="com.chrynan.colors.space/Connector///PointingToDeclaration/"></a>|
| <a name="com.chrynan.colors.space/Connector///PointingToDeclaration/"></a>[ColorSpace.adapt](../adapt.md)| <a name="com.chrynan.colors.space/Connector///PointingToDeclaration/"></a>|
| <a name="com.chrynan.colors.space/Connector///PointingToDeclaration/"></a>[ColorSpace.connect](../connect.md)| <a name="com.chrynan.colors.space/Connector///PointingToDeclaration/"></a>|
  


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.space/Connector/transform/#kotlin.FloatArray/PointingToDeclaration/"></a>[transform](transform.md)| <a name="com.chrynan.colors.space/Connector/transform/#kotlin.FloatArray/PointingToDeclaration/"></a>[common]  <br>Content  <br>open fun [transform](transform.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  <br>fun [transform](transform.md)(componentOne: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), componentTwo: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), componentThree: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  <br>More info  <br>Transforms the specified color from the source color space to a color in the destination color space.  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.space/Connector/destination/#/PointingToDeclaration/"></a>[destination](destination.md)| <a name="com.chrynan.colors.space/Connector/destination/#/PointingToDeclaration/"></a> [common] val [destination](destination.md): [ColorSpace](../-color-space/index.md)   <br>|
| <a name="com.chrynan.colors.space/Connector/renderIntent/#/PointingToDeclaration/"></a>[renderIntent](render-intent.md)| <a name="com.chrynan.colors.space/Connector/renderIntent/#/PointingToDeclaration/"></a> [common] val [renderIntent](render-intent.md): [RenderIntent](../-render-intent/index.md)   <br>|
| <a name="com.chrynan.colors.space/Connector/source/#/PointingToDeclaration/"></a>[source](source.md)| <a name="com.chrynan.colors.space/Connector/source/#/PointingToDeclaration/"></a> [common] val [source](source.md): [ColorSpace](../-color-space/index.md)   <br>|

