//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[Adaptation](index.md)

# Adaptation

enum [Adaptation](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Adaptation](index.md)&gt; 

List of adaptation matrices that can be used for chromatic adaptation using the von Kries transform. These matrices are used to convert values in the CIE XYZ space to values in the LMS space (Long Medium Short).

Given an adaptation matrix `A`, the conversion from XYZ to LMS is straightforward:

#### See also

| | |
|---|---|
| equation | (https://developer.android.com/reference/android/graphics/ColorSpace.Adaptation.html) |
| [Connector](../-connector/index.md) |
| [connect](../connect.md) |

## Entries

| | |
|---|---|
| [BRADFORD](-b-r-a-d-f-o-r-d/index.md) | [common]<br>[BRADFORD](-b-r-a-d-f-o-r-d/index.md)<br>Bradford chromatic adaptation transform, as defined in the CIECAM97s color appearance model. |
| [VON_KRIES](-v-o-n_-k-r-i-e-s/index.md) | [common]<br>[VON_KRIES](-v-o-n_-k-r-i-e-s/index.md)<br>von Kries chromatic adaptation transform. |
| [CIECAT02](-c-i-e-c-a-t02/index.md) | [common]<br>[CIECAT02](-c-i-e-c-a-t02/index.md)<br>CIECAT02 chromatic adaption transform, as defined in the CIECAM02 color appearance model. |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [entries](entries.md) | [common]<br>val [entries](entries.md): [EnumEntries](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.enums/-enum-entries/index.html)&lt;[Adaptation](index.md)&gt;<br>Returns a representation of an immutable list of all enum entries, in the order they're declared. |
| [name](../-render-intent/-a-b-s-o-l-u-t-e/index.md#-372974862%2FProperties%2F1346026436) | [common]<br>val [name](../-render-intent/-a-b-s-o-l-u-t-e/index.md#-372974862%2FProperties%2F1346026436): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ordinal](../-render-intent/-a-b-s-o-l-u-t-e/index.md#-739389684%2FProperties%2F1346026436) | [common]<br>val [ordinal](../-render-intent/-a-b-s-o-l-u-t-e/index.md#-739389684%2FProperties%2F1346026436): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [transform](transform.md) | [common]<br>val [transform](transform.md): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html) |
| [typeName](type-name.md) | [common]<br>val [typeName](type-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |

## Functions

| Name | Summary |
|---|---|
| [valueOf](value-of.md) | [common]<br>fun [valueOf](value-of.md)(value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Adaptation](index.md)<br>Returns the enum constant of this type with the specified name. The string must match exactly an identifier used to declare an enum constant in this type. (Extraneous whitespace characters are not permitted.) |
| [values](values.md) | [common]<br>fun [values](values.md)(): [Array](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-array/index.html)&lt;[Adaptation](index.md)&gt;<br>Returns an array containing the constants of this enum type, in the order they're declared. |
