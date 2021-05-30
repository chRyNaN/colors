//[colors-core](../../../index.md)/[com.chrynan.colors](../index.md)/[Color](index.md)/[alpha](alpha.md)



# alpha  
[common]  
Content  
abstract val [alpha](alpha.md): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)  
More info  


A value between 0.0 and 1.0 representing the opacity value of this Color instance. A value of 0.0 is completely transparent. A value of 1.0 is completely opaque.



Note that most [ColorSpaces](../../com.chrynan.colors.space/-color-spaces/index.md) contain an alpha component. However, that component has a range within the range between [ColorSpace.getMinValue](../../com.chrynan.colors.space/-color-space/get-min-value.md) and [ColorSpace.getMaxValue](../../com.chrynan.colors.space/-color-space/get-max-value.md) for that component of the [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md). Whereas, this value should be in the range of 0.0f to 1.0f.

  



