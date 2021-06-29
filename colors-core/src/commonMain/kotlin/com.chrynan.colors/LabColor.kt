@file:Suppress("unused")

package com.chrynan.colors

import com.chrynan.colors.space.ColorModel
import com.chrynan.colors.space.ColorSpace
import com.chrynan.colors.space.coerceComponentInRange

/**
 * A [Color] interface that represents a [Color] within a [ColorSpace] with a [ColorModel.LAB]
 * color model.
 */
interface LabColor : Color {

    /**
     * This is the first component in a [Color] with a [ColorSpace] that has a [ColorModel.LAB]
     * color model. This should be the same as calling [component1].
     *
     * Note: Refer to the [colorSpace] value to determine if a [Color] is really a LAB [Color].
     */
    val l: Float
        get() = colorSpace.coerceComponentInRange(1, component1())

    /**
     * This is the second component in a [Color] with a [ColorSpace] that has a [ColorModel.LAB]
     * color model. This should be the same as calling [component2].
     *
     * Note: Refer to the [colorSpace] value to determine if a [Color] is really an LAB [Color].
     */
    val a: Float
        get() = colorSpace.coerceComponentInRange(2, component2())

    /**
     * This is the second component in a [Color] with a [ColorSpace] that has a [ColorModel.LAB]
     * color model. This should be the same as calling [component2].
     *
     * Note: Refer to the [colorSpace] value to determine if a [Color] is really an LAB [Color].
     */
    val b: Float
        get() = colorSpace.coerceComponentInRange(3, component3())

    companion object
}

val LabColor.lightness: Float
    get() = l

val LabColor.greenRed: Float
    get() = a

val LabColor.blueYellow: Float
    get() = b
