//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[RgbColorSpace](index.md)



# RgbColorSpace  
 [common] class [RgbColorSpace](index.md) : [ColorSpace](../-color-space/index.md)

An RGB color space is an additive color space using the [RGB](../-color-model/-r-g-b/index.md) color model (a color is therefore represented by a tuple of 3 numbers).



A specific RGB color space is defined by the following properties:

<ul><li>Three chromaticities of the red, green and blue primaries, which define the gamut of the color space.</li><li>A white point chromaticity that defines the stimulus to which color space values are normalized (also just called "white").</li><li>An opto-electronic transfer function, also called opto-electronic conversion function or often, and approximately, gamma function.</li><li>An electro-optical transfer function, also called electo-optical conversion function or often, and approximately, gamma function.</li><li>A range of valid RGB values (most commonly [0..1]).</li></ul>

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



When manipulating RGB values, particularly sRGB values, it is safe to assume that these values have been encoded with the appropriate OETF (unless noted otherwise). Encoded values are often said to be in "gamma space". They are therefore defined in a non-linear space. This in turns means that any linear operation applied to these values is going to yield mathematically incorrect results (any linear interpolation such as gradient generation for instance, most image processing functions such as blurs, etc.).



To properly process encoded RGB values you must first apply the EOTF to decode the value into linear space. After processing, the RGB value must be encoded back to non-linear ("gamma") space. Here is a formal description of the process, where f is the processing function to apply:



