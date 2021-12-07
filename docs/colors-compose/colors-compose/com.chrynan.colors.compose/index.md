//[colors-compose](../../index.md)/[com.chrynan.colors.compose](index.md)

# Package com.chrynan.colors.compose

## Functions

| Name | Summary |
|---|---|
| [MaterialTheme](../../../colors-compose/colors-compose/com.chrynan.colors.compose/[jvm]-material-theme.md) | [android, jvm]<br>[android]<br>@Composable<br>fun [MaterialTheme]([android]-material-theme.md)(colors: [Colors](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md), typography: Typography = MaterialTheme.typography, shapes: Shapes = MaterialTheme.shapes, content: @Composable() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))<br>[jvm]<br>@Composable<br>fun [MaterialTheme]([jvm]-material-theme.md)(colors: [Colors](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md), typography: Typography = MaterialTheme.typography, shapes: Shapes = MaterialTheme.shapes, content: @Composable() -&gt; [Unit](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-unit/index.html))<br>A Composable function to create a MaterialTheme with the provided [Colors](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md) class. |
| [toCSSColorValue](to-c-s-s-color-value.md) | [js]<br>fun <!---  GfmCommand {"@class":"org.jetbrains.dokka.gfm.ResolveLinkGfmCommand","dri":{"packageName":"","classNames":"<ERROR CLASS>","callable":null,"target":{"@class":"org.jetbrains.dokka.links.PointingToDeclaration"},"extra":null}} --->&lt;ERROR CLASS&gt;<!--- --->.[toCSSColorValue](to-c-s-s-color-value.md)(destinationColorSpace: <!---  GfmCommand {"@class":"org.jetbrains.dokka.gfm.ResolveLinkGfmCommand","dri":{"packageName":"","classNames":"<ERROR CLASS>","callable":null,"target":{"@class":"org.jetbrains.dokka.links.PointingToDeclaration"},"extra":null}} --->&lt;ERROR CLASS&gt;<!--- ---> = ColorSpaces.SRGB, renderIntent: <!---  GfmCommand {"@class":"org.jetbrains.dokka.gfm.ResolveLinkGfmCommand","dri":{"packageName":"","classNames":"<ERROR CLASS>","callable":null,"target":{"@class":"org.jetbrains.dokka.links.PointingToDeclaration"},"extra":null}} --->&lt;ERROR CLASS&gt;<!--- ---> = RenderIntent.PERCEPTUAL): <!---  GfmCommand {"@class":"org.jetbrains.dokka.gfm.ResolveLinkGfmCommand","dri":{"packageName":"","classNames":"<ERROR CLASS>","callable":null,"target":{"@class":"org.jetbrains.dokka.links.PointingToDeclaration"},"extra":null}} --->&lt;ERROR CLASS&gt;<!--- ---><br>Converts this Color to a CSSColorValue so that it can be used with compose-web components. |
| [toJetpackComposeColor](../../../colors-compose/colors-compose/com.chrynan.colors.compose/[jvm]to-jetpack-compose-color.md) | [android, jvm]<br>[android]<br>fun [Color](../../../colors-core/colors-core/com.chrynan.colors/-color/index.md).[toJetpackComposeColor]([android]to-jetpack-compose-color.md)(): Color<br>[jvm]<br>fun [Color](../../../colors-core/colors-core/com.chrynan.colors/-color/index.md).[toJetpackComposeColor]([jvm]to-jetpack-compose-color.md)(): Color<br>Converts this [Color](../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) to a Jetpack Compose compatible androidx.compose.ui.graphics.Color. |
| [toJetpackComposeColors](../../../colors-compose/colors-compose/com.chrynan.colors.compose/[jvm]to-jetpack-compose-colors.md) | [android, jvm]<br>[android]<br>fun [Colors](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md).[toJetpackComposeColors]([android]to-jetpack-compose-colors.md)(): Colors<br>[jvm]<br>fun [Colors](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md).[toJetpackComposeColors]([jvm]to-jetpack-compose-colors.md)(): Colors<br>Converts this [Colors](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md) value to a Jetpack Compose androidx.compose.material.Colors value. |
| [toMultiplatformColor](../../../colors-compose/colors-compose/com.chrynan.colors.compose/[jvm]to-multiplatform-color.md) | [android, jvm]<br>[android]<br>fun Color.[toMultiplatformColor]([android]to-multiplatform-color.md)(): [Color](../../../colors-core/colors-core/com.chrynan.colors/-color/index.md)<br>[jvm]<br>fun Color.[toMultiplatformColor]([jvm]to-multiplatform-color.md)(): [Color](../../../colors-core/colors-core/com.chrynan.colors/-color/index.md)<br>Converts this androidx.compose.ui.graphics.Color to a Kotlin Multiplatform compatible [Color](../../../colors-core/colors-core/com.chrynan.colors/-color/index.md). |
| [toMultiplatformColors](../../../colors-compose/colors-compose/com.chrynan.colors.compose/[jvm]to-multiplatform-colors.md) | [android, jvm]<br>[android]<br>fun Colors.[toMultiplatformColors]([android]to-multiplatform-colors.md)(): [Colors](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md)<br>[jvm]<br>fun Colors.[toMultiplatformColors]([jvm]to-multiplatform-colors.md)(): [Colors](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md)<br>Converts this androidx.compose.material.Colors value to a Kotlin Multiplatform [Colors](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md) value. |

## Properties

| Name | Summary |
|---|---|
| [LocalColors](-local-colors.md) | [js]<br>val [LocalColors](-local-colors.md): <!---  GfmCommand {"@class":"org.jetbrains.dokka.gfm.ResolveLinkGfmCommand","dri":{"packageName":"","classNames":"<ERROR CLASS>","callable":null,"target":{"@class":"org.jetbrains.dokka.links.PointingToDeclaration"},"extra":null}} --->&lt;ERROR CLASS&gt;<!--- --->&lt;<!---  GfmCommand {"@class":"org.jetbrains.dokka.gfm.ResolveLinkGfmCommand","dri":{"packageName":"","classNames":"<ERROR CLASS>","callable":null,"target":{"@class":"org.jetbrains.dokka.links.PointingToDeclaration"},"extra":null}} --->&lt;ERROR CLASS&gt;<!--- --->&gt;<br>A ProvidableCompositionLocal of the Colors interface. |