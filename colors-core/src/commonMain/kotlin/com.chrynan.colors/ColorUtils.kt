@file:Suppress("MemberVisibilityCanBePrivate", "unused")

package com.chrynan.colors

import com.chrynan.colors.space.ColorSpace
import com.chrynan.colors.space.ColorSpaces
import kotlin.math.abs
import com.chrynan.colors.space.RenderIntent

/**
 * Determines whether this [Color] is completely transparent, meaning that it has a [Color.alpha]
 * value of 0.0f.
 *
 * **Note:** Translucent is different than transparent. Translucency means that the alpha value is
 * not completely opaque or completely transparent. Transparency means that the alpha value is
 * 0.0f, or completely invisible.
 */
val Color.isTransparent: Boolean
    get() = alpha == 0.0f

/**
 * Determines whether this [Color] is completely opaque, meaning that it has a [Color.alpha] value
 * of 1.0f.
 */
val Color.isOpaque: Boolean
    get() = alpha == 1.0f

/**
 * Determines whether this [Color] is translucent, meaning that it has a [Color.alpha] value
 * between, but not including, 0.0f and 1.0f.
 *
 * **Note:** Translucent is different than transparent. Translucency means that the alpha value is
 * not completely opaque or completely transparent. Transparency means that the alpha value is
 * 0.0f, or completely invisible.
 */
val Color.isTranslucent: Boolean
    get() {
        val a = alpha

        return a != 0.0f && a != 1.0f && a in 0.0f..1.0f
    }

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
 * Linear interpolate between two [Color]s, [start] and [stop] with [fraction]
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

    val interpolated = LabColor(
        alpha = lerp(startAlpha, endAlpha, fraction),
        l = lerp(startL, endL, fraction),
        a = lerp(startA, endA, fraction),
        b = lerp(startB, endB, fraction),
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
 * Retrieves the most contrasting [Color] with this [Color] from the provided values.
 *
 * If the [Color.contrast] value with [this] [Color] and the [conditional] [Color] is greater than
 * [factor], then the [conditional] [Color] is returned. Otherwise, the [default] [Color] is
 * returned.
 *
 * This function could be useful for getting a [Color] to overlay over [this] color that has enough
 * contrast.
 *
 * @param [factor] The value that the contrast has to be greater than, for the [conditional] color
 * to be used. This defaults to 0.5f.
 * @param [conditional] The [Color] to return if it has a higher contrast value with [this] color
 * than [factor]. This defaults to [Color.White].
 * @param [default] The [Color] to return if the conditional statement is not met. This defaults to
 * [Color.Black].
 *
 * @see [Color.contrast]
 */
fun Color.contrasting(
    factor: Float = 0.5f,
    conditional: Color = Color.White,
    default: Color = Color.Black
): Color =
    if (contrast(conditional) > factor) {
        conditional
    } else {
        default
    }

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
 * Composites [this] color on top of [background] using the Porter-Duff 'source over' mode.
 *
 * Both [this] and [background] must not be pre-multiplied, and the resulting color will also
 * not be pre-multiplied.
 *
 * The [ColorSpace] of the result is always the [ColorSpace][Color.colorSpace] of [background].
 *
 * @return the [Color] representing [this] composited on top of [background], converted to the
 * color space of [background].
 */
fun Color.compositeOver(background: Color): Color {
    val fg = this.convert(background.colorSpace)

    val bgA = background.alpha
    val fgA = fg.alpha
    val a = fgA + (bgA * (1f - fgA))

    val r = compositeComponent(fg.component1(), background.component1(), fgA, bgA, a)
    val g = compositeComponent(fg.component2(), background.component2(), fgA, bgA, a)
    val b = compositeComponent(fg.component3(), background.component3(), fgA, bgA, a)

    return Color(r, g, b, a, background.colorSpace)
}

/**
 * Composites the given [foreground component][fgC] over the [background component][bgC], with
 * foreground and background alphas of [fgA] and [bgA] respectively.
 *
 * This uses a pre-calculated composite destination alpha of [a] for efficiency.
 */
@Suppress("NOTHING_TO_INLINE")
internal inline fun compositeComponent(
    fgC: Float,
    bgC: Float,
    fgA: Float,
    bgA: Float,
    a: Float
) = if (a == 0f) 0f else ((fgC * fgA) + ((bgC * bgA) * (1f - fgA))) / a

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
