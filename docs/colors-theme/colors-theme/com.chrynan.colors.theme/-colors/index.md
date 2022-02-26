//[colors-theme](../../../index.md)/[com.chrynan.colors.theme](../index.md)/[Colors](index.md)

# Colors

[common]\
interface [Colors](index.md)

Represents common colors used in an application theme. This component is useful for centralizing the colors for an application, so it is easier to change the values in a single location and it will propagate properly throughout the application.

## See also

common

| | |
|---|---|
| [com.chrynan.colors.theme.ColorTheme](../-color-theme/index.md) | To support types or multiple sets of [Colors](index.md). |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [accentPrimary](accent-primary.md) | [common]<br>abstract val [accentPrimary](accent-primary.md): [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) |
| [accentSecondary](accent-secondary.md) | [common]<br>abstract val [accentSecondary](accent-secondary.md): [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) |
| [backgroundPrimary](background-primary.md) | [common]<br>abstract val [backgroundPrimary](background-primary.md): [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) |
| [backgroundSecondary](background-secondary.md) | [common]<br>abstract val [backgroundSecondary](background-secondary.md): [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) |
| [error](error.md) | [common]<br>abstract val [error](error.md): [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) |
| [isLight](is-light.md) | [common]<br>abstract val [isLight](is-light.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [onAccentPrimary](on-accent-primary.md) | [common]<br>abstract val [onAccentPrimary](on-accent-primary.md): [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) |
| [onAccentSecondary](on-accent-secondary.md) | [common]<br>abstract val [onAccentSecondary](on-accent-secondary.md): [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) |
| [onBackgroundPrimary](on-background-primary.md) | [common]<br>abstract val [onBackgroundPrimary](on-background-primary.md): [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) |
| [onBackgroundSecondary](on-background-secondary.md) | [common]<br>abstract val [onBackgroundSecondary](on-background-secondary.md): [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) |
| [onError](on-error.md) | [common]<br>abstract val [onError](on-error.md): [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) |
| [onPrimary](on-primary.md) | [common]<br>abstract val [onPrimary](on-primary.md): [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) |
| [onSecondary](on-secondary.md) | [common]<br>abstract val [onSecondary](on-secondary.md): [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) |
| [primary](primary.md) | [common]<br>abstract val [primary](primary.md): [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) |
| [primaryVariant](primary-variant.md) | [common]<br>abstract val [primaryVariant](primary-variant.md): [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) |
| [secondary](secondary.md) | [common]<br>abstract val [secondary](secondary.md): [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) |
| [secondaryVariant](secondary-variant.md) | [common]<br>abstract val [secondaryVariant](secondary-variant.md): [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) |
| [textError](text-error.md) | [common]<br>abstract val [textError](text-error.md): [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) |
| [textPrimary](text-primary.md) | [common]<br>abstract val [textPrimary](text-primary.md): [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) |
| [textSecondary](text-secondary.md) | [common]<br>abstract val [textSecondary](text-secondary.md): [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) |
| [textTertiary](text-tertiary.md) | [common]<br>abstract val [textTertiary](text-tertiary.md): [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) |

## Extensions

| Name | Summary |
|---|---|
| [copy](../copy.md) | [common]<br>fun [Colors](index.md).[copy](../copy.md)(primary: [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) = this.primary, primaryVariant: [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) = this.primaryVariant, secondary: [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) = this.secondary, secondaryVariant: [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) = this.secondaryVariant, backgroundPrimary: [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) = this.backgroundPrimary, backgroundSecondary: [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) = this.backgroundSecondary, error: [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) = this.error, onPrimary: [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) = this.onPrimary, onSecondary: [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) = this.onSecondary, onBackgroundPrimary: [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) = this.onBackgroundPrimary, onBackgroundSecondary: [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) = this.onBackgroundSecondary, onError: [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) = this.onError, textPrimary: [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) = this.textPrimary, textSecondary: [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) = this.textSecondary, textTertiary: [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) = this.textTertiary, textError: [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) = this.textError, accentPrimary: [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) = this.accentPrimary, accentSecondary: [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) = this.accentSecondary, onAccentPrimary: [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) = this.onAccentPrimary, onAccentSecondary: [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) = this.onAccentSecondary, isLight: [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) = this.isLight): [Colors](index.md)<br>Creates a shallow copy of this [Colors](index.md) instance overriding the provided parameter values. This is similar to performing a copy on a data class. If a parameter value is not provided, this [Colors](index.md) corresponding value will be used instead. |
| [onSurface](../on-surface.md) | [common]<br>val [Colors](index.md).[onSurface](../on-surface.md): [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md)<br>A convenience property delegating to the [Colors.onBackgroundSecondary](on-background-secondary.md) property. This is to be inline with the Jetpack Compose Material Design Colors instance. |
| [surface](../surface.md) | [common]<br>val [Colors](index.md).[surface](../surface.md): [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md)<br>A convenience property delegating to the [Colors.backgroundSecondary](background-secondary.md) property. This is to be inline with the Jetpack Compose Material Design Colors instance. |
