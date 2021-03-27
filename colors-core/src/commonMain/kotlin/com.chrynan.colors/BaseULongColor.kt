package com.chrynan.colors

import com.chrynan.colors.space.ColorModel
import com.chrynan.colors.space.RgbColorSpace

// TODO this should be updated to be a value class once they support multiple properties
@ExperimentalUnsignedTypes
class BaseULongColor internal constructor(
    override val value: ULong,
    private val hexColorString: String? = null
) : BaseColor {

    override val cssValue: String
        get() = when {
            hexColorString != null -> hexString
            colorSpace.model == ColorModel.RGB -> "rgba($red, $green, $blue, $alpha)"
            else -> {
                val rgbaColor = toRgbaColor()

                "rgba(${rgbaColor.red}, ${rgbaColor.green}, ${rgbaColor.blue}, ${rgbaColor.alpha})"
            }
        }

    override val hexString: String =
        if (hexColorString != null) {
            if (hexColorString.startsWith(HexadecimalColor.HEX_CHAR)) hexColorString else "${HexadecimalColor.HEX_CHAR}$hexColorString"
        } else {
            throw error("No Hexadecimal String value provided for this Color.")
        }

    override val hexStringWithoutPrefix: String
        get() = hexString.substring(1)

    override fun luminance(): Float {
        val colorSpace = colorSpace

        require(colorSpace.model === ColorModel.RGB) {
            "The specified color must be encoded in an RGB color space. " +
                    "The supplied color space is ${colorSpace.model}"
        }

        val eotf = (colorSpace as RgbColorSpace).eotf
        val r = eotf(red.toDouble())
        val g = eotf(green.toDouble())
        val b = eotf(blue.toDouble())

        return saturate(((0.2126 * r) + (0.7152 * g) + (0.0722 * b)).toFloat())
    }

    private fun saturate(v: Float): Float = if (v <= 0.0f) 0.0f else (if (v >= 1.0f) 1.0f else v)

    override fun toString(): String =
        "Color(colorLong = $colorLong, colorSpace = $colorSpace, component1 = ${component1()}, component2 = ${component2()}, component3 = ${component3()}, component4 = ${component4()})"
}