[See RGB equation](https://developer.android.com/reference/android/graphics/ColorSpace.Rgb)



If the transfer functions of the color space can be expressed as an ICC parametric curve as defined in ICC.1:2004-10, the numeric parameters can be retrieved from [transferParameters](transfer-parameters.md). This can be useful to match color spaces for instance.



Some RGB color spaces, such as [ColorSpaces.ACES](../-color-spaces/-a-c-e-s.md) and [scRGB](../-color-spaces/-l-i-n-e-a-r_-e-x-t-e-n-d-e-d_-s-r-g-b.md), are said to be linear because their transfer functions are the identity function: f(x) = x. If the source and/or destination are known to be linear, it is not necessary to invoke the transfer functions.



###  Range  


Most RGB color spaces allow RGB values in the range [0..1]. There are however a few RGB color spaces that allow much larger ranges. For instance, [scRGB](../-color-spaces/-e-x-t-e-n-d-e-d_-s-r-g-b.md) is used to manipulate the range [-0.5..7.5] while [ACES](../-color-spaces/-a-c-e-s.md) can be used throughout the range [-65504, 65504].



{@docRoot}reference/android/images/graphics/colorspace_scrgb.png



###  Converting between RGB color spaces  


Conversion between two color spaces is achieved by using an intermediate color space called the profile connection space (PCS). The PCS used by this implementation is CIE XYZ. The conversion operation is defined as such:



[See RGB equation](https://developer.android.com/reference/android/graphics/ColorSpace.Rgb)



Where Tsrc is the [RGB to XYZ transform](get-transform.md) of the source color space and Tdst^-1 the [XYZ to RGB transform](get-inverse-transform.md) of the destination color space.



Many RGB color spaces commonly used with electronic devices use the standard illuminant [D65](../-illuminant/-d65.md). Care must be take however when converting between two RGB color spaces if their white points do not match. This can be achieved by either calling [adapt](../adapt.md) to adapt one or both color spaces to a single common white point. This can be achieved automatically by calling [ColorSpace.connect](../connect.md), which also handles non-RGB color spaces.



To learn more about the white point adaptation process, refer to the documentation of [Adaptation](../-adaptation/index.md).

   


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]/PointingToDeclaration/"></a>[RgbColorSpace](-rgb-color-space.md)| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]/PointingToDeclaration/"></a> [common] fun [RgbColorSpace](-rgb-color-space.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), toXYZ: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html), oetf: ([Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)) -> [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), eotf: ([Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)) -> [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html))Creates a new RGB color space using a 3x3 column-major transform matrix.   <br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>[RgbColorSpace](-rgb-color-space.md)| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a> [common] fun [RgbColorSpace](-rgb-color-space.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), primaries: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html), whitePoint: [WhitePoint](../-white-point/index.md), oetf: ([Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)) -> [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), eotf: ([Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)) -> [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), min: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), max: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))Creates a new RGB color space using a specified set of primaries and a specified white point.   <br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.TransferParameters/PointingToDeclaration/"></a>[RgbColorSpace](-rgb-color-space.md)| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.TransferParameters/PointingToDeclaration/"></a> [common] fun [RgbColorSpace](-rgb-color-space.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), toXYZ: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html), function: [TransferParameters](../-transfer-parameters/index.md))Creates a new RGB color space using a 3x3 column-major transform matrix.   <br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#com.chrynan.colors.space.TransferParameters/PointingToDeclaration/"></a>[RgbColorSpace](-rgb-color-space.md)| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#com.chrynan.colors.space.TransferParameters/PointingToDeclaration/"></a> [common] fun [RgbColorSpace](-rgb-color-space.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), primaries: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html), whitePoint: [WhitePoint](../-white-point/index.md), function: [TransferParameters](../-transfer-parameters/index.md))Creates a new RGB color space using a specified set of primaries and a specified white point.   <br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#kotlin.Double/PointingToDeclaration/"></a>[RgbColorSpace](-rgb-color-space.md)| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#kotlin.Double/PointingToDeclaration/"></a> [common] fun [RgbColorSpace](-rgb-color-space.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), toXYZ: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html), gamma: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html))Creates a new RGB color space using a 3x3 column-major transform matrix.   <br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Double/PointingToDeclaration/"></a>[RgbColorSpace](-rgb-color-space.md)| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Double/PointingToDeclaration/"></a> [common] fun [RgbColorSpace](-rgb-color-space.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), primaries: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html), whitePoint: [WhitePoint](../-white-point/index.md), gamma: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html))Creates a new RGB color space using a specified set of primaries and a specified white point.   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.colors.space/RgbColorSpace.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](equals.md)| <a name="com.chrynan.colors.space/RgbColorSpace/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator override fun [equals](equals.md)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/fromLinear/#kotlin.FloatArray/PointingToDeclaration/"></a>[fromLinear](from-linear.md)| <a name="com.chrynan.colors.space/RgbColorSpace/fromLinear/#kotlin.FloatArray/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [fromLinear](from-linear.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  <br>fun [fromLinear](from-linear.md)(r: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), g: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), b: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  <br>More info  <br>Encodes an RGB value from linear space to this color space's "gamma space".  <br><br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/fromXyz/#kotlin.FloatArray/PointingToDeclaration/"></a>[fromXyz](from-xyz.md)| <a name="com.chrynan.colors.space/RgbColorSpace/fromXyz/#kotlin.FloatArray/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [fromXyz](from-xyz.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  <br>fun [fromXyz](../-color-space/from-xyz.md)(x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), z: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  <br>More info  <br>Converts tristimulus values from the CIE XYZ space to this color space's color model.  <br><br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/getInverseTransform/#/PointingToDeclaration/"></a>[getInverseTransform](get-inverse-transform.md)| <a name="com.chrynan.colors.space/RgbColorSpace/getInverseTransform/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [getInverseTransform](get-inverse-transform.md)(): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  <br>More info  <br>Returns the inverse transform of this color space as a new array.  <br><br><br>[common]  <br>Content  <br>fun [getInverseTransform](get-inverse-transform.md)(inverseTransform: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  <br>More info  <br>Copies the inverse transform of this color space in specified array.  <br><br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/getMaxValue/#kotlin.Int/PointingToDeclaration/"></a>[getMaxValue](get-max-value.md)| <a name="com.chrynan.colors.space/RgbColorSpace/getMaxValue/#kotlin.Int/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [getMaxValue](get-max-value.md)(component: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)  <br>More info  <br>Returns the maximum valid value for the specified component of this color space's color model.  <br><br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/getMinValue/#kotlin.Int/PointingToDeclaration/"></a>[getMinValue](get-min-value.md)| <a name="com.chrynan.colors.space/RgbColorSpace/getMinValue/#kotlin.Int/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [getMinValue](get-min-value.md)(component: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)  <br>More info  <br>Returns the minimum valid value for the specified component of this color space's color model.  <br><br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/getPrimaries/#/PointingToDeclaration/"></a>[getPrimaries](get-primaries.md)| <a name="com.chrynan.colors.space/RgbColorSpace/getPrimaries/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [getPrimaries](get-primaries.md)(): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  <br>More info  <br>Returns the primaries of this color space as a new array of 6 floats.  <br><br><br>[common]  <br>Content  <br>fun [getPrimaries](get-primaries.md)(primaries: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  <br>More info  <br>Copies the primaries of this color space in specified array.  <br><br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/getTransform/#/PointingToDeclaration/"></a>[getTransform](get-transform.md)| <a name="com.chrynan.colors.space/RgbColorSpace/getTransform/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [getTransform](get-transform.md)(): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  <br>More info  <br>Returns the transform of this color space as a new array.  <br><br><br>[common]  <br>Content  <br>fun [getTransform](get-transform.md)(transform: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  <br>More info  <br>Copies the transform of this color space in specified array.  <br><br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/hashCode/#/PointingToDeclaration/"></a>[hashCode](hash-code.md)| <a name="com.chrynan.colors.space/RgbColorSpace/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [hashCode](hash-code.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/toLinear/#kotlin.FloatArray/PointingToDeclaration/"></a>[toLinear](to-linear.md)| <a name="com.chrynan.colors.space/RgbColorSpace/toLinear/#kotlin.FloatArray/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [toLinear](to-linear.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  <br>fun [toLinear](to-linear.md)(r: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), g: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), b: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  <br>More info  <br>Decodes an RGB value to linear space.  <br><br><br>|
| <a name="com.chrynan.colors.space/ColorSpace/toString/#/PointingToDeclaration/"></a>[toString](../-color-space/to-string.md)| <a name="com.chrynan.colors.space/ColorSpace/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [toString](../-color-space/to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br>More info  <br>Returns a string representation of the object.  <br><br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/toXyz/#kotlin.FloatArray/PointingToDeclaration/"></a>[toXyz](to-xyz.md)| <a name="com.chrynan.colors.space/RgbColorSpace/toXyz/#kotlin.FloatArray/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [toXyz](to-xyz.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  <br>fun [toXyz](../-color-space/to-xyz.md)(r: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), g: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), b: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  <br>More info  <br>Converts a color value from this color space's model to tristimulus CIE XYZ values.  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/componentCount/#/PointingToDeclaration/"></a>[componentCount](index.md#%5Bcom.chrynan.colors.space%2FRgbColorSpace%2FcomponentCount%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-144979981)| <a name="com.chrynan.colors.space/RgbColorSpace/componentCount/#/PointingToDeclaration/"></a> [common] val [componentCount](index.md#%5Bcom.chrynan.colors.space%2FRgbColorSpace%2FcomponentCount%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-144979981): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)Returns the number of components that form a color value according to this color space's color model.   <br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/eotf/#/PointingToDeclaration/"></a>[eotf](eotf.md)| <a name="com.chrynan.colors.space/RgbColorSpace/eotf/#/PointingToDeclaration/"></a> [common] val [eotf](eotf.md): ([Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)) -> [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)Returns the electro-optical transfer function (EOTF) of this color space.   <br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/id/#/PointingToDeclaration/"></a>[id](index.md#%5Bcom.chrynan.colors.space%2FRgbColorSpace%2Fid%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-144979981)| <a name="com.chrynan.colors.space/RgbColorSpace/id/#/PointingToDeclaration/"></a> [common] val [id](index.md#%5Bcom.chrynan.colors.space%2FRgbColorSpace%2Fid%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-144979981): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)The ID of this color space.   <br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/isSrgb/#/PointingToDeclaration/"></a>[isSrgb](is-srgb.md)| <a name="com.chrynan.colors.space/RgbColorSpace/isSrgb/#/PointingToDeclaration/"></a> [common] open override val [isSrgb](is-srgb.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)Indicates whether this color space is the sRGB color space or equivalent to the sRGB color space.   <br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/isWideGamut/#/PointingToDeclaration/"></a>[isWideGamut](is-wide-gamut.md)| <a name="com.chrynan.colors.space/RgbColorSpace/isWideGamut/#/PointingToDeclaration/"></a> [common] open override val [isWideGamut](is-wide-gamut.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)Returns whether this color space is a wide-gamut color space.   <br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/model/#/PointingToDeclaration/"></a>[model](index.md#%5Bcom.chrynan.colors.space%2FRgbColorSpace%2Fmodel%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-144979981)| <a name="com.chrynan.colors.space/RgbColorSpace/model/#/PointingToDeclaration/"></a> [common] val [model](index.md#%5Bcom.chrynan.colors.space%2FRgbColorSpace%2Fmodel%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-144979981): [ColorModel](../-color-model/index.md)The color model of this color space.   <br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/name/#/PointingToDeclaration/"></a>[name](index.md#%5Bcom.chrynan.colors.space%2FRgbColorSpace%2Fname%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-144979981)| <a name="com.chrynan.colors.space/RgbColorSpace/name/#/PointingToDeclaration/"></a> [common] val [name](index.md#%5Bcom.chrynan.colors.space%2FRgbColorSpace%2Fname%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F-144979981): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Returns the name of this color space.   <br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/oetf/#/PointingToDeclaration/"></a>[oetf](oetf.md)| <a name="com.chrynan.colors.space/RgbColorSpace/oetf/#/PointingToDeclaration/"></a> [common] val [oetf](oetf.md): ([Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)) -> [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)Returns the opto-electronic transfer function (OETF) of this color space.   <br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/transferParameters/#/PointingToDeclaration/"></a>[transferParameters](transfer-parameters.md)| <a name="com.chrynan.colors.space/RgbColorSpace/transferParameters/#/PointingToDeclaration/"></a> [common] val [transferParameters](transfer-parameters.md): [TransferParameters](../-transfer-parameters/index.md)?   <br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/whitePoint/#/PointingToDeclaration/"></a>[whitePoint](white-point.md)| <a name="com.chrynan.colors.space/RgbColorSpace/whitePoint/#/PointingToDeclaration/"></a> [common] val [whitePoint](white-point.md): [WhitePoint](../-white-point/index.md)   <br>|

