package com.chrynan.colors.sample.android.util

import com.chrynan.colors.Color
import com.chrynan.colors.HslColor
import com.chrynan.colors.contrast
import com.chrynan.colors.sample.android.data.ColorData
import com.chrynan.colors.toHslComponents

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
    val (h, s, l) = rgbaColor.toHslComponents()

    var newH = h + 180
    if (newH > 360) {
        newH -= 360
    }
    newH /= 360f

    return HslColor(newH.coerceIn(0f, 360f), s.coerceIn(0f, 1f), l.coerceIn(0f, 1f))
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
