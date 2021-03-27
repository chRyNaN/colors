//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[RgbColorSpace](index.md)/[RgbColorSpace](-rgb-color-space.md)



# RgbColorSpace  
[common]  
Content  
fun [RgbColorSpace](-rgb-color-space.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), toXYZ: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html), oetf: ([Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)) -> [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), eotf: ([Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)) -> [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html))  
More info  


Creates a new RGB color space using a 3x3 column-major transform matrix. The transform matrix must convert from the RGB space to the profile connection space CIE XYZ.



The range of the color space is imposed to be [0..1].



## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]/PointingToDeclaration/"></a>name| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]/PointingToDeclaration/"></a><br><br>Name of the color space, cannot be null, its length must be >= 1<br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]/PointingToDeclaration/"></a>toXYZ| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]/PointingToDeclaration/"></a><br><br>3x3 column-major transform matrix from RGB to the profile connection space CIE XYZ as an array of 9 floats, cannot be null<br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]/PointingToDeclaration/"></a>oetf| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]/PointingToDeclaration/"></a><br><br>Opto-electronic transfer function, cannot be null<br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]/PointingToDeclaration/"></a>eotf| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]/PointingToDeclaration/"></a><br><br>Electro-optical transfer function, cannot be null<br><br>|
  


#### Throws  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]/PointingToDeclaration/"></a>[kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html)| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]/PointingToDeclaration/"></a><br><br>If any of the following conditions is met:<br><br><ul><li>The name is null or has a length of 0.</li><li>The OETF is null or the EOTF is null.</li><li>The minimum valid value is >= the maximum valid value.</li></ul>|
  


[common]  
Content  
fun [RgbColorSpace](-rgb-color-space.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), primaries: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html), whitePoint: [WhitePoint](../-white-point/index.md), oetf: ([Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)) -> [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), eotf: ([Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)) -> [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), min: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), max: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))  
More info  


Creates a new RGB color space using a specified set of primaries and a specified white point.



The primaries and white point can be specified in the CIE xyY space or in CIE XYZ. The length of the arrays depends on the chosen space:

| Spaces | Primaries length | White point length |  
|--------|------------------|--------------------|  
| xyY    | 6                | 2                  |  
| XYZ    | 9                | 3                  |

When the primaries and/or white point are specified in xyY, the Y component does not need to be specified and is assumed to be 1.0. Only the xy components are required.



## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>name| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a><br><br>Name of the color space, cannot be null, its length must be >= 1<br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>primaries| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a><br><br>RGB primaries as an array of 6 (xy) or 9 (XYZ) floats<br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>whitePoint| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a><br><br>Reference white as an array of 2 (xy) or 3 (XYZ) floats<br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>oetf| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a><br><br>Opto-electronic transfer function, cannot be null<br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>eotf| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a><br><br>Electro-optical transfer function, cannot be null<br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>min| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a><br><br>The minimum valid value in this color space's RGB range<br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>max| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a><br><br>The maximum valid value in this color space's RGB range<br><br>|
  


#### Throws  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a>[kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html)| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Function1[kotlin.Double,kotlin.Double]#kotlin.Float#kotlin.Float/PointingToDeclaration/"></a><br><br>If any of the following conditions is met:<br><br><ul><li>The name is null or has a length of 0.</li><li>The primaries array is null or has a length that is neither 6 or 9.</li><li>The white point array is null or has a length that is neither 2 or 3.</li><li>The OETF is null or the EOTF is null.</li><li>The minimum valid value is >= the maximum valid value.</li></ul>|
  


[common]  
Content  
fun [RgbColorSpace](-rgb-color-space.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), toXYZ: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html), function: [TransferParameters](../-transfer-parameters/index.md))  
More info  


Creates a new RGB color space using a 3x3 column-major transform matrix. The transform matrix must convert from the RGB space to the profile connection space CIE XYZ.



The range of the color space is imposed to be [0..1].



## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.TransferParameters/PointingToDeclaration/"></a>name| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.TransferParameters/PointingToDeclaration/"></a><br><br>Name of the color space, cannot be null, its length must be >= 1<br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.TransferParameters/PointingToDeclaration/"></a>toXYZ| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.TransferParameters/PointingToDeclaration/"></a><br><br>3x3 column-major transform matrix from RGB to the profile connection space CIE XYZ as an array of 9 floats, cannot be null<br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.TransferParameters/PointingToDeclaration/"></a>function| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.TransferParameters/PointingToDeclaration/"></a><br><br>Parameters for the transfer functions<br><br>|
  


#### Throws  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.TransferParameters/PointingToDeclaration/"></a>[kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html)| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.TransferParameters/PointingToDeclaration/"></a><br><br>If any of the following conditions is met:<br><br><ul><li>The name is null or has a length of 0.</li><li>Gamma is negative.</li></ul>|
  


[common]  
Content  
fun [RgbColorSpace](-rgb-color-space.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), primaries: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html), whitePoint: [WhitePoint](../-white-point/index.md), function: [TransferParameters](../-transfer-parameters/index.md))  
More info  


Creates a new RGB color space using a specified set of primaries and a specified white point.



The primaries and white point can be specified in the CIE xyY space or in CIE XYZ. The length of the arrays depends on the chosen space:

| Spaces | Primaries length | White point length |  
|--------|------------------|--------------------|  
| xyY    | 6                | 2                  |  
| XYZ    | 9                | 3                  |

