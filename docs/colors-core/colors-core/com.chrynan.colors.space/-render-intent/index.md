//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[RenderIntent](index.md)

# RenderIntent

[common]\
enum [RenderIntent](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)&lt;[RenderIntent](index.md)&gt; 

A render intent determines how a [connector](../-connector/index.md) maps colors from one color space to another. The choice of mapping is important when the source color space has a larger color gamut than the destination color space.

A [RenderIntent](index.md) is used in the conversion process between different Color Spaces. It's the approach used when calculating new color values that within the new Color Space.

## See also

common

| | |
|---|---|
|  | [Render Intent Definition](http://colorwiki.com/wiki/Rendering_Intent) |
| [ColorSpace.connect](../connect.md) |  |

## Entries

| | |
|---|---|
| [ABSOLUTE](-a-b-s-o-l-u-t-e/index.md) | [common]<br>[ABSOLUTE](-a-b-s-o-l-u-t-e/index.md)("absolute")<br>Colors that are in the destination gamut are left unchanged. Colors that fall outside of the destination gamut are mapped to the closest possible color within the gamut of the destination color space (they are clipped). |
| [SATURATION](-s-a-t-u-r-a-t-i-o-n/index.md) | [common]<br>[SATURATION](-s-a-t-u-r-a-t-i-o-n/index.md)("saturation")<br>Attempts to maintain the relative saturation of colors from the source gamut to the destination gamut, to keep highly saturated colors as saturated as possible. |
| [RELATIVE](-r-e-l-a-t-i-v-e/index.md) | [common]<br>[RELATIVE](-r-e-l-a-t-i-v-e/index.md)("relative")<br>Similar to the [ABSOLUTE](-a-b-s-o-l-u-t-e/index.md) render intent, this render intent matches the closest color in the destination gamut but makes adjustments for the destination white point. |
| [PERCEPTUAL](-p-e-r-c-e-p-t-u-a-l/index.md) | [common]<br>[PERCEPTUAL](-p-e-r-c-e-p-t-u-a-l/index.md)("perceptual")<br>Compresses the source gamut into the destination gamut. This render intent affects all colors, inside and outside of destination gamut. The goal of this render intent is to preserve the visual relationship between colors. |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [name](-p-e-r-c-e-p-t-u-a-l/index.md#-372974862%2FProperties%2F1346026436) | [common]<br>val [name](-p-e-r-c-e-p-t-u-a-l/index.md#-372974862%2FProperties%2F1346026436): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
| [ordinal](-p-e-r-c-e-p-t-u-a-l/index.md#-739389684%2FProperties%2F1346026436) | [common]<br>val [ordinal](-p-e-r-c-e-p-t-u-a-l/index.md#-739389684%2FProperties%2F1346026436): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [typeName](type-name.md) | [common]<br>val [typeName](type-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html) |
