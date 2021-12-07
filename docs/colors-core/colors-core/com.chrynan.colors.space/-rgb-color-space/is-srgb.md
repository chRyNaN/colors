//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[RgbColorSpace](index.md)/[isSrgb](is-srgb.md)

# isSrgb

[common]\
open override val [isSrgb](is-srgb.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Indicates whether this color space is the sRGB color space or equivalent to the sRGB color space.

A color space is considered sRGB if it meets all the following conditions:

<ul><li>Its color model is [ColorModel.RGB](../-color-model/-r-g-b/index.md).</li><li></li></ul>

Its primaries are within 1e-3 of the true [sRGB](../-color-spaces/-s-r-g-b.md) primaries.

<ul><li></li></ul>

Its white point is within 1e-3 of the CIE standard illuminant [D65](../-illuminant/-d65.md).

<ul><li>Its opto-electronic transfer function is not linear.</li><li>Its electro-optical transfer function is not linear.</li><li>Its transfer functions yield values within 1e-3 of [ColorSpaces.SRGB](../-color-spaces/-s-r-g-b.md).</li><li>Its range is [0..1].</li></ul>

This method always returns true for [ColorSpaces.SRGB](../-color-spaces/-s-r-g-b.md).

#### Return

True if this color space is the sRGB color space (or a close approximation), false otherwise
