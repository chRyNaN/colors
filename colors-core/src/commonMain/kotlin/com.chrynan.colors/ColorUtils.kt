@file:Suppress("MemberVisibilityCanBePrivate", "unused")

package com.chrynan.colors

import android.R.attr
import com.chrynan.colors.space.ColorSpace
import com.chrynan.colors.space.ColorSpaces
import kotlin.math.abs
import android.R.attr.digits
import com.chrynan.colors.space.RenderIntent
import java.lang.StringBuilder


/**
 * Creates a [ColorInt] from this [Int] value.
 */
fun Int.toColorInt(): ColorInt = ColorInt(value = this)

/**
 * Creates a [ColorLong] from this [Long] value.
 */
fun Long.toColorLong(): ColorLong = ColorLong(value = this)

/**
 * Converts this [Int] to an [RgbaColor].
 *
 * Note that this [Int] is expected to be valid.
 */
fun Int.toColor(): RgbaColor = Color(int = this)

/**
 * Converts this [ColorInt] to an [RgbaColor].
 *
 * Note that this [ColorInt] is expected to be valid.
 */
fun ColorInt.toColor(): RgbaColor = Color(colorInt = this)

/**
 * Converts this [Long] to an [RgbaColor].
 *
 * Note that this [Long] is expected to be valid.
 */
fun Long.toColor(): RgbaColor = Color(long = this)

/**
 * Converts this [ColorLong] to an [Color].
 *
 * Note that this [ColorLong] is expected to be valid.
 */
fun ColorLong.toColor(): Color = Color(colorLong = this)

/**
 * Linear interpolate between two [Colors][Color], [start] and [stop] with [fraction] fraction
 * between the two. The [ColorSpace] of the result is always the [ColorSpace][Color.colorSpace]
 * of [stop]. [fraction] should be between 0 and 1, inclusive.
 */
fun lerp(start: Color, stop: Color, fraction: Float): Color {
    require(fraction in 0f..1f) {
        "Provided fraction should be in between 0f and 1f."
    }

    val colorSpace = ColorSpaces.OK_LAB
    val startColor = start.convert(colorSpace)
    val endColor = stop.convert(colorSpace)
    val startAlpha = startColor.alpha
    val startL = startColor.component1()
    val startA = startColor.component2()
    val startB = startColor.component3()
    val endAlpha = endColor.alpha
    val endL = endColor.component1()
    val endA = endColor.component2()
    val endB = endColor.component2()

    val interpolated = RgbaColor(
        alpha = lerp(startAlpha, endAlpha, fraction),
        red = lerp(startL, endL, fraction),
        green = lerp(startA, endA, fraction),
        blue = lerp(startB, endB, fraction),
        colorSpace = colorSpace
    )

    return interpolated.convert(stop.colorSpace)
}

/**
 * Retrieves a [Float], in the range of 0.0f to 1.0f, indicating the amount of contrast between
 * this [Color] and the provided [other] [Color]. A value of 0.0f indicates the lowest contrast
 * value, and a value of 1.0f indicates the highest contrast value.
 *
 * Note that this compares the [Color.luminance] values of the [Color]s.
 *
 * @see [Color.luminance]
 */
fun Color.contrast(other: Color): Float =
    abs(luminance() - other.luminance()).coerceIn(0.0f, 1.0f)

/**
 * Converts this [Color] to a Hexadecimal [String] representation. For example, the Color
 * White, RgbaColor(red = 255, green = 255, blue = 255, alpha = 255), would return a [String]
 * representation similar to the following: '#FFFFFF'.
 *
 * **Note:** This function will convert this [Color] to an [RgbaColor] if it is not one already.
 *
 * @param [includePrefix] Whether to include the Hexadecimal prefix character, '#', in the output.
 *
 * @param [uppercase] Whether all of the letters in the output should be uppercase.
 *
 * @param [alwaysIncludeAlpha] Whether to include the alpha component even when the color is
 * completely opaque.
 *
 * @param [destinationColorSpace] The [ColorSpace] used if this color is not an [RgbaColor] and has
 * to be converted with the [Color.toRgbaColor] function.
 *
 * @param [renderIntent] The [RenderIntent] used if this color is not an [RgbaColor] and has to be
 * converted with the [Color.toRgbaColor] function.
 *
 * @see [Color.toRgbaColor]
 * @see [RgbaColor.toHexString]
 */
fun Color.toHexString(
    includePrefix: Boolean = true,
    uppercase: Boolean = true,
    alwaysIncludeAlpha: Boolean = false,
    destinationColorSpace: ColorSpace = ColorSpaces.SRGB,
    renderIntent: RenderIntent = RenderIntent.PERCEPTUAL
): String = toRgbaColor(
    destinationColorSpace = destinationColorSpace,
    renderIntent = renderIntent
).toHexString(
    includePrefix = includePrefix,
    uppercase = uppercase,
    alwaysIncludeAlpha = alwaysIncludeAlpha
)

/**
 * Linearly interpolate between [start] and [stop] with [fraction] fraction between them.
 */
internal fun lerp(start: Float, stop: Float, fraction: Float): Float =
    (1 - fraction) * start + fraction * stop

/**
 * Coerces this [Int] value within the SRGB Color Range of 0 to 255.
 */
internal fun Int.coerceInSRGBColorRange(): Int = this.coerceIn(0, 255)

/**
 * Coerces this [Float] value within the SRGB Color Range of 0f to 255f.
 */
internal fun Float.coerceInSRGBColorRange(): Float = this.coerceIn(0f, 255f)

internal fun coerceInRange(
    value: Float,
    newMin: Float,
    newMax: Float,
    oldMin: Float,
    oldMax: Float
): Float {
    val newRange = newMax - newMin
    val oldRange = oldMax - oldMin

    return ((((value - oldMin) * newRange) / oldRange) + newMin).coerceIn(newMin, newMax)
}
