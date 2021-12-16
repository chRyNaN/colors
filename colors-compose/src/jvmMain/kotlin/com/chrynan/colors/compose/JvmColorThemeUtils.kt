@file:Suppress("unused")

package com.chrynan.colors.compose

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import com.chrynan.colors.theme.Colors
import com.chrynan.colors.theme.darkColors
import com.chrynan.colors.theme.lightColors

/**
 * Converts this [Colors] value to a Jetpack Compose [androidx.compose.material.Colors] value.
 */
fun Colors.toJetpackComposeColors(): androidx.compose.material.Colors =
    if (isLight) {
        androidx.compose.material.lightColors(
            primary = primary.toComposeColor(),
            primaryVariant = primaryVariant.toComposeColor(),
            secondary = secondary.toComposeColor(),
            secondaryVariant = secondaryVariant.toComposeColor(),
            background = backgroundPrimary.toComposeColor(),
            surface = backgroundSecondary.toComposeColor(),
            error = error.toComposeColor(),
            onPrimary = onPrimary.toComposeColor(),
            onSecondary = onSecondary.toComposeColor(),
            onBackground = onBackgroundPrimary.toComposeColor(),
            onSurface = onBackgroundSecondary.toComposeColor(),
            onError = onError.toComposeColor()
        )
    } else {
        androidx.compose.material.darkColors(
            primary = primary.toComposeColor(),
            primaryVariant = primaryVariant.toComposeColor(),
            secondary = secondary.toComposeColor(),
            background = backgroundPrimary.toComposeColor(),
            surface = backgroundSecondary.toComposeColor(),
            error = error.toComposeColor(),
            onPrimary = onPrimary.toComposeColor(),
            onSecondary = onSecondary.toComposeColor(),
            onBackground = onBackgroundPrimary.toComposeColor(),
            onSurface = onBackgroundSecondary.toComposeColor(),
            onError = onError.toComposeColor()
        )
    }

/**
 * Converts this [androidx.compose.material.Colors] value to a Kotlin Multiplatform [Colors] value.
 */
fun androidx.compose.material.Colors.toMultiplatformColors(): Colors =
    if (isLight) {
        lightColors(
            primary = primary.toMultiplatformColor(),
            primaryVariant = primaryVariant.toMultiplatformColor(),
            secondary = secondary.toMultiplatformColor(),
            secondaryVariant = secondaryVariant.toMultiplatformColor(),
            background = background.toMultiplatformColor(),
            backgroundSecondary = surface.toMultiplatformColor(),
            error = error.toMultiplatformColor(),
            onPrimary = onPrimary.toMultiplatformColor(),
            onSecondary = onSecondary.toMultiplatformColor(),
            onBackground = onBackground.toMultiplatformColor(),
            onBackgroundSecondary = onSurface.toMultiplatformColor(),
            onError = onError.toMultiplatformColor()
        )
    } else {
        darkColors(
            primary = primary.toMultiplatformColor(),
            primaryVariant = primaryVariant.toMultiplatformColor(),
            secondary = secondary.toMultiplatformColor(),
            secondaryVariant = secondaryVariant.toMultiplatformColor(),
            background = background.toMultiplatformColor(),
            backgroundSecondary = surface.toMultiplatformColor(),
            error = error.toMultiplatformColor(),
            onPrimary = onPrimary.toMultiplatformColor(),
            onSecondary = onSecondary.toMultiplatformColor(),
            onBackground = onBackground.toMultiplatformColor(),
            onBackgroundSecondary = onSurface.toMultiplatformColor(),
            onError = onError.toMultiplatformColor()
        )
    }

/**
 * A Composable function to create a [MaterialTheme] with the provided [Colors] class.
 *
 * @see [MaterialTheme]
 */
@Composable
fun MaterialTheme(
    colors: Colors,
    typography: Typography = MaterialTheme.typography,
    shapes: Shapes = MaterialTheme.shapes,
    content: @Composable () -> Unit
) = MaterialTheme(
    colors = colors.toJetpackComposeColors(),
    typography = typography,
    shapes = shapes,
    content = content
)

@Composable
@ReadOnlyComposable
internal actual fun internalIsSystemInDarkTheme(): Boolean = androidx.compose.foundation.isSystemInDarkTheme()