When the primaries and/or white point are specified in xyY, the Y component does not need to be specified and is assumed to be 1.0. Only the xy components are required.



## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#com.chrynan.colors.space.TransferParameters/PointingToDeclaration/"></a>name| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#com.chrynan.colors.space.TransferParameters/PointingToDeclaration/"></a><br><br>Name of the color space, cannot be null, its length must be >= 1<br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#com.chrynan.colors.space.TransferParameters/PointingToDeclaration/"></a>primaries| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#com.chrynan.colors.space.TransferParameters/PointingToDeclaration/"></a><br><br>RGB primaries as an array of 6 (xy) or 9 (XYZ) floats<br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#com.chrynan.colors.space.TransferParameters/PointingToDeclaration/"></a>whitePoint| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#com.chrynan.colors.space.TransferParameters/PointingToDeclaration/"></a><br><br>Reference white as an array of 2 (xy) or 3 (XYZ) floats<br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#com.chrynan.colors.space.TransferParameters/PointingToDeclaration/"></a>function| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#com.chrynan.colors.space.TransferParameters/PointingToDeclaration/"></a><br><br>Parameters for the transfer functions<br><br>|
  


#### Throws  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#com.chrynan.colors.space.TransferParameters/PointingToDeclaration/"></a>[kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html)| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#com.chrynan.colors.space.TransferParameters/PointingToDeclaration/"></a><br><br>If any of the following conditions is met:<br><br><ul><li>The name is null or has a length of 0.</li><li>The primaries array is null or has a length that is neither 6 or 9.</li><li>The white point array is null or has a length that is neither 2 or 3.</li><li>The transfer parameters are invalid.</li></ul>|
  


[common]  
Content  
fun [RgbColorSpace](-rgb-color-space.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), toXYZ: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html), gamma: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html))  
More info  


Creates a new RGB color space using a 3x3 column-major transform matrix. The transform matrix must convert from the RGB space to the profile connection space CIE XYZ.



The range of the color space is imposed to be [0..1].



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#kotlin.Double/PointingToDeclaration/"></a>[get](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index.html)| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#kotlin.Double/PointingToDeclaration/"></a>|
  


## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#kotlin.Double/PointingToDeclaration/"></a>name| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#kotlin.Double/PointingToDeclaration/"></a><br><br>Name of the color space, cannot be null, its length must be >= 1<br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#kotlin.Double/PointingToDeclaration/"></a>toXYZ| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#kotlin.Double/PointingToDeclaration/"></a><br><br>3x3 column-major transform matrix from RGB to the profile connection space CIE XYZ as an array of 9 floats, cannot be null<br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#kotlin.Double/PointingToDeclaration/"></a>gamma| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#kotlin.Double/PointingToDeclaration/"></a><br><br>Gamma to use as the transfer function<br><br>|
  


#### Throws  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#kotlin.Double/PointingToDeclaration/"></a>[kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html)| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#kotlin.Double/PointingToDeclaration/"></a><br><br>If any of the following conditions is met:<br><br><ul><li>The name is null or has a length of 0.</li><li>Gamma is negative.</li></ul>|
  


[common]  
Content  
fun [RgbColorSpace](-rgb-color-space.md)(name: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), primaries: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html), whitePoint: [WhitePoint](../-white-point/index.md), gamma: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html))  
More info  


Creates a new RGB color space using a specified set of primaries and a specified white point.



The primaries and white point can be specified in the CIE xyY space or in CIE XYZ. The length of the arrays depends on the chosen space:

| Spaces | Primaries length | White point length |  
|--------|------------------|--------------------|  
| xyY    | 6                | 2                  |  
| XYZ    | 9                | 3                  |

When the primaries and/or white point are specified in xyY, the Y component does not need to be specified and is assumed to be 1.0. Only the xy components are required.



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Double/PointingToDeclaration/"></a>[get](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.collections/index.html)| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Double/PointingToDeclaration/"></a>|
  


## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Double/PointingToDeclaration/"></a>name| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Double/PointingToDeclaration/"></a><br><br>Name of the color space, cannot be null, its length must be >= 1<br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Double/PointingToDeclaration/"></a>primaries| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Double/PointingToDeclaration/"></a><br><br>RGB primaries as an array of 6 (xy) or 9 (XYZ) floats<br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Double/PointingToDeclaration/"></a>whitePoint| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Double/PointingToDeclaration/"></a><br><br>Reference white as an array of 2 (xy) or 3 (XYZ) floats<br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Double/PointingToDeclaration/"></a>gamma| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Double/PointingToDeclaration/"></a><br><br>Gamma to use as the transfer function<br><br>|
  


#### Throws  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Double/PointingToDeclaration/"></a>[kotlin.IllegalArgumentException](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-illegal-argument-exception/index.html)| <a name="com.chrynan.colors.space/RgbColorSpace/RgbColorSpace/#kotlin.String#kotlin.FloatArray#com.chrynan.colors.space.WhitePoint#kotlin.Double/PointingToDeclaration/"></a><br><br>If any of the following conditions is met:<br><br><ul><li>The name is null or has a length of 0.</li><li>The primaries array is null or has a length that is neither 6 or 9.</li><li>The white point array is null or has a length that is neither 2 or 3.</li><li>Gamma is negative.</li></ul>|
  



