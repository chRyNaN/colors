@file:Suppress("MemberVisibilityCanBePrivate", "unused")

package com.chrynan.colors

/**
 * A [Color] implementation that extends from [RgbaColor] but provides an additional [hexString] representation of the
 * color.
 */
class HexColor internal constructor(
    override val colorInt: ColorInt,
    val hexString: String
) : RgbaColor(colorInt) {

    override val cssValue: String
        get() = if (hexString.startsWith(HexStringUtils.HEX_CHAR)) hexString else "${HexStringUtils.HEX_CHAR}$hexString"

    override fun hashCode(): Int = colorInt.hashCode()

    override fun equals(other: Any?): Boolean {
        if (other == null) return false

        if (other !is HexColor) return false

        return other.colorInt == colorInt && other.cssValue == cssValue
    }

    override fun toString(): String =
        "HexColor(colorInt = $colorInt, hex = $cssValue, red = $red, green = $green, blue = $blue, alpha = $alpha)"
}

/**
 * Retrieves a [HexColor] from the provided [hexString]. The provided [hexString] must be in a valid Hex Color format,
 * with or without the preceeding '#' character.
 *
 * @throws [IllegalArgumentException] if the provided [hexString] is not in a valid Hex Color format.
 */
fun hex(hexString: String): HexColor {
    require(HexStringUtils.REGEX.matches(hexString))

    val hexStringInt = if (hexString[HexStringUtils.HEX_CHAR_LOCATION] == HexStringUtils.HEX_CHAR) {
        hexString.subSequence(
            startIndex = 1,
            endIndex = hexString.length
        ).toString()
    } else {
        hexString
    }

    var colorInt = hexStringInt.toInt(radix = HexStringUtils.BIT_COUNT)

    if (hexStringInt.length == HexStringUtils.LENGTH_WITHOUT_ALPHA) {
        // Set the alpha value
        colorInt = colorInt or -0x1000000
    } else if (hexStringInt.length != HexStringUtils.LENGTH_WITH_ALPHA) {
        throw IllegalArgumentException("Unknown color from hex value.")
    }

    return HexColor(colorInt = colorInt, hexString = hexString)
}
