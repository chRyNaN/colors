@file:Suppress("unused")

package com.chrynan.colors.compose

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import com.chrynan.colors.theme.*

/**
 * Converts this [Colors] value to a Jetpack Compose [androidx.compose.material.Colors] value.
 */
fun Colors.toComposeColors(): androidx.compose.material.Colors =
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
            backgroundPrimary = background.toMultiplatformColor(),
            backgroundSecondary = surface.toMultiplatformColor(),
            error = error.toMultiplatformColor(),
            onPrimary = onPrimary.toMultiplatformColor(),
            onSecondary = onSecondary.toMultiplatformColor(),
            onBackgroundPrimary = onBackground.toMultiplatformColor(),
            onBackgroundSecondary = onSurface.toMultiplatformColor(),
            onError = onError.toMultiplatformColor()
        )
    } else {
        darkColors(
            primary = primary.toMultiplatformColor(),
            primaryVariant = primaryVariant.toMultiplatformColor(),
            secondary = secondary.toMultiplatformColor(),
            secondaryVariant = secondaryVariant.toMultiplatformColor(),
            backgroundPrimary = background.toMultiplatformColor(),
            backgroundSecondary = surface.toMultiplatformColor(),
            error = error.toMultiplatformColor(),
            onPrimary = onPrimary.toMultiplatformColor(),
            onSecondary = onSecondary.toMultiplatformColor(),
            onBackgroundPrimary = onBackground.toMultiplatformColor(),
            onBackgroundSecondary = onSurface.toMultiplatformColor(),
            onError = onError.toMultiplatformColor()
        )
    }

/**
 * Obtains the appropriate [Colors] instance of this [LightDarkColorTheme] depending on the result
 * of the [isSystemInDarkTheme] function. If [isSystemInDarkTheme] returns true, then the
 * [LightDarkColorTheme.dark] [Colors] will be returned. Otherwise, the [LightDarkColorTheme.light]
 * [Colors] will be returned.
 */
@Composable
fun LightDarkColorTheme.systemBasedColors(): Colors = if (isSystemInDarkTheme()) dark else light

@Composable
@ReadOnlyComposable
fun isSystemInDarkTheme(): Boolean = internalIsSystemInDarkTheme()

@Composable
@ReadOnlyComposable
internal fun internalIsSystemInDarkTheme(): Boolean = androidx.compose.foundation.isSystemInDarkTheme()

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
    colors = colors.toComposeColors(),
    typography = typography,
    shapes = shapes,
    content = content
)

/**
 * A Composable function to create a [MaterialTheme] with the provided [Colors] class.
 *
 * @see [MaterialTheme]
 */
@Composable
fun MaterialTheme(
    colorTheme: ColorTheme,
    typography: Typography = MaterialTheme.typography,
    shapes: Shapes = MaterialTheme.shapes,
    content: @Composable () -> Unit
) = MaterialTheme(
    colors = colorTheme.colors().toComposeColors(),
    typography = typography,
    shapes = shapes,
    content = content
)

/**
 * A Composable function to create a [MaterialTheme] with the provided [Colors] class.
 *
 * @see [MaterialTheme]
 */
@Composable
fun MaterialTheme(
    colorTheme: LightDarkColorTheme,
    typography: Typography = MaterialTheme.typography,
    shapes: Shapes = MaterialTheme.shapes,
    content: @Composable () -> Unit
) = MaterialTheme(
    colors = colorTheme.systemBasedColors().toComposeColors(),
    typography = typography,
    shapes = shapes,
    content = content
)
