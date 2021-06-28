package com.chrynan.colors

import com.chrynan.colors.space.ColorModel

// TODO this should be updated to be a value class once they support multiple properties
@ExperimentalUnsignedTypes
class BaseULongColor internal constructor(
    override val value: ULong,
    private val hexColorString: String? = null
) : BaseColor {

    override val cssValue: String
        get() =
            when {
                hexColorString != null -> hexString
                colorSpace.model == ColorModel.RGB -> "rgba($redInt, $greenInt, $blueInt, $alphaInt)"
                else -> {
                    val rgbaColor = toRgbaColor()

                    "rgba(${rgbaColor.redInt}, ${rgbaColor.greenInt}, ${rgbaColor.blueInt}, ${rgbaColor.alphaInt})"
                }
            }

    override val hexString: String
        get() = if (hexColorString != null) {
            if (hexColorString.startsWith(HexadecimalColor.HEX_CHAR)) hexColorString else "${HexadecimalColor.HEX_CHAR}$hexColorString"
        } else {
            throw error("No Hexadecimal String value provided for this Color.")
        }

    override val hexStringWithoutPrefix: String
        get() = hexString.substring(1)

    override fun equals(other: Any?): Boolean {
        if (other == null) return false
        if (other !is Color) return false

        if (other is BaseULongColor) return value == other.value

        return colorLong == other.colorLong
    }

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String =
        "Color(colorLong = $colorLong, colorSpace = $colorSpace, component1 = ${component1()}, component2 = ${component2()}, component3 = ${component3()}, component4 = ${component4()})"
}
