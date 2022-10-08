//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[RgbColorSpace](index.md)/[isSrgb](is-srgb.md)

# isSrgb

[common]\
open override val [isSrgb](is-srgb.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Indicates whether this color space is the sRGB color space or equivalent to the sRGB color space.

A color space is considered sRGB if it meets all the following conditions:

- 
   Its color model is [ColorModel.RGB](../-color-model/-r-g-b/index.md).
- 

Its primaries are within 1e-3 of the true [sRGB](../-color-spaces/-s-r-g-b.md) primaries.

- 

Its white point is within 1e-3 of the CIE standard illuminant [D65](../-illuminant/-d65.md).

- 
   Its opto-electronic transfer function is not linear.
- 
   Its electro-optical transfer function is not linear.
- 
   Its transfer functions yield values within 1e-3 of [ColorSpaces.SRGB](../-color-spaces/-s-r-g-b.md).
- 
   Its range is `[0..1]`.

This method always returns true for [ColorSpaces.SRGB](../-color-spaces/-s-r-g-b.md).

#### Return

True if this color space is the sRGB color space (or a close approximation), false otherwise
