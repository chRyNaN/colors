//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[ColorSpace](index.md)/[isWideGamut](is-wide-gamut.md)

# isWideGamut

[common]\
abstract val [isWideGamut](is-wide-gamut.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)

Returns whether this color space is a wide-gamut color space. An RGB color space is wide-gamut if its gamut entirely contains the [sRGB](../-color-spaces/-s-r-g-b.md) gamut and if the area of its gamut is 90% of greater than the area of the [NTSC](../-color-spaces/-n-t-s-c_1953.md) gamut.

#### Return

True if this color space is a wide-gamut color space, false otherwise
