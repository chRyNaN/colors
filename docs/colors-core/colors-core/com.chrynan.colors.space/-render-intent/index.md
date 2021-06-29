//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[RenderIntent](index.md)



# RenderIntent  
 [common] enum [RenderIntent](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)<[RenderIntent](index.md)> 

A render intent determines how a [connector](../-connector/index.md) maps colors from one color space to another. The choice of mapping is important when the source color space has a larger color gamut than the destination color space.



A [RenderIntent](index.md) is used in the conversion process between different Color Spaces. It's the approach used when calculating new color values that within the new Color Space.

   


## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RenderIntent///PointingToDeclaration/"></a>| <a name="com.chrynan.colors.space/RenderIntent///PointingToDeclaration/"></a><br><br>[Render Intent Definition](http://colorwiki.com/wiki/Rendering_Intent)<br><br>|
| <a name="com.chrynan.colors.space/RenderIntent///PointingToDeclaration/"></a>[ColorSpace.connect](../connect.md)| <a name="com.chrynan.colors.space/RenderIntent///PointingToDeclaration/"></a>|
  


## Entries  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RenderIntent.PERCEPTUAL///PointingToDeclaration/"></a>[PERCEPTUAL](-p-e-r-c-e-p-t-u-a-l/index.md)| <a name="com.chrynan.colors.space/RenderIntent.PERCEPTUAL///PointingToDeclaration/"></a> [common] [PERCEPTUAL](-p-e-r-c-e-p-t-u-a-l/index.md)(typeName, "perceptual")  <br>Compresses the source gamut into the destination gamut.   <br>|
| <a name="com.chrynan.colors.space/RenderIntent.RELATIVE///PointingToDeclaration/"></a>[RELATIVE](-r-e-l-a-t-i-v-e/index.md)| <a name="com.chrynan.colors.space/RenderIntent.RELATIVE///PointingToDeclaration/"></a> [common] [RELATIVE](-r-e-l-a-t-i-v-e/index.md)(typeName, "relative")  <br>Similar to the [ABSOLUTE](-a-b-s-o-l-u-t-e/index.md) render intent, this render intent matches the closest color in the destination gamut but makes adjustments for the destination white point.   <br>|
| <a name="com.chrynan.colors.space/RenderIntent.SATURATION///PointingToDeclaration/"></a>[SATURATION](-s-a-t-u-r-a-t-i-o-n/index.md)| <a name="com.chrynan.colors.space/RenderIntent.SATURATION///PointingToDeclaration/"></a> [common] [SATURATION](-s-a-t-u-r-a-t-i-o-n/index.md)(typeName, "saturation")  <br>Attempts to maintain the relative saturation of colors from the source gamut to the destination gamut, to keep highly saturated colors as saturated as possible.   <br>|
| <a name="com.chrynan.colors.space/RenderIntent.ABSOLUTE///PointingToDeclaration/"></a>[ABSOLUTE](-a-b-s-o-l-u-t-e/index.md)| <a name="com.chrynan.colors.space/RenderIntent.ABSOLUTE///PointingToDeclaration/"></a> [common] [ABSOLUTE](-a-b-s-o-l-u-t-e/index.md)(typeName, "absolute")  <br>Colors that are in the destination gamut are left unchanged.   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.space/RenderIntent.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.colors.space/RenderIntent.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.space/RenderIntent/name/#/PointingToDeclaration/"></a>[name](index.md#%5Bcom.chrynan.colors.space%2FRenderIntent%2Fname%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-144979981)| <a name="com.chrynan.colors.space/RenderIntent/name/#/PointingToDeclaration/"></a> [common] val [name](index.md#%5Bcom.chrynan.colors.space%2FRenderIntent%2Fname%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-144979981): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>|
| <a name="com.chrynan.colors.space/RenderIntent/ordinal/#/PointingToDeclaration/"></a>[ordinal](index.md#%5Bcom.chrynan.colors.space%2FRenderIntent%2Fordinal%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-144979981)| <a name="com.chrynan.colors.space/RenderIntent/ordinal/#/PointingToDeclaration/"></a> [common] val [ordinal](index.md#%5Bcom.chrynan.colors.space%2FRenderIntent%2Fordinal%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-144979981): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)   <br>|
| <a name="com.chrynan.colors.space/RenderIntent/typeName/#/PointingToDeclaration/"></a>[typeName](type-name.md)| <a name="com.chrynan.colors.space/RenderIntent/typeName/#/PointingToDeclaration/"></a> [common] val [typeName](type-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>|

