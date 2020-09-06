@file:Suppress("MemberVisibilityCanBePrivate")

package com.chrynan.colors

/**
 * A [Color] implementation for a RGBA Color (Red, Green, Blue, Alpha).
 */
open class RgbaColor internal constructor(override val colorInt: ColorInt) : Color {

    override val cssValue: String
        get() = "rgba($red, $green, $blue, $alpha)"

    /**
     * A value between 0 and 255 representing the opacity value of this Color instance. This is similar to
     * [fractionalAlpha] but is an [Int] value from 0 and 255 instead of a [Float] between 0.0 and 1.0. A value of 0
     * is completely transparent. A value of 255 is completely opaque.
     */
    val alpha: Int
        get() = (colorInt shr 24) and 0xff

    /**
     * A value between 0.0 and 1.0 representing the opacity value of this Color instance. This is similar to [alpha]
     * but is a [Float] value from 0.0 and 1.0 instead of an [Int] value between 0 and 255. A value of 0.0 is
     * completely transparent. A value of 1.0 is completely opaque.
     */
    val fractionalAlpha: Float
        get() = alpha / 255f

    /**
     * An [Int] value between 0 and 255 representing the red value of this [Color].
     */
    val red: Int
        get() = (colorInt shr 16) and 0xff

    /**
     * An [Int] value between 0 and 255 representing the green value of this [Color].
     */
    val green: Int
        get() = (colorInt shr 8) and 0xff

    /**
     * An [Int] value between 0 and 255 representing the blue value of this [Color].
     */
    val blue: Int
        get() = colorInt and 0xff

    override fun hashCode(): Int = colorInt.hashCode()

    override fun equals(other: Any?): Boolean {
        if (other == null) return false

        if (other !is RgbaColor) return false

        return other.colorInt == colorInt
    }

    override fun toString(): String =
        "RgbaColor(colorInt = $colorInt, red = $red, green = $green, blue = $blue, alpha = $alpha)"
}

/**
 * Retrieves a [RgbaColor] from the provided color values.
 *
 * Note that the provided [Int] values for each color value will be coerced into the valid range of 0 to 255.
 */
fun rgba(red: Int, green: Int, blue: Int, alpha: Int = -0x1000000): RgbaColor {
    val a = alpha.coerceInSRGBColorRange()
    val r = red.coerceInSRGBColorRange()
    val g = green.coerceInSRGBColorRange()
    val b = blue.coerceInSRGBColorRange()

    val colorInt = ((a and 0xff) shl 24) or
            ((r and 0xff) shl 16) or
            ((g and 0xff) shl 8) or
            (b and 0xff)

    return RgbaColor(colorInt)
}
