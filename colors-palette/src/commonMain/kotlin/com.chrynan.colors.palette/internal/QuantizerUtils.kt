package com.chrynan.colors.palette.internal

import com.chrynan.colors.Color
import com.chrynan.colors.RgbaColor

private const val QUANTIZE_WORD_WIDTH: Int = 5
private const val QUANTIZE_WORD_MASK: Int = (1 shl QUANTIZE_WORD_WIDTH) - 1

/**
 * Retrieves the red component of the quantized color
 */
internal fun quantizedRed(color: Int): Int =
    (color shr (QUANTIZE_WORD_WIDTH + QUANTIZE_WORD_WIDTH)) and QUANTIZE_WORD_MASK

/**
 * Retrives the green component of a quantized color
 */
internal fun quantizedGreen(color: Int): Int =
    (color shr QUANTIZE_WORD_WIDTH) and QUANTIZE_WORD_MASK

/**
 * Retrieves the blue component of a quantized color
 */
internal fun quantizedBlue(color: Int): Int = color and QUANTIZE_WORD_MASK

/**
 * Quantized a RGB888 value to have a word width of {@value #QUANTIZE_WORD_WIDTH}.
 */
internal fun quantizeFromRgb888(color: Int): Int {
    val rgbaColor = Color(color)
    val r: Int = modifyWordWidth(
        rgbaColor.red.toInt(), 8,
        QUANTIZE_WORD_WIDTH
    )
    val g: Int =
        modifyWordWidth(
            rgbaColor.green.toInt(), 8,
            QUANTIZE_WORD_WIDTH
        )
    val b: Int = modifyWordWidth(
        rgbaColor.blue.toInt(), 8,
        QUANTIZE_WORD_WIDTH
    )

    return (r shl (QUANTIZE_WORD_WIDTH + QUANTIZE_WORD_WIDTH)) or (g shl QUANTIZE_WORD_WIDTH) or b
}

/**
 * Quantized RGB888 values to have a word width of {@value #QUANTIZE_WORD_WIDTH}.
 */
internal fun approximateToRgb888(r: Int, g: Int, b: Int): Int =
    RgbaColor(
        red = modifyWordWidth(r, QUANTIZE_WORD_WIDTH, 8),
        green = modifyWordWidth(g, QUANTIZE_WORD_WIDTH, 8),
        blue = modifyWordWidth(b, QUANTIZE_WORD_WIDTH, 8)
    ).colorInt.value

internal fun approximateToRgb888(color: Int): Int =
    approximateToRgb888(
        quantizedRed(color),
        quantizedGreen(color),
        quantizedBlue(color)
    )

internal fun comparableRed(color: Int) = color

internal fun comparableGreen(color: Int) =
    (quantizedGreen(color) shl (QUANTIZE_WORD_WIDTH + QUANTIZE_WORD_WIDTH)) or
            (quantizedRed(color) shl QUANTIZE_WORD_WIDTH) or
            quantizedBlue(color)

internal fun comparableBlue(color: Int) =
    (quantizedBlue(color) shl (QUANTIZE_WORD_WIDTH + QUANTIZE_WORD_WIDTH)) or
            (quantizedGreen(color) shl QUANTIZE_WORD_WIDTH) or
            quantizedRed(color)

private fun modifyWordWidth(value: Int, currentWidth: Int, targetWidth: Int): Int {
    val newValue = if (targetWidth > currentWidth) {
        // If we're approximating up in word width, we'll shift up
        value shl (targetWidth - currentWidth)
    } else {
        // Else, we will just shift and keep the MSB
        value shr (currentWidth - targetWidth)
    }

    return newValue and ((1 shl targetWidth) - 1)
}
