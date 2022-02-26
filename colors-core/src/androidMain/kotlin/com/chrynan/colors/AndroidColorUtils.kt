@file:Suppress("unused")

package com.chrynan.colors

import android.content.Context
import android.content.res.Resources
import android.os.Build
import androidx.annotation.RequiresApi

/**
 * Retrieves a [Color] from the provided resource [id] and [theme] using the provided [context].
 */
fun Color.Companion.fromResource(
    context: Context,
    id: Int,
    theme: Resources.Theme? = null
): Color {
    val colorInt = context.resources.getColor(id, theme)

    return Color(colorInt = ColorInt(colorInt))
}

/**
 * Retrieves a [ColorInt] from the provided resource [id] and [theme] using the provided [context].
 */
fun ColorInt.Companion.fromResource(
    context: Context,
    id: Int,
    theme: Resources.Theme? = null
): ColorInt {
    val colorInt = context.resources.getColor(id, theme)

    return ColorInt(value = colorInt)
}

/**
 * Converts this [android.graphics.Color] instance into a [Color] instance.
 */
@RequiresApi(Build.VERSION_CODES.O)
fun android.graphics.Color.toMultiplatformColor(): Color {
    return Color(toArgb()) // TODO should probably use the components and colorspace to retain information and not convert
}

/**
 * Converts this [Color] instance into an [android.graphics.Color] instance.
 */
@RequiresApi(Build.VERSION_CODES.O)
fun Color.toAndroidColor(): android.graphics.Color = android.graphics.Color.valueOf(colorLong.value)
