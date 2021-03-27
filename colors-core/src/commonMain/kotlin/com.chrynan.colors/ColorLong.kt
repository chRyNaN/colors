@file:Suppress("unused")

package com.chrynan.colors

import com.chrynan.colors.space.ColorModel

/**
 * An inline class wrapping a [Long] that is meant to represent a [Color] value in a [Long] form.
 * This is very similar to a [ColorInt] but allows for more precision. A common color model is the
 * [ColorModel.RGB] in which the components represent red, green and blue values.
 *
 * This is similar to the "ColorLong" native representation on the Android platform.
 *
 * Note that where [ColorInt]s always contain ARGB components, a [ColorLong] always has
 * four components that depend on the Color Space Model. One of these components is always
 * alpha, but the other three components depend on the Color Space Model.
 *
 * Note that while alpha is encoded in a color long using a 10 bit integer (thus using a range of
 * [0...1023]), it is converted to and from  float values when decoding and encoding color longs.
 *
 * Note that for compatibility reasons and ease of use, color longs encoding sRGB colors do not use
 * the same encoding as other color longs. In that case, they are more like [ColorInt]s.
 *
 * Note that the [ColorModel.CMYK] is unsupported for [ColorLong]s. The [ColorModel.CMYK] is
 * typically used for printing.
 *
 * @see [Android Color Long Documentation](https://developer.android.com/reference/android/graphics/Color.html#color-longs)
 */
inline class ColorLong(val value: Long)

/**
 * Creates a [ColorLong] instance with the provided [ULong] [value].
 */
// TODO make sure this logic is correct
@ExperimentalUnsignedTypes
fun ColorLong(value: ULong): ColorLong = ColorLong(value = value.toLong())
