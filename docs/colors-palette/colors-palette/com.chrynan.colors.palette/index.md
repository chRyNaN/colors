//[colors-palette](../../index.md)/[com.chrynan.colors.palette](index.md)



# Package com.chrynan.colors.palette  


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.palette/Palette///PointingToDeclaration/"></a>[Palette](-palette/index.md)| <a name="com.chrynan.colors.palette/Palette///PointingToDeclaration/"></a>[common]  <br>Content  <br>interface [Palette](-palette/index.md)  <br>More info  <br>A color [Palette](-palette/index.md) is a component that contains color [Swatch](-swatch/index.md)s representing important colors: either extracted from an image or used for rendering UI components.  <br><br><br>|
| <a name="com.chrynan.colors.palette/SimplePalette///PointingToDeclaration/"></a>[SimplePalette](-simple-palette/index.md)| <a name="com.chrynan.colors.palette/SimplePalette///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [SimplePalette](-simple-palette/index.md) : [Palette](-palette/index.md)  <br><br><br>|
| <a name="com.chrynan.colors.palette/Swatch///PointingToDeclaration/"></a>[Swatch](-swatch/index.md)| <a name="com.chrynan.colors.palette/Swatch///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [Swatch](-swatch/index.md)(**color**: [Color](../../../colors-core/colors-core/com.chrynan.colors/-color/index.md), **primaryOnColor**: [Color](../../../colors-core/colors-core/com.chrynan.colors/-color/index.md), **secondaryOnColor**: [Color](../../../colors-core/colors-core/com.chrynan.colors/-color/index.md), **population**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)?)  <br>More info  <br>Represents a color swatch which contains a [color](-swatch/color.md) and the related [primaryOnColor](-swatch/primary-on-color.md) and [secondaryOnColor](-swatch/secondary-on-color.md) which can be used to overlap the [color](-swatch/color.md) with enough contrast.  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.palette//isEmpty/com.chrynan.colors.palette.Palette#/PointingToDeclaration/"></a>[isEmpty](is-empty.md)| <a name="com.chrynan.colors.palette//isEmpty/com.chrynan.colors.palette.Palette#/PointingToDeclaration/"></a> [common] val [Palette](-palette/index.md).[isEmpty](is-empty.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)Determines whether all the [Swatch](-swatch/index.md)es in this [Palette](-palette/index.md) are null.   <br>|
| <a name="com.chrynan.colors.palette//isNotEmpty/com.chrynan.colors.palette.Palette#/PointingToDeclaration/"></a>[isNotEmpty](is-not-empty.md)| <a name="com.chrynan.colors.palette//isNotEmpty/com.chrynan.colors.palette.Palette#/PointingToDeclaration/"></a> [common] val [Palette](-palette/index.md).[isNotEmpty](is-not-empty.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)The inverse operation of [isEmpty](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index.html).   <br>|
| <a name="com.chrynan.colors.palette//primarySwatch/com.chrynan.colors.palette.Palette#/PointingToDeclaration/"></a>[primarySwatch](primary-swatch.md)| <a name="com.chrynan.colors.palette//primarySwatch/com.chrynan.colors.palette.Palette#/PointingToDeclaration/"></a> [common] val [Palette](-palette/index.md).[primarySwatch](primary-swatch.md): [Swatch](-swatch/index.md)?Retrieves the first non-null [Swatch](-swatch/index.md) from the [swatches](swatches.md) property or null if this [Palette](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index.html).   <br>|
| <a name="com.chrynan.colors.palette//swatches/com.chrynan.colors.palette.Palette#/PointingToDeclaration/"></a>[swatches](swatches.md)| <a name="com.chrynan.colors.palette//swatches/com.chrynan.colors.palette.Palette#/PointingToDeclaration/"></a> [common] val [Palette](-palette/index.md).[swatches](swatches.md): [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html)<[Swatch](-swatch/index.md)?>Retrieves a [List](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/-list/index.html) of all of the available [Swatch](-swatch/index.md)es for this [Palette](-palette/index.md).   <br>|

