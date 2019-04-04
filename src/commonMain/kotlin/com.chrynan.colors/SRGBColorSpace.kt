package com.chrynan.colors

class SRGBColorSpace : ColorSpace {

    companion object {

        private const val MIN = 0f
        private const val MAX = 255f
        private const val BIT_COUNT = 8
        private const val NAME_ALPHA = "alpha"
        private const val NAME_RED = "red"
        private const val NAME_GREEN = "green"
        private const val NAME_BLUE = "blue"
        private const val INDEX_ALPHA = 0
        private const val INDEX_RED = 1
        private const val INDEX_GREEN = 2
        private const val INDEX_BLUE = 3

        fun coerceInRange(value: Int): Int = value.coerceIn(minimumValue = MIN.toInt(), maximumValue = MAX.toInt())
    }

    override val name = "SRGB"

    override val componentCount = 4

    override fun minValue(componentIndex: Int) = MIN

    override fun maxValue(componentIndex: Int) = MAX

    override fun coerceInRange(value: Float) = value.coerceIn(minimumValue = MIN, maximumValue = MAX)

    override val colorModel = ColorModel.RGB

    override fun componentsFromValues(vararg values: Float) = listOf(
        ColorComponent(
            name = NAME_ALPHA,
            value = values[INDEX_ALPHA],
            minValue = MIN,
            maxValue = MAX,
            bitCount = BIT_COUNT,
            isAlpha = true
        ),
        ColorComponent(
            name = NAME_RED,
            value = values[INDEX_RED],
            minValue = MIN,
            maxValue = MAX,
            bitCount = BIT_COUNT,
            isAlpha = false
        ),
        ColorComponent(
            name = NAME_GREEN,
            value = values[INDEX_GREEN],
            minValue = MIN,
            maxValue = MAX,
            bitCount = BIT_COUNT,
            isAlpha = false
        ),
        ColorComponent(
            name = NAME_BLUE,
            value = values[INDEX_BLUE],
            minValue = MIN,
            maxValue = MAX,
            bitCount = BIT_COUNT,
            isAlpha = false
        )
    )

    fun componentsFromARGB(alpha: Float, red: Float, green: Float, blue: Float) = listOf(
        ColorComponent(
            name = NAME_ALPHA,
            value = coerceInRange(alpha),
            minValue = MIN,
            maxValue = MAX,
            bitCount = BIT_COUNT,
            isAlpha = true
        ),
        ColorComponent(
            name = NAME_RED,
            value = coerceInRange(red),
            minValue = MIN,
            maxValue = MAX,
            bitCount = BIT_COUNT,
            isAlpha = false
        ),
        ColorComponent(
            name = NAME_GREEN,
            value = coerceInRange(green),
            minValue = MIN,
            maxValue = MAX,
            bitCount = BIT_COUNT,
            isAlpha = false
        ),
        ColorComponent(
            name = NAME_BLUE,
            value = coerceInRange(blue),
            minValue = MIN,
            maxValue = MAX,
            bitCount = BIT_COUNT,
            isAlpha = false
        )
    )

    fun componentsFromARGB(alpha: Int, red: Int, green: Int, blue: Int) =
        componentsFromARGB(alpha = alpha.toFloat(), red = red.toFloat(), green = green.toFloat(), blue = blue.toFloat())
}