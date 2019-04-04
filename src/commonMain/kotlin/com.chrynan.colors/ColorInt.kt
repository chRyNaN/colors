package com.chrynan.colors

interface ARGBColor : Color {

    val a: Int

    val red: Int

    val green: Int

    val blue: Int
}

data class ColorInt(val value: Int) : ARGBColor,
    Color {

    override val a = (value shr 24) and 0xff

    override val red = (value shr 16) and 0xff

    override val green = (value shr 8) and 0xff

    override val blue = value and 0xff

    override val alpha: Float
        get() = opacity.toFloat() / Color.MAX_OPACITY

    override val opacity = a

    override val colorSpace = SRGBColorSpace()

    override val components: List<ColorComponent>
        get() = colorSpace.componentsFromARGB(alpha = a, red = red, green = green, blue = blue)

    override fun toColorInt() = this
}

fun Int.coerceInSRGBColorRange(): Int = SRGBColorSpace.coerceInRange(this)

fun argb(alpha: Int = -0x1000000, red: Int, green: Int, blue: Int): ARGBColor {
    val a = alpha.coerceInSRGBColorRange()
    val r = red.coerceInSRGBColorRange()
    val g = green.coerceInSRGBColorRange()
    val b = blue.coerceInSRGBColorRange()

    return ColorInt(
        ((a and 0xff) shl 24) or
                ((r and 0xff) shl 16) or
                ((g and 0xff) shl 8) or
                (b and 0xff)
    )
}

fun argb(alpha: Float = (-0x1000000).toFloat(), red: Float, green: Float, blue: Float) = argb(
    alpha = (alpha * Color.MAX_OPACITY).toInt(),
    red = (red * Color.MAX_OPACITY).toInt(),
    green = (green * Color.MAX_OPACITY).toInt(),
    blue = (blue * Color.MAX_OPACITY).toInt()
)