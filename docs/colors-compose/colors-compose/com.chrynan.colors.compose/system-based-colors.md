//[colors-compose](../../index.md)/[com.chrynan.colors.compose](index.md)/[systemBasedColors](system-based-colors.md)

# systemBasedColors

[common]\

@[Composable](https://developer.android.com/reference/kotlin/androidx/compose/runtime/Composable.html)

fun [LightOrDarkColorTheme](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-light-or-dark-color-theme/index.md).[systemBasedColors](system-based-colors.md)(): [Colors](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md)

Obtains the appropriate [Colors](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md) instance of this [LightOrDarkColorTheme](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-light-or-dark-color-theme/index.md) depending on the result of the [isSystemInDarkTheme](https://developer.android.com/reference/kotlin/androidx/compose/foundation/package-summary.html) function. If [isSystemInDarkTheme](https://developer.android.com/reference/kotlin/androidx/compose/foundation/package-summary.html) returns true, then the [LightOrDarkColorTheme.dark](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md) will be returned. Otherwise, the [LightOrDarkColorTheme.light](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md) will be returned.
