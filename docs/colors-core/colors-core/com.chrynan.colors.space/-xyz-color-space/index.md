//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[XyzColorSpace](index.md)

# XyzColorSpace

[common]\
class [XyzColorSpace](index.md)(val name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), val id: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [ColorSpace](../-color-space/index.md)

Implementation of the CIE XYZ color space. Assumes the white point is D50.

## Constructors

| | |
|---|---|
| [XyzColorSpace](-xyz-color-space.md) | [common]<br>constructor(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), id: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) |

## Types

| Name | Summary |
|---|---|
| [Companion](-companion/index.md) | [common]<br>object [Companion](-companion/index.md) |

## Properties

| Name | Summary |
|---|---|
| [componentCount](../-color-space/component-count.md) | [common]<br>val [componentCount](../-color-space/component-count.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>Returns the number of components that form a color value according to this color space's color model. |
| [id](../-color-space/id.md) | [common]<br>val [id](../-color-space/id.md): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)<br>The ID of this color space. Positive IDs match the color spaces enumerated in [ColorSpaces](../-color-spaces/index.md). A negative ID indicates a color space created by calling one of the public constructors. |
| [isSrgb](../-color-space/is-srgb.md) | [common]<br>open val [isSrgb](../-color-space/is-srgb.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Indicates whether this color space is the sRGB color space or equivalent to the sRGB color space. |
| [isWideGamut](is-wide-gamut.md) | [common]<br>open override val [isWideGamut](is-wide-gamut.md): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)<br>Returns whether this color space is a wide-gamut color space. An RGB color space is wide-gamut if its gamut entirely contains the [sRGB](../-color-spaces/-s-r-g-b.md) gamut and if the area of its gamut is 90% of greater than the area of the [NTSC](../-color-spaces/-n-t-s-c_1953.md) gamut. |
| [model](../-color-space/model.md) | [common]<br>val [model](../-color-space/model.md): [ColorModel](../-color-model/index.md)<br>The color model of this color space. |
| [name](../-color-space/name.md) | [common]<br>val [name](../-color-space/name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Returns the name of this color space. The name is never null and contains always at least 1 character. |

## Functions

| Name | Summary |
|---|---|
| [adapt](../adapt.md) | [common]<br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)<br>fun [ColorSpace](../-color-space/index.md).[adapt](../adapt.md)(whitePoint: [WhitePoint](../-white-point/index.md), adaptation: [Adaptation](../-adaptation/index.md) = Adaptation.BRADFORD): [ColorSpace](../-color-space/index.md)<br>Performs the chromatic adaptation of a color space from its native white point to the specified white point. If the specified color space does not have an [RGB](../-color-model/-r-g-b/index.md) color model, or if the color space already has the target white point, the color space is returned unmodified. |
| [coerceComponentInRange](../coerce-component-in-range.md) | [common]<br>fun [ColorSpace](../-color-space/index.md).[coerceComponentInRange](../coerce-component-in-range.md)(componentIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), componentValue: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) |
| [connect](../connect.md) | [common]<br>fun [ColorSpace](../-color-space/index.md).[connect](../connect.md)(destination: [ColorSpace](../-color-space/index.md) = ColorSpaces.SRGB, intent: [RenderIntent](../-render-intent/index.md) = RenderIntent.PERCEPTUAL): [Connector](../-connector/index.md)<br>Connects two color spaces to allow conversion from the source color space to the destination color space. If the source and destination color spaces do not have the same profile connection space (CIE XYZ with the same white point), they are chromatically adapted to use the CIE standard illuminant [D50](../-illuminant/-d50.md) as needed. |
| [equals](../-color-space/equals.md) | [common]<br>open operator override fun [equals](../-color-space/equals.md)(other: [Any](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-any/index.html)?): [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) |
| [fromXyz](../-color-space/from-xyz.md) | [common]<br>fun [fromXyz](../-color-space/from-xyz.md)(x: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), y: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), z: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>Converts tristimulus values from the CIE XYZ space to this color space's color model.<br>[common]<br>open override fun [fromXyz](from-xyz.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>Converts tristimulus values from the CIE XYZ space to this color space's color model. The resulting value is passed back in the specified array. |
| [getComponentRange](../get-component-range.md) | [common]<br>fun [ColorSpace](../-color-space/index.md).[getComponentRange](../get-component-range.md)(componentIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [ClosedFloatingPointRange](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.ranges/-closed-floating-point-range/index.html)&lt;[Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)&gt; |
| [getMaxValue](get-max-value.md) | [common]<br>open override fun [getMaxValue](get-max-value.md)(component: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Returns the maximum valid value for the specified component of this color space's color model. |
| [getMinValue](get-min-value.md) | [common]<br>open override fun [getMinValue](get-min-value.md)(component: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)<br>Returns the minimum valid value for the specified component of this color space's color model. |
| [hashCode](../-color-space/hash-code.md) | [common]<br>open override fun [hashCode](../-color-space/hash-code.md)(): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) |
| [toString](../-color-space/to-string.md) | [common]<br>open override fun [toString](../-color-space/to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)<br>Returns a string representation of the object. This method returns a string equal to the value of: |
| [toXyz](../-color-space/to-xyz.md) | [common]<br>fun [toXyz](../-color-space/to-xyz.md)(r: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), g: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), b: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>open override fun [toXyz](to-xyz.md)(v: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)<br>Converts a color value from this color space's model to tristimulus CIE XYZ values. If the color model of this color space is not [RGB](../-color-model/-r-g-b/index.md), it is assumed that the target CIE XYZ space uses a [D50](../-illuminant/-d50.md) standard illuminant. |
