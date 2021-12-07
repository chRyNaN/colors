//[colors-core](../../../index.md)/[com.chrynan.colors](../index.md)/[ColorInt](index.md)

# ColorInt

[common]\
@[JvmInline](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-inline/index.html)

value class [ColorInt](index.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html))

An inline class wrapping an [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) that is meant to represent a [Color](../-color/index.md) value in an [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) form. This [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) should have all of the necessary color information encoded into it. The [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) should be a packed color value, in the SRGB Color Space, in the form AARRGGBB. This is similar to the "ColorInt" native representation on the Android platform.

##  ColorInt Components:

| Component | Name | Size | Range |
|---|---|---|---|
| A | Alpha | 8 Bits | 0...255 |
| R | Red | 8 Bits | 0...255 |
| G | Green | 8 Bits | 0...255 |
| B | Blue | 8 Bits | 0...255 |

The components in the above table are listed in encoding order, which is why [ColorInt](index.md)s are called "ARGB" colors.

## Constructors

| | |
|---|---|
| [ColorInt](-color-int.md) | [common]<br>fun [ColorInt](-color-int.md)(value: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [value](value.md) | [common]<br>val [value](value.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |

## Extensions

| Name | Summary |
|---|---|
| [toColor](../to-color.md) | [common]<br>fun [ColorInt](index.md).[toColor](../to-color.md)(): [RgbaColor](../-rgba-color/index.md)<br>Converts this [ColorInt](index.md) to an [RgbaColor](../-rgba-color/index.md). |
