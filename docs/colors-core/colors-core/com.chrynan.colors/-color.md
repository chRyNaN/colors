//[colors-core](../../index.md)/[com.chrynan.colors](index.md)/[Color](-color.md)



# Color  
[common]  
Content  
@[ExperimentalUnsignedTypes](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-experimental-unsigned-types/index.html)()  
  
fun [Color](-color.md)(component1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), component2: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), component3: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), component4: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), colorSpace: [ColorSpace](../com.chrynan.colors.space/-color-space/index.md)): [Color](-color/index.md)  
More info  


Creates a [Color](-color/index.md) from the provided components and [colorSpace](-color.md).



Typically, the [component4](-color.md) value is the [Color.alpha](-color/alpha.md) value.



Note that currently this only works with [ColorSpace](../com.chrynan.colors.space/-color-space/index.md)s that have a [ColorModel.componentCount](../com.chrynan.colors.space/-color-model/component-count.md) of 3.



If you prefer to use more specific component names and get a more specific [Color](-color/index.md) instance, use the other constructor functions, such as [RgbaColor](-rgba-color/index.md), [RgbaColor](-rgba-color/index.md), [LabColor](-lab-color/index.md), or [XyzColor](-xyz-color/index.md).

  


[common]  
Content  
@[ExperimentalUnsignedTypes](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-experimental-unsigned-types/index.html)()  
  
fun [Color](-color.md)(colorInt: [ColorInt](-color-int/index.md)): [RgbaColor](-rgba-color/index.md)  
More info  


Creates a new [RgbaColor](-rgba-color/index.md) instance from an ARGB [ColorInt](-color-int/index.md). The resulting color is in the [sRGB](../com.chrynan.colors.space/-color-spaces/-s-r-g-b.md) color space.



## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors//Color/#com.chrynan.colors.ColorInt/PointingToDeclaration/"></a>colorInt| <a name="com.chrynan.colors//Color/#com.chrynan.colors.ColorInt/PointingToDeclaration/"></a><br><br>The ARGB color int to create a [RgbaColor](-rgba-color/index.md) from.<br><br>|
  
  


[common]  
Content  
@[ExperimentalUnsignedTypes](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-experimental-unsigned-types/index.html)()  
  
fun [Color](-color.md)(int: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [RgbaColor](-rgba-color/index.md)  
More info  


Creates a new [RgbaColor](-rgba-color/index.md) instance from an ARGB color [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html). The resulting color is in the [sRGB](../com.chrynan.colors.space/-color-spaces/-s-r-g-b.md) color space.



## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors//Color/#kotlin.Int/PointingToDeclaration/"></a>int| <a name="com.chrynan.colors//Color/#kotlin.Int/PointingToDeclaration/"></a><br><br>The ARGB color int to create a [RgbaColor](-rgba-color/index.md) from.<br><br>|
  
  


[common]  
Content  
@[ExperimentalUnsignedTypes](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-experimental-unsigned-types/index.html)()  
  
fun [Color](-color.md)(long: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)): [RgbaColor](-rgba-color/index.md)  
More info  


Creates a new [RgbaColor](-rgba-color/index.md) instance from an ARGB color int. The resulting color is in the [sRGB](../com.chrynan.colors.space/-color-spaces/-s-r-g-b.md) color space. This is useful for specifying colors with alpha greater than 0x80 in numeric form without using [Long.toInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/to-int.html):

    val color = Color(0xFF000080)

## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors//Color/#kotlin.Long/PointingToDeclaration/"></a>long| <a name="com.chrynan.colors//Color/#kotlin.Long/PointingToDeclaration/"></a><br><br>The 32-bit ARGB color int to create a [RgbaColor](-rgba-color/index.md) from.<br><br><br><br>Note that this function does not use a [ColorLong](-color-long/index.md) and is different than one that does. This is more similar to the [RgbaColor](-rgba-color/index.md) function.<br><br>|
  
  


[common]  
Content  
@[ExperimentalUnsignedTypes](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-experimental-unsigned-types/index.html)()  
  
fun [Color](-color.md)(colorLong: [ColorLong](-color-long/index.md)): [Color](-color/index.md)  
More info  


Creates a new [Color](-color/index.md) instance from the provided [ColorLong](-color-long/index.md) value. The provided [colorLong](-color.md) value should contain all of the [Color](-color/index.md) information encoded properly in it.



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors//Color/#com.chrynan.colors.ColorLong/PointingToDeclaration/"></a>[com.chrynan.colors.ColorLong](-color-long/index.md)| <a name="com.chrynan.colors//Color/#com.chrynan.colors.ColorLong/PointingToDeclaration/"></a>|
  
  


[common]  
Content  
@[ExperimentalUnsignedTypes](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-experimental-unsigned-types/index.html)()  
  
fun [Color](-color.md)(colorULong: [ULong](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-long/index.html)): [Color](-color/index.md)  
More info  


Creates a new [Color](-color/index.md) instance from the provided [ULong](-color.md) value. The provided [colorULong](-color.md) value should contain all of the [Color](-color/index.md) information encoded properly in it. The [colorULong](-color.md) should be encoded like a [ColorLong](-color-long/index.md) value.



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors//Color/#kotlin.ULong/PointingToDeclaration/"></a>[com.chrynan.colors.Color](-color/index.md)| <a name="com.chrynan.colors//Color/#kotlin.ULong/PointingToDeclaration/"></a>|
| <a name="com.chrynan.colors//Color/#kotlin.ULong/PointingToDeclaration/"></a>[com.chrynan.colors.ColorLong](-color-long/index.md)| <a name="com.chrynan.colors//Color/#kotlin.ULong/PointingToDeclaration/"></a>|
  
  


[common]  
Content  
@[ExperimentalUnsignedTypes](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-experimental-unsigned-types/index.html)()  
  
fun [Color](-color.md)(hexadecimalString: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [HexadecimalColor](-hexadecimal-color/index.md)  
More info  


Retrieves a [HexadecimalColor](-hexadecimal-color/index.md) from the provided [hexadecimalString](-color.md). The provided [hexadecimalString](-color.md) must be in a valid Hex Color format, with or without the preceeding '#' character.



#### Throws  
  
| | |
|---|---|
| <a name="com.chrynan.colors//Color/#kotlin.String/PointingToDeclaration/"></a>[kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html)| <a name="com.chrynan.colors//Color/#kotlin.String/PointingToDeclaration/"></a><br><br>if the provided [hexadecimalString](-color.md) is not in a valid Hex Color format.<br><br>|
  



