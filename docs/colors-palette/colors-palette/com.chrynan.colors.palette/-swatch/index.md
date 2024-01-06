//[colors-palette](../../../index.md)/[com.chrynan.colors.palette](../index.md)/[Swatch](index.md)

# Swatch

[common]\
data class [Swatch](index.md)(val color: [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md), val primaryOnColor: [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md), val secondaryOnColor: [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md), val population: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = null)

Represents a color swatch which contains a [color](color.md) and the related [primaryOnColor](primary-on-color.md) and [secondaryOnColor](secondary-on-color.md) which can be used to overlap the [color](color.md) with enough contrast. A color [Swatch](index.md) is typically extracted from an image by looking at it's pixel data.

## Constructors

| | |
|---|---|
| [Swatch](-swatch.md) | [common]<br>constructor(color: [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md), primaryOnColor: [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md), secondaryOnColor: [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md), population: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = null) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [color](color.md) | [common]<br>val [color](color.md): [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md)<br>The primary [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) for this swatch. |
| [population](population.md) | [common]<br>val [population](population.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)? = null<br>The number of pixels represented by this swatch in an underlying image. |
| [primaryOnColor](primary-on-color.md) | [common]<br>val [primaryOnColor](primary-on-color.md): [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md)<br>The primary color that can be used on top of the [color](color.md) value. For instance, when displaying text over the [color](color.md) value, this value can be used. |
| [secondaryOnColor](secondary-on-color.md) | [common]<br>val [secondaryOnColor](secondary-on-color.md): [Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md)<br>The secondary color that can be used on top of the [color](color.md) value. For instance, when displaying text over the [color](color.md) value, this value can be used. |
