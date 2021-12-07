package com.chrynan.colors

import com.chrynan.colors.space.ColorModel

// TODO this should be a value class when IR compilation works
internal class BaseLabColor(
    override val value: ULong
) : Color,
    BaseColor,
    LabColor {

    init {
        require(colorSpace.model == ColorModel.LAB) {
            "LabColor needs to have a ColorModel of ${ColorModel.LAB}"
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
        "LabColor(colorLong = $colorLong, colorSpace = $colorSpace, l = ${component1()}, a = ${component2()}, b = ${component3()}, alpha = ${component4()})"
}
