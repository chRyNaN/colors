//[colors-compose](../../index.md)/[com.chrynan.colors.compose](index.md)/[systemBasedColors](system-based-colors.md)

# systemBasedColors

[common]\

@Composable

fun [LightDarkColorTheme](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-light-dark-color-theme/index.md).[systemBasedColors](system-based-colors.md)(): [Colors](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md)

Obtains the appropriate [Colors](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md) instance of this [LightDarkColorTheme](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-light-dark-color-theme/index.md) depending on the result of the [isSystemInDarkTheme](is-system-in-dark-theme.md) function. If [isSystemInDarkTheme](is-system-in-dark-theme.md) returns true, then the [LightDarkColorTheme.dark](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md) will be returned. Otherwise, the [LightDarkColorTheme.light](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md) will be returned.
