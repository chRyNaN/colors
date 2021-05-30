//[colors-core](../../../index.md)/[com.chrynan.colors](../index.md)/[NamedColor](index.md)



# NamedColor  
 [common] data class [NamedColor](index.md)(**names**: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)<[LocalizedText](../-localized-text/index.md)>, **color**: [Color](../-color/index.md))

Represents a [Color](../-color/index.md) that has a [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html) of localized [names](names.md). This could be useful to associate a [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) name with a [Color](../-color/index.md).

   


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.colors/NamedColor/NamedColor/#kotlin.collections.Set[com.chrynan.colors.LocalizedText]#com.chrynan.colors.Color/PointingToDeclaration/"></a>[NamedColor](-named-color.md)| <a name="com.chrynan.colors/NamedColor/NamedColor/#kotlin.collections.Set[com.chrynan.colors.LocalizedText]#com.chrynan.colors.Color/PointingToDeclaration/"></a> [common] fun [NamedColor](-named-color.md)(names: [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)<[LocalizedText](../-localized-text/index.md)>, color: [Color](../-color/index.md))   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors/NamedColor.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.colors/NamedColor.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors/NamedColor/name/#kotlin.String/PointingToDeclaration/"></a>[name](name.md)| <a name="com.chrynan.colors/NamedColor/name/#kotlin.String/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [name](name.md)(languageCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) = "en"): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)?  <br>More info  <br>Retrieves the first name for the provided [languageCode](name.md).  <br><br><br>|
| <a name="com.chrynan.colors/NamedColor/namesForLanguageCode/#kotlin.String/PointingToDeclaration/"></a>[namesForLanguageCode](names-for-language-code.md)| <a name="com.chrynan.colors/NamedColor/namesForLanguageCode/#kotlin.String/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [namesForLanguageCode](names-for-language-code.md)(languageCode: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)): [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)<[LocalizedText](../-localized-text/index.md)>  <br>More info  <br>Retrieves a [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html) of [LocalizedText](../-localized-text/index.md)s from the [names](names.md) value that match the provided [languageCode](names-for-language-code.md).  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors/NamedColor/color/#/PointingToDeclaration/"></a>[color](color.md)| <a name="com.chrynan.colors/NamedColor/color/#/PointingToDeclaration/"></a> [common] val [color](color.md): [Color](../-color/index.md)The [Color](../-color/index.md) instance this [NamedColor](index.md) represents.   <br>|
| <a name="com.chrynan.colors/NamedColor/names/#/PointingToDeclaration/"></a>[names](names.md)| <a name="com.chrynan.colors/NamedColor/names/#/PointingToDeclaration/"></a> [common] val [names](names.md): [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html)<[LocalizedText](../-localized-text/index.md)>The [Set](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-set/index.html) of [LocalizedText](../-localized-text/index.md)s for this [NamedColor](index.md) instance.   <br>|

