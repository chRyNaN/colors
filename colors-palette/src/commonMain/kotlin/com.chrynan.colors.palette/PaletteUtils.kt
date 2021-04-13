@file:Suppress("unused")

package com.chrynan.colors.palette

/**
 * Retrieves a [List] of all of the available [Swatch]es for this [Palette].
 */
val Palette.swatches: List<Swatch?>
    get() = listOf(
        vibrantSwatch,
        vibrantDarkSwatch,
        vibrantLightSwatch,
        mutedSwatch,
        mutedDarkSwatch,
        mutedLightSwatch
    )

/**
 * Retrieves the first non-null [Swatch] from the [swatches] property or null if this [Palette]
 * [isEmpty].
 */
val Palette.primarySwatch: Swatch?
    get() = swatches.filterNotNull().firstOrNull()

/**
 * Determines whether all the [Swatch]es in this [Palette] are null. If there is at least one
 * non-null [Swatch] in this [Palette] false is returned (meaning this [Palette] is not empty),
 * otherwise true is returned (meaning this [Palette] is empty).
 */
val Palette.isEmpty
    get() = swatches.filterNotNull().isEmpty()

/**
 * The inverse operation of [isEmpty].
 *
 * @see [isEmpty]
 */
val Palette.isNotEmpty
    get() = !isEmpty
