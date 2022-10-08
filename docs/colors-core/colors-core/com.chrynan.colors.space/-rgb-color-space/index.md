//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[RgbColorSpace](index.md)

# RgbColorSpace

[common]\
class [RgbColorSpace](index.md) : [ColorSpace](../-color-space/index.md)

An RGB color space is an additive color space using the [RGB](../-color-model/-r-g-b/index.md) color model (a color is therefore represented by a tuple of 3 numbers).

A specific RGB color space is defined by the following properties:

- 
   Three chromaticities of the red, green and blue primaries, which define the gamut of the color space.
- 
   A white point chromaticity that defines the stimulus to which color space values are normalized (also just called &quot;white&quot;).
- 
   An opto-electronic transfer function, also called opto-electronic conversion function or often, and approximately, gamma function.
- 
   An electro-optical transfer function, also called electo-optical conversion function or often, and approximately, gamma function.
- 
   A range of valid RGB values (most commonly `[0..1]`).

The most commonly used RGB color space is [sRGB](../-color-spaces/-s-r-g-b.md).

###  Primaries and white point chromaticities

In this implementation, the chromaticity of the primaries and the white point of an RGB color space is defined in the CIE xyY color space. This color space separates the chromaticity of a color, the x and y components, and its luminance, the Y component. Since the primaries and the white point have full brightness, the Y component is assumed to be 1 and only the x and y components are needed to encode them.

For convenience, this implementation also allows to define the primaries and white point in the CIE XYZ space. The tristimulus XYZ values are internally converted to xyY.

{@docRoot}reference/android/images/graphics/colorspace_srgb.png

###  Transfer functions

A transfer function is a color component conversion function, defined as a single variable, monotonic mathematical function. It is applied to each individual component of a color. They are used to perform the mapping between linear tristimulus values and non-linear electronic signal value.

The *opto-electronic transfer function* (OETF or OECF) encodes tristimulus values in a scene to a non-linear electronic signal value. An OETF is often expressed as a power function with an exponent between 0.38 and 0.55 (the reciprocal of 1.8 to 2.6).

The *electro-optical transfer function* (EOTF or EOCF) decodes a non-linear electronic signal value to a tristimulus value at the display. An EOTF is often expressed as a power function with an exponent between 1.8 and 2.6.

Transfer functions are used as a compression scheme. For instance, linear sRGB values would normally require 11 to 12 bits of precision to store all values that can be perceived by the human eye. When encoding sRGB values using the appropriate OETF (see [sRGB](../-color-spaces/-s-r-g-b.md) for an exact mathematical description of that OETF), the values can be compressed to only 8 bits precision.

When manipulating RGB values, particularly sRGB values, it is safe to assume that these values have been encoded with the appropriate OETF (unless noted otherwise). Encoded values are often said to be in &quot;gamma space&quot;. They are therefore defined in a non-linear space. This in turns means that any linear operation applied to these values is going to yield mathematically incorrect results (any linear interpolation such as gradient generation for instance, most image processing functions such as blurs, etc.).

To properly process encoded RGB values you must first apply the EOTF to decode the value into linear space. After processing, the RGB value must be encoded back to non-linear (&quot;gamma&quot;) space. Here is a formal description of the process, where `f` is the processing function to apply:

