package com.chrynan.colors

/**
 * A typealias to an [Int] that is meant to represent a [Color] value in an [Long] form.
 * This is very similar to a [ColorInt] but allows for more precision.
 * This is similar to the "ColorLong" native representation on the Android platform.
 *
 * Note that where [ColorInt]s always contain ARGB components, a [ColorLong] always has
 * four components that depend on the Color Space Model. One of these components is always
 * alpha, but the other three components depend on the Color Space Model.
 */
typealias ColorLong = Long
