@file:Suppress("unused", "MemberVisibilityCanBePrivate")

package com.chrynan.colors

import com.chrynan.colors.space.ColorSpace
import com.chrynan.colors.space.ColorModel
import com.chrynan.colors.space.ColorSpaces
import com.chrynan.colors.space.RenderIntent

/**
 * A representation of a Color.
 */
interface Color {

    /**
     * The [ColorInt] representation of this [Color] value.
     *
     * Note that a conversion may be necessary to retrieve this value depending on the
     * [colorSpace].
     */
    val colorInt: ColorInt

    /**
     * The [ColorLong] representation of this [Color] value.
     */
    val colorLong: ColorLong

    /**
     * A [String] CSS value representation of this [Color] value. For example: "#FFFFFF" or
     * "rgba(255, 255, 255, 255)". This [String] value should be usable in CSS. For example:
     * "background-color: ${color.cssValue}".
     */
    val cssValue: String

    /**
     * The [ColorSpace] that this [Color] belongs to.
     */
    val colorSpace: ColorSpace

    /**
     * A value between 0.0 and 1.0 representing the opacity value of this Color instance. A value
     * of 0.0 is completely transparent. A value of 1.0 is completely opaque.
     */
    val alpha: Float

    /**
     * Returns this color's components as a new array. The last element of the
     * array is always the [alpha] component.
     *
     * @return A new, non-null array whose size is 4
     */
    val components: FloatArray

    /**
     * The first component of this [Color] defined by the [colorSpace]s [ColorModel].
     *
     * For a [ColorModel.RGB] [ColorSpace], this would the red value.
     *
     * This is used for destructuring the [Color] into it's color components.
     * For example, for an RGB Color:
     * ```
     * val (red, green, blue, alpha) = color
     * ```
     */
    operator fun component1(): Float

    /**
     * The second component of this [Color] defined by the [colorSpace]s [ColorModel].
     *
     * For a [ColorModel.RGB] [ColorSpace], this would the green value.
     *
     * This is used for destructuring the [Color] into it's color components.
     * For example, for an RGB Color:
     * ```
     * val (red, green, blue, alpha) = color
     * ```
     */
    operator fun component2(): Float

    /**
     * The third component of this [Color] defined by the [colorSpace]s [ColorModel].
     *
     * For a [ColorModel.RGB] [ColorSpace], this would the blue value.
     *
     * This is used for destructuring the [Color] into it's color components.
     * For example, for an RGB Color:
     * ```
     * val (red, green, blue, alpha) = color
     * ```
     */
    operator fun component3(): Float

    /**
     * The fourth component of this [Color] defined by the [colorSpace]s [ColorModel].
     *
     * For a [ColorModel.RGB] [ColorSpace], this would the alpha value.
     *
     * This is used for destructuring the [Color] into it's color components.
     * For example, for an RGB Color:
     * ```
     * val (red, green, blue, alpha) = color
     * ```
     */
    operator fun component4(): Float

    /**
     * Converts this [Color] value to a [Color] value in the provided [colorSpace]
     * using the provided [renderIntent].
     */
    fun convert(colorSpace: ColorSpace, renderIntent: RenderIntent = RenderIntent.PERCEPTUAL): Color

    /**
     * Copies the existing color, changing only the provided values. The [ColorSpace][colorSpace]
     * of the returned [Color] is the same as this [colorSpace].
     */
    fun copy(
        component1: Float = this.component1(),
        component2: Float = this.component2(),
        component3: Float = this.component3(),
        component4: Float = this.component4(),
        alpha: Float = this.alpha
    ): Color

    /**
     * Converts this [Color] instance into a [RgbaColor]. If this [Color] instance is already an
     * [RgbaColor], then it should simply be returned.
     *
     * @param [destinationColorSpace] The destination [ColorSpace] to convert this [Color] to. Note
     * that this [ColorSpace] value must have a [ColorModel] of [ColorModel.RGB] or an exception is
     * thrown.
     *
     * @param [renderIntent] The [RenderIntent] used when converting this [Color] to the
     * [destinationColorSpace] [ColorSpace].
     */
    fun toRgbaColor(
        destinationColorSpace: ColorSpace = ColorSpaces.SRGB,
        renderIntent: RenderIntent = RenderIntent.PERCEPTUAL
    ): RgbaColor

    /**
     * Returns the relative luminance of this color.
     *
     * For [RgbaColor]s, this is based on the formula for relative luminance defined in WCAG 2.0,
     * W3C Recommendation 11 December 2008. For [XyzColor]s, this should be the 'Y' component
     * value.
     *
     * Note that if this color's color space's model is not [ColorModel.XYZ] or [ColorModel.RGB],
     * then it is possible for the implementation to convert the color to one in a supported color
     * space before calculating this value.
     *
     * @return A value between 0.0f (darkest black) and 1.0f (lightest white).
     *
     * @throws IllegalArgumentException If the this color's color space does not support luminance.
     */
    fun luminance(): Float

    companion object {

        const val MIN_INT_OPACITY = 0
        const val MAX_INT_OPACITY = 255
        const val MIN_ALPHA = 0f
        const val MAX_ALPHA = 1f
        const val OPAQUE_INT_OPACITY = MAX_INT_OPACITY
        const val OPAQUE_ALPHA = MAX_ALPHA
        const val TRANSPARENT_INT_OPACITY = MIN_INT_OPACITY
        const val TRANSPARENT_ALPHA = MIN_ALPHA

        @ExperimentalUnsignedTypes
        val TRANSPARENT: Color = RgbaColor(red = 0, green = 0, blue = 0, alpha = 0)

        @ExperimentalUnsignedTypes
        val BLACK: Color = RgbaColor(red = 0, green = 0, blue = 0, alpha = 255)

        @ExperimentalUnsignedTypes
        val WHITE: Color = RgbaColor(red = 255, green = 255, blue = 255, alpha = 255)
    }
}
