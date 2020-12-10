package com.chrynan.colors

/**
 * A typealias to an [Int] that is meant to represent a [Color] value in an [Int] form.
 * This [Int] should have all of the necessary color information encoded into it. The
 * [Int] should be a packed color value, in the SRGB Color Space, in the form `AARRGGBB`.
 * This is similar to the "ColorInt" native representation on the Android platform.
 *
 * ## ColorInt Components:
 * | Component | Name  | Size   | Range     |
 * |-----------|-------|--------|-----------|
 * | A         | Alpha | 8 Bits | [0...255] |
 * | R         | Red   | 8 Bits | [0...255] |
 * | G         | Green | 8 Bits | [0...255] |
 * | B         | Blue  | 8 Bits | [0...255] |
 *
 * The components in the above table are listed in encoding order, which is why
 * [ColorInt]s are called "ARGB" colors.
 *
 */
typealias ColorInt = Int
