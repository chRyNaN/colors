//[colors-core](../../index.md)/[com.chrynan.colors](index.md)/[Color](-color.md)

# Color

[common]\
fun [Color](-color.md)(component1: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), component2: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), component3: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), component4: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), colorSpace: [ColorSpace](../com.chrynan.colors.space/-color-space/index.md)): [Color](-color/index.md)

Creates a [Color](-color/index.md) from the provided components and [colorSpace](-color.md).

Typically, the [component4](-color.md) value is the [Color.alpha](-color/alpha.md) value.

Note that currently this only works with [ColorSpace](../com.chrynan.colors.space/-color-space/index.md)s that have a [ColorModel.componentCount](../com.chrynan.colors.space/-color-model/component-count.md) of 3.

If you prefer to use more specific component names and get a more specific [Color](-color/index.md) instance, use the other constructor functions, such as [RgbaColor](-rgba-color/index.md), [RgbaColor](-rgba-color/index.md), [LabColor](-lab-color/index.md), or [XyzColor](-xyz-color/index.md).

[common]\
fun [Color](-color.md)(colorInt: [ColorInt](-color-int/index.md)): [RgbaColor](-rgba-color/index.md)

Creates a new [RgbaColor](-rgba-color/index.md) instance from an ARGB [ColorInt](-color-int/index.md). The resulting color is in the [sRGB](../com.chrynan.colors.space/-color-spaces/-s-r-g-b.md) color space.

## Parameters

common

| | |
|---|---|
| colorInt | The ARGB color int to create a [RgbaColor](-rgba-color/index.md) from. |

[common]\
fun [Color](-color.md)(int: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [RgbaColor](-rgba-color/index.md)

Creates a new [RgbaColor](-rgba-color/index.md) instance from an ARGB color [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html). The resulting color is in the [sRGB](../com.chrynan.colors.space/-color-spaces/-s-r-g-b.md) color space.

## Parameters

common

| | |
|---|---|
| int | The ARGB color int to create a [RgbaColor](-rgba-color/index.md) from. |

[common]\
fun [Color](-color.md)(long: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)): [RgbaColor](-rgba-color/index.md)

Creates a new [RgbaColor](-rgba-color/index.md) instance from an ARGB color int. The resulting color is in the [sRGB](../com.chrynan.colors.space/-color-spaces/-s-r-g-b.md) color space. This is useful for specifying colors with alpha greater than 0x80 in numeric form without using [Long.toInt](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/to-int.html):

    val color = Color(0xFF000080)

## Parameters

common

| | |
|---|---|
| long | The 32-bit ARGB color int to create a [RgbaColor](-rgba-color/index.md) from.<br>Note that this function does not use a [ColorLong](-color-long/index.md) and is different than one that does. This is more similar to the [RgbaColor](-rgba-color/index.md) function. |

[common]\
fun [Color](-color.md)(colorLong: [ColorLong](-color-long/index.md)): [Color](-color/index.md)

Creates a new [Color](-color/index.md) instance from the provided [ColorLong](-color-long/index.md) value. The provided [colorLong](-color.md) value should contain all of the [Color](-color/index.md) information encoded properly in it.

## See also

common

| | |
|---|---|
| [com.chrynan.colors.ColorLong](-color-long/index.md) |  |

[common]\
fun [Color](-color.md)(colorULong: [ULong](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-u-long/index.html)): [Color](-color/index.md)

Creates a new [Color](-color/index.md) instance from the provided [ULong](-color.md) value. The provided [colorULong](-color.md) value should contain all of the [Color](-color/index.md) information encoded properly in it. The [colorULong](-color.md) should be encoded like a [ColorLong](-color-long/index.md) value.

## See also

common

| | |
|---|---|
| [com.chrynan.colors.Color](-color/index.md) |  |
| [com.chrynan.colors.ColorLong](-color-long/index.md) |  |

[common]\
fun [Color](-color.md)(hex: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [HexadecimalColor](-hexadecimal-color/index.md)

Retrieves a [HexadecimalColor](-hexadecimal-color/index.md) from the provided [hex](-color.md). The provided [hex](-color.md) must be in a valid Hex Color format, with or without the preceeding '#' character.

## Throws

| | |
|---|---|
| [kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | if the provided [hex](-color.md) is not in a valid Hex Color format. |

[common]\
fun [Color](-color.md)(red: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), green: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), blue: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), alpha: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = Color.OPAQUE_INT_OPACITY, colorSpace: [ColorSpace](../com.chrynan.colors.space/-color-space/index.md) = ColorSpaces.SRGB): [RgbaColor](-rgba-color/index.md)

Retrieves a [RgbaColor](-rgba-color/index.md) from the provided color values.

Note that the provided values will be coerced into the SRGB Color Range.

## See also

common

| | |
|---|---|
| [com.chrynan.colors.RgbaColor](-rgba-color/index.md) |  |
