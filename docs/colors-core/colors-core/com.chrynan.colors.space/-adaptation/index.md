//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[Adaptation](index.md)

# Adaptation

[common]\
enum [Adaptation](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[Adaptation](index.md)&gt; 

List of adaptation matrices that can be used for chromatic adaptation using the von Kries transform. These matrices are used to convert values in the CIE XYZ space to values in the LMS space (Long Medium Short).

Given an adaptation matrix A, the conversion from XYZ to LMS is straightforward:

## See also

common

| | |
|---|---|
| equation | (https://developer.android.com/reference/android/graphics/ColorSpace.Adaptation.html) |
| [com.chrynan.colors.space.Connector](../-connector/index.md) |  |
| [ColorSpace.connect](../connect.md) |  |

## Entries

| | |
|---|---|
| [CIECAT02](-c-i-e-c-a-t02/index.md) | [common]<br>[CIECAT02](-c-i-e-c-a-t02/index.md)(transform, floatArrayOf(             0.7328f, -0.7036f, 0.0030f,             0.4296f, 1.6975f, 0.0136f,             -0.1624f, 0.0061f, 0.9834f         ), typeName, "ciecat02")<br>CIECAT02 chromatic adaption transform, as defined in the CIECAM02 color appearance model. |
| [VON_KRIES](-v-o-n_-k-r-i-e-s/index.md) | [common]<br>[VON_KRIES](-v-o-n_-k-r-i-e-s/index.md)(transform, floatArrayOf(             0.40024f, -0.22630f, 0.00000f,             0.70760f, 1.16532f, 0.00000f,             -0.08081f, 0.04570f, 0.91822f         ), typeName, "von_kries")<br>von Kries chromatic adaptation transform. |
| [BRADFORD](-b-r-a-d-f-o-r-d/index.md) | [common]<br>[BRADFORD](-b-r-a-d-f-o-r-d/index.md)(transform, floatArrayOf(             0.8951f, -0.7502f, 0.0389f,             0.2664f, 1.7135f, -0.0685f,             -0.1614f, 0.0367f, 1.0296f         ), typeName, "bradford")<br>Bradford chromatic adaptation transform, as defined in the CIECAM97s color appearance model. |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [name](../-render-intent/-p-e-r-c-e-p-t-u-a-l/index.md#-372974862%2FProperties%2F1346026436) | [common]<br>val [name](../-render-intent/-p-e-r-c-e-p-t-u-a-l/index.md#-372974862%2FProperties%2F1346026436): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ordinal](../-render-intent/-p-e-r-c-e-p-t-u-a-l/index.md#-739389684%2FProperties%2F1346026436) | [common]<br>val [ordinal](../-render-intent/-p-e-r-c-e-p-t-u-a-l/index.md#-739389684%2FProperties%2F1346026436): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [transform](transform.md) | [common]<br>val [transform](transform.md): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html) |
| [typeName](type-name.md) | [common]<br>val [typeName](type-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
