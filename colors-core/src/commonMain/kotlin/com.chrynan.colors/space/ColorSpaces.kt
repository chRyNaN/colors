/** Note that this is adapted from the open source Jetpack Compose library with the following license: */

/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("unused")

package com.chrynan.colors.space

object ColorSpaces {

    internal val SRGB_PRIMARIES = floatArrayOf(0.640f, 0.330f, 0.300f, 0.600f, 0.150f, 0.060f)
    internal val NTSC_1953_PRIMARIES = floatArrayOf(0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f)
    internal val SRGB_TRANSFER_PARAMETERS =
        TransferParameters(2.4, 1 / 1.055, 0.055 / 1.055, 1 / 12.92, 0.04045)

    private val NONE_TRANSFER_PARAMETERS =
        TransferParameters(2.2, 1 / 1.055, 0.055 / 1.055, 1 / 12.92, 0.04045)

    /**
     * [RGB][RgbColorSpace] color space sRGB standardized as IEC 61966-2.1:1999.
     * [See details on sRGB color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#SRGB)
     */
    val SRGB = RgbColorSpace(
        name = "sRGB IEC61966-2.1",
        primaries = SRGB_PRIMARIES,
        whitePoint = Illuminant.D65,
        function = SRGB_TRANSFER_PARAMETERS,
        id = 0
    )

    /**
     * [RGB][RgbColorSpace] color space sRGB standardized as IEC 61966-2.1:1999.
     * [See details on Linear sRGB color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#LINEAR_SRGB)
     */
    val LINEAR_SRGB = RgbColorSpace(
        name = "sRGB IEC61966-2.1 (Linear)",
        primaries = SRGB_PRIMARIES,
        whitePoint = Illuminant.D65,
        gamma = 1.0,
        min = 0.0f,
        max = 1.0f,
        id = 1
    )

    /**
     * [RGB][RgbColorSpace] color space scRGB-nl standardized as IEC 61966-2-2:2003.
     * [See details on Extended sRGB color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#EXTENDED_SRGB)
     */
    val EXTENDED_SRGB = RgbColorSpace(
        name = "scRGB-nl IEC 61966-2-2:2003",
        primaries = SRGB_PRIMARIES,
        whitePoint = Illuminant.D65,
        transform = null,
        oetf = { x ->
            absRcpResponse(
                x,
                1 / 1.055,
                0.055 / 1.055,
                1 / 12.92,
                0.04045,
                2.4
            )
        },
        eotf = { x ->
            absResponse(
                x,
                1 / 1.055,
                0.055 / 1.055,
                1 / 12.92,
                0.04045,
                2.4
            )
        },
        min = -0.799f,
        max = 2.399f,
        transferParameters = SRGB_TRANSFER_PARAMETERS,
        id = 2
    )

    /**
     * [RGB][RgbColorSpace] color space scRGB standardized as IEC 61966-2-2:2003.
     * [See details on Linear Extended sRGB color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#LINEAR_EXTENDED_SRGB)
     */
    val LINEAR_EXTENDED_SRGB = RgbColorSpace(
        name = "scRGB IEC 61966-2-2:2003",
        primaries = SRGB_PRIMARIES,
        whitePoint = Illuminant.D65,
        gamma = 1.0,
        min = -0.5f,
        max = 7.499f,
        id = 3
    )

    /**
     * [RGB][RgbColorSpace] color space BT.709 standardized as Rec. ITU-R BT.709-5.
     * [See details on BT.709 color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#BT_709)
     */
    val BT_709 = RgbColorSpace(
        name = "Rec. ITU-R BT.709-5",
        primaries = floatArrayOf(0.640f, 0.330f, 0.300f, 0.600f, 0.150f, 0.060f),
        whitePoint = Illuminant.D65,
        function = TransferParameters(1 / 0.45, 1 / 1.099, 0.099 / 1.099, 1 / 4.5, 0.081),
        id = 4
    )

    /**
     * [RGB][RgbColorSpace] color space BT.2020 standardized as Rec. ITU-R BT.2020-1.
     * [See details on BT.2020 color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#BT_2020)
     */
    val BT_2020 = RgbColorSpace(
        name = "Rec. ITU-R BT.2020-1",
        primaries = floatArrayOf(0.708f, 0.292f, 0.170f, 0.797f, 0.131f, 0.046f),
        whitePoint = Illuminant.D65,
        function = TransferParameters(1 / 0.45, 1 / 1.0993, 0.0993 / 1.0993, 1 / 4.5, 0.08145),
        id = 5
    )

