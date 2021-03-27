//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[ColorSpace](index.md)



# ColorSpace  
 [common] abstract class [ColorSpace](index.md)

A [ColorSpace](index.md) is used to identify a specific organization of colors. Each color space is characterized by a [color model](../-color-model/index.md) that defines how a color value is represented (for instance the [RGB](../-color-model/-r-g-b/index.md) color model defines a color value as a triplet of numbers).



Each component of a color must fall within a valid range, specific to each color space, defined by [getMinValue](get-min-value.md) and [getMaxValue](get-max-value.md) This range is commonly [0..1]. While it is recommended to use values in the valid range, a color space always clamps input and output values when performing operations such as converting to a different color space.



###  Using color spaces  


This implementation provides a pre-defined set of common color spaces described in the [ColorSpaces](../-color-spaces/index.md) object.



The documentation of [ColorSpaces](../-color-spaces/index.md) provides a detailed description of the various characteristics of each available color space.



###  Color space conversions  


To allow conversion between color spaces, this implementation uses the CIE XYZ profile connection space (PCS). Color values can be converted to and from this PCS using [toXyz](to-xyz.md) and [fromXyz](from-xyz.md).



For color space with a non-RGB color model, the white point of the PCS *must be* the CIE standard illuminant D50. RGB color spaces use their native white point (D65 for [sRGB](../-color-spaces/-s-r-g-b.md) for instance and must undergo [chromatic adaptation](../-adaptation/index.md) as necessary.



Since the white point of the PCS is not defined for RGB color space, it is highly recommended to use the [connect](../connect.md) method to perform conversions between color spaces. A color space can be manually adapted to a specific white point using [adapt](../adapt.md). Please refer to the documentation of [RGB color spaces](../-rgb-color-space/index.md) for more information. Several common CIE standard illuminants are provided in this class as reference (see [Illuminant.D65](../-illuminant/-d65.md) or [Illuminant.D50](../-illuminant/-d50.md) for instance).



Here is an example of how to convert from a color space to another:

    // Convert from DCI-P3 to Rec.2020
    val connector = ColorSpaces.DciP3.connect(ColorSpaces.BT2020)

    val bt2020Values = connector.transform(p3r, p3g, p3b);

You can easily convert to [sRGB](../-color-spaces/-s-r-g-b.md) by omitting the color space parameter:

    // Convert from DCI-P3 to sRGB
    val connector = ColorSpaces.DciP3.connect()

    val sRGBValues = connector.transform(p3r, p3g, p3b);

Conversions also work between color spaces with different color models:

    // Convert from CIE L*a*b* (color model Lab) to Rec.709 (color model RGB)
    val connector = ColorSpaces.CieLab.connect(ColorSpaces.Bt709)

###  Color spaces and multi-threading  


Color spaces and other related classes ([Connector](../-connector/index.md) for instance) are immutable and stateless. They can be safely used from multiple concurrent threads.

   


## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/ColorSpace///PointingToDeclaration/"></a>[com.chrynan.colors.space.ColorSpaces](../-color-spaces/index.md)| <a name="com.chrynan.colors.space/ColorSpace///PointingToDeclaration/"></a>|
| <a name="com.chrynan.colors.space/ColorSpace///PointingToDeclaration/"></a>[com.chrynan.colors.space.ColorModel](../-color-model/index.md)| <a name="com.chrynan.colors.space/ColorSpace///PointingToDeclaration/"></a>|
| <a name="com.chrynan.colors.space/ColorSpace///PointingToDeclaration/"></a>[com.chrynan.colors.space.Connector](../-connector/index.md)| <a name="com.chrynan.colors.space/ColorSpace///PointingToDeclaration/"></a>|
| <a name="com.chrynan.colors.space/ColorSpace///PointingToDeclaration/"></a>[com.chrynan.colors.space.Adaptation](../-adaptation/index.md)| <a name="com.chrynan.colors.space/ColorSpace///PointingToDeclaration/"></a>|
  


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/ColorSpace/ColorSpace/#kotlin.String#com.chrynan.colors.space.ColorModel/PointingToDeclaration/"></a>[ColorSpace](-color-space.md)| <a name="com.chrynan.colors.space/ColorSpace/ColorSpace/#kotlin.String#com.chrynan.colors.space.ColorModel/PointingToDeclaration/"></a> [common] fun [ColorSpace](-color-space.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), model: [ColorModel](../-color-model/index.md))   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.space/ColorSpace.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.colors.space/ColorSpace.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.space/ColorSpace/equals/#kotlin.Any?/PointingToDeclaration/"></a>[equals](equals.md)| <a name="com.chrynan.colors.space/ColorSpace/equals/#kotlin.Any?/PointingToDeclaration/"></a>[common]  <br>Content  <br>open operator override fun [equals](equals.md)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)  <br><br><br>|
| <a name="com.chrynan.colors.space/ColorSpace/fromXyz/#kotlin.FloatArray/PointingToDeclaration/"></a>[fromXyz](from-xyz.md)| <a name="com.chrynan.colors.space/ColorSpace/fromXyz/#kotlin.FloatArray/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [fromXyz](from-xyz.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  <br>fun [fromXyz](from-xyz.md)(x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), z: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  <br>More info  <br>Converts tristimulus values from the CIE XYZ space to this color space's color model.  <br><br><br>|
| <a name="com.chrynan.colors.space/ColorSpace/getMaxValue/#kotlin.Int/PointingToDeclaration/"></a>[getMaxValue](get-max-value.md)| <a name="com.chrynan.colors.space/ColorSpace/getMaxValue/#kotlin.Int/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [getMaxValue](get-max-value.md)(component: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)  <br>More info  <br>Returns the maximum valid value for the specified component of this color space's color model.  <br><br><br>|
| <a name="com.chrynan.colors.space/ColorSpace/getMinValue/#kotlin.Int/PointingToDeclaration/"></a>[getMinValue](get-min-value.md)| <a name="com.chrynan.colors.space/ColorSpace/getMinValue/#kotlin.Int/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [getMinValue](get-min-value.md)(component: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)  <br>More info  <br>Returns the minimum valid value for the specified component of this color space's color model.  <br><br><br>|
| <a name="com.chrynan.colors.space/ColorSpace/hashCode/#/PointingToDeclaration/"></a>[hashCode](hash-code.md)| <a name="com.chrynan.colors.space/ColorSpace/hashCode/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [hashCode](hash-code.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)  <br><br><br>|
| <a name="com.chrynan.colors.space/ColorSpace/toString/#/PointingToDeclaration/"></a>[toString](to-string.md)| <a name="com.chrynan.colors.space/ColorSpace/toString/#/PointingToDeclaration/"></a>[common]  <br>Content  <br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)  <br>More info  <br>Returns a string representation of the object.  <br><br><br>|
| <a name="com.chrynan.colors.space/ColorSpace/toXyz/#kotlin.FloatArray/PointingToDeclaration/"></a>[toXyz](to-xyz.md)| <a name="com.chrynan.colors.space/ColorSpace/toXyz/#kotlin.FloatArray/PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract fun [toXyz](to-xyz.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  <br>fun [toXyz](to-xyz.md)(r: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), g: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), b: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)  <br>More info  <br>Converts a color value from this color space's model to tristimulus CIE XYZ values.  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.space/ColorSpace/componentCount/#/PointingToDeclaration/"></a>[componentCount](component-count.md)| <a name="com.chrynan.colors.space/ColorSpace/componentCount/#/PointingToDeclaration/"></a> [common] val [componentCount](component-count.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)Returns the number of components that form a color value according to this color space's color model.   <br>|
| <a name="com.chrynan.colors.space/ColorSpace/id/#/PointingToDeclaration/"></a>[id](id.md)| <a name="com.chrynan.colors.space/ColorSpace/id/#/PointingToDeclaration/"></a> [common] val [id](id.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)The ID of this color space.   <br>|
| <a name="com.chrynan.colors.space/ColorSpace/isSrgb/#/PointingToDeclaration/"></a>[isSrgb](is-srgb.md)| <a name="com.chrynan.colors.space/ColorSpace/isSrgb/#/PointingToDeclaration/"></a> [common] open val [isSrgb](is-srgb.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)Indicates whether this color space is the sRGB color space or equivalent to the sRGB color space.   <br>|
| <a name="com.chrynan.colors.space/ColorSpace/isWideGamut/#/PointingToDeclaration/"></a>[isWideGamut](is-wide-gamut.md)| <a name="com.chrynan.colors.space/ColorSpace/isWideGamut/#/PointingToDeclaration/"></a> [common] abstract val [isWideGamut](is-wide-gamut.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)Returns whether this color space is a wide-gamut color space.   <br>|
| <a name="com.chrynan.colors.space/ColorSpace/model/#/PointingToDeclaration/"></a>[model](model.md)| <a name="com.chrynan.colors.space/ColorSpace/model/#/PointingToDeclaration/"></a> [common] val [model](model.md): [ColorModel](../-color-model/index.md)The color model of this color space.   <br>|
| <a name="com.chrynan.colors.space/ColorSpace/name/#/PointingToDeclaration/"></a>[name](name.md)| <a name="com.chrynan.colors.space/ColorSpace/name/#/PointingToDeclaration/"></a> [common] val [name](name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)Returns the name of this color space.   <br>|


