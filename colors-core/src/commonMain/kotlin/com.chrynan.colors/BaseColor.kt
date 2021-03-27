package com.chrynan.colors

import com.chrynan.colors.space.*
import com.chrynan.colors.space.Float16

@ExperimentalUnsignedTypes
interface BaseColor : Color,
    RgbaColor,
    LabColor,
    XyzColor,
    HexadecimalColor {

    val value: ULong

    override val colorInt: ColorInt
        get() {
            val colorSpace = colorSpace
            if (colorSpace.isSrgb) return ColorInt(value = (this.value shr 32).toInt())

            val color = components

            // The transformation saturates the output
            colorSpace.connect(destination = ColorSpaces.SRGB).transform(color)

            val colorInt = (color[3] * 255.0f + 0.5f).toInt() shl 24 or
                    ((color[0] * 255.0f + 0.5f).toInt() shl 16) or
                    ((color[1] * 255.0f + 0.5f).toInt() shl 8) or
                    (color[2] * 255.0f + 0.5f).toInt()

            return ColorInt(value = colorInt)
        }

    override val colorLong: ColorLong
        get() = ColorLong(value = value.toLong())

    override val colorSpace: ColorSpace
        get() = ColorSpaces.getColorSpace(colorSpaceBitsValue.toInt())

    override val alpha: Float
        get() = if (isSrgb) {
            ((value shr 56) and 0xffUL).toFloat() / 255.0f
        } else {
            ((value shr 6) and 0x3ffUL).toFloat() / 1023.0f
        }

    /**
     * Returns this color's components as a new array.
     *
     * @return A new, non-null array whose size is 4
     */
    override val components: FloatArray
        get() = floatArrayOf(component1(), component2(), component3(), component4())

    /**
     * The [ULong] value representing the value of the [ColorSpace] bits segment
     * in the [value] [ULong].
     *
     * This is almost always the last six bits ([0..63]) in the [ULong] [value].
     *
     * Note that some [ColorSpace]s don't explicitly provide [ColorSpace] bits,
     * such as sRGB, but this returned value should still be resolvable using
     * the [ColorSpaces.getColorSpace] function for those [ColorSpaces].
     */
    private val colorSpaceBitsValue: ULong
        get() = value and 0x3fUL

    /**
     * Determines whether this is in the SRGB [ColorSpace]. The SRGB [ColorSpace]
     * has special handling to retrieve the component values.
     */
    private val isSrgb: Boolean
        get() = colorSpaceBitsValue == 0UL

    override fun component1(): Float =
        if (isSrgb) {
            ((value shr 48) and 0xffUL).toFloat() / 255.0f
        } else {
            Float16(((value shr 48) and 0xffffUL).toShort())
                .toFloat()
        }

    override fun component2(): Float =
        if (isSrgb) {
            ((value shr 40) and 0xffUL).toFloat() / 255.0f
        } else {
            Float16(((value shr 32) and 0xffffUL).toShort())
                .toFloat()
        }

    override fun component3(): Float =
        if (isSrgb) {
            ((value shr 32) and 0xffUL).toFloat() / 255.0f
        } else {
            Float16(((value shr 16) and 0xffffUL).toShort())
                .toFloat()
        }

    override fun component4(): Float =
        if (isSrgb) {
            ((value shr 56) and 0xffUL).toFloat() / 255.0f
        } else {
            ((value shr 6) and 0x3ffUL).toFloat() / 1023.0f
        }

    override fun convert(colorSpace: ColorSpace, renderIntent: RenderIntent): Color {
        if (colorSpace == this.colorSpace) return this

        val connector = this.colorSpace.connect(colorSpace)
        val color = components
        connector.transform(color)

        return RgbaColor(
            red = color[0],
            green = color[1],
            blue = color[2],
            alpha = color[3],
            colorSpace = colorSpace
        )
    }

    override fun copy(
        component1: Float,
        component2: Float,
        component3: Float,
        component4: Float,
        alpha: Float
    ): Color = RgbaColor(
        red = component1,
        green = component2,
        blue = component3,
        alpha = component4,
        colorSpace = this.colorSpace
    )

    override fun toRgbaColor(
        destinationColorSpace: ColorSpace,
        renderIntent: RenderIntent
    ): RgbaColor {
        if (colorSpace.model == ColorModel.RGB && colorSpace == destinationColorSpace) return this

        val color = components

        // The transformation saturates the output
        colorSpace.connect(
            destination = destinationColorSpace,
            intent = renderIntent
        ).transform(color)

        val colorInt = (color[3] * 255.0f + 0.5f).toInt() shl 24 or
                ((color[0] * 255.0f + 0.5f).toInt() shl 16) or
                ((color[1] * 255.0f + 0.5f).toInt() shl 8) or
                (color[2] * 255.0f + 0.5f).toInt()

        return BaseULongColor(value = colorInt.toULong() shl 32)
    }
}
