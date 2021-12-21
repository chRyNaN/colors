package com.chrynan.colors.sample.android.util

import com.chrynan.colors.*
import com.chrynan.colors.sample.android.data.ColorData

/**
 * Converts a transparent color to [Color.White].
 */
internal fun Color.normalize(): Color = if (this.alpha == 0f) Color.White else this

/**
 * Retrieves a [Color] that can be overlaid on top of this [Color].
 */
internal fun Color.content(): Color =
    if (contrast(Color.White) > 0.5f) {
        Color.White
    } else {
        Color.Black
    }

/**
 * Retrieves a secondary [Color] from this [Color].
 */
internal fun Color.secondary(): Color = copy(component4 = alpha / 2)

internal fun Color.accent(): Color {
    val rgbaColor = toRgbaColor()

    val newRed = (255 - rgbaColor.redInt).coerceIn(0, 255)
    val newGreen = (255 - rgbaColor.greenInt).coerceIn(0, 255)
    val newBlue = (255 - rgbaColor.blueInt).coerceIn(0, 255)

    val newColor = Color(newRed, newGreen, newBlue)

    val contrast = this.contrast(newColor)

    if (contrast < 0.5f) {
        return newColor.toRgbaColor().darker(by = (0.6f - contrast) / 2)
    }

    return newColor
}

internal fun Color.toColorData(): ColorData {
    val background = this.normalize()
    val foreground = background.content()
    val foregroundSecondary = foreground.secondary()
    val foregroundAccent = background.accent()

    return ColorData(
        background = background,
        foreground = foreground,
        foregroundSecondary = foregroundSecondary,
        foregroundAccent = foregroundAccent
    )
}
