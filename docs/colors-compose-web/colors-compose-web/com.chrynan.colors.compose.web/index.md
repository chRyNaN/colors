//[colors-compose-web](../../index.md)/[com.chrynan.colors.compose.web](index.md)

# Package com.chrynan.colors.compose.web

## Types

| Name | Summary |
|---|---|
| [ComposeColor](-compose-color/index.md) | [common, js]<br>[common]<br>expect class [ComposeColor](-compose-color/index.md)<br>[js]<br>actual typealias [ComposeColor](-compose-color/index.md) = CSSColorValue |

## Functions

| Name | Summary |
|---|---|
| [isSystemInDarkTheme](is-system-in-dark-theme.md) | [common]<br>@Composable<br>@ReadOnlyComposable<br>fun [isSystemInDarkTheme](is-system-in-dark-theme.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Determines whether the current system theme is set to dark mode. |
| [systemBasedColors](system-based-colors.md) | [common]<br>@Composable<br>fun [LightDarkColorTheme](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-light-dark-color-theme/index.md).[systemBasedColors](system-based-colors.md)(): [Colors](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md)<br>Obtains the appropriate [Colors](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md) instance of this [LightDarkColorTheme](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-light-dark-color-theme/index.md) depending on the result of the [isSystemInDarkTheme](is-system-in-dark-theme.md) function. If [isSystemInDarkTheme](is-system-in-dark-theme.md) returns true, then the [LightDarkColorTheme.dark](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md) will be returned. Otherwise, the [LightDarkColorTheme.light](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md) will be returned. |
| [toComposeColor](to-compose-color.md) | [common, js]<br>[common]<br>expect fun [Color](../../../colors-core/colors-core/com.chrynan.colors/-color/index.md).[toComposeColor](to-compose-color.md)(): [ComposeColor](-compose-color/index.md)<br>[js]<br>actual fun [Color](../../../colors-core/colors-core/com.chrynan.colors/-color/index.md).[toComposeColor](to-compose-color.md)(): [ComposeColor](-compose-color/index.md) |
| [toCSSColorValue](to-c-s-s-color-value.md) | [js]<br>fun [Color](../../../colors-core/colors-core/com.chrynan.colors/-color/index.md).[toCSSColorValue](to-c-s-s-color-value.md)(destinationColorSpace: [ColorSpace](../../../colors-core/colors-core/com.chrynan.colors.space/-color-space/index.md) = ColorSpaces.SRGB, renderIntent: [RenderIntent](../../../colors-core/colors-core/com.chrynan.colors.space/-render-intent/index.md) = RenderIntent.PERCEPTUAL): CSSColorValue<br>Converts this [Color](../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) to a CSSColorValue so that it can be used with compose-web components. |

## Properties

| Name | Summary |
|---|---|
| [LocalColors](-local-colors.md) | [common]<br>val [LocalColors](-local-colors.md): ProvidableCompositionLocal&lt;[Colors](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md)&gt;<br>A ProvidableCompositionLocal of the [Colors](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md) interface. |
