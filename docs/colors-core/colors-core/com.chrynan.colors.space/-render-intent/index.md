//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[RenderIntent](index.md)

# RenderIntent

enum [RenderIntent](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[RenderIntent](index.md)&gt; 

A render intent determines how a [connector](../-connector/index.md) maps colors from one color space to another. The choice of mapping is important when the source color space has a larger color gamut than the destination color space.

A [RenderIntent](index.md) is used in the conversion process between different Color Spaces. It's the approach used when calculating new color values that within the new Color Space.

#### See also

| | |
|---|---|
|  | [Render Intent Definition](http://colorwiki.com/wiki/Rendering_Intent) |
| [connect](../connect.md) |

## Entries

| | |
|---|---|
| [PERCEPTUAL](-p-e-r-c-e-p-t-u-a-l/index.md) | [common]<br>[PERCEPTUAL](-p-e-r-c-e-p-t-u-a-l/index.md)<br>Compresses the source gamut into the destination gamut. This render intent affects all colors, inside and outside of destination gamut. The goal of this render intent is to preserve the visual relationship between colors. |
| [RELATIVE](-r-e-l-a-t-i-v-e/index.md) | [common]<br>[RELATIVE](-r-e-l-a-t-i-v-e/index.md)<br>Similar to the [ABSOLUTE](-a-b-s-o-l-u-t-e/index.md) render intent, this render intent matches the closest color in the destination gamut but makes adjustments for the destination white point. |
| [SATURATION](-s-a-t-u-r-a-t-i-o-n/index.md) | [common]<br>[SATURATION](-s-a-t-u-r-a-t-i-o-n/index.md)<br>Attempts to maintain the relative saturation of colors from the source gamut to the destination gamut, to keep highly saturated colors as saturated as possible. |
| [ABSOLUTE](-a-b-s-o-l-u-t-e/index.md) | [common]<br>[ABSOLUTE](-a-b-s-o-l-u-t-e/index.md)<br>Colors that are in the destination gamut are left unchanged. Colors that fall outside of the destination gamut are mapped to the closest possible color within the gamut of the destination color space (they are clipped). |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [entries](entries.md) | [common]<br>val [entries](entries.md): [EnumEntries](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.enums/-enum-entries/index.html)&lt;[RenderIntent](index.md)&gt;<br>Returns a representation of an immutable list of all enum entries, in the order they're declared. |
| [name](-a-b-s-o-l-u-t-e/index.md#-372974862%2FProperties%2F1346026436) | [common]<br>val [name](-a-b-s-o-l-u-t-e/index.md#-372974862%2FProperties%2F1346026436): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ordinal](-a-b-s-o-l-u-t-e/index.md#-739389684%2FProperties%2F1346026436) | [common]<br>val [ordinal](-a-b-s-o-l-u-t-e/index.md#-739389684%2FProperties%2F1346026436): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [typeName](type-name.md) | [common]<br>val [typeName](type-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Functions

| Name | Summary |
|---|---|
| [valueOf](value-of.md) | [common]<br>fun [valueOf](value-of.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [RenderIntent](index.md)<br>Returns the enum constant of this type with the specified name. The string must match exactly an identifier used to declare an enum constant in this type. (Extraneous whitespace characters are not permitted.) |
| [values](values.md) | [common]<br>fun [values](values.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[RenderIntent](index.md)&gt;<br>Returns an array containing the constants of this enum type, in the order they're declared. |
