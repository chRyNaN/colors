//[colors-theme](../../../index.md)/[com.chrynan.colors.theme](../index.md)/[LightDarkColorTheme](index.md)

# LightDarkColorTheme

[common]\
interface [LightDarkColorTheme](index.md) : [LightColorTheme](../-light-color-theme/index.md), [DarkColorTheme](../-dark-color-theme/index.md)

A [ColorTheme](../-color-theme/index.md) that contains both light and dark [Colors](../-colors/index.md).

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [colors](colors.md) | [common]<br>open override fun [colors](colors.md)(): [Colors](../-colors/index.md)<br>Obtains the default [Colors](../-colors/index.md) for this [ColorTheme](../-color-theme/index.md). This defaults to returning the [light](../-colors/index.md). |

## Properties

| Name | Summary |
|---|---|
| [dark](dark.md) | [common]<br>abstract override val [dark](dark.md): [Colors](../-colors/index.md)<br>Obtains the dark [Colors](../-colors/index.md) for this [ColorTheme](../-color-theme/index.md). |
| [light](light.md) | [common]<br>abstract override val [light](light.md): [Colors](../-colors/index.md)<br>Obtains the light [Colors](../-colors/index.md) for this [ColorTheme](../-color-theme/index.md). |

## Extensions

| Name | Summary |
|---|---|
| [colors](../colors.md) | [common]<br>fun [LightDarkColorTheme](index.md).[colors](../colors.md)(isLight: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)): [Colors](../-colors/index.md)<br>Obtains the appropriate [Colors](../-colors/index.md) instance depending on the provided [isLight](../colors.md) parameter value. If the [isLight](../colors.md) parameter equals true, then [LightDarkColorTheme.light](../-colors/index.md) will be returned. Otherwise, the [LightDarkColorTheme.dark](dark.md) will be returned. |
