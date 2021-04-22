//[colors-core](../../index.md)/[com.chrynan.colors.space](index.md)



# Package com.chrynan.colors.space  


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.space/Adaptation///PointingToDeclaration/"></a>[Adaptation](-adaptation/index.md)| <a name="com.chrynan.colors.space/Adaptation///PointingToDeclaration/"></a>[common]  <br>Content  <br>enum [Adaptation](-adaptation/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)<[Adaptation](-adaptation/index.md)>   <br>More info  <br>List of adaptation matrices that can be used for chromatic adaptation using the von Kries transform.  <br><br><br>|
| <a name="com.chrynan.colors.space/ColorModel///PointingToDeclaration/"></a>[ColorModel](-color-model/index.md)| <a name="com.chrynan.colors.space/ColorModel///PointingToDeclaration/"></a>[common]  <br>Content  <br>enum [ColorModel](-color-model/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)<[ColorModel](-color-model/index.md)>   <br>More info  <br>A color model is required by a [ColorSpace](-color-space/index.md) to describe the way colors can be represented as tuples of numbers.  <br><br><br>|
| <a name="com.chrynan.colors.space/ColorSpace///PointingToDeclaration/"></a>[ColorSpace](-color-space/index.md)| <a name="com.chrynan.colors.space/ColorSpace///PointingToDeclaration/"></a>[common]  <br>Content  <br>abstract class [ColorSpace](-color-space/index.md)  <br>More info  <br>A [ColorSpace](-color-space/index.md) is used to identify a specific organization of colors.  <br><br><br>|
| <a name="com.chrynan.colors.space/ColorSpaces///PointingToDeclaration/"></a>[ColorSpaces](-color-spaces/index.md)| <a name="com.chrynan.colors.space/ColorSpaces///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [ColorSpaces](-color-spaces/index.md)  <br><br><br>|
| <a name="com.chrynan.colors.space/Connector///PointingToDeclaration/"></a>[Connector](-connector/index.md)| <a name="com.chrynan.colors.space/Connector///PointingToDeclaration/"></a>[common]  <br>Content  <br>open class [Connector](-connector/index.md)  <br>More info  <br>A connector transforms colors from a source color space to a destination color space.  <br><br><br>|
| <a name="com.chrynan.colors.space/Illuminant///PointingToDeclaration/"></a>[Illuminant](-illuminant/index.md)| <a name="com.chrynan.colors.space/Illuminant///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Illuminant](-illuminant/index.md)  <br>More info  <br>Illuminant contains standard CIE [white points](-white-point/index.md).  <br><br><br>|
| <a name="com.chrynan.colors.space/LabColorSpace///PointingToDeclaration/"></a>[LabColorSpace](-lab-color-space/index.md)| <a name="com.chrynan.colors.space/LabColorSpace///PointingToDeclaration/"></a>[common]  <br>Content  <br>class [LabColorSpace](-lab-color-space/index.md)(**name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **id**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [ColorSpace](-color-space/index.md)  <br>More info  <br>Implementation of the CIE L*a*b* color space.  <br><br><br>|
| <a name="com.chrynan.colors.space/OkLabColorSpace///PointingToDeclaration/"></a>[OkLabColorSpace](-ok-lab-color-space/index.md)| <a name="com.chrynan.colors.space/OkLabColorSpace///PointingToDeclaration/"></a>[common]  <br>Content  <br>class [OkLabColorSpace](-ok-lab-color-space/index.md)(**name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **id**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [ColorSpace](-color-space/index.md)  <br>More info  <br>Implementation of the OkLab color space.  <br><br><br>|
| <a name="com.chrynan.colors.space/RenderIntent///PointingToDeclaration/"></a>[RenderIntent](-render-intent/index.md)| <a name="com.chrynan.colors.space/RenderIntent///PointingToDeclaration/"></a>[common]  <br>Content  <br>enum [RenderIntent](-render-intent/index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)<[RenderIntent](-render-intent/index.md)>   <br>More info  <br>A render intent determines how a [connector](-connector/index.md) maps colors from one color space to another.  <br><br><br>|
| <a name="com.chrynan.colors.space/RgbColorSpace///PointingToDeclaration/"></a>[RgbColorSpace](-rgb-color-space/index.md)| <a name="com.chrynan.colors.space/RgbColorSpace///PointingToDeclaration/"></a>[common]  <br>Content  <br>class [RgbColorSpace](-rgb-color-space/index.md) : [ColorSpace](-color-space/index.md)  <br>More info  <br>An RGB color space is an additive color space using the [RGB](-color-model/-r-g-b/index.md) color model (a color is therefore represented by a tuple of 3 numbers).  <br><br><br>|
| <a name="com.chrynan.colors.space/TransferParameters///PointingToDeclaration/"></a>[TransferParameters](-transfer-parameters/index.md)| <a name="com.chrynan.colors.space/TransferParameters///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [TransferParameters](-transfer-parameters/index.md)(**gamma**: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), **a**: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), **b**: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), **c**: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), **d**: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), **e**: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html), **f**: [Double](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-double/index.html))  <br>More info  <br>Defines the parameters for the ICC parametric curve type 4, as defined in ICC.1:2004-10, section 10.15.  <br><br><br>|
| <a name="com.chrynan.colors.space/WhitePoint///PointingToDeclaration/"></a>[WhitePoint](-white-point/index.md)| <a name="com.chrynan.colors.space/WhitePoint///PointingToDeclaration/"></a>[common]  <br>Content  <br>data class [WhitePoint](-white-point/index.md)(**x**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), **y**: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html))  <br>More info  <br>Class for constructing white points used in [RGB](-rgb-color-space/index.md) color space.  <br><br><br>|
| <a name="com.chrynan.colors.space/XyzColorSpace///PointingToDeclaration/"></a>[XyzColorSpace](-xyz-color-space/index.md)| <a name="com.chrynan.colors.space/XyzColorSpace///PointingToDeclaration/"></a>[common]  <br>Content  <br>class [XyzColorSpace](-xyz-color-space/index.md)(**name**: [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html), **id**: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)) : [ColorSpace](-color-space/index.md)  <br>More info  <br>Implementation of the CIE XYZ color space.  <br><br><br>|


