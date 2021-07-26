//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[ColorModel](index.md)



# ColorModel  
 [common] enum [ColorModel](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)<[ColorModel](index.md)> 

A color model is required by a [ColorSpace](../-color-space/index.md) to describe the way colors can be represented as tuples of numbers. A common color model is the [RGB](-r-g-b/index.md) color model which defines a color as represented by a tuple of 3 numbers (red, green and blue). The amount of components, [componentCount](component-count.md), range from 1 to 4.

   


## Entries  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/ColorModel.RGB///PointingToDeclaration/"></a>[RGB](-r-g-b/index.md)| <a name="com.chrynan.colors.space/ColorModel.RGB///PointingToDeclaration/"></a> [common] [RGB](-r-g-b/index.md)(componentCount, 3, typeName, "rgb")  <br>The RGB model is a color model with 3 components that refer to the three additive primiaries: red, green and blue.   <br>|
| <a name="com.chrynan.colors.space/ColorModel.XYZ///PointingToDeclaration/"></a>[XYZ](-x-y-z/index.md)| <a name="com.chrynan.colors.space/ColorModel.XYZ///PointingToDeclaration/"></a> [common] [XYZ](-x-y-z/index.md)(componentCount, 3, typeName, "xyz")  <br>The XYZ model is a color model with 3 components that are used to model human color vision on a basic sensory level.   <br>|
| <a name="com.chrynan.colors.space/ColorModel.LAB///PointingToDeclaration/"></a>[LAB](-l-a-b/index.md)| <a name="com.chrynan.colors.space/ColorModel.LAB///PointingToDeclaration/"></a> [common] [LAB](-l-a-b/index.md)(componentCount, 3, typeName, "lab")  <br>The Lab model is a color model with 3 components used to describe a color space that is more perceptually uniform than XYZ.   <br>|
| <a name="com.chrynan.colors.space/ColorModel.CMYK///PointingToDeclaration/"></a>[CMYK](-c-m-y-k/index.md)| <a name="com.chrynan.colors.space/ColorModel.CMYK///PointingToDeclaration/"></a> [common] [CMYK](-c-m-y-k/index.md)(componentCount, 4, typeName, "cmyk")  <br>The CMYK model is a color model with 4 components that refer to four inks used in color printing: cyan, magenta, yellow and black (or key).   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.space/ColorModel.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.colors.space/ColorModel.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.space/ColorModel/componentCount/#/PointingToDeclaration/"></a>[componentCount](component-count.md)| <a name="com.chrynan.colors.space/ColorModel/componentCount/#/PointingToDeclaration/"></a> [common] val [componentCount](component-count.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)The number of components for this color model.   <br>|
| <a name="com.chrynan.colors.space/ColorModel/name/#/PointingToDeclaration/"></a>[name](index.md#%5Bcom.chrynan.colors.space%2FColorModel%2Fname%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1316981857)| <a name="com.chrynan.colors.space/ColorModel/name/#/PointingToDeclaration/"></a> [common] val [name](index.md#%5Bcom.chrynan.colors.space%2FColorModel%2Fname%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1316981857): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>|
| <a name="com.chrynan.colors.space/ColorModel/ordinal/#/PointingToDeclaration/"></a>[ordinal](index.md#%5Bcom.chrynan.colors.space%2FColorModel%2Fordinal%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1316981857)| <a name="com.chrynan.colors.space/ColorModel/ordinal/#/PointingToDeclaration/"></a> [common] val [ordinal](index.md#%5Bcom.chrynan.colors.space%2FColorModel%2Fordinal%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1316981857): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)   <br>|
| <a name="com.chrynan.colors.space/ColorModel/typeName/#/PointingToDeclaration/"></a>[typeName](type-name.md)| <a name="com.chrynan.colors.space/ColorModel/typeName/#/PointingToDeclaration/"></a> [common] val [typeName](type-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>|

