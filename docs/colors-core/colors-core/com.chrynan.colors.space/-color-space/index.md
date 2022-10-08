//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[ColorSpace](index.md)

# ColorSpace

[common]\
abstract class [ColorSpace](index.md)

A [ColorSpace](index.md) is used to identify a specific organization of colors. Each color space is characterized by a [color model](../-color-model/index.md) that defines how a color value is represented (for instance the [RGB](../-color-model/-r-g-b/index.md) color model defines a color value as a triplet of numbers).

Each component of a color must fall within a valid range, specific to each color space, defined by [getMinValue](get-min-value.md) and [getMaxValue](get-max-value.md) This range is commonly `[0..1]`. While it is recommended to use values in the valid range, a color space always clamps input and output values when performing operations such as converting to a different color space.

###  Using color spaces

This implementation provides a pre-defined set of common color spaces described in the [ColorSpaces](../-color-spaces/index.md) object.

The documentation of [ColorSpaces](../-color-spaces/index.md) provides a detailed description of the various characteristics of each available color space.

###  Color space conversions

To allow conversion between color spaces, this implementation uses the CIE XYZ profile connection space (PCS). Color values can be converted to and from this PCS using [toXyz](to-xyz.md) and [fromXyz](from-xyz.md).

For color space with a non-RGB color model, the white point of the PCS *must be* the CIE standard illuminant D50. RGB color spaces use their native white point (D65 for [sRGB](../-color-spaces/-s-r-g-b.md) for instance and must undergo [chromatic adaptation](../-adaptation/index.md) as necessary.

Since the white point of the PCS is not defined for RGB color space, it is highly recommended to use the [connect](../connect.md) method to perform conversions between color spaces. A color space can be manually adapted to a specific white point using [adapt](../adapt.md). Please refer to the documentation of [RGB color spaces](../-rgb-color-space/index.md) for more information. Several common CIE standard illuminants are provided in this class as reference (see [Illuminant.D65](../-illuminant/-d65.md) or [Illuminant.D50](../-illuminant/-d50.md) for instance).

Here is an example of how to convert from a color space to another:

```kotlin
    // Convert from DCI-P3 to Rec.2020
    val connector = ColorSpaces.DciP3.connect(ColorSpaces.BT2020)

    val bt2020Values = connector.transform(p3r, p3g, p3b);
```

You can easily convert to [sRGB](../-color-spaces/-s-r-g-b.md) by omitting the color space parameter:

```kotlin
    // Convert from DCI-P3 to sRGB
    val connector = ColorSpaces.DciP3.connect()

    val sRGBValues = connector.transform(p3r, p3g, p3b);
```

Conversions also work between color spaces with different color models:

```kotlin
    // Convert from CIE L*a*b* (color model Lab) to Rec.709 (color model RGB)
    val connector = ColorSpaces.CieLab.connect(ColorSpaces.Bt709)
```

###  Color spaces and multi-threading

Color spaces and other related classes ([Connector](../-connector/index.md) for instance) are immutable and stateless. They can be safely used from multiple concurrent threads.

## See also

common

| | |
|---|---|
| [com.chrynan.colors.space.ColorSpaces](../-color-spaces/index.md) |  |
| [com.chrynan.colors.space.ColorModel](../-color-model/index.md) |  |
| [com.chrynan.colors.space.Connector](../-connector/index.md) |  |
| [com.chrynan.colors.space.Adaptation](../-adaptation/index.md) |  |

## Constructors

| | |
|---|---|
| [ColorSpace](-color-space.md) | [common]<br>fun [ColorSpace](-color-space.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), model: [ColorModel](../-color-model/index.md)) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Functions

