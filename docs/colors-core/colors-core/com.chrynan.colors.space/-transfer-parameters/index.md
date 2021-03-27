//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[TransferParameters](index.md)



# TransferParameters  
 [common] data class [TransferParameters](index.md)(**gamma**: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), **a**: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), **b**: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), **c**: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), **d**: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), **e**: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), **f**: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html))

Defines the parameters for the ICC parametric curve type 4, as defined in ICC.1:2004-10, section 10.15.



[The EOTF is of the form linked here](https://d.android.com/reference/android/graphics/ColorSpace.Rgb.TransferParameters)



The corresponding OETF is simply the inverse function.



The parameters defined by this class form a valid transfer function only if all the following conditions are met:

<ul><li>No parameter is a [Not-a-Number](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/index.html)</li><li>d is in the range [0..1]</li><li>The function is not constant</li><li>The function is positive and increasing</li></ul>   


## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/TransferParameters///PointingToDeclaration/"></a>gamma| <a name="com.chrynan.colors.space/TransferParameters///PointingToDeclaration/"></a><br><br>Value g in the equation of the EOTF described above.<br><br>|
| <a name="com.chrynan.colors.space/TransferParameters///PointingToDeclaration/"></a>a| <a name="com.chrynan.colors.space/TransferParameters///PointingToDeclaration/"></a><br><br>Value a in the equation of the EOTF described above.<br><br>|
| <a name="com.chrynan.colors.space/TransferParameters///PointingToDeclaration/"></a>b| <a name="com.chrynan.colors.space/TransferParameters///PointingToDeclaration/"></a><br><br>Value b in the equation of the EOTF described above.<br><br>|
| <a name="com.chrynan.colors.space/TransferParameters///PointingToDeclaration/"></a>c| <a name="com.chrynan.colors.space/TransferParameters///PointingToDeclaration/"></a><br><br>Value c in the equation of the EOTF described above.<br><br>|
| <a name="com.chrynan.colors.space/TransferParameters///PointingToDeclaration/"></a>d| <a name="com.chrynan.colors.space/TransferParameters///PointingToDeclaration/"></a><br><br>Value d in the equation of the EOTF described above.<br><br>|
| <a name="com.chrynan.colors.space/TransferParameters///PointingToDeclaration/"></a>e| <a name="com.chrynan.colors.space/TransferParameters///PointingToDeclaration/"></a><br><br>Value e in the equation of the EOTF described above.<br><br>|
| <a name="com.chrynan.colors.space/TransferParameters///PointingToDeclaration/"></a>f| <a name="com.chrynan.colors.space/TransferParameters///PointingToDeclaration/"></a><br><br>Value f in the equation of the EOTF described above.<br><br>|
  


## Constructors  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/TransferParameters/TransferParameters/#kotlin.Double#kotlin.Double#kotlin.Double#kotlin.Double#kotlin.Double#kotlin.Double#kotlin.Double/PointingToDeclaration/"></a>[TransferParameters](-transfer-parameters.md)| <a name="com.chrynan.colors.space/TransferParameters/TransferParameters/#kotlin.Double#kotlin.Double#kotlin.Double#kotlin.Double#kotlin.Double#kotlin.Double#kotlin.Double/PointingToDeclaration/"></a> [common] fun [TransferParameters](-transfer-parameters.md)(gamma: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), a: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), b: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), c: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), d: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), e: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) = 0.0, f: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) = 0.0)Value g in the equation of the EOTF described above.   <br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.space/TransferParameters/a/#/PointingToDeclaration/"></a>[a](a.md)| <a name="com.chrynan.colors.space/TransferParameters/a/#/PointingToDeclaration/"></a> [common] val [a](a.md): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)Value a in the equation of the EOTF described above.   <br>|
| <a name="com.chrynan.colors.space/TransferParameters/b/#/PointingToDeclaration/"></a>[b](b.md)| <a name="com.chrynan.colors.space/TransferParameters/b/#/PointingToDeclaration/"></a> [common] val [b](b.md): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)Value b in the equation of the EOTF described above.   <br>|
| <a name="com.chrynan.colors.space/TransferParameters/c/#/PointingToDeclaration/"></a>[c](c.md)| <a name="com.chrynan.colors.space/TransferParameters/c/#/PointingToDeclaration/"></a> [common] val [c](c.md): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)Value c in the equation of the EOTF described above.   <br>|
| <a name="com.chrynan.colors.space/TransferParameters/d/#/PointingToDeclaration/"></a>[d](d.md)| <a name="com.chrynan.colors.space/TransferParameters/d/#/PointingToDeclaration/"></a> [common] val [d](d.md): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)Value d in the equation of the EOTF described above.   <br>|
| <a name="com.chrynan.colors.space/TransferParameters/e/#/PointingToDeclaration/"></a>[e](e.md)| <a name="com.chrynan.colors.space/TransferParameters/e/#/PointingToDeclaration/"></a> [common] val [e](e.md): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) = 0.0Value e in the equation of the EOTF described above.   <br>|
| <a name="com.chrynan.colors.space/TransferParameters/f/#/PointingToDeclaration/"></a>[f](f.md)| <a name="com.chrynan.colors.space/TransferParameters/f/#/PointingToDeclaration/"></a> [common] val [f](f.md): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html) = 0.0Value f in the equation of the EOTF described above.   <br>|
| <a name="com.chrynan.colors.space/TransferParameters/gamma/#/PointingToDeclaration/"></a>[gamma](gamma.md)| <a name="com.chrynan.colors.space/TransferParameters/gamma/#/PointingToDeclaration/"></a> [common] val [gamma](gamma.md): [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html)Value g in the equation of the EOTF described above.   <br>|

