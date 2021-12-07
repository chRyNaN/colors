package com.chrynan.colors.palette.internal

import com.chrynan.colors.Color
import com.chrynan.colors.palette.Swatch
import kotlin.math.min
import kotlin.math.round

/**
 * Represents a tightly fitting box around a color space.
 *
 * This code was adapted from the Android Open Source Palette library.
 */
internal class VBox(private var colorBoxes: List<ColorHistogram.ColorBox>) {

    val volume: Int
        get() = ((maxRed - minRed + 1) * (maxGreen - minGreen + 1) * (maxBlue - minBlue + 1))

    val colorCount: Int
        get() = colorBoxes.size

    val isSplitable: Boolean
        get() = colorCount > 1

    /**
     * @return The dimension which this box is largest in
     */
    val longestColorDimension: ColorComponent
        get() {
            val redLength = maxRed - minRed
            val greenLength = maxGreen - minGreen
            val blueLength = maxBlue - minBlue

            return if (redLength >= greenLength && redLength >= blueLength) {
                ColorComponent.RED
            } else if (greenLength >= redLength && greenLength >= blueLength) {
                ColorComponent.GREEN
            } else {
                ColorComponent.BLUE
            }
        }

    /**
     * @return The average color of this box.
     */
    val averageColor: Swatch
        get() {
            var redSum = 0
            var greenSum = 0
            var blueSum = 0
            var totalPopulation = 0

            for (colorBox in colorBoxes) {
                val color = colorBox.color
                val colorPopulation = colorBox.count

                totalPopulation += colorPopulation
                redSum += colorPopulation * quantizedRed(color)
                greenSum += colorPopulation * quantizedGreen(color)
                blueSum += colorPopulation * quantizedBlue(color)
            }

            val redMean: Int = round(redSum / totalPopulation.toFloat()).toInt()
            val greenMean: Int = round(greenSum / totalPopulation.toFloat()).toInt()
            val blueMean: Int = round(blueSum / totalPopulation.toFloat()).toInt()

            val averageColor = Color(approximateToRgb888(redMean, greenMean, blueMean))
            val primaryOnColor = Color(averageColor.getPrimaryOnColorInt())
            val secondaryOnColor = Color(averageColor.getSecondaryOnColorInt())

            return Swatch(
                color = averageColor,
                primaryOnColor = primaryOnColor,
                secondaryOnColor = secondaryOnColor,
                population = totalPopulation
            )
        }

    // Population of colors within this box
    private var totalPopulation: Int = 0
    private var minRed: Int = 0
    private var maxRed: Int = 0
    private var minGreen: Int = 0
    private var maxGreen: Int = 0
    private var minBlue: Int = 0
    private var maxBlue: Int = 0

    init {
        fitBox()
    }

    /**
     * Split this color box at the mid-point along its longest dimension
     *
     * @return the new ColorBox
     */
    fun splitBox(): VBox {
        if (!isSplitable) throw IllegalStateException("Can not split a box with only 1 color")

        // find median along the longest dimension
        val splitPoint = findSplitPoint()
        val newBox = VBox(colorBoxes.subList(splitPoint + 1, colorBoxes.size))

        colorBoxes = colorBoxes.subList(0, splitPoint)

        fitBox()

        return newBox
    }

    /**
     * Recomputes the boundaries of this box to tightly fit the colors within the box.
     */
    private fun fitBox() {
        // Reset the min and max to opposite values
        var minRed: Int = Int.MAX_VALUE
        var minGreen: Int = Int.MAX_VALUE
        var minBlue: Int = Int.MAX_VALUE

        var maxRed: Int = Int.MIN_VALUE
        var maxGreen: Int = Int.MIN_VALUE
        var maxBlue: Int = Int.MIN_VALUE

        var totalCount = 0

        for (colorBox in colorBoxes) {
            val color = colorBox.color

            totalCount += colorBox.count

            val r = quantizedRed(color)
            val g = quantizedGreen(color)
            val b = quantizedBlue(color)

            if (r > maxRed) {
                maxRed = r
            }
            if (r < minRed) {
                minRed = r
            }
            if (g > maxGreen) {
                maxGreen = g
            }
            if (g < minGreen) {
                minGreen = g
            }
            if (b > maxBlue) {
                maxBlue = b
            }
            if (b < minBlue) {
                minBlue = b
            }
        }

        this.minRed = minRed
        this.maxRed = maxRed
        this.minGreen = minGreen
        this.maxGreen = maxGreen
        this.minBlue = minBlue
        this.maxBlue = maxBlue
        this.totalPopulation = totalCount
    }

    /**
     * Finds the point within this box's lowerIndex and upperIndex index of where to split.
     *
     * This is calculated by finding the longest color dimension, and then sorting the
     * sub-array based on that dimension value in each color. The colors are then iterated over
     * until a color is found with at least the midpoint of the whole box's dimension midpoint.
     *
     * @return the index of the colors array to split from
     */
    private fun findSplitPoint(): Int {
        // Sort the color boxes by the longest color dimension.
        colorBoxes = colorBoxes.sortedBy {
            when (longestColorDimension) {
                ColorComponent.RED -> comparableRed(it.color)
                ColorComponent.GREEN -> comparableGreen(it.color)
                ColorComponent.BLUE -> comparableBlue(it.color)
            }
        }

        val midPoint = totalPopulation / 2
        var count = 0

        for (i in colorBoxes.indices) {
            count += colorBoxes[i].count

            if (count >= midPoint) {
                // we never want to split on the upperIndex, as this will result in the same
                // box
                return min(colorBoxes.lastIndex, i)
            }
        }

        return 0
    }
}
