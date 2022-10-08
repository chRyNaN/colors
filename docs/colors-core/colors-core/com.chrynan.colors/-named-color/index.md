//[colors-core](../../../index.md)/[com.chrynan.colors](../index.md)/[NamedColor](index.md)

# NamedColor

[common]\
data class [NamedColor](index.md)(val names: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[LocalizedText](../-localized-text/index.md)&gt;, val color: [Color](../-color/index.md))

Represents a [Color](../-color/index.md) that has a [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html) of localized [names](names.md). This could be useful to associate a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) name with a [Color](../-color/index.md).

## Constructors

| | |
|---|---|
| [NamedColor](-named-color.md) | [common]<br>fun [NamedColor](-named-color.md)(names: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[LocalizedText](../-localized-text/index.md)&gt;, color: [Color](../-color/index.md)) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [name](name.md) | [common]<br>fun [name](name.md)(languageCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = &quot;en&quot;): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?<br>Retrieves the first name for the provided [languageCode](name.md). If there are multiple [names](names.md) with the provided [languageCode](name.md), then the first one is returned. If there are no [names](names.md) for the provided [languageCode](name.md), then null is returned. The [languageCode](name.md) defaults to the value of &quot;en&quot;. |
| [namesForLanguageCode](names-for-language-code.md) | [common]<br>fun [namesForLanguageCode](names-for-language-code.md)(languageCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[LocalizedText](../-localized-text/index.md)&gt;<br>Retrieves a [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html) of [LocalizedText](../-localized-text/index.md)s from the [names](names.md) value that match the provided [languageCode](names-for-language-code.md). |

## Properties

| Name | Summary |
|---|---|
| [color](color.md) | [common]<br>val [color](color.md): [Color](../-color/index.md)<br>The [Color](../-color/index.md) instance this [NamedColor](index.md) represents. |
| [names](names.md) | [common]<br>val [names](names.md): [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)&lt;[LocalizedText](../-localized-text/index.md)&gt;<br>The [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html) of [LocalizedText](../-localized-text/index.md)s for this [NamedColor](index.md) instance. |
