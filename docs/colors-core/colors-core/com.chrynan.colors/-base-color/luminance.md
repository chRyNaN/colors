//[colors-core](../../../index.md)/[com.chrynan.colors](../index.md)/[BaseColor](index.md)/[luminance](luminance.md)

# luminance

[common]\
open override fun [luminance](luminance.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)

Returns the relative luminance of this color.

For [RgbaColor](../-rgba-color/index.md)s, this is based on the formula for relative luminance defined in WCAG 2.0, W3C Recommendation 11 December 2008. For [XyzColor](../-xyz-color/index.md)s, this should be the 'Y' component value.

Note that if this color's color space's model is not [ColorModel.XYZ](../../com.chrynan.colors.space/-color-model/-x-y-z/index.md) or [ColorModel.RGB](../../com.chrynan.colors.space/-color-model/-r-g-b/index.md), then it is possible for the implementation to convert the color to one in a supported color space before calculating this value.

#### Return

A value between 0.0f (darkest black) and 1.0f (lightest white).

## Throws

| | |
|---|---|
| [kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | If the this color's color space does not support luminance. |
