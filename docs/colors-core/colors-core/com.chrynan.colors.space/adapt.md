//[colors-core](../../index.md)/[com.chrynan.colors.space](index.md)/[adapt](adapt.md)



# adapt  
[common]  
Content  
@[JvmOverloads](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin.jvm/-jvm-overloads/index.html)()  
  
fun [ColorSpace](-color-space/index.md).[adapt](adapt.md)(whitePoint: [WhitePoint](-white-point/index.md), adaptation: [Adaptation](-adaptation/index.md) = Adaptation.BRADFORD): [ColorSpace](-color-space/index.md)  
More info  


Performs the chromatic adaptation of a color space from its native white point to the specified white point. If the specified color space does not have an [RGB](-color-model/-r-g-b/index.md) color model, or if the color space already has the target white point, the color space is returned unmodified.



The chromatic adaptation is performed using the von Kries method described in the documentation of [Adaptation](-adaptation/index.md).



#### Return  


A new color space if the specified color space has an RGB model and a white point different from the specified white point; the specified color space otherwise



## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space//adapt/com.chrynan.colors.space.ColorSpace#com.chrynan.colors.space.WhitePoint#com.chrynan.colors.space.Adaptation/PointingToDeclaration/"></a>[com.chrynan.colors.space.Adaptation](-adaptation/index.md)| <a name="com.chrynan.colors.space//adapt/com.chrynan.colors.space.ColorSpace#com.chrynan.colors.space.WhitePoint#com.chrynan.colors.space.Adaptation/PointingToDeclaration/"></a>|
  


## Parameters  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space//adapt/com.chrynan.colors.space.ColorSpace#com.chrynan.colors.space.WhitePoint#com.chrynan.colors.space.Adaptation/PointingToDeclaration/"></a>whitePoint| <a name="com.chrynan.colors.space//adapt/com.chrynan.colors.space.ColorSpace#com.chrynan.colors.space.WhitePoint#com.chrynan.colors.space.Adaptation/PointingToDeclaration/"></a><br><br>The new white point<br><br>|
| <a name="com.chrynan.colors.space//adapt/com.chrynan.colors.space.ColorSpace#com.chrynan.colors.space.WhitePoint#com.chrynan.colors.space.Adaptation/PointingToDeclaration/"></a>adaptation| <a name="com.chrynan.colors.space//adapt/com.chrynan.colors.space.ColorSpace#com.chrynan.colors.space.WhitePoint#com.chrynan.colors.space.Adaptation/PointingToDeclaration/"></a><br><br>The adaptation matrix<br><br>|
  
  



