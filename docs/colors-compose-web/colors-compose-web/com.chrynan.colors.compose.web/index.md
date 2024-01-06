//[colors-compose-web](../../index.md)/[com.chrynan.colors.compose.web](index.md)

# Package-level declarations

## Types

| Name | Summary |
|---|---|
| [ComposeColor](-compose-color/index.md) | [common, js]<br>[common]<br>expect class [ComposeColor](-compose-color/index.md)<br>[js]<br>actual typealias [ComposeColor](-compose-color/index.md) = CSSColorValue |

## Properties

| Name | Summary |
|---|---|
| [LocalColors](-local-colors.md) | [common]<br>val [LocalColors](-local-colors.md): <!---  GfmCommand {"@class":"org.jetbrains.dokka.gfm.ResolveLinkGfmCommand","dri":{"packageName":"","classNames":"<Error class: unknown class>","callable":null,"target":{"@class":"org.jetbrains.dokka.links.PointingToDeclaration"},"extra":null}} --->&lt;Error class: unknown class&gt;<!--- --->&lt;<!---  GfmCommand {"@class":"org.jetbrains.dokka.gfm.ResolveLinkGfmCommand","dri":{"packageName":"","classNames":"<Error class: unknown class>","callable":null,"target":{"@class":"org.jetbrains.dokka.links.PointingToDeclaration"},"extra":null}} --->&lt;Error class: unknown class&gt;<!--- --->&gt;<br>A ProvidableCompositionLocal of the Colors interface. |

## Functions

| Name | Summary |
|---|---|
| [isSystemInDarkTheme](is-system-in-dark-theme.md) | [common]<br>fun [isSystemInDarkTheme](is-system-in-dark-theme.md)(): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Determines whether the current system theme is set to dark mode. |
| [systemBasedColors](system-based-colors.md) | [common]<br>fun <!---  GfmCommand {"@class":"org.jetbrains.dokka.gfm.ResolveLinkGfmCommand","dri":{"packageName":"","classNames":"<Error class: unknown class>","callable":null,"target":{"@class":"org.jetbrains.dokka.links.PointingToDeclaration"},"extra":null}} --->&lt;Error class: unknown class&gt;<!--- --->.[systemBasedColors](system-based-colors.md)(): <!---  GfmCommand {"@class":"org.jetbrains.dokka.gfm.ResolveLinkGfmCommand","dri":{"packageName":"","classNames":"<Error class: unknown class>","callable":null,"target":{"@class":"org.jetbrains.dokka.links.PointingToDeclaration"},"extra":null}} --->&lt;Error class: unknown class&gt;<!--- ---><br>Obtains the appropriate Colors instance of this LightOrDarkColorTheme depending on the result of the [isSystemInDarkTheme](is-system-in-dark-theme.md) function. If [isSystemInDarkTheme](is-system-in-dark-theme.md) returns true, then the Colors will be returned. Otherwise, the Colors will be returned. |
| [toComposeColor](to-compose-color.md) | [common]<br>expect fun <!---  GfmCommand {"@class":"org.jetbrains.dokka.gfm.ResolveLinkGfmCommand","dri":{"packageName":"","classNames":"<Error class: unknown class>","callable":null,"target":{"@class":"org.jetbrains.dokka.links.PointingToDeclaration"},"extra":null}} --->&lt;Error class: unknown class&gt;<!--- --->.[toComposeColor](to-compose-color.md)(): [ComposeColor](-compose-color/index.md) |
| [toCSSColorValue](to-c-s-s-color-value.md) | [js]<br>fun [Color](../../../colors-core/colors-core/com.chrynan.colors/-color/index.md).[toCSSColorValue](to-c-s-s-color-value.md)(destinationColorSpace: [ColorSpace](../../../colors-core/colors-core/com.chrynan.colors.space/-color-space/index.md) = ColorSpaces.SRGB, renderIntent: [RenderIntent](../../../colors-core/colors-core/com.chrynan.colors.space/-render-intent/index.md) = RenderIntent.PERCEPTUAL): CSSColorValue<br>Converts this [Color](../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) to a CSSColorValue so that it can be used with compose-web components. |
