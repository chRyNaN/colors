//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[TransferParameters](index.md)

# TransferParameters

data class [TransferParameters](index.md)(val gamma: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), val a: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), val b: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), val c: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), val d: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), val e: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) = 0.0, val f: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) = 0.0)

Defines the parameters for the ICC parametric curve type 4, as defined in ICC.1:2004-10, section 10.15.

[The EOTF is of the form linked here](https://d.android.com/reference/android/graphics/ColorSpace.Rgb.TransferParameters)

The corresponding OETF is simply the inverse function.

The parameters defined by this class form a valid transfer function only if all the following conditions are met:

- 
   No parameter is a [Not-a-Number](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/index.html)
- 
   `d` is in the range `[0..1]`
- 
   The function is not constant
- 
   The function is positive and increasing

#### Parameters

common

| | |
|---|---|
| gamma | Value g in the equation of the EOTF described above. |
| a | Value a in the equation of the EOTF described above. |
| b | Value b in the equation of the EOTF described above. |
| c | Value c in the equation of the EOTF described above. |
| d | Value d in the equation of the EOTF described above. |
| e | Value e in the equation of the EOTF described above. |
| f | Value f in the equation of the EOTF described above. |

## Constructors

| | |
|---|---|
| [TransferParameters](-transfer-parameters.md) | [common]<br>constructor(gamma: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), a: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), b: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), c: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), d: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), e: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) = 0.0, f: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) = 0.0) |

## Properties

| Name | Summary |
|---|---|
| [a](a.md) | [common]<br>val [a](a.md): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [b](b.md) | [common]<br>val [b](b.md): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [c](c.md) | [common]<br>val [c](c.md): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [d](d.md) | [common]<br>val [d](d.md): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
| [e](e.md) | [common]<br>val [e](e.md): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) = 0.0 |
| [f](f.md) | [common]<br>val [f](f.md): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) = 0.0 |
| [gamma](gamma.md) | [common]<br>val [gamma](gamma.md): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) |
