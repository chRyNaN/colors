package com.chrynan.colors.sample.android.util

import com.chrynan.colors.Color
import com.chrynan.colors.contrast

/**
 * Converts a transparent color to [Color.White].
 */
internal fun Color.normalize(): Color = if (this.alpha == 0f) Color.White else this

/**
 * Retrieves a [Color] that can be overlaid on top of this [Color].
 */
internal fun Color.contentColor(): Color =
    if (contrast(Color.White) > 0.5f) {
        Color.White
    } else {
        Color.Black
    }

/**
 * Retrieves a secondary [Color] from this [Color].
 */
internal fun Color.secondary(): Color = copy(component4 = alpha / 2)
