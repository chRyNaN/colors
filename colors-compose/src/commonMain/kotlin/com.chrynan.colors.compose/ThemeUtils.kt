@file:Suppress("unused")

package com.chrynan.colors.compose

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import androidx.compose.foundation.isSystemInDarkTheme
import com.chrynan.colors.theme.*

/**
 * typealias to [androidx.compose.material.Colors].
 */
typealias ComposeColors = androidx.compose.material.Colors

/**
 * Converts this [Colors] value to a Jetpack Compose [androidx.compose.material.Colors] value.
 */
fun Colors.toComposeColors(): ComposeColors =
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
fun ComposeColors.toMultiplatformColors(): Colors =
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
 * Obtains the appropriate [Colors] instance of this [LightOrDarkColorTheme] depending on the result
 * of the [isSystemInDarkTheme] function. If [isSystemInDarkTheme] returns true, then the
 * [LightOrDarkColorTheme.dark] [Colors] will be returned. Otherwise, the [LightOrDarkColorTheme.light]
 * [Colors] will be returned.
 */
@Composable
fun LightOrDarkColorTheme.systemBasedColors(): Colors =
    if (isSystemInDarkTheme()) dark else light

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
    colorTheme: LightOrDarkColorTheme,
    typography: Typography = MaterialTheme.typography,
    shapes: Shapes = MaterialTheme.shapes,
    content: @Composable () -> Unit
) = MaterialTheme(
    colors = colorTheme.systemBasedColors().toComposeColors(),
    typography = typography,
    shapes = shapes,
    content = content
)