## Functions  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.space//adapt/com.chrynan.colors.space.ColorSpace#com.chrynan.colors.space.WhitePoint#com.chrynan.colors.space.Adaptation/PointingToDeclaration/"></a>[adapt](adapt.md)| <a name="com.chrynan.colors.space//adapt/com.chrynan.colors.space.ColorSpace#com.chrynan.colors.space.WhitePoint#com.chrynan.colors.space.Adaptation/PointingToDeclaration/"></a>[common]  <br>Content  <br>@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)()  <br>  <br>fun [ColorSpace](-color-space/index.md).[adapt](adapt.md)(whitePoint: [WhitePoint](-white-point/index.md), adaptation: [Adaptation](-adaptation/index.md) = Adaptation.BRADFORD): [ColorSpace](-color-space/index.md)  <br>More info  <br>Performs the chromatic adaptation of a color space from its native white point to the specified white point.  <br><br><br>|
| <a name="com.chrynan.colors.space//coerceComponentInRange/com.chrynan.colors.space.ColorSpace#kotlin.Int#kotlin.Float/PointingToDeclaration/"></a>[coerceComponentInRange](coerce-component-in-range.md)| <a name="com.chrynan.colors.space//coerceComponentInRange/com.chrynan.colors.space.ColorSpace#kotlin.Int#kotlin.Float/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [ColorSpace](-color-space/index.md).[coerceComponentInRange](coerce-component-in-range.md)(componentIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), componentValue: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)  <br><br><br>|
| <a name="com.chrynan.colors.space//connect/com.chrynan.colors.space.ColorSpace#com.chrynan.colors.space.ColorSpace#com.chrynan.colors.space.RenderIntent/PointingToDeclaration/"></a>[connect](connect.md)| <a name="com.chrynan.colors.space//connect/com.chrynan.colors.space.ColorSpace#com.chrynan.colors.space.ColorSpace#com.chrynan.colors.space.RenderIntent/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [ColorSpace](-color-space/index.md).[connect](connect.md)(destination: [ColorSpace](-color-space/index.md) = ColorSpaces.SRGB, intent: [RenderIntent](-render-intent/index.md) = RenderIntent.PERCEPTUAL): [Connector](-connector/index.md)  <br>More info  <br>Connects two color spaces to allow conversion from the source color space to the destination color space.  <br><br><br>|
| <a name="com.chrynan.colors.space//getComponentRange/com.chrynan.colors.space.ColorSpace#kotlin.Int/PointingToDeclaration/"></a>[getComponentRange](get-component-range.md)| <a name="com.chrynan.colors.space//getComponentRange/com.chrynan.colors.space.ColorSpace#kotlin.Int/PointingToDeclaration/"></a>[common]  <br>Content  <br>fun [ColorSpace](-color-space/index.md).[getComponentRange](get-component-range.md)(componentIndex: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [ClosedFloatingPointRange](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.ranges/-closed-floating-point-range/index.html)<[Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)>  <br><br><br>|
