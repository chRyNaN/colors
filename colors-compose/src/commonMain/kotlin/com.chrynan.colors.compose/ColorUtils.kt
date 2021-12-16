@file:Suppress("unused")

package com.chrynan.colors.compose

import com.chrynan.colors.Color
import com.chrynan.colors.ColorLong

/**
 * Converts this [Color] to a Jetpack Compose compatible [androidx.compose.ui.graphics.Color].
 */
fun Color.toComposeColor(): ComposeColor = ComposeColor(colorLong.value.toULong())

/**
 * Converts this [androidx.compose.ui.graphics.Color] to a Kotlin Multiplatform compatible [Color].
 */
fun ComposeColor.toMultiplatformColor(): Color =
    Color(colorLong = ColorLong(value = value))
