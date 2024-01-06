//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[RgbColorSpace](index.md)/[RgbColorSpace](-rgb-color-space.md)

# RgbColorSpace

[common]\
constructor(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), toXYZ: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html), oetf: ([Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)) -&gt; [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), eotf: ([Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)) -&gt; [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html))

Creates a new RGB color space using a 3x3 column-major transform matrix. The transform matrix must convert from the RGB space to the profile connection space CIE XYZ.

The range of the color space is imposed to be `[0..1]`.

#### Parameters

common

| | |
|---|---|
| name | Name of the color space, cannot be null, its length must be >= 1 |
| toXYZ | 3x3 column-major transform matrix from RGB to the profile connection space CIE XYZ as an array of 9 floats, cannot be null |
| oetf | Opto-electronic transfer function, cannot be null |
| eotf | Electro-optical transfer function, cannot be null |

#### Throws

| | |
|---|---|
| [IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | If any of the following conditions is met:<br>-     The name is null or has a length of 0. -     The OETF is null or the EOTF is null. -     The minimum valid value is >= the maximum valid value. |

[common]\
constructor(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), primaries: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html), whitePoint: [WhitePoint](../-white-point/index.md), oetf: ([Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)) -&gt; [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), eotf: ([Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)) -&gt; [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), min: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), max: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))

Creates a new RGB color space using a specified set of primaries and a specified white point.

The primaries and white point can be specified in the CIE xyY space or in CIE XYZ. The length of the arrays depends on the chosen space:

```kotlin
| Spaces | Primaries length | White point length |
|--------|------------------|--------------------|
| xyY    | 6                | 2                  |
| XYZ    | 9                | 3                  |
```

When the primaries and/or white point are specified in xyY, the Y component does not need to be specified and is assumed to be 1.0. Only the xy components are required.

#### Parameters

common

| | |
|---|---|
| name | Name of the color space, cannot be null, its length must be >= 1 |
| primaries | RGB primaries as an array of 6 (xy) or 9 (XYZ) floats |
| whitePoint | Reference white as an array of 2 (xy) or 3 (XYZ) floats |
| oetf | Opto-electronic transfer function, cannot be null |
| eotf | Electro-optical transfer function, cannot be null |
| min | The minimum valid value in this color space's RGB range |
| max | The maximum valid value in this color space's RGB range |

#### Throws

| | |
|---|---|
| [IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | If any of the following conditions is met:<br>-     The name is null or has a length of 0. -     The primaries array is null or has a length that is neither 6 or 9. -     The white point array is null or has a length that is neither 2 or 3. -     The OETF is null or the EOTF is null. -     The minimum valid value is >= the maximum valid value. |

[common]\
constructor(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), toXYZ: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html), function: [TransferParameters](../-transfer-parameters/index.md))

Creates a new RGB color space using a 3x3 column-major transform matrix. The transform matrix must convert from the RGB space to the profile connection space CIE XYZ.

The range of the color space is imposed to be `[0..1]`.

#### Parameters

common

| | |
|---|---|
| name | Name of the color space, cannot be null, its length must be >= 1 |
| toXYZ | 3x3 column-major transform matrix from RGB to the profile connection space CIE XYZ as an array of 9 floats, cannot be null |
| function | Parameters for the transfer functions |

#### Throws

| | |
|---|---|
| [IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | If any of the following conditions is met:<br>-     The name is null or has a length of 0. -     Gamma is negative. |

[common]\
constructor(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), primaries: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html), whitePoint: [WhitePoint](../-white-point/index.md), function: [TransferParameters](../-transfer-parameters/index.md))

Creates a new RGB color space using a specified set of primaries and a specified white point.

The primaries and white point can be specified in the CIE xyY space or in CIE XYZ. The length of the arrays depends on the chosen space:

```kotlin
| Spaces | Primaries length | White point length |
|--------|------------------|--------------------|
| xyY    | 6                | 2                  |
| XYZ    | 9                | 3                  |
```

When the primaries and/or white point are specified in xyY, the Y component does not need to be specified and is assumed to be 1.0. Only the xy components are required.

#### Parameters

common

| | |
|---|---|
| name | Name of the color space, cannot be null, its length must be >= 1 |
| primaries | RGB primaries as an array of 6 (xy) or 9 (XYZ) floats |
| whitePoint | Reference white as an array of 2 (xy) or 3 (XYZ) floats |
| function | Parameters for the transfer functions |

#### Throws

| | |
|---|---|
| [IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | If any of the following conditions is met:<br>-     The name is null or has a length of 0. -     The primaries array is null or has a length that is neither 6 or 9. -     The white point array is null or has a length that is neither 2 or 3. -     The transfer parameters are invalid. |

[common]\
constructor(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), toXYZ: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html), gamma: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html))

Creates a new RGB color space using a 3x3 column-major transform matrix. The transform matrix must convert from the RGB space to the profile connection space CIE XYZ.

The range of the color space is imposed to be `[0..1]`.

#### Parameters

common

| | |
|---|---|
| name | Name of the color space, cannot be null, its length must be >= 1 |
| toXYZ | 3x3 column-major transform matrix from RGB to the profile connection space CIE XYZ as an array of 9 floats, cannot be null |
| gamma | Gamma to use as the transfer function |

#### See also

| |
|---|
| [get](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index.html) |

#### Throws

| | |
|---|---|
| [IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | If any of the following conditions is met:<br>-     The name is null or has a length of 0. -     Gamma is negative. |

[common]\
constructor(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), primaries: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html), whitePoint: [WhitePoint](../-white-point/index.md), gamma: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html))

Creates a new RGB color space using a specified set of primaries and a specified white point.

The primaries and white point can be specified in the CIE xyY space or in CIE XYZ. The length of the arrays depends on the chosen space:

```kotlin
| Spaces | Primaries length | White point length |
|--------|------------------|--------------------|
| xyY    | 6                | 2                  |
| XYZ    | 9                | 3                  |
```

When the primaries and/or white point are specified in xyY, the Y component does not need to be specified and is assumed to be 1.0. Only the xy components are required.

#### Parameters

common

| | |
|---|---|
| name | Name of the color space, cannot be null, its length must be >= 1 |
| primaries | RGB primaries as an array of 6 (xy) or 9 (XYZ) floats |
| whitePoint | Reference white as an array of 2 (xy) or 3 (XYZ) floats |
| gamma | Gamma to use as the transfer function |

#### See also

| |
|---|
| [get](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index.html) |

#### Throws

| | |
|---|---|
| [IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html) | If any of the following conditions is met:<br>-     The name is null or has a length of 0. -     The primaries array is null or has a length that is neither 6 or 9. -     The white point array is null or has a length that is neither 2 or 3. -     Gamma is negative. |
