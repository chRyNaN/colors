//[colors-compose-web](../../index.md)/[com.chrynan.colors.compose.web](index.md)/[LocalColors](-local-colors.md)

# LocalColors

[common]\
val [LocalColors](-local-colors.md): <!---  GfmCommand {"@class":"org.jetbrains.dokka.gfm.ResolveLinkGfmCommand","dri":{"packageName":"","classNames":"<Error class: unknown class>","callable":null,"target":{"@class":"org.jetbrains.dokka.links.PointingToDeclaration"},"extra":null}} --->&lt;Error class: unknown class&gt;<!--- --->&lt;<!---  GfmCommand {"@class":"org.jetbrains.dokka.gfm.ResolveLinkGfmCommand","dri":{"packageName":"","classNames":"<Error class: unknown class>","callable":null,"target":{"@class":"org.jetbrains.dokka.links.PointingToDeclaration"},"extra":null}} --->&lt;Error class: unknown class&gt;<!--- --->&gt;

A ProvidableCompositionLocal of the Colors interface.

To access this value in a Composable function, simply access the `current` value:

``` kotlin
LocalColors.current
```

To provide a new local color value, simply use the `CompositionLocalProvider` function:

``` kotlin
CompositionLocalProvider(LocalColors provides colors) {
    LocalColors.current
}
```
