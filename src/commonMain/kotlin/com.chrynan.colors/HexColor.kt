package com.chrynan.colors

@Retention(AnnotationRetention.SOURCE)
@Target(
    AnnotationTarget.FIELD,
    AnnotationTarget.PROPERTY,
    AnnotationTarget.VALUE_PARAMETER,
    AnnotationTarget.TYPE_PARAMETER
)
annotation class HexString {

    companion object {

        const val BIT_COUNT = 16
        const val HEX_CHAR = '#'
        const val HEX_CHAR_LOCATION = 0
        const val LENGTH_WITHOUT_ALPHA = 7
        const val LENGTH_WITH_ALPHA = 9
        const val REGEX_PATTERN = "^#?[0-9A-Fa-f]+\$"
        val REGEX = Regex(REGEX_PATTERN)
    }
}

fun hex(@HexString hexString: String): ARGBColor {
    require(HexString.REGEX.matches(hexString))

    val hexStringInt = if (hexString[HexString.HEX_CHAR_LOCATION] == HexString.HEX_CHAR) {
        hexString.subSequence(
            startIndex = 1,
            endIndex = hexString.length
        ).toString()
    } else {
        hexString
    }

    var colorLong = hexStringInt.toLong(radix = HexString.BIT_COUNT)

    if (hexStringInt.length == HexString.LENGTH_WITHOUT_ALPHA) {
        // Set the alpha value
        colorLong = colorLong or -0x1000000
    } else if (hexStringInt.length != HexString.LENGTH_WITH_ALPHA) {
        throw IllegalArgumentException("Unknown color from hex value.")
    }

    return ColorInt(value = colorLong.toInt())
}