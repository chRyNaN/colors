//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[ColorModel](index.md)

# ColorModel

[common]\
enum [ColorModel](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[ColorModel](index.md)&gt; 

A color model is required by a [ColorSpace](../-color-space/index.md) to describe the way colors can be represented as tuples of numbers. A common color model is the [RGB](-r-g-b/index.md) color model which defines a color as represented by a tuple of 3 numbers (red, green and blue). The amount of components, [componentCount](component-count.md), range from 1 to 4.

## Entries

| | |
|---|---|
| [CMYK](-c-m-y-k/index.md) | [common]<br>[CMYK](-c-m-y-k/index.md)(componentCount, 4, typeName, "cmyk")<br>The CMYK model is a color model with 4 components that refer to four inks used in color printing: cyan, magenta, yellow and black (or key). CMYK is a subtractive color model. |
| [LAB](-l-a-b/index.md) | [common]<br>[LAB](-l-a-b/index.md)(componentCount, 3, typeName, "lab")<br>The Lab model is a color model with 3 components used to describe a color space that is more perceptually uniform than XYZ. |
| [XYZ](-x-y-z/index.md) | [common]<br>[XYZ](-x-y-z/index.md)(componentCount, 3, typeName, "xyz")<br>The XYZ model is a color model with 3 components that are used to model human color vision on a basic sensory level. |
| [RGB](-r-g-b/index.md) | [common]<br>[RGB](-r-g-b/index.md)(componentCount, 3, typeName, "rgb")<br>The RGB model is a color model with 3 components that refer to the three additive primiaries: red, green and blue. |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [componentCount](component-count.md) | [common]<br>val [componentCount](component-count.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The number of components for this color model. An integer between 1 and 4 |
| [name](../-render-intent/-p-e-r-c-e-p-t-u-a-l/index.md#-372974862%2FProperties%2F1346026436) | [common]<br>val [name](../-render-intent/-p-e-r-c-e-p-t-u-a-l/index.md#-372974862%2FProperties%2F1346026436): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ordinal](../-render-intent/-p-e-r-c-e-p-t-u-a-l/index.md#-739389684%2FProperties%2F1346026436) | [common]<br>val [ordinal](../-render-intent/-p-e-r-c-e-p-t-u-a-l/index.md#-739389684%2FProperties%2F1346026436): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [typeName](type-name.md) | [common]<br>val [typeName](type-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
