@file:Suppress("unused")

package com.chrynan.colors.compose.web

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import com.chrynan.colors.theme.Colors
import com.chrynan.colors.theme.LightOrDarkColorTheme
import com.chrynan.colors.theme.lightColors

/**
 * A [ProvidableCompositionLocal] of the [Colors] interface.
 *
 * To access this value in a [Composable] function, simply access the `current` value:
 * ``` kotlin
 * LocalColors.current
 * ```
 *
 * To provide a new local color value, simply use the `CompositionLocalProvider` function:
 * ``` kotlin
 * CompositionLocalProvider(LocalColors provides colors) {
 *     LocalColors.current
 * }
 * ```
 */
val LocalColors: ProvidableCompositionLocal<Colors> = staticCompositionLocalOf {
    lightColors()
}

/**
 * Obtains the appropriate [Colors] instance of this [LightOrDarkColorTheme] depending on the result
 * of the [isSystemInDarkTheme] function. If [isSystemInDarkTheme] returns true, then the
 * [LightOrDarkColorTheme.dark] [Colors] will be returned. Otherwise, the [LightOrDarkColorTheme.light]
 * [Colors] will be returned.
 */
@Composable
fun LightOrDarkColorTheme.systemBasedColors(): Colors = if (isSystemInDarkTheme()) dark else light

/**
 * Determines whether the current system theme is set to dark mode.
 */
@Composable
@ReadOnlyComposable
fun isSystemInDarkTheme(): Boolean = internalIsSystemInDarkTheme()

@Composable
@ReadOnlyComposable
internal expect fun internalIsSystemInDarkTheme(): Boolean
