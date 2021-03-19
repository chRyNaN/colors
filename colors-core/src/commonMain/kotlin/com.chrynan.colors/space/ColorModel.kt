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
 * A color model is required by a [ColorSpace] to describe the
 * way colors can be represented as tuples of numbers. A common color
 * model is the [RGB][RGB] color model which defines a color
 * as represented by a tuple of 3 numbers (red, green and blue).
 * The amount of components, [componentCount], range from 1 to 4.
 *
 * @property [componentCount] The number of components for this color model.
 * An integer between 1 and 4
 */
@Suppress("MemberVisibilityCanBePrivate")
enum class ColorModel(
    val componentCount: Int,
    val typeName: String
) {

    /**
     * The RGB model is a color model with 3 components that
     * refer to the three additive primiaries: red, green
     * and blue.
     */
    RGB(componentCount = 3, typeName = "rgb"),

    /**
     * The XYZ model is a color model with 3 components that
     * are used to model human color vision on a basic sensory
     * level.
     */
    XYZ(componentCount = 3, typeName = "xyz"),

    /**
     * The Lab model is a color model with 3 components used
     * to describe a color space that is more perceptually
     * uniform than XYZ.
     */
    LAB(componentCount = 3, typeName = "lab"),

    /**
     * The CMYK model is a color model with 4 components that
     * refer to four inks used in color printing: cyan, magenta,
     * yellow and black (or key). CMYK is a subtractive color
     * model.
     */
    CMYK(componentCount = 4, typeName = "cmyk");

    companion object {

        fun getByTypeName(typeName: String, ignoreCase: Boolean = true): ColorModel? =
            values().firstOrNull { it.typeName.equals(typeName, ignoreCase) }
    }
}
