@file:Suppress("unused")

package com.chrynan.colors.compose

import androidx.compose.material.MaterialTheme
import androidx.compose.material.Shapes
import androidx.compose.material.Typography
import androidx.compose.runtime.Composable
import com.chrynan.colors.theme.Colors
import com.chrynan.colors.theme.darkColors
import com.chrynan.colors.theme.lightColors

/**
 * Converts this [Colors] value to a Jetpack Compose [androidx.compose.material.Colors] value.
 */
fun Colors.toJetpackComposeColors(): androidx.compose.material.Colors =
    if (isLight) {
        androidx.compose.material.lightColors(
            primary = colorPrimary.toJetpackComposeColor(),
            primaryVariant = colorPrimaryVariant.toJetpackComposeColor(),
            secondary = colorSecondary.toJetpackComposeColor(),
            secondaryVariant = colorSecondaryVariant.toJetpackComposeColor(),
            background = colorBackgroundPrimary.toJetpackComposeColor(),
            surface = colorBackgroundSecondary.toJetpackComposeColor(),
            error = colorError.toJetpackComposeColor(),
            onPrimary = colorOnPrimary.toJetpackComposeColor(),
            onSecondary = colorOnSecondary.toJetpackComposeColor(),
            onBackground = colorOnBackgroundPrimary.toJetpackComposeColor(),
            onSurface = colorOnBackgroundSecondary.toJetpackComposeColor(),
            onError = colorOnError.toJetpackComposeColor()
        )
    } else {
        androidx.compose.material.darkColors(
            primary = colorPrimary.toJetpackComposeColor(),
            primaryVariant = colorPrimaryVariant.toJetpackComposeColor(),
            secondary = colorSecondary.toJetpackComposeColor(),
            background = colorBackgroundPrimary.toJetpackComposeColor(),
            surface = colorBackgroundSecondary.toJetpackComposeColor(),
            error = colorError.toJetpackComposeColor(),
            onPrimary = colorOnPrimary.toJetpackComposeColor(),
            onSecondary = colorOnSecondary.toJetpackComposeColor(),
            onBackground = colorOnBackgroundPrimary.toJetpackComposeColor(),
            onSurface = colorOnBackgroundSecondary.toJetpackComposeColor(),
            onError = colorOnError.toJetpackComposeColor()
        )
    }

/**
 * Converts this [androidx.compose.material.Colors] value to a Kotlin Multiplatform [Colors] value.
 */
fun androidx.compose.material.Colors.toMultiplatformColors(): Colors =
    if (isLight) {
        lightColors(
            colorPrimary = primary.toMultiplatformColor(),
            colorPrimaryVariant = primaryVariant.toMultiplatformColor(),
            colorSecondary = secondary.toMultiplatformColor(),
            colorSecondaryVariant = secondaryVariant.toMultiplatformColor(),
            colorBackground = background.toMultiplatformColor(),
            colorBackgroundSecondary = surface.toMultiplatformColor(),
            colorError = error.toMultiplatformColor(),
            colorOnPrimary = onPrimary.toMultiplatformColor(),
            colorOnSecondary = onSecondary.toMultiplatformColor(),
            colorOnBackground = onBackground.toMultiplatformColor(),
            colorOnBackgroundSecondary = onSurface.toMultiplatformColor(),
            colorOnError = onError.toMultiplatformColor()
        )
    } else {
        darkColors(
            colorPrimary = primary.toMultiplatformColor(),
            colorPrimaryVariant = primaryVariant.toMultiplatformColor(),
            colorSecondary = secondary.toMultiplatformColor(),
            colorSecondaryVariant = secondaryVariant.toMultiplatformColor(),
            colorBackground = background.toMultiplatformColor(),
            colorBackgroundSecondary = surface.toMultiplatformColor(),
            colorError = error.toMultiplatformColor(),
            colorOnPrimary = onPrimary.toMultiplatformColor(),
            colorOnSecondary = onSecondary.toMultiplatformColor(),
            colorOnBackground = onBackground.toMultiplatformColor(),
            colorOnBackgroundSecondary = onSurface.toMultiplatformColor(),
            colorOnError = onError.toMultiplatformColor()
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