## Inheritors  
  
|  Name | 
|---|
| <a name="com.chrynan.colors.space/LabColorSpace///PointingToDeclaration/"></a>[LabColorSpace](../-lab-color-space/index.md)|
| <a name="com.chrynan.colors.space/OkLabColorSpace///PointingToDeclaration/"></a>[OkLabColorSpace](../-ok-lab-color-space/index.md)|
| <a name="com.chrynan.colors.space/RgbColorSpace///PointingToDeclaration/"></a>[RgbColorSpace](../-rgb-color-space/index.md)|
| <a name="com.chrynan.colors.space/XyzColorSpace///PointingToDeclaration/"></a>[XyzColorSpace](../-xyz-color-space/index.md)|


## Extensions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.space//adapt/com.chrynan.colors.space.ColorSpace#com.chrynan.colors.space.WhitePoint#com.chrynan.colors.space.Adaptation/PointingToDeclaration/"></a>[adapt](../adapt.md)| <a name="com.chrynan.colors.space//adapt/com.chrynan.colors.space.ColorSpace#com.chrynan.colors.space.WhitePoint#com.chrynan.colors.space.Adaptation/PointingToDeclaration/"></a>[common]  <br>Content  <br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)()  <br>  <br>fun [ColorSpace](index.md).[adapt](../adapt.md)(whitePoint: [WhitePoint](../-white-point/index.md), adaptation: [Adaptation](../-adaptation/index.md) = Adaptation.BRADFORD): [ColorSpace](index.md)  <br>More info  <br>Performs the chromatic adaptation of a color space from its native white point to the specified white point.  <br><br><br>|
| <a name="com.chrynan.colors.space//coerceComponentInRange/com.chrynan.colors.space.ColorSpace#kotlin.Int#kotlin.Float/PointingToDeclaration/"></a>[coerceComponentInRange](../coerce-component-in-range.md)| <a name="com.chrynan.colors.space//coerceComponentInRange/com.chrynan.colors.space.ColorSpace#kotlin.Int#kotlin.Float/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [ColorSpace](index.md).[coerceComponentInRange](../coerce-component-in-range.md)(componentIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), componentValue: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)  <br><br><br>|
| <a name="com.chrynan.colors.space//connect/com.chrynan.colors.space.ColorSpace#com.chrynan.colors.space.ColorSpace#com.chrynan.colors.space.RenderIntent/PointingToDeclaration/"></a>[connect](../connect.md)| <a name="com.chrynan.colors.space//connect/com.chrynan.colors.space.ColorSpace#com.chrynan.colors.space.ColorSpace#com.chrynan.colors.space.RenderIntent/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [ColorSpace](index.md).[connect](../connect.md)(destination: [ColorSpace](index.md) = ColorSpaces.SRGB, intent: [RenderIntent](../-render-intent/index.md) = RenderIntent.PERCEPTUAL): [Connector](../-connector/index.md)  <br>More info  <br>Connects two color spaces to allow conversion from the source color space to the destination color space.  <br><br><br>|
| <a name="com.chrynan.colors.space//getComponentRange/com.chrynan.colors.space.ColorSpace#kotlin.Int/PointingToDeclaration/"></a>[getComponentRange](../get-component-range.md)| <a name="com.chrynan.colors.space//getComponentRange/com.chrynan.colors.space.ColorSpace#kotlin.Int/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [ColorSpace](index.md).[getComponentRange](../get-component-range.md)(componentIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [ClosedFloatingPointRange](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.ranges/-closed-floating-point-range/index.html)<[Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)>  <br><br><br>|

