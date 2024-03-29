@file:Suppress("MemberVisibilityCanBePrivate", "unused")

package com.chrynan.colors

/**
 * A [Color] interface that represents a [Color] with a hexadecimal [String] value representation.
 */
interface HexadecimalColor : Color,
    RgbaColor {

    /**
     * The hexadecimal [String] value of this [Color] including the '#' character prefix.
     */
    val hexString: String

    /**
     * The hexadecimal [String] value of this [Color] excluding the '#' character prefix.
     */
    val hexStringWithoutPrefix: String

    companion object {

        const val BIT_COUNT = 16
        const val HEX_CHAR = '#'
        const val HEX_CHAR_LOCATION = 0
        const val LENGTH_WITHOUT_ALPHA = 7
        const val LENGTH_WITH_ALPHA = 9
        private const val REGEX_PATTERN = "^#?[0-9A-Fa-f]+"
        private const val RGB_REGEX_PATTERN = "^#?(?:[0-9a-fA-F]{3}){1,2}\$"
        private const val ARGB_REGEX_PATTERN = "^#(?:[0-9a-fA-F]{3,4}){1,2}\$"

        val REGEX = Regex(RGB_REGEX_PATTERN)
    }
}
