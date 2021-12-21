//[colors-theme](../../../index.md)/[com.chrynan.colors.theme](../index.md)/[ColorThemes](index.md)

# ColorThemes

[common]\
class [ColorThemes](index.md)

A class that can be used to place [ColorTheme](../-color-theme/index.md)s on to as extension properties. This allows for easy access to the various color themes within an application. For example:

// Have the color theme as an extension property on this [ColorThemes] class:\
val ColorThemes.myColorTheme: MyColorTheme get() = ...\
\
// Then access the color theme via the [Colors.themes] property:\
Colors.themes.myColorTheme

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |
