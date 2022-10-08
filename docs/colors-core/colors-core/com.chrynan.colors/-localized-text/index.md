//[colors-core](../../../index.md)/[com.chrynan.colors](../index.md)/[LocalizedText](index.md)

# LocalizedText

[common]\
data class [LocalizedText](index.md)(val languageCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = &quot;en&quot;, val value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html))

Represents a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) text content [value](value.md) for a particular [languageCode](language-code.md). This allows for having the same [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) text content [value](value.md) localized for different languages.

## Constructors

| | |
|---|---|
| [LocalizedText](-localized-text.md) | [common]<br>fun [LocalizedText](-localized-text.md)(languageCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = &quot;en&quot;, value: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [languageCode](language-code.md) | [common]<br>val [languageCode](language-code.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The language code of this text [value](value.md). This defaults to &quot;en&quot; for English. |
| [value](value.md) | [common]<br>val [value](value.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>The [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) text content value. |
