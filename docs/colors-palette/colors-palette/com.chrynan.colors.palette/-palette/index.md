//[colors-palette](../../../index.md)/[com.chrynan.colors.palette](../index.md)/[Palette](index.md)

# Palette

interface [Palette](index.md)

A color [Palette](index.md) is a component that contains color [Swatch](../-swatch/index.md)s representing important colors: either extracted from an image or used for rendering UI components.

#### Inheritors

| |
|---|
| [SimplePalette](../-simple-palette/index.md) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [dominantSwatch](dominant-swatch.md) | [common]<br>abstract val [dominantSwatch](dominant-swatch.md): [Swatch](../-swatch/index.md)? |
| [isEmpty](../is-empty.md) | [common]<br>val [Palette](index.md).[isEmpty](../is-empty.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Determines whether all the [Swatch](../-swatch/index.md)es in this [Palette](index.md) are null. If there is at least one non-null [Swatch](../-swatch/index.md) in this [Palette](index.md) false is returned (meaning this [Palette](index.md) is not empty), otherwise true is returned (meaning this [Palette](index.md) is empty). |
| [isNotEmpty](../is-not-empty.md) | [common]<br>val [Palette](index.md).[isNotEmpty](../is-not-empty.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>The inverse operation of [isEmpty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index.html). |
| [mutedDarkSwatch](muted-dark-swatch.md) | [common]<br>abstract val [mutedDarkSwatch](muted-dark-swatch.md): [Swatch](../-swatch/index.md)? |
| [mutedLightSwatch](muted-light-swatch.md) | [common]<br>abstract val [mutedLightSwatch](muted-light-swatch.md): [Swatch](../-swatch/index.md)? |
| [mutedSwatch](muted-swatch.md) | [common]<br>abstract val [mutedSwatch](muted-swatch.md): [Swatch](../-swatch/index.md)? |
| [primarySwatch](../primary-swatch.md) | [common]<br>val [Palette](index.md).[primarySwatch](../primary-swatch.md): [Swatch](../-swatch/index.md)?<br>Retrieves the first non-null [Swatch](../-swatch/index.md) from the [swatches](../swatches.md) property or null if this [Palette](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index.html). |
| [swatches](../swatches.md) | [common]<br>val [Palette](index.md).[swatches](../swatches.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)&lt;[Swatch](../-swatch/index.md)?&gt;<br>Retrieves a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of all of the available [Swatch](../-swatch/index.md)es for this [Palette](index.md). |
| [vibrantDarkSwatch](vibrant-dark-swatch.md) | [common]<br>abstract val [vibrantDarkSwatch](vibrant-dark-swatch.md): [Swatch](../-swatch/index.md)? |
| [vibrantLightSwatch](vibrant-light-swatch.md) | [common]<br>abstract val [vibrantLightSwatch](vibrant-light-swatch.md): [Swatch](../-swatch/index.md)? |
| [vibrantSwatch](vibrant-swatch.md) | [common]<br>abstract val [vibrantSwatch](vibrant-swatch.md): [Swatch](../-swatch/index.md)? |
