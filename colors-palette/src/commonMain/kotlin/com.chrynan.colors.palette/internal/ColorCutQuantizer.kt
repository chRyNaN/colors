package com.chrynan.colors.palette.internal

import com.chrynan.colors.Color
import com.chrynan.colors.palette.Swatch

/**
 * An color quantizer based on the Median-cut algorithm, but optimized for picking out distinct
 * colors rather than representation colors.
 *
 * The color space is represented as a 3-dimensional cube with each dimension being an RGB
 * component. The cube is then repeatedly divided until we have reduced the color space to the
 * requested number of colors. An average color is then generated from each cube.
 *
 * What makes this different to median-cut is that median-cut divided cubes so that all of the cubes
 * have roughly the same population, where this quantizer divides boxes based on their color volume.
 * This means that the color space is divided into distinct colors, rather than representative
 * colors.
 */
@ExperimentalUnsignedTypes
internal class ColorCutQuantizer() {

    private val vBoxComparator: Comparator<VBox> =
        Comparator { lhs, rhs -> rhs.volume - lhs.volume }

    operator fun invoke(pixels: IntArray, maxColors: Int): List<Swatch> {
        val histogram = ColorHistogram(pixels)

        if (histogram.distinctColorCount <= maxColors) {
            // The image has fewer colors than the maximum requested, so just return the colors
            return histogram.values.map {
                val color = Color(it.color)

                Swatch(
                    color = color,
                    primaryOnColor = Color(color.getPrimaryOnColorInt()),
                    secondaryOnColor = Color(color.getSecondaryOnColorInt()),
                    population = it.count
                )
            }
        } else {
            // We need use quantization to reduce the number of colors
            return quantizePixels(histogram, maxColors)
        }
    }

    private fun quantizePixels(histogram: ColorHistogram, maxColors: Int): List<Swatch> {
        // Create the priority queue which is sorted by volume descending. This means we always
        // split the largest box in the queue
        val pq = PriorityQueue(vBoxComparator)

        // To start, offer a box which contains all of the colors
        pq.offer(VBox(histogram.values))

        // Now go through the boxes, splitting them until we have reached maxColors or there are no
        // more boxes to split
        splitBoxes(pq, maxColors)

        // Finally, return the average colors of the color boxes
        return generateAverageColors(pq)
    }

    /**
     * Iterate through the [java.util.Queue], popping [VBox] objects from the queue
     * and splitting them. Once split, the new box and the remaining box are offered back to the
     * queue.
     *
     * @param queue [java.util.PriorityQueue] to poll for boxes
     * @param maxSize Maximum amount of boxes to split
     */
    private fun splitBoxes(queue: PriorityQueue<VBox>, maxSize: Int) {
        while (queue.size < maxSize) {
            val vbox: VBox? = queue.pollOrNull()

            if (vbox != null && vbox.isSplitable) {
                // First split the box, and offer the result
                queue.offer(vbox.splitBox())
                // Then offer the box back
                queue.offer(vbox)
            } else {
                // If we get here then there are no more boxes to split, so return
                return
            }
        }
    }

    private fun generateAverageColors(vboxes: Collection<VBox>): MutableList<Swatch> {
        val colors = ArrayList<Swatch>(vboxes.size)

        for (vbox in vboxes) {
            val swatch = vbox.averageColor

            colors.add(swatch)
        }

        return colors
    }
}
