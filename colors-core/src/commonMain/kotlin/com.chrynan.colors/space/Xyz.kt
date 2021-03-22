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
 * Implementation of the CIE XYZ color space. Assumes the white point is D50.
 */
class Xyz(
    name: String,
    id: Int
) : ColorSpace(
    name = name,
    model = ColorModel.XYZ,
    id = id
) {

    override val isWideGamut: Boolean
        get() = true

    override fun getMinValue(component: Int): Float = -2.0f

    override fun getMaxValue(component: Int): Float = 2.0f

    override fun toXyz(v: FloatArray): FloatArray {
        v[0] = clamp(v[0])
        v[1] = clamp(v[1])
        v[2] = clamp(v[2])
        return v
    }

    override fun fromXyz(v: FloatArray): FloatArray {
        v[0] = clamp(v[0])
        v[1] = clamp(v[1])
        v[2] = clamp(v[2])
        return v
    }

    private fun clamp(x: Float): Float = x.coerceIn(-2f, 2f)

    companion object
}
