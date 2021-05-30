//[colors-palette](../../../index.md)/[com.chrynan.colors.palette](../index.md)/[Palette](index.md)



# Palette  
 [common] interface [Palette](index.md)

A color [Palette](index.md) is a component that contains color [Swatch](../-swatch/index.md)s representing important colors: either extracted from an image or used for rendering UI components.

   


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.palette/Palette.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.colors.palette/Palette.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.palette/Palette/mutedDarkSwatch/#/PointingToDeclaration/"></a>[mutedDarkSwatch](muted-dark-swatch.md)| <a name="com.chrynan.colors.palette/Palette/mutedDarkSwatch/#/PointingToDeclaration/"></a> [common] abstract val [mutedDarkSwatch](muted-dark-swatch.md): [Swatch](../-swatch/index.md)?   <br>|
| <a name="com.chrynan.colors.palette/Palette/mutedLightSwatch/#/PointingToDeclaration/"></a>[mutedLightSwatch](muted-light-swatch.md)| <a name="com.chrynan.colors.palette/Palette/mutedLightSwatch/#/PointingToDeclaration/"></a> [common] abstract val [mutedLightSwatch](muted-light-swatch.md): [Swatch](../-swatch/index.md)?   <br>|
| <a name="com.chrynan.colors.palette/Palette/mutedSwatch/#/PointingToDeclaration/"></a>[mutedSwatch](muted-swatch.md)| <a name="com.chrynan.colors.palette/Palette/mutedSwatch/#/PointingToDeclaration/"></a> [common] abstract val [mutedSwatch](muted-swatch.md): [Swatch](../-swatch/index.md)?   <br>|
| <a name="com.chrynan.colors.palette/Palette/vibrantDarkSwatch/#/PointingToDeclaration/"></a>[vibrantDarkSwatch](vibrant-dark-swatch.md)| <a name="com.chrynan.colors.palette/Palette/vibrantDarkSwatch/#/PointingToDeclaration/"></a> [common] abstract val [vibrantDarkSwatch](vibrant-dark-swatch.md): [Swatch](../-swatch/index.md)?   <br>|
| <a name="com.chrynan.colors.palette/Palette/vibrantLightSwatch/#/PointingToDeclaration/"></a>[vibrantLightSwatch](vibrant-light-swatch.md)| <a name="com.chrynan.colors.palette/Palette/vibrantLightSwatch/#/PointingToDeclaration/"></a> [common] abstract val [vibrantLightSwatch](vibrant-light-swatch.md): [Swatch](../-swatch/index.md)?   <br>|
| <a name="com.chrynan.colors.palette/Palette/vibrantSwatch/#/PointingToDeclaration/"></a>[vibrantSwatch](vibrant-swatch.md)| <a name="com.chrynan.colors.palette/Palette/vibrantSwatch/#/PointingToDeclaration/"></a> [common] abstract val [vibrantSwatch](vibrant-swatch.md): [Swatch](../-swatch/index.md)?   <br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="com.chrynan.colors.palette/SimplePalette///PointingToDeclaration/"></a>[SimplePalette](../-simple-palette/index.md)|


## Extensions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.palette//isEmpty/com.chrynan.colors.palette.Palette#/PointingToDeclaration/"></a>[isEmpty](../is-empty.md)| <a name="com.chrynan.colors.palette//isEmpty/com.chrynan.colors.palette.Palette#/PointingToDeclaration/"></a>[common]  <br>Content  <br>val [Palette](index.md).[isEmpty](../is-empty.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>Determines whether all the [Swatch](../-swatch/index.md)es in this [Palette](index.md) are null.  <br><br><br>|
| <a name="com.chrynan.colors.palette//isNotEmpty/com.chrynan.colors.palette.Palette#/PointingToDeclaration/"></a>[isNotEmpty](../is-not-empty.md)| <a name="com.chrynan.colors.palette//isNotEmpty/com.chrynan.colors.palette.Palette#/PointingToDeclaration/"></a>[common]  <br>Content  <br>val [Palette](index.md).[isNotEmpty](../is-not-empty.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br>More info  <br>The inverse operation of [isEmpty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index.html).  <br><br><br>|
| <a name="com.chrynan.colors.palette//primarySwatch/com.chrynan.colors.palette.Palette#/PointingToDeclaration/"></a>[primarySwatch](../primary-swatch.md)| <a name="com.chrynan.colors.palette//primarySwatch/com.chrynan.colors.palette.Palette#/PointingToDeclaration/"></a>[common]  <br>Content  <br>val [Palette](index.md).[primarySwatch](../primary-swatch.md): [Swatch](../-swatch/index.md)?  <br>More info  <br>Retrieves the first non-null [Swatch](../-swatch/index.md) from the [swatches](../swatches.md) property or null if this [Palette](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index.html).  <br><br><br>|
| <a name="com.chrynan.colors.palette//swatches/com.chrynan.colors.palette.Palette#/PointingToDeclaration/"></a>[swatches](../swatches.md)| <a name="com.chrynan.colors.palette//swatches/com.chrynan.colors.palette.Palette#/PointingToDeclaration/"></a>[common]  <br>Content  <br>val [Palette](index.md).[swatches](../swatches.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Swatch](../-swatch/index.md)?>  <br>More info  <br>Retrieves a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of all of the available [Swatch](../-swatch/index.md)es for this [Palette](index.md).  <br><br><br>|

