package com.chrynan.colors

import com.chrynan.colors.space.ColorModel

// TODO this class should be a value class when it supports multiple properties
internal class BaseHexadecimalColor(
    override val value: ULong,
    hexColorString: String
) : Color,
    BaseColor,
    RgbaColor,
    HexadecimalColor {

    init {
        require(colorSpace.model == ColorModel.RGB) {
            "HexadecimalColor needs to have a ColorModel of ${ColorModel.RGB}"
        }
    }

    override val cssValue: String
        get() = hexString

    override val hexString: String =
        if (hexColorString.startsWith(HexadecimalColor.HEX_CHAR)) hexColorString else "${HexadecimalColor.HEX_CHAR}$hexColorString"

    override val hexStringWithoutPrefix: String =
        hexString.removePrefix("${HexadecimalColor.HEX_CHAR}")

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other == null || this::class != other::class) return false

        other as BaseHexadecimalColor

        if (value != other.value) return false

        return true
    }

    override fun hashCode(): Int = value.hashCode()

    override fun toString(): String =
        "HexadecimalColor(colorLong = $colorLong, colorSpace = $colorSpace, red = ${component1()}, green = ${component2()}, blue = ${component3()}, alpha = ${component4()}, hexString = $hexString)"
}
