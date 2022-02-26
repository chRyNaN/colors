@file:Suppress("unused")

package com.chrynan.colors

import com.chrynan.colors.space.ColorSpace
import com.chrynan.colors.space.ColorSpaces
import com.chrynan.colors.space.RenderIntent
import platform.UIKit.UIColor

/**
 * Converts this [Color] instance into a [UIColor] from UIKit.
 */
fun Color.toUIColor(
    destinationColorSpace: ColorSpace = ColorSpaces.SRGB,
    renderIntent: RenderIntent = RenderIntent.PERCEPTUAL
): UIColor {
    val rgbaColor =
        toRgbaColor(destinationColorSpace = destinationColorSpace, renderIntent = renderIntent)

    return UIColor(
        red = rgbaColor.red.toDouble(),
        green = rgbaColor.green.toDouble(),
        blue = rgbaColor.blue.toDouble(),
        alpha = rgbaColor.alpha.toDouble()
    )
}
