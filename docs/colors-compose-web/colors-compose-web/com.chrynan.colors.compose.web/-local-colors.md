//[colors-compose-web](../../index.md)/[com.chrynan.colors.compose.web](index.md)/[LocalColors](-local-colors.md)

# LocalColors

[common]\
val [LocalColors](-local-colors.md): ProvidableCompositionLocal&lt;[Colors](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md)&gt;

A ProvidableCompositionLocal of the [Colors](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md) interface.

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
