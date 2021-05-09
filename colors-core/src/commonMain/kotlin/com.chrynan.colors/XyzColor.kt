@file:Suppress("unused")

package com.chrynan.colors

import com.chrynan.colors.space.ColorModel
import com.chrynan.colors.space.ColorSpace
import com.chrynan.colors.space.coerceComponentInRange

/**
 * A [Color] interface that represents a [Color] within a [ColorSpace] with a [ColorModel.XYZ]
 * color model.
 *
 * **Note:** Do **not** perform an instance check (ex: `color is RgbaColor`) to determine if a
 * [Color] instance is really a particular [Color] subtype. Instead refer to the [colorSpace]
 * property. This is because different [Color] subtypes, such as [RgbaColor], can share the same
 * class implementation.
 */
interface XyzColor : Color {

    /**
     * This is the first component in a [Color] with a [ColorSpace] that has a [ColorModel.XYZ]
     * color model. This should be the same as calling [component1].
     *
     * Note: Refer to the [colorSpace] value to determine if a [Color] is really a XYZ [Color].
     */
    val x: Float
        get() = colorSpace.coerceComponentInRange(1, component1())

    /**
     * This is the second component in a [Color] with a [ColorSpace] that has a [ColorModel.XYZ]
     * color model. This should be the same as calling [component2].
     *
     * Note: Refer to the [colorSpace] value to determine if a [Color] is really an XYZ [Color].
     */
    val y: Float
        get() = colorSpace.coerceComponentInRange(2, component2())

    /**
     * This is the second component in a [Color] with a [ColorSpace] that has a [ColorModel.XYZ]
     * color model. This should be the same as calling [component2].
     *
     * Note: Refer to the [colorSpace] value to determine if a [Color] is really an XYZ [Color].
     */
    val z: Float
        get() = colorSpace.coerceComponentInRange(3, component3())

    companion object
}

val XyzColor.greenRed: Float
    get() = x

val XyzColor.lightness: Float
    get() = y

val XyzColor.blueYellow: Float
    get() = z
