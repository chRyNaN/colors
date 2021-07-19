package com.chrynan.colors.palette

import com.chrynan.colors.palette.internal.ColorCutQuantizer
import com.chrynan.colors.palette.internal.Target
import com.chrynan.colors.palette.internal.toHsl
import kotlin.math.abs

@ExperimentalUnsignedTypes
@Suppress("unused", "RedundantSuspendModifier")
suspend fun Palette.Companion.generate(
    pixels: IntArray,
    maxColorCount: Int = 16
): Palette {
    val quantizer = ColorCutQuantizer()

    val swatches = quantizer.invoke(pixels = pixels, maxColors = maxColorCount)

    val usedSwatches = mutableSetOf<Swatch>()

    val dominantSwatch = findDominantSwatch(swatches = swatches)

    val lightVibrantSwatch = getMaxScoredSwatchForTarget(
        swatches = swatches,
        usedSwatches = usedSwatches,
        target = Target.LIGHT_VIBRANT,
        dominantSwatch = dominantSwatch
    )

    if (lightVibrantSwatch != null) {
        usedSwatches.add(lightVibrantSwatch)
    }

    val vibrantSwatch = getMaxScoredSwatchForTarget(
        swatches = swatches,
        usedSwatches = usedSwatches,
        target = Target.VIBRANT,
        dominantSwatch = dominantSwatch
    )

    if (vibrantSwatch != null) {
        usedSwatches.add(vibrantSwatch)
    }

    val darkVibrantSwatch = getMaxScoredSwatchForTarget(
        swatches = swatches,
        usedSwatches = usedSwatches,
        target = Target.DARK_VIBRANT,
        dominantSwatch = dominantSwatch
    )

    if (darkVibrantSwatch != null) {
        usedSwatches.add(darkVibrantSwatch)
    }

    val lightMutedSwatch = getMaxScoredSwatchForTarget(
        swatches = swatches,
        usedSwatches = usedSwatches,
        target = Target.LIGHT_MUTED,
        dominantSwatch = dominantSwatch
    )

    if (lightMutedSwatch != null) {
        usedSwatches.add(lightMutedSwatch)
    }

    val mutedSwatch = getMaxScoredSwatchForTarget(
        swatches = swatches,
        usedSwatches = usedSwatches,
        target = Target.MUTED,
        dominantSwatch = dominantSwatch
    )

    if (mutedSwatch != null) {
        usedSwatches.add(mutedSwatch)
    }

    val darkMutedSwatch = getMaxScoredSwatchForTarget(
        swatches = swatches,
        usedSwatches = usedSwatches,
        target = Target.DARK_MUTED,
        dominantSwatch = dominantSwatch
    )

    if (darkMutedSwatch != null) {
        usedSwatches.add(darkMutedSwatch)
    }

    return SimplePalette(
        vibrantLightSwatch = lightVibrantSwatch,
        vibrantSwatch = vibrantSwatch,
        vibrantDarkSwatch = darkVibrantSwatch,
        mutedLightSwatch = lightMutedSwatch,
        mutedSwatch = mutedSwatch,
        mutedDarkSwatch = darkMutedSwatch
    )
}

private fun getMaxScoredSwatchForTarget(
    swatches: List<Swatch>,
    usedSwatches: Set<Swatch>,
    target: Target,
    dominantSwatch: Swatch? = null
): Swatch? {
    var maxScore = 0f
    var maxScoreSwatch: Swatch? = null
    var i = 0

    while (i < swatches.size) {
        val swatch = swatches[i]

        if (target.matchesSwatch(swatch) && !usedSwatches.contains(swatch)) {
            val score =
                generateScore(swatch = swatch, target = target, dominantSwatch = dominantSwatch)

            if (maxScoreSwatch == null || score > maxScore) {
                maxScoreSwatch = swatch
                maxScore = score
            }
        }

        i++
    }

    return maxScoreSwatch
}

private fun generateScore(swatch: Swatch, target: Target, dominantSwatch: Swatch? = null): Float {
    val hsl = swatch.toHsl()

    var saturationScore = 0f
    var luminanceScore = 0f
    var populationScore = 0f
    val maxPopulation = if (dominantSwatch != null) (dominantSwatch.population ?: 1) else 1

    if (target.saturationWeight > 0) {
        saturationScore = (target.saturationWeight * (1f - abs(hsl[1] - target.targetSaturation)))
    }

    if (target.lightnessWeight > 0) {
        luminanceScore = (target.lightnessWeight * (1f - abs(hsl[2] - target.targetLightness)))
    }

    if (target.populationWeight > 0) {
        populationScore =
            (target.populationWeight * ((swatch.population ?: 1) / maxPopulation.toFloat()))
    }

    return saturationScore + luminanceScore + populationScore
}

private fun findDominantSwatch(swatches: List<Swatch>): Swatch? {
    var maxPop = Int.MIN_VALUE
    var maxSwatch: Swatch? = null

    var i = 0

    while (i < swatches.size) {
        val swatch: Swatch = swatches[i]
        val population = swatch.population ?: 0

        if (population > maxPop) {
            maxSwatch = swatch
            maxPop = population
        }

        i++
    }

    return maxSwatch
}
