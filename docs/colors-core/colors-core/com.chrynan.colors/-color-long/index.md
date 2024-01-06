//[colors-core](../../../index.md)/[com.chrynan.colors](../index.md)/[ColorLong](index.md)

# ColorLong

@[JvmInline](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-inline/index.html)

value class [ColorLong](index.md)(val value: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html))

An inline class wrapping a [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) that is meant to represent a [Color](../-color/index.md) value in a [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) form. This is very similar to a [ColorInt](../-color-int/index.md) but allows for more precision. A common color model is the [ColorModel.RGB](../../com.chrynan.colors.space/-color-model/-r-g-b/index.md) in which the components represent red, green and blue values.

This is similar to the &quot;ColorLong&quot; native representation on the Android platform.

Note that where [ColorInt](../-color-int/index.md)s always contain ARGB components, a [ColorLong](index.md) always has four components that depend on the Color Space Model. One of these components is always alpha, but the other three components depend on the Color Space Model.

Note that while alpha is encoded in a color long using a 10 bit integer (thus using a range of 0...1023), it is converted to and from  float values when decoding and encoding color longs.

Note that for compatibility reasons and ease of use, color longs encoding sRGB colors do not use the same encoding as other color longs. In that case, they are more like [ColorInt](../-color-int/index.md)s.

Note that the [ColorModel.CMYK](../../com.chrynan.colors.space/-color-model/-c-m-y-k/index.md) is unsupported for [ColorLong](index.md)s. The [ColorModel.CMYK](../../com.chrynan.colors.space/-color-model/-c-m-y-k/index.md) is typically used for printing.

#### See also

| | |
|---|---|
|  | [Android Color Long Documentation](https://developer.android.com/reference/android/graphics/Color.html#color-longs) |

## Constructors

| | |
|---|---|
| [ColorLong](-color-long.md) | [common]<br>constructor(value: [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [value](value.md) | [common]<br>val [value](value.md): [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) |

## Functions

| Name | Summary |
|---|---|
| [toColor](../to-color.md) | [common]<br>fun [ColorLong](index.md).[toColor](../to-color.md)(): [Color](../-color/index.md)<br>Converts this [ColorLong](index.md) to an [Color](../-color/index.md). |
