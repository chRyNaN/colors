@file:Suppress("MemberVisibilityCanBePrivate", "unused")

package com.chrynan.colors

/**
 * Converts this [ColorInt] to an [RgbaColor].
 *
 * Note that this [ColorInt] is expected to be valid.
 */
fun ColorInt.toRgbaColor(): RgbaColor = RgbaColor(colorInt = this)

/**
 * Coerces this [Int] value within the SRGB Color Range of 0 to 255.
 */
fun Int.coerceInSRGBColorRange(): Int = this.coerceIn(0, 255)
