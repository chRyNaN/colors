package com.chrynan.colors.palette.internal

import com.chrynan.colors.palette.Swatch

interface Target {

    val minimumSaturation: Float
    val targetSaturation: Float
    val maximumSaturation: Float
    val minimumLightness: Float
    val targetLightness: Float
    val maximumLightness: Float
    val saturationWeight: Float
    val lightnessWeight: Float
    val populationWeight: Float
    val isExclusive: Boolean

    fun matchesSwatch(swatch: Swatch): Boolean

    companion object {

        internal const val DEFAULT_WEIGHT_SATURATION = 0.24f
        internal const val DEFAULT_WEIGHT_LUMA = 0.52f
        internal const val DEFAULT_WEIGHT_POPULATION = 0.24f

        private const val TARGET_DARK_LUMA = 0.26f
        private const val MAX_DARK_LUMA = 0.45f
        private const val MIN_LIGHT_LUMA = 0.55f
        private const val TARGET_LIGHT_LUMA = 0.74f
        private const val MIN_NORMAL_LUMA = 0.3f
        private const val TARGET_NORMAL_LUMA = 0.5f
        private const val MAX_NORMAL_LUMA = 0.7f
        private const val TARGET_MUTED_SATURATION = 0.3f
        private const val MAX_MUTED_SATURATION = 0.4f
        private const val TARGET_VIBRANT_SATURATION = 1f
        private const val MIN_VIBRANT_SATURATION = 0.35f

        val LIGHT_VIBRANT: Target = HslTarget(
            minimumLightness = MIN_LIGHT_LUMA,
            targetLightness = TARGET_LIGHT_LUMA,
            minimumSaturation = MIN_VIBRANT_SATURATION,
            targetSaturation = TARGET_VIBRANT_SATURATION
        )

        val VIBRANT: Target = HslTarget(
            minimumLightness = MIN_NORMAL_LUMA,
            targetLightness = TARGET_NORMAL_LUMA,
            maximumLightness = MAX_NORMAL_LUMA,
            minimumSaturation = MIN_VIBRANT_SATURATION,
            targetSaturation = TARGET_VIBRANT_SATURATION
        )

        val DARK_VIBRANT: Target = HslTarget(
            targetLightness = TARGET_DARK_LUMA,
            maximumLightness = MAX_DARK_LUMA,
            minimumSaturation = MIN_VIBRANT_SATURATION,
            targetSaturation = TARGET_VIBRANT_SATURATION
        )

        val LIGHT_MUTED: Target = HslTarget(
            minimumLightness = MIN_LIGHT_LUMA,
            targetLightness = TARGET_LIGHT_LUMA,
            targetSaturation = TARGET_MUTED_SATURATION,
            maximumSaturation = MAX_MUTED_SATURATION
        )

        val MUTED: Target = HslTarget(
            minimumLightness = MIN_NORMAL_LUMA,
            targetLightness = TARGET_NORMAL_LUMA,
            maximumLightness = MAX_NORMAL_LUMA,
            targetSaturation = TARGET_MUTED_SATURATION,
            maximumSaturation = MAX_MUTED_SATURATION
        )

        val DARK_MUTED: Target = HslTarget(
            targetLightness = TARGET_DARK_LUMA,
            maximumLightness = MAX_DARK_LUMA,
            targetSaturation = TARGET_MUTED_SATURATION,
            maximumSaturation = MAX_MUTED_SATURATION
        )
    }
}

data class HslTarget internal constructor(
    override val minimumSaturation: Float = 0f,
    override val targetSaturation: Float = 0.5f,
    override val maximumSaturation: Float = 1f,
    override val minimumLightness: Float = 0f,
    override val targetLightness: Float = 0.5f,
    override val maximumLightness: Float = 1f,
    override val saturationWeight: Float = Target.DEFAULT_WEIGHT_SATURATION,
    override val lightnessWeight: Float = Target.DEFAULT_WEIGHT_LUMA,
    override val populationWeight: Float = Target.DEFAULT_WEIGHT_POPULATION,
    override val isExclusive: Boolean = true
) : Target {

    override fun matchesSwatch(swatch: Swatch): Boolean {
        val hsl = swatch.toHsl()

        return hsl[1] in minimumSaturation..maximumSaturation && hsl[2] in minimumLightness..maximumLightness
    }
}
