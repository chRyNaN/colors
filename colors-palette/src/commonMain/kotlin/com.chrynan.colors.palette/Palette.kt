@file:Suppress("unused")

package com.chrynan.colors.palette

/**
 * A color [Palette] is a component that contains color [Swatch]s representing important colors:
 * either extracted from an image or used for rendering UI components.
 */
interface Palette {

    val dominantSwatch: Swatch?

    val vibrantSwatch: Swatch?

    val vibrantDarkSwatch: Swatch?

    val vibrantLightSwatch: Swatch?

    val mutedSwatch: Swatch?

    val mutedDarkSwatch: Swatch?

    val mutedLightSwatch: Swatch?

    companion object
}