    /**
     * [RGB][RgbColorSpace] color space DCI-P3 standardized as SMPTE RP 431-2-2007.
     * [See details on DCI-P3 color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#DCI_P3)
     */
    val DCI_P3 = RgbColorSpace(
        name = "SMPTE RP 431-2-2007 DCI (P3)",
        primaries = floatArrayOf(0.680f, 0.320f, 0.265f, 0.690f, 0.150f, 0.060f),
        whitePoint = WhitePoint(0.314f, 0.351f),
        gamma = 2.6,
        min = 0.0f,
        max = 1.0f,
        id = 6
    )

    /**
     * [RGB][RgbColorSpace] color space Display P3 based on SMPTE RP 431-2-2007 and IEC 61966-2.1:1999.
     * [See details on Display P3 color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#DISPLAY_P3)
     */
    val DISPLAY_P3 = RgbColorSpace(
        name = "Display P3",
        primaries = floatArrayOf(0.680f, 0.320f, 0.265f, 0.690f, 0.150f, 0.060f),
        whitePoint = Illuminant.D65,
        function = SRGB_TRANSFER_PARAMETERS,
        id = 7
    )

    /**
     * [RGB][RgbColorSpace] color space NTSC, 1953 standard.
     * [See details on NTSC 1953 color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#NTSC_1953)
     */
    val NTSC_1953 = RgbColorSpace(
        name = "NTSC (1953)",
        primaries = NTSC_1953_PRIMARIES,
        whitePoint = Illuminant.C,
        function = TransferParameters(1 / 0.45, 1 / 1.099, 0.099 / 1.099, 1 / 4.5, 0.081),
        id = 8
    )

    /**
     * [RGB][RgbColorSpace] color space SMPTE C.
     * [See details on SMPTE C color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#SMPTE_C)
     */
    val SMPTE_C = RgbColorSpace(
        name = "SMPTE-C RGB",
        primaries = floatArrayOf(0.630f, 0.340f, 0.310f, 0.595f, 0.155f, 0.070f),
        whitePoint = Illuminant.D65,
        function = TransferParameters(1 / 0.45, 1 / 1.099, 0.099 / 1.099, 1 / 4.5, 0.081),
        id = 9
    )

    /**
     * [RGB][RgbColorSpace] color space Adobe RGB (1998).
     * [See details on Adobe RGB (1998) color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#ADOBE_RGB)
     */
    val ADOBE_RGB = RgbColorSpace(
        name = "Adobe RGB (1998)",
        primaries = floatArrayOf(0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f),
        whitePoint = Illuminant.D65,
        gamma = 2.2,
        min = 0.0f,
        max = 1.0f,
        id = 10
    )

    /**
     * [RGB][RgbColorSpace] color space ProPhoto RGB standardized as ROMM RGB ISO 22028-2:2013.
     * [See details on ProPhoto RGB color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#PRO_PHOTO_RGB)
     */
    val PRO_PHOTO_RGB = RgbColorSpace(
        name = "ROMM RGB ISO 22028-2:2013",
        primaries = floatArrayOf(0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 0.0001f),
        whitePoint = Illuminant.D50,
        function = TransferParameters(1.8, 1.0, 0.0, 1 / 16.0, 0.031248),
        id = 11
    )

    /**
     * [RGB][RgbColorSpace] color space ACES standardized as SMPTE ST 2065-1:2012.
     * [See details on ACES color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#ACES)
     */
    val ACES = RgbColorSpace(
        name = "SMPTE ST 2065-1:2012 ACES",
        primaries = floatArrayOf(0.73470f, 0.26530f, 0.0f, 1.0f, 0.00010f, -0.0770f),
        whitePoint = Illuminant.D60,
        gamma = 1.0,
        min = -65504.0f, 65504.0f,
        id = 12
    )

    /**
     * [RGB][RgbColorSpace] color space ACEScg standardized as Academy S-2014-004.
     * [See details on ACEScg color space](https://d.android.com/reference/android/graphics/ColorSpace.Named.html#ACES_CG)
     */
    val ACES_CG = RgbColorSpace(
        name = "Academy S-2014-004 ACEScg",
        primaries = floatArrayOf(0.713f, 0.293f, 0.165f, 0.830f, 0.128f, 0.044f),
        whitePoint = Illuminant.D60,
        gamma = 1.0,
        min = -65504.0f, 65504.0f,
        id = 13
    )

