//[colors-compose](../../index.md)/[com.chrynan.colors.compose](index.md)/[LocalColors](-local-colors.md)

# LocalColors

[js]\
val [LocalColors](-local-colors.md): <!---  GfmCommand {"@class":"org.jetbrains.dokka.gfm.ResolveLinkGfmCommand","dri":{"packageName":"","classNames":"<ERROR CLASS>","callable":null,"target":{"@class":"org.jetbrains.dokka.links.PointingToDeclaration"},"extra":null}} --->&lt;ERROR CLASS&gt;<!--- --->&lt;<!---  GfmCommand {"@class":"org.jetbrains.dokka.gfm.ResolveLinkGfmCommand","dri":{"packageName":"","classNames":"<ERROR CLASS>","callable":null,"target":{"@class":"org.jetbrains.dokka.links.PointingToDeclaration"},"extra":null}} --->&lt;ERROR CLASS&gt;<!--- --->&gt;

A ProvidableCompositionLocal of the Colors interface.

To access this value in a Composable function, simply access the current value:

LocalColors.current

To provide a new local color value, simply use the CompositionLocalProvider function:

CompositionLocalProvider(LocalColors provides colors) {\
    LocalColors.current\
}
