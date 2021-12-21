//[colors-theme](../../../index.md)/[com.chrynan.colors.theme](../index.md)/[DarkColorTheme](index.md)/[dark](dark.md)

# dark

[common]\
abstract val [dark](dark.md): [Colors](../-colors/index.md)

Obtains the dark [Colors](../-colors/index.md) for this [ColorTheme](../-color-theme/index.md).

Note that implementing interfaces should make sure that returned [Colors](../-colors/index.md) has [Colors.isLight](../-colors/is-light.md) set to false. Undefined behaviour if this is not implemented correctly.
