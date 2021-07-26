//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[Adaptation](index.md)



# Adaptation  
 [common] enum [Adaptation](index.md) : [Enum](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-enum/index.html)<[Adaptation](index.md)> 

List of adaptation matrices that can be used for chromatic adaptation using the von Kries transform. These matrices are used to convert values in the CIE XYZ space to values in the LMS space (Long Medium Short).



Given an adaptation matrix A, the conversion from XYZ to LMS is straightforward:

   


## See also  
  
common  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/Adaptation///PointingToDeclaration/"></a>equation| <a name="com.chrynan.colors.space/Adaptation///PointingToDeclaration/"></a><br><br>(https://developer.android.com/reference/android/graphics/ColorSpace.Adaptation.html)<br><br>|
| <a name="com.chrynan.colors.space/Adaptation///PointingToDeclaration/"></a>[com.chrynan.colors.space.Connector](../-connector/index.md)| <a name="com.chrynan.colors.space/Adaptation///PointingToDeclaration/"></a>|
| <a name="com.chrynan.colors.space/Adaptation///PointingToDeclaration/"></a>[ColorSpace.connect](../connect.md)| <a name="com.chrynan.colors.space/Adaptation///PointingToDeclaration/"></a>|
  


## Entries  
  
| | |
|---|---|
| <a name="com.chrynan.colors.space/Adaptation.BRADFORD///PointingToDeclaration/"></a>[BRADFORD](-b-r-a-d-f-o-r-d/index.md)| <a name="com.chrynan.colors.space/Adaptation.BRADFORD///PointingToDeclaration/"></a> [common] [BRADFORD](-b-r-a-d-f-o-r-d/index.md)(transform, floatArrayOf(<br>            0.8951f, -0.7502f, 0.0389f,<br>            0.2664f, 1.7135f, -0.0685f,<br>            -0.1614f, 0.0367f, 1.0296f<br>        ), typeName, "bradford")  <br>Bradford chromatic adaptation transform, as defined in the CIECAM97s color appearance model.   <br>|
| <a name="com.chrynan.colors.space/Adaptation.VON_KRIES///PointingToDeclaration/"></a>[VON_KRIES](-v-o-n_-k-r-i-e-s/index.md)| <a name="com.chrynan.colors.space/Adaptation.VON_KRIES///PointingToDeclaration/"></a> [common] [VON_KRIES](-v-o-n_-k-r-i-e-s/index.md)(transform, floatArrayOf(<br>            0.40024f, -0.22630f, 0.00000f,<br>            0.70760f, 1.16532f, 0.00000f,<br>            -0.08081f, 0.04570f, 0.91822f<br>        ), typeName, "von_kries")  <br>von Kries chromatic adaptation transform.   <br>|
| <a name="com.chrynan.colors.space/Adaptation.CIECAT02///PointingToDeclaration/"></a>[CIECAT02](-c-i-e-c-a-t02/index.md)| <a name="com.chrynan.colors.space/Adaptation.CIECAT02///PointingToDeclaration/"></a> [common] [CIECAT02](-c-i-e-c-a-t02/index.md)(transform, floatArrayOf(<br>            0.7328f, -0.7036f, 0.0030f,<br>            0.4296f, 1.6975f, 0.0136f,<br>            -0.1624f, 0.0061f, 0.9834f<br>        ), typeName, "ciecat02")  <br>CIECAT02 chromatic adaption transform, as defined in the CIECAM02 color appearance model.   <br>|


## Types  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.space/Adaptation.Companion///PointingToDeclaration/"></a>[Companion](-companion/index.md)| <a name="com.chrynan.colors.space/Adaptation.Companion///PointingToDeclaration/"></a>[common]  <br>Content  <br>object [Companion](-companion/index.md)  <br><br><br>|


## Properties  
  
|  Name |  Summary | 
|---|---|
| <a name="com.chrynan.colors.space/Adaptation/name/#/PointingToDeclaration/"></a>[name](index.md#%5Bcom.chrynan.colors.space%2FAdaptation%2Fname%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1316981857)| <a name="com.chrynan.colors.space/Adaptation/name/#/PointingToDeclaration/"></a> [common] val [name](index.md#%5Bcom.chrynan.colors.space%2FAdaptation%2Fname%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1316981857): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>|
| <a name="com.chrynan.colors.space/Adaptation/ordinal/#/PointingToDeclaration/"></a>[ordinal](index.md#%5Bcom.chrynan.colors.space%2FAdaptation%2Fordinal%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1316981857)| <a name="com.chrynan.colors.space/Adaptation/ordinal/#/PointingToDeclaration/"></a> [common] val [ordinal](index.md#%5Bcom.chrynan.colors.space%2FAdaptation%2Fordinal%2F%23%2FPointingToDeclaration%2F%5D%2FProperties%2F1316981857): [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)   <br>|
| <a name="com.chrynan.colors.space/Adaptation/transform/#/PointingToDeclaration/"></a>[transform](transform.md)| <a name="com.chrynan.colors.space/Adaptation/transform/#/PointingToDeclaration/"></a> [common] val [transform](transform.md): [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html)   <br>|
| <a name="com.chrynan.colors.space/Adaptation/typeName/#/PointingToDeclaration/"></a>[typeName](type-name.md)| <a name="com.chrynan.colors.space/Adaptation/typeName/#/PointingToDeclaration/"></a> [common] val [typeName](type-name.md): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)   <br>|

