package com.chrynan.colors

import com.chrynan.colors.space.ColorSpace
import com.chrynan.colors.space.ColorModel
import com.chrynan.colors.space.coerceComponentInRange

/**
 * A [Color] interface that represents a [Color] with red, green, and blue components.
 */
interface RgbaColor : Color {

    /**
     * This is the first component in a [Color] with a [ColorSpace] that has a [ColorModel.RGB]
     * color model. This should be the same as calling [component1].
     *
     * Note: Refer to the [colorSpace] value to determine if a [Color] is really an RGB [Color].
     */
    val red: Float
        get() = colorSpace.coerceComponentInRange(1, component1())

    /**
     * This is the second component in a [Color] with a [ColorSpace] that has a [ColorModel.RGB]
     * color model. This should be the same as calling [component2].
     *
     * Note: Refer to the [colorSpace] value to determine if a [Color] is really an RGB [Color].
     */
    val green: Float
        get() = colorSpace.coerceComponentInRange(2, component2())

    /**
     * This is the second component in a [Color] with a [ColorSpace] that has a [ColorModel.RGB]
     * color model. This should be the same as calling [component2].
     *
     * Note: Refer to the [colorSpace] value to determine if a [Color] is really an RGB [Color].
     */
    val blue: Float
        get() = colorSpace.coerceComponentInRange(3, component3())

    companion object
}
