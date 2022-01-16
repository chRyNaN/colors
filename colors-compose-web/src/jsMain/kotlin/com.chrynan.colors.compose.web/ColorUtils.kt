@file:Suppress("unused")

package com.chrynan.colors.compose.web

import com.chrynan.colors.*
import com.chrynan.colors.space.ColorSpace
import com.chrynan.colors.space.ColorSpaces
import com.chrynan.colors.space.RenderIntent
import org.jetbrains.compose.web.css.CSSColorValue
import org.jetbrains.compose.web.css.rgba

/**
 * Converts this [Color] to a [CSSColorValue] so that it can be used with compose-web components.
 *
 * Note that this [Color] will first be converted to an [RgbaColor] so that it can be easily
 * converted to a [CSSColorValue].
 */
fun Color.toCSSColorValue(
    destinationColorSpace: ColorSpace = ColorSpaces.SRGB,
    renderIntent: RenderIntent = RenderIntent.PERCEPTUAL
): CSSColorValue {
    val rgbaColor =
        this.toRgbaColor(
            destinationColorSpace = destinationColorSpace,
            renderIntent = renderIntent
        )

    return rgba(r = rgbaColor.redInt, g = rgbaColor.greenInt, b = rgbaColor.blueInt, a = rgbaColor.alphaInt)
}
