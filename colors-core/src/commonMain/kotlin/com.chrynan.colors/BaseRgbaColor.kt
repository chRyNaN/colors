package com.chrynan.colors

import com.chrynan.colors.space.ColorModel

@ExperimentalUnsignedTypes // TODO this should be a value class when IR compilation works
internal class BaseRgbaColor(
    override val value: ULong
) : Color,
    BaseColor,
    RgbaColor {

    init {
        require(colorSpace.model == ColorModel.RGB) {
            "RgbaColor needs to have a ColorModel of ${ColorModel.RGB}"
        }
    }

    override val cssValue: String
        get() = "rgba($redInt, $greenInt, $blueInt, $alphaInt)"

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as BaseHexadecimalColor

        if (value != other.value) return false

        return true
    }

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String =
        "RgbaColor(colorLong = $colorLong, colorSpace = $colorSpace, red = ${component1()}, green = ${component2()}, blue = ${component3()}, alpha = ${component4()})"
}
