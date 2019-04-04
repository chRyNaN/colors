package com.chrynan.colors

interface Color {

    companion object {

        const val MIN_ALPHA = 0f
        const val MAX_ALPHA = 1f
        const val MIN_OPACITY = 0
        const val MAX_OPACITY = 255
        const val OPAQUE_ALPHA = MAX_ALPHA
        const val OPAQUE_OPACITY = MAX_OPACITY
        const val TRANSPARENT_ALPHA = MIN_ALPHA
        const val TRANSPARENT_OPACITY = MIN_OPACITY
    }

    /**
     * A value between 0.0 and 1.0 representing the alpha value of this Color instance. This is similar to [opacity] but
     * is a float value from 0.0 and 1.0 instead of an integer value between 0 and 255. A value of 0.0 is completely
     * transparent. A value of 1.0 is completely opaque.
     */
    val alpha: Float

    /**
     * A value between 0 and 255 representing the opacity value of this Color instance. This is similar to [alpha] but
     * is an integer value from 0 and 255 instead of a float between 0.0 and 1.0. A value of 0 is completely transparent.
     * A value of 255 is completely opaque.
     */
    val opacity: Int

    val colorSpace: ColorSpace

    val components: List<ColorComponent>

    fun toColorInt(): ColorInt
}

enum class ColorModel(val componentCount: Int) {

    CMYK(componentCount = 4),
    LAB(componentCount = 3),
    RGB(componentCount = 3),
    XYZ(componentCount = 3)
}

data class ColorComponent(
    val name: String,
    val minValue: Float,
    val maxValue: Float,
    val value: Float,
    val bitCount: Int,
    val isAlpha: Boolean
)

interface ColorSpace {

    val name: String
    val componentCount: Int
    val colorModel: ColorModel

    fun minValue(componentIndex: Int): Float

    fun maxValue(componentIndex: Int): Float

    fun coerceInRange(value: Float): Float

    fun componentsFromValues(vararg values: Float): List<ColorComponent>
}