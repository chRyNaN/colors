package com.chrynan.colors

/**
 * Utilities and constants for working with Hex Color [String]s.
 */
object HexStringUtils {

    const val BIT_COUNT = 16
    const val HEX_CHAR = '#'
    const val HEX_CHAR_LOCATION = 0
    const val LENGTH_WITHOUT_ALPHA = 7
    const val LENGTH_WITH_ALPHA = 9
    private const val REGEX_PATTERN = "^#?[0-9A-Fa-f]+\$"

    val REGEX = Regex(REGEX_PATTERN)
}
