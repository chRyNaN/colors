//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[ColorSpaces](index.md)

# ColorSpaces

[common]\
object [ColorSpaces](index.md)

## Functions

| Name | Summary |
|---|---|
| [getColorSpaceById](get-color-space-by-id.md) | [common]<br>fun [getColorSpaceById](get-color-space-by-id.md)(id: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [ColorSpace](../-color-space/index.md) |
| [match](match.md) | [common]<br>fun [match](match.md)(toXYZD50: [FloatArray](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float-array/index.html), function: [TransferParameters](../-transfer-parameters/index.md)): [ColorSpace](../-color-space/index.md)?<br>Returns a [ColorSpaces](index.md) instance of [ColorSpace](../-color-space/index.md) that matches the specified RGB to CIE XYZ transform and transfer functions. If no instance can be found, this method returns null. |

## Properties

| Name | Summary |
|---|---|
| [ACES](-a-c-e-s.md) | [common]<br>val [ACES](-a-c-e-s.md): [RgbColorSpace](../-rgb-color-space/index.md)<br>[RGB](../-rgb-color-space/index.md) color space ACES standardized as SMPTE ST 2065-1:2012. [See details on ACES color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#ACES) |
| [ACES_CG](-a-c-e-s_-c-g.md) | [common]<br>val [ACES_CG](-a-c-e-s_-c-g.md): [RgbColorSpace](../-rgb-color-space/index.md)<br>[RGB](../-rgb-color-space/index.md) color space ACEScg standardized as Academy S-2014-004. [See details on ACEScg color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#ACES_CG) |
| [ADOBE_RGB](-a-d-o-b-e_-r-g-b.md) | [common]<br>val [ADOBE_RGB](-a-d-o-b-e_-r-g-b.md): [RgbColorSpace](../-rgb-color-space/index.md)<br>[RGB](../-rgb-color-space/index.md) color space Adobe RGB (1998). [See details on Adobe RGB (1998) color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#ADOBE_RGB) |
| [BT_2020](-b-t_2020.md) | [common]<br>val [BT_2020](-b-t_2020.md): [RgbColorSpace](../-rgb-color-space/index.md)<br>[RGB](../-rgb-color-space/index.md) color space BT.2020 standardized as Rec. ITU-R BT.2020-1. [See details on BT.2020 color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#BT_2020) |
| [BT_709](-b-t_709.md) | [common]<br>val [BT_709](-b-t_709.md): [RgbColorSpace](../-rgb-color-space/index.md)<br>[RGB](../-rgb-color-space/index.md) color space BT.709 standardized as Rec. ITU-R BT.709-5. [See details on BT.709 color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#BT_709) |
| [CIE_LAB](-c-i-e_-l-a-b.md) | [common]<br>val [CIE_LAB](-c-i-e_-l-a-b.md): [ColorSpace](../-color-space/index.md)<br>ColorModel.Lab color space CIE L*a*b*. This color space uses CIE XYZ D50 as a profile conversion space. |
| [CIE_XYZ](-c-i-e_-x-y-z.md) | [common]<br>val [CIE_XYZ](-c-i-e_-x-y-z.md): [ColorSpace](../-color-space/index.md)<br>ColorModel.Xyz color space CIE XYZ. This color space assumes standard illuminant D50 as its white point. |
| [DCI_P3](-d-c-i_-p3.md) | [common]<br>val [DCI_P3](-d-c-i_-p3.md): [RgbColorSpace](../-rgb-color-space/index.md)<br>[RGB](../-rgb-color-space/index.md) color space DCI-P3 standardized as SMPTE RP 431-2-2007. [See details on DCI-P3 color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#DCI_P3) |
| [DISPLAY_P3](-d-i-s-p-l-a-y_-p3.md) | [common]<br>val [DISPLAY_P3](-d-i-s-p-l-a-y_-p3.md): [RgbColorSpace](../-rgb-color-space/index.md)<br>[RGB](../-rgb-color-space/index.md) color space Display P3 based on SMPTE RP 431-2-2007 and IEC 61966-2.1:1999. [See details on Display P3 color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#DISPLAY_P3) |
| [EXTENDED_SRGB](-e-x-t-e-n-d-e-d_-s-r-g-b.md) | [common]<br>val [EXTENDED_SRGB](-e-x-t-e-n-d-e-d_-s-r-g-b.md): [RgbColorSpace](../-rgb-color-space/index.md)<br>[RGB](../-rgb-color-space/index.md) color space scRGB-nl standardized as IEC 61966-2-2:2003. [See details on Extended sRGB color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#EXTENDED_SRGB) |
| [LINEAR_EXTENDED_SRGB](-l-i-n-e-a-r_-e-x-t-e-n-d-e-d_-s-r-g-b.md) | [common]<br>val [LINEAR_EXTENDED_SRGB](-l-i-n-e-a-r_-e-x-t-e-n-d-e-d_-s-r-g-b.md): [RgbColorSpace](../-rgb-color-space/index.md)<br>[RGB](../-rgb-color-space/index.md) color space scRGB standardized as IEC 61966-2-2:2003. [See details on Linear Extended sRGB color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#LINEAR_EXTENDED_SRGB) |
| [LINEAR_SRGB](-l-i-n-e-a-r_-s-r-g-b.md) | [common]<br>val [LINEAR_SRGB](-l-i-n-e-a-r_-s-r-g-b.md): [RgbColorSpace](../-rgb-color-space/index.md)<br>[RGB](../-rgb-color-space/index.md) color space sRGB standardized as IEC 61966-2.1:1999. [See details on Linear sRGB color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#LINEAR_SRGB) |
| [NTSC_1953](-n-t-s-c_1953.md) | [common]<br>val [NTSC_1953](-n-t-s-c_1953.md): [RgbColorSpace](../-rgb-color-space/index.md)<br>[RGB](../-rgb-color-space/index.md) color space NTSC, 1953 standard. [See details on NTSC 1953 color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#NTSC_1953) |
| [OK_LAB](-o-k_-l-a-b.md) | [common]<br>val [OK_LAB](-o-k_-l-a-b.md): [ColorSpace](../-color-space/index.md)<br>ColorModel.Lab color space Oklab. This color space uses Oklab D65 as a profile conversion space. |
| [PRO_PHOTO_RGB](-p-r-o_-p-h-o-t-o_-r-g-b.md) | [common]<br>val [PRO_PHOTO_RGB](-p-r-o_-p-h-o-t-o_-r-g-b.md): [RgbColorSpace](../-rgb-color-space/index.md)<br>[RGB](../-rgb-color-space/index.md) color space ProPhoto RGB standardized as ROMM RGB ISO 22028-2:2013. [See details on ProPhoto RGB color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#PRO_PHOTO_RGB) |
| [SMPTE_C](-s-m-p-t-e_-c.md) | [common]<br>val [SMPTE_C](-s-m-p-t-e_-c.md): [RgbColorSpace](../-rgb-color-space/index.md)<br>[RGB](../-rgb-color-space/index.md) color space SMPTE C. [See details on SMPTE C color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#SMPTE_C) |
| [SRGB](-s-r-g-b.md) | [common]<br>val [SRGB](-s-r-g-b.md): [RgbColorSpace](../-rgb-color-space/index.md)<br>[RGB](../-rgb-color-space/index.md) color space sRGB standardized as IEC 61966-2.1:1999. [See details on sRGB color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#SRGB) |
| [UNSPECIFIED](-u-n-s-p-e-c-i-f-i-e-d.md) | [common]<br>val [UNSPECIFIED](-u-n-s-p-e-c-i-f-i-e-d.md): [RgbColorSpace](../-rgb-color-space/index.md)<br>This identifies the 'None' color. |