| Name | Summary |
|---|---|
| [equals](equals.md) | [common]<br>open operator override fun [equals](equals.md)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [fromXyz](from-xyz.md) | [common]<br>abstract fun [fromXyz](from-xyz.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>Converts tristimulus values from the CIE XYZ space to this color space's color model. The resulting value is passed back in the specified array.<br>[common]<br>fun [fromXyz](from-xyz.md)(x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), z: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>Converts tristimulus values from the CIE XYZ space to this color space's color model. |
| [getMaxValue](get-max-value.md) | [common]<br>abstract fun [getMaxValue](get-max-value.md)(component: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Returns the maximum valid value for the specified component of this color space's color model. |
| [getMinValue](get-min-value.md) | [common]<br>abstract fun [getMinValue](get-min-value.md)(component: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Returns the minimum valid value for the specified component of this color space's color model. |
| [hashCode](hash-code.md) | [common]<br>open override fun [hashCode](hash-code.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toString](to-string.md) | [common]<br>open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Returns a string representation of the object. This method returns a string equal to the value of: |
| [toXyz](to-xyz.md) | [common]<br>abstract fun [toXyz](to-xyz.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>fun [toXyz](to-xyz.md)(r: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), g: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), b: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>Converts a color value from this color space's model to tristimulus CIE XYZ values. If the color model of this color space is not [RGB](../-color-model/-r-g-b/index.md), it is assumed that the target CIE XYZ space uses a [D50](../-illuminant/-d50.md) standard illuminant. |

## Properties

| Name | Summary |
|---|---|
| [componentCount](component-count.md) | [common]<br>val [componentCount](component-count.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Returns the number of components that form a color value according to this color space's color model. |
| [id](id.md) | [common]<br>val [id](id.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The ID of this color space. Positive IDs match the color spaces enumerated in [ColorSpaces](../-color-spaces/index.md). A negative ID indicates a color space created by calling one of the public constructors. |
| [isSrgb](is-srgb.md) | [common]<br>open val [isSrgb](is-srgb.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Indicates whether this color space is the sRGB color space or equivalent to the sRGB color space. |
| [isWideGamut](is-wide-gamut.md) | [common]<br>abstract val [isWideGamut](is-wide-gamut.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns whether this color space is a wide-gamut color space. An RGB color space is wide-gamut if its gamut entirely contains the [sRGB](../-color-spaces/-s-r-g-b.md) gamut and if the area of its gamut is 90% of greater than the area of the [NTSC](../-color-spaces/-n-t-s-c_1953.md) gamut. |
| [model](model.md) | [common]<br>val [model](model.md): [ColorModel](../-color-model/index.md)<br>The color model of this color space. |
| [name](name.md) | [common]<br>val [name](name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Returns the name of this color space. The name is never null and contains always at least 1 character. |

## Inheritors

| Name |
|---|
| [LabColorSpace](../-lab-color-space/index.md) |
| [OkLabColorSpace](../-ok-lab-color-space/index.md) |
| [RgbColorSpace](../-rgb-color-space/index.md) |
| [XyzColorSpace](../-xyz-color-space/index.md) |

## Extensions

| Name | Summary |
|---|---|
| [adapt](../adapt.md) | [common]<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)<br>fun [ColorSpace](index.md).[adapt](../adapt.md)(whitePoint: [WhitePoint](../-white-point/index.md), adaptation: [Adaptation](../-adaptation/index.md) = Adaptation.BRADFORD): [ColorSpace](index.md)<br>Performs the chromatic adaptation of a color space from its native white point to the specified white point. If the specified color space does not have an [RGB](../-color-model/-r-g-b/index.md) color model, or if the color space already has the target white point, the color space is returned unmodified. |
| [coerceComponentInRange](../coerce-component-in-range.md) | [common]<br>fun [ColorSpace](index.md).[coerceComponentInRange](../coerce-component-in-range.md)(componentIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), componentValue: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [connect](../connect.md) | [common]<br>fun [ColorSpace](index.md).[connect](../connect.md)(destination: [ColorSpace](index.md) = ColorSpaces.SRGB, intent: [RenderIntent](../-render-intent/index.md) = RenderIntent.PERCEPTUAL): [Connector](../-connector/index.md)<br>Connects two color spaces to allow conversion from the source color space to the destination color space. If the source and destination color spaces do not have the same profile connection space (CIE XYZ with the same white point), they are chromatically adapted to use the CIE standard illuminant [D50](../-illuminant/-d50.md) as needed. |
| [getComponentRange](../get-component-range.md) | [common]<br>fun [ColorSpace](index.md).[getComponentRange](../get-component-range.md)(componentIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [ClosedFloatingPointRange](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.ranges/-closed-floating-point-range/index.html)&lt;[Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)&gt; |
