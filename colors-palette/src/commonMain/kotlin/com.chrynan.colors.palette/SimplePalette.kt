@file:Suppress("unused")

package com.chrynan.colors.palette

data class SimplePalette internal constructor(
    override val vibrantSwatch: Swatch? = null,
    override val vibrantDarkSwatch: Swatch? = null,
    override val vibrantLightSwatch: Swatch? = null,
    override val mutedSwatch: Swatch? = null,
    override val mutedDarkSwatch: Swatch? = null,
    override val mutedLightSwatch: Swatch? = null
) : Palette

fun Palette(
    vibrantSwatch: Swatch? = null,
    vibrantDarkSwatch: Swatch? = null,
    vibrantLightSwatch: Swatch? = null,
    mutedSwatch: Swatch? = null,
    mutedDarkSwatch: Swatch? = null,
    mutedLightSwatch: Swatch? = null
): Palette = SimplePalette(
    vibrantSwatch = vibrantSwatch,
    vibrantDarkSwatch = vibrantDarkSwatch,
    vibrantLightSwatch = vibrantLightSwatch,
    mutedSwatch = mutedSwatch,
    mutedDarkSwatch = mutedDarkSwatch,
    mutedLightSwatch = mutedLightSwatch
)
