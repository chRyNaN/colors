package com.chrynan.colors.palette.internal

import com.chrynan.colors.Color
import com.chrynan.colors.contrast
import com.chrynan.colors.palette.Swatch
import com.chrynan.colors.toHslComponents

private const val MIN_ALPHA_SEARCH_MAX_ITERATIONS = 10
private const val MIN_ALPHA_SEARCH_PRECISION = 1
private const val MIN_CONTRAST_PRIMARY_TEXT = 3.0f
private const val MIN_CONTRAST_SECONDARY_TEXT = 4.5f

internal fun Color.getPrimaryOnColorInt(): Int {
    val whiteColorInt = Color.WHITE.colorInt
    val blackColorInt = Color.BLACK.colorInt

    // First check white, as most colors will be dark
    val lightAlpha = calculateMinimumAlpha(Color.WHITE, this, MIN_CONTRAST_PRIMARY_TEXT)

    // If we found valid light values, use them and return
    if (lightAlpha != -1) return setAlphaComponent(whiteColorInt.value, lightAlpha)

    val darkAlpha = calculateMinimumAlpha(Color.BLACK, this, MIN_CONTRAST_PRIMARY_TEXT)

    // If we found valid dark values, use them and return
    if (darkAlpha != -1) return setAlphaComponent(blackColorInt.value, darkAlpha)

    // If we reach here then we can not find title and body values which use the same
    // lightness, we need to use mismatched values
    return setAlphaComponent(whiteColorInt.value, 255)
}

internal fun Color.getSecondaryOnColorInt(): Int {
    val whiteColorInt = Color.WHITE.colorInt
    val blackColorInt = Color.BLACK.colorInt

    // First check white, as most colors will be dark
    val lightAlpha = calculateMinimumAlpha(Color.WHITE, this, MIN_CONTRAST_SECONDARY_TEXT)

    // If we found valid light values, use them and return
    if (lightAlpha != -1) return setAlphaComponent(whiteColorInt.value, lightAlpha)

    val darkAlpha = calculateMinimumAlpha(Color.BLACK, this, MIN_CONTRAST_SECONDARY_TEXT)

    // If we found valid dark values, use them and return
    if (darkAlpha != -1) return setAlphaComponent(blackColorInt.value, darkAlpha)

    // If we reach here then we can not find title and body values which use the same
    // lightness, we need to use mismatched values
    return setAlphaComponent(whiteColorInt.value, 255)
}

internal fun Swatch.toHsl(): FloatArray = this.color.toRgbaColor().toHslComponents()

/**
 * Calculates the minimum alpha value which can be applied to `foreground` so that would
 * have a contrast value of at least `minContrastRatio` when compared to
 * `background`.
 *
 * @param foreground       the foreground color
 * @param background       the opaque background color
 * @param minContrastRatio the minimum contrast ratio
 * @return the alpha value in the range 0-255, or -1 if no value could be calculated
 */
private fun calculateMinimumAlpha(
    foreground: Color,
    background: Color,
    minContrastRatio: Float
): Int {
    if (background.alpha != 1.0f) throw IllegalArgumentException("background can not be translucent: $background")

    val foregroundColorInt = foreground.colorInt

    // First lets check that a fully opaque foreground has sufficient contrast
    var testForeground = setAlphaComponent(foregroundColorInt.value, 255)
    var testRatio: Float = Color(testForeground).contrast(background)

    // Fully opaque foreground does not have sufficient contrast, return error
    if (testRatio < minContrastRatio) return -1

    // Binary search to find a value with the minimum value which provides sufficient contrast
    var numIterations = 0
    var minAlpha = 0
    var maxAlpha = 255

    while (numIterations <= MIN_ALPHA_SEARCH_MAX_ITERATIONS && (maxAlpha - minAlpha) > MIN_ALPHA_SEARCH_PRECISION) {
        val testAlpha = (minAlpha + maxAlpha) / 2

        testForeground = setAlphaComponent(foregroundColorInt.value, testAlpha)
        testRatio = Color(testForeground).contrast(background)

        if (testRatio < minContrastRatio) {
            minAlpha = testAlpha
        } else {
            maxAlpha = testAlpha
        }

        numIterations++
    }

    // Conservatively return the max of the range of possible alphas, which is known to pass.
    return maxAlpha
}

/**
 * Set the alpha component of `color` to be `alpha`.
 */
private fun setAlphaComponent(color: Int, alpha: Int): Int {
    if (alpha < 0 || alpha > 255) throw IllegalArgumentException("alpha must be between 0 and 255. alpha = $alpha; color = $color")

    return color and 0x00ffffff or (alpha shl 24)
}
