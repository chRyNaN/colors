/** Note that this is adapted from the open source Jetpack Compose library with the following license: */

/*
 * Copyright 2019 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@file:Suppress("unused")

package com.chrynan.colors.space

/**
 * Class for constructing white points used in [RGB][Rgb] color space. The value is
 * stored in the CIE xyY color space. The Y component of the white point is assumed
 * to be 1.
 *
 * A [WhitePoint] is used to determine the coordinate of a base white value for an
 * image. It should be the coordinate within an image, or 2-D pixel matrix, that
 * contains the color that is the closest to white within the image. This is useful
 * when converting between Color Spaces for different conversion algorithms and
 * [RenderIntent]s.
 *
 * @see [Definition One](http://www.colorwiki.com/wiki/White_Point)
 * @see [Definition Two](https://en.wikipedia.org/wiki/White_point)
 *
 * @see Illuminant
 */
data class WhitePoint(
    val x: Float,
    val y: Float
) {

    /**
     * Illuminant for CIE XYZ white point
     */
    constructor(x: Float, y: Float, z: Float) : this(x, y, z, x + y + z)

    @Suppress("UNUSED_PARAMETER")
    private constructor(x: Float, y: Float, z: Float, sum: Float) : this(x / sum, y / sum)

    /**
     * Converts a value from CIE xyY to CIE XYZ. Y is assumed to be 1 so the
     * input xyY array only contains the x and y components.
     *
     * @return A new float array of length 3 containing XYZ values
     */
    fun toXyz(): FloatArray = floatArrayOf(x / y, 1.0f, (1f - x - y) / y)
}
