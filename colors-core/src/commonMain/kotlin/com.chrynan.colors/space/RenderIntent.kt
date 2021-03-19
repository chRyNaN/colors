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
 * A render intent determines how a [connector][Connector]
 * maps colors from one color space to another. The choice of mapping is
 * important when the source color space has a larger color gamut than the
 * destination color space.
 *
 * A [RenderIntent] is used in the conversion process between different
 * Color Spaces. It's the approach used when calculating new color values
 * that within the new Color Space.
 *
 * @see [Render Intent Definition](http://colorwiki.com/wiki/Rendering_Intent)
 * @see ColorSpace.connect
 */
enum class RenderIntent(val typeName: String) {

    /**
     * Compresses the source gamut into the destination gamut.
     * This render intent affects all colors, inside and outside
     * of destination gamut. The goal of this render intent is
     * to preserve the visual relationship between colors.
     *
     * This render intent is currently not
     * implemented and behaves like [RELATIVE].
     */
    PERCEPTUAL(typeName = "perceptual"),

    /**
     * Similar to the [ABSOLUTE] render intent, this render
     * intent matches the closest color in the destination gamut
     * but makes adjustments for the destination white point.
     */
    RELATIVE(typeName = "relative"),

    /**
     * Attempts to maintain the relative saturation of colors
     * from the source gamut to the destination gamut, to keep
     * highly saturated colors as saturated as possible.
     *
     * This render intent is currently not
     * implemented and behaves like [RELATIVE].
     */
    SATURATION(typeName = "saturation"),

    /**
     * Colors that are in the destination gamut are left unchanged.
     * Colors that fall outside of the destination gamut are mapped
     * to the closest possible color within the gamut of the destination
     * color space (they are clipped).
     */
    ABSOLUTE(typeName = "absolute");

    companion object {

        fun getByTypeName(typeName: String, ignoreCase: Boolean = true): RenderIntent? =
            values().firstOrNull { it.typeName.equals(typeName, ignoreCase) }
    }
}
