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
