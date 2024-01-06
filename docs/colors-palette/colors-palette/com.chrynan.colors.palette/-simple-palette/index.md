//[colors-palette](../../../index.md)/[com.chrynan.colors.palette](../index.md)/[SimplePalette](index.md)

# SimplePalette

[common]\
data class [SimplePalette](index.md) : [Palette](../-palette/index.md)

## Properties

| Name | Summary |
|---|---|
| [dominantSwatch](dominant-swatch.md) | [common]<br>open override val [dominantSwatch](dominant-swatch.md): [Swatch](../-swatch/index.md)? = null |
| [isEmpty](../is-empty.md) | [common]<br>val [Palette](../-palette/index.md).[isEmpty](../is-empty.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Determines whether all the [Swatch](../-swatch/index.md)es in this [Palette](../-palette/index.md) are null. If there is at least one non-null [Swatch](../-swatch/index.md) in this [Palette](../-palette/index.md) false is returned (meaning this [Palette](../-palette/index.md) is not empty), otherwise true is returned (meaning this [Palette](../-palette/index.md) is empty). |
| [isNotEmpty](../is-not-empty.md) | [common]<br>val [Palette](../-palette/index.md).[isNotEmpty](../is-not-empty.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>The inverse operation of [isEmpty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index.html). |
| [mutedDarkSwatch](muted-dark-swatch.md) | [common]<br>open override val [mutedDarkSwatch](muted-dark-swatch.md): [Swatch](../-swatch/index.md)? = null |
| [mutedLightSwatch](muted-light-swatch.md) | [common]<br>open override val [mutedLightSwatch](muted-light-swatch.md): [Swatch](../-swatch/index.md)? = null |
| [mutedSwatch](muted-swatch.md) | [common]<br>open override val [mutedSwatch](muted-swatch.md): [Swatch](../-swatch/index.md)? = null |
| [primarySwatch](../primary-swatch.md) | [common]<br>val [Palette](../-palette/index.md).[primarySwatch](../primary-swatch.md): [Swatch](../-swatch/index.md)?<br>Retrieves the first non-null [Swatch](../-swatch/index.md) from the [swatches](../swatches.md) property or null if this [Palette](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index.html). |
| [swatches](../swatches.md) | [common]<br>val [Palette](../-palette/index.md).[swatches](../swatches.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Swatch](../-swatch/index.md)?&gt;<br>Retrieves a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of all of the available [Swatch](../-swatch/index.md)es for this [Palette](../-palette/index.md). |
| [vibrantDarkSwatch](vibrant-dark-swatch.md) | [common]<br>open override val [vibrantDarkSwatch](vibrant-dark-swatch.md): [Swatch](../-swatch/index.md)? = null |
| [vibrantLightSwatch](vibrant-light-swatch.md) | [common]<br>open override val [vibrantLightSwatch](vibrant-light-swatch.md): [Swatch](../-swatch/index.md)? = null |
| [vibrantSwatch](vibrant-swatch.md) | [common]<br>open override val [vibrantSwatch](vibrant-swatch.md): [Swatch](../-swatch/index.md)? = null |
