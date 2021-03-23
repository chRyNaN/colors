@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package com.chrynan.colors

/**
 * A representation of a Color.
 */
interface Color {

    /**
     * The [ColorInt] representation of this [Color] value.
     */
    val colorInt: ColorInt

    /**
     * A [String] CSS value representation of this [Color] value. For example: "#FFFFFF" or
     * "rgba(255, 255, 255, 255)". This [String] value should be usable in CSS. For example:
     * "background-color: ${color.cssValue}".
     */
    val cssValue: String

    companion object {

        const val MIN_ALPHA = 0
        const val MAX_ALPHA = 255
        const val MIN_FRACTIONAL_ALPHA = 0f
        const val MAX_FRACTIONAL_ALPHA = 1f
        const val OPAQUE_ALPHA = MAX_ALPHA
        const val OPAQUE_FRACTIONAL_ALPHA = MAX_FRACTIONAL_ALPHA
        const val TRANSPARENT_ALPHA = MIN_ALPHA
        const val TRANSPARENT_FRACTIONAL_ALPHA = MIN_FRACTIONAL_ALPHA

        val TRANSPARENT: Color = rgba(red = 0, green = 0, blue = 0, alpha = 0)
        val BLACK: Color = rgba(red = 0, green = 0, blue = 0, alpha = 255)
        val WHITE: Color = rgba(red = 255, green = 255, blue = 255, alpha = 255)
    }
}
