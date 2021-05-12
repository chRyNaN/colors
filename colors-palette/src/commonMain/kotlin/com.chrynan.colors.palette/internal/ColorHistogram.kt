@file:Suppress("unused")

package com.chrynan.colors.palette.internal

/**
 * Class which provides a histogram for RGB Color values.
 *
 * @property [pixels] An [IntArray] representing the pixels of an image. Each value in this
 * [IntArray] should be an sRGB color [Int] value.
 *
 * @see [Wikipedia Definition of Histogram](https://en.wikipedia.org/wiki/Histogram)
 * @see [Thoughtco Explanation of Histogram](https://www.thoughtco.com/what-is-a-histogram-3126359)
 */
internal class ColorHistogram(private val pixels: IntArray) {

    val distinctColorCount: Int
        get() = colorMap.size

    val values: List<ColorBox>
        get() = colorMap.entries.map { ColorBox(color = it.key, count = it.value) }

    private val colorMap: Map<Int, Int>

    init {
        // Sort the pixels to enable counting below
        pixels.sort()

        // Count the frequency of each color
        colorMap = countFrequencies(pixels)
    }

    /**
     * Retrieves the [ColorBox] for the provided [color] value within this [ColorHistogram], or
     * null if the provided [color] isn't in this [ColorHistogram].
     *
     * Note that the provided value is a [color] [Int] value and not an index.
     */
    operator fun get(color: Int): ColorBox? =
        colorMap[color]?.let { ColorBox(color = color, count = it) }

    /**
     * Counts the amount of distinct colors in the provided [pixels] [IntArray] and returns a [Map]
     * with the keys being the distinct color [Int] value and the values being the frequencies, or
     * amount of occurrences of that color in the [pixels] array. The size of the resulting [Map]
     * should indicate how many distinct colors there are in the [pixels] array.
     */
    private fun countFrequencies(pixels: IntArray): Map<Int, Int> {
        if (pixels.isEmpty()) return emptyMap()

        var currentColor = pixels[0]

        val result = mutableMapOf(currentColor to 1)

        // If we only have one pixel, we can stop here
        if (pixels.size == 1) return result

        // Now iterate from the second pixel to the end, population distinct colors.
        // Remember that the array should be sorted, so that the same colors should appear
        // consecutively.
        for (i in 1 until pixels.size) {
            if (pixels[i] == currentColor) {
                // We've hit the same color as before, so increase the population.
                result[currentColor] = (result[currentColor] ?: 0) + 1
            } else {
                // We've hit a new color, so increase index.
                currentColor = pixels[i]
                result[currentColor] = 1
            }
        }

        return result
    }

    internal data class ColorBox(
        val color: Int,
        val count: Int
    )
}