[See RGB equation](https://developer.android.com/reference/android/graphics/ColorSpace.Rgb)

If the transfer functions of the color space can be expressed as an ICC parametric curve as defined in ICC.1:2004-10, the numeric parameters can be retrieved from [transferParameters](transfer-parameters.md). This can be useful to match color spaces for instance.

Some RGB color spaces, such as [ColorSpaces.ACES](../-color-spaces/-a-c-e-s.md) and [scRGB](../-color-spaces/-l-i-n-e-a-r_-e-x-t-e-n-d-e-d_-s-r-g-b.md), are said to be linear because their transfer functions are the identity function: `f(x) = x`. If the source and/or destination are known to be linear, it is not necessary to invoke the transfer functions.

###  Range

Most RGB color spaces allow RGB values in the range `[0..1]`. There are however a few RGB color spaces that allow much larger ranges. For instance, [scRGB](../-color-spaces/-e-x-t-e-n-d-e-d_-s-r-g-b.md) is used to manipulate the range `[-0.5..7.5]` while [ACES](../-color-spaces/-a-c-e-s.md) can be used throughout the range `[-65504, 65504]`.

{@docRoot}reference/android/images/graphics/colorspace_scrgb.png

###  Converting between RGB color spaces

Conversion between two color spaces is achieved by using an intermediate color space called the profile connection space (PCS). The PCS used by this implementation is CIE XYZ. The conversion operation is defined as such:

[See RGB equation](https://developer.android.com/reference/android/graphics/ColorSpace.Rgb)

Where `Tsrc` is the [RGB to XYZ transform](get-transform.md) of the source color space and `Tdst^-1` the [XYZ to RGB transform](get-inverse-transform.md) of the destination color space.

Many RGB color spaces commonly used with electronic devices use the standard illuminant [D65](../-illuminant/-d65.md). Care must be take however when converting between two RGB color spaces if their white points do not match. This can be achieved by either calling [adapt](../adapt.md) to adapt one or both color spaces to a single common white point. This can be achieved automatically by calling [ColorSpace.connect](../connect.md), which also handles non-RGB color spaces.

To learn more about the white point adaptation process, refer to the documentation of [Adaptation](../-adaptation/index.md).

## Constructors

| | |
|---|---|
| [RgbColorSpace](-rgb-color-space.md) | [common]<br>fun [RgbColorSpace](-rgb-color-space.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), toXYZ: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html), oetf: ([Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)) -&gt; [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), eotf: ([Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)) -&gt; [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html))<br>Creates a new RGB color space using a 3x3 column-major transform matrix. The transform matrix must convert from the RGB space to the profile connection space CIE XYZ. |
| [RgbColorSpace](-rgb-color-space.md) | [common]<br>fun [RgbColorSpace](-rgb-color-space.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), primaries: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html), whitePoint: [WhitePoint](../-white-point/index.md), oetf: ([Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)) -&gt; [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), eotf: ([Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)) -&gt; [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), min: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), max: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))<br>Creates a new RGB color space using a specified set of primaries and a specified white point. |
| [RgbColorSpace](-rgb-color-space.md) | [common]<br>fun [RgbColorSpace](-rgb-color-space.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), toXYZ: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html), function: [TransferParameters](../-transfer-parameters/index.md))<br>Creates a new RGB color space using a 3x3 column-major transform matrix. The transform matrix must convert from the RGB space to the profile connection space CIE XYZ. |
| [RgbColorSpace](-rgb-color-space.md) | [common]<br>fun [RgbColorSpace](-rgb-color-space.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), primaries: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html), whitePoint: [WhitePoint](../-white-point/index.md), function: [TransferParameters](../-transfer-parameters/index.md))<br>Creates a new RGB color space using a specified set of primaries and a specified white point. |
| [RgbColorSpace](-rgb-color-space.md) | [common]<br>fun [RgbColorSpace](-rgb-color-space.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), toXYZ: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html), gamma: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html))<br>Creates a new RGB color space using a 3x3 column-major transform matrix. The transform matrix must convert from the RGB space to the profile connection space CIE XYZ. |
| [RgbColorSpace](-rgb-color-space.md) | [common]<br>fun [RgbColorSpace](-rgb-color-space.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), primaries: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html), whitePoint: [WhitePoint](../-white-point/index.md), gamma: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html))<br>Creates a new RGB color space using a specified set of primaries and a specified white point. |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [equals](equals.md) | [common]<br>open operator override fun [equals](equals.md)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [fromLinear](from-linear.md) | [common]<br>fun [fromLinear](from-linear.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>Encodes an RGB value from linear space to this color space's &quot;gamma space&quot;. This is achieved by applying this color space's opto-electronic transfer function to the first 3 values of the supplied array. The result is stored back in the input array.<br>[common]<br>fun [fromLinear](from-linear.md)(r: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), g: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), b: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>Encodes an RGB value from linear space to this color space's &quot;gamma space&quot;. This is achieved by applying this color space's opto-electronic transfer function to the supplied values. |
| [fromXyz](from-xyz.md) | [common]<br>open override fun [fromXyz](from-xyz.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>Converts tristimulus values from the CIE XYZ space to this color space's color model. The resulting value is passed back in the specified array.<br>[common]<br>fun [fromXyz](../-color-space/from-xyz.md)(x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), z: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>Converts tristimulus values from the CIE XYZ space to this color space's color model. |
| [getInverseTransform](get-inverse-transform.md) | [common]<br>fun [getInverseTransform](get-inverse-transform.md)(): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>Returns the inverse transform of this color space as a new array. The inverse transform is used to convert from XYZ to RGB (with the same white point as this color space). To connect color spaces, you must first [adapt](../adapt.md) them to the same white point.<br>[common]<br>fun [getInverseTransform](get-inverse-transform.md)(inverseTransform: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>Copies the inverse transform of this color space in specified array. The inverse transform is used to convert from XYZ to RGB (with the same white point as this color space). To connect color spaces, you must first [adapt](../adapt.md) them to the same white point. |
| [getMaxValue](get-max-value.md) | [common]<br>open override fun [getMaxValue](get-max-value.md)(component: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Returns the maximum valid value for the specified component of this color space's color model. |
| [getMinValue](get-min-value.md) | [common]<br>open override fun [getMinValue](get-min-value.md)(component: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Returns the minimum valid value for the specified component of this color space's color model. |
| [getPrimaries](get-primaries.md) | [common]<br>fun [getPrimaries](get-primaries.md)(): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>Returns the primaries of this color space as a new array of 6 floats. The Y component is assumed to be 1 and is therefore not copied into the destination. The x and y components of the first primary are written in the array at positions 0 and 1 respectively.<br>[common]<br>fun [getPrimaries](get-primaries.md)(primaries: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>Copies the primaries of this color space in specified array. The Y component is assumed to be 1 and is therefore not copied into the destination. The x and y components of the first primary are written in the array at positions 0 and 1 respectively. |
| [getTransform](get-transform.md) | [common]<br>fun [getTransform](get-transform.md)(): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>Returns the transform of this color space as a new array. The transform is used to convert from RGB to XYZ (with the same white point as this color space). To connect color spaces, you must first [adapt](../adapt.md) them to the same white point.<br>[common]<br>fun [getTransform](get-transform.md)(transform: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>Copies the transform of this color space in specified array. The transform is used to convert from RGB to XYZ (with the same white point as this color space). To connect color spaces, you must first [adapt](../adapt.md) them to the same white point. |
| [hashCode](hash-code.md) | [common]<br>open override fun [hashCode](hash-code.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toLinear](to-linear.md) | [common]<br>fun [toLinear](to-linear.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>Decodes an RGB value to linear space. This is achieved by applying this color space's electro-optical transfer function to the first 3 values of the supplied array. The result is stored back in the input array.<br>[common]<br>fun [toLinear](to-linear.md)(r: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), g: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), b: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>Decodes an RGB value to linear space. This is achieved by applying this color space's electro-optical transfer function to the supplied values. |
| [toString](../-color-space/to-string.md) | [common]<br>open override fun [toString](../-color-space/to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Returns a string representation of the object. This method returns a string equal to the value of: |
| [toXyz](to-xyz.md) | [common]<br>open override fun [toXyz](to-xyz.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>fun [toXyz](../-color-space/to-xyz.md)(r: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), g: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), b: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>Converts a color value from this color space's model to tristimulus CIE XYZ values. If the color model of this color space is not [RGB](../-color-model/-r-g-b/index.md), it is assumed that the target CIE XYZ space uses a [D50](../-illuminant/-d50.md) standard illuminant. |

## Properties

| Name | Summary |
|---|---|
| [componentCount](../-color-space/component-count.md) | [common]<br>val [componentCount](../-color-space/component-count.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Returns the number of components that form a color value according to this color space's color model. |
| [eotf](eotf.md) | [common]<br>val [eotf](eotf.md): ([Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)) -&gt; [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>Returns the electro-optical transfer function (EOTF) of this color space. The inverse function is the opto-electronic transfer function (OETF) returned by [oetf](oetf.md). These functions are defined to satisfy the following equality for x in `[0..1]`: |
| [id](../-color-space/id.md) | [common]<br>val [id](../-color-space/id.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The ID of this color space. Positive IDs match the color spaces enumerated in [ColorSpaces](../-color-spaces/index.md). A negative ID indicates a color space created by calling one of the public constructors. |
| [isSrgb](is-srgb.md) | [common]<br>open override val [isSrgb](is-srgb.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Indicates whether this color space is the sRGB color space or equivalent to the sRGB color space. |
| [isWideGamut](is-wide-gamut.md) | [common]<br>open override val [isWideGamut](is-wide-gamut.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns whether this color space is a wide-gamut color space. An RGB color space is wide-gamut if its gamut entirely contains the [sRGB](../-color-spaces/-s-r-g-b.md) gamut and if the area of its gamut is 90% of greater than the area of the [NTSC](../-color-spaces/-n-t-s-c_1953.md) gamut. |
| [model](../-color-space/model.md) | [common]<br>val [model](../-color-space/model.md): [ColorModel](../-color-model/index.md)<br>The color model of this color space. |
| [name](../-color-space/name.md) | [common]<br>val [name](../-color-space/name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Returns the name of this color space. The name is never null and contains always at least 1 character. |
| [oetf](oetf.md) | [common]<br>val [oetf](oetf.md): ([Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)) -&gt; [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)<br>Returns the opto-electronic transfer function (OETF) of this color space. The inverse function is the electro-optical transfer function (EOTF) returned by [eotf](eotf.md). These functions are defined to satisfy the following equality for x ∈ `[0..1]`: |
| [transferParameters](transfer-parameters.md) | [common]<br>val [transferParameters](transfer-parameters.md): [TransferParameters](../-transfer-parameters/index.md)? |
| [whitePoint](white-point.md) | [common]<br>val [whitePoint](white-point.md): [WhitePoint](../-white-point/index.md) |