    /**
     * [XYZ][ColorModel.Xyz] color space CIE XYZ. This color space assumes standard
     * illuminant D50 as its white point.
     *
     * ```
     * | Property                | Value                 |
     * |-------------------------|-----------------------|
     * | Name                    | Generic XYZ           |
     * | CIE standard illuminant | [D50][Illuminant.D50] |
     * | Range                   | `[-2.0, 2.0]`         |
     * ```
     */
    val CIE_XYZ: ColorSpace = XyzColorSpace(
        name = "Generic XYZ",
        id = 14
    )

    /**
     * [Lab][ColorModel.Lab] color space CIE L*a*b*. This color space uses CIE XYZ D50
     * as a profile conversion space.
     *
     * ```
     * | Property                | Value                                                   |
     * |-------------------------|---------------------------------------------------------|
     * | Name                    | Generic L*a*b*                                          |
     * | CIE standard illuminant | [D50][Illuminant.D50]                                   |
     * | Range                   | (L: `[0.0, 100.0]`, a: `[-128, 128]`, b: `[-128, 128]`) |
     * ```
     */
    val CIE_LAB: ColorSpace = LabColorSpace(
        name = "Generic L*a*b*",
        id = 15
    )

    /**
     * This identifies the 'None' color.
     */
    val UNSPECIFIED = RgbColorSpace(
        name = "None",
        primaries = SRGB_PRIMARIES,
        whitePoint = Illuminant.D65,
        function = NONE_TRANSFER_PARAMETERS,
        id = 16
    )

    /**
     * [Lab][ColorModel.Lab] color space Oklab. This color space uses Oklab D65
     * as a profile conversion space.
     *
     * ```
     * | Property                | Value                                                   |
     * |-------------------------|---------------------------------------------------------|
     * | Name                    | Oklab                                                   |
     * | CIE standard illuminant | [D65][Illuminant.D65]                                   |
     * | Range                   | (L: `[0.0, 1.0]`, a: `[-2, 2]`, b: `[-2, 2]`)           |
     * ```
     */
    val OK_LAB: ColorSpace = OkLabColorSpace(
        name = "Oklab",
        id = 17
    )

    /**
     * These MUST be in the order of their IDs
     */
    internal val COLOR_SPACES_ARRAY = arrayOf(
        SRGB,
        LINEAR_SRGB,
        EXTENDED_SRGB,
        LINEAR_EXTENDED_SRGB,
        BT_709,
        BT_2020,
        DCI_P3,
        DISPLAY_P3,
        NTSC_1953,
        SMPTE_C,
        ADOBE_RGB,
        PRO_PHOTO_RGB,
        ACES,
        ACES_CG,
        CIE_XYZ,
        CIE_LAB,
        UNSPECIFIED,
        OK_LAB
    )

    /**
     * Returns a [ColorSpaces] instance of [ColorSpace] that matches
     * the specified RGB to CIE XYZ transform and transfer functions. If no
     * instance can be found, this method returns null.
     *
     * The color transform matrix is assumed to target the CIE XYZ space
     * a [D50][Illuminant.D50] standard illuminant.
     *
     * @param toXYZD50 3x3 column-major transform matrix from RGB to the profile
     * connection space CIE XYZ as an array of 9 floats, cannot be null
     * @param function Parameters for the transfer functions
     * @return A non-null [ColorSpace] if a match is found, null otherwise
     */
    fun match(
        /*@Size(9)*/
        toXYZD50: FloatArray,
        function: TransferParameters
    ): ColorSpace? {
        for (colorSpace in COLOR_SPACES_ARRAY) {
            if (colorSpace.model == ColorModel.RGB) {
                val rgb = colorSpace.adapt(Illuminant.D50) as RgbColorSpace
                if ((
                            compare(toXYZD50, rgb.transform) &&
                                    compare(function, rgb.transferParameters)
                            )
                ) {
                    return colorSpace
                }
            }
        }

        return null
    }

    internal inline fun getColorSpace(id: Int): ColorSpace = COLOR_SPACES_ARRAY[id]
}
