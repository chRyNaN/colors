package com.chrynan.colors

import com.chrynan.colors.space.ColorModel

@ExperimentalUnsignedTypes // TODO this should be a value class when IR compilation works
internal class BaseXyzColor(
    override val value: ULong
) : Color,
    BaseColor,
    XyzColor {

    init {
        require(colorSpace.model == ColorModel.XYZ) {
            "XyzColor needs to have a ColorModel of ${ColorModel.XYZ}"
        }
    }

    override val cssValue: String
        get() {
            val rgbaColor = toRgbaColor()

            return "rgba(${rgbaColor.redInt}, ${rgbaColor.greenInt}, ${rgbaColor.blueInt}, ${rgbaColor.alphaInt})"
        }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as BaseHexadecimalColor

        if (value != other.value) return false

        return true
    }

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String =
        "XyzColor(colorLong = $colorLong, colorSpace = $colorSpace, x = ${component1()}, y = ${component2()}, z = ${component3()}, alpha = ${component4()})"
}
