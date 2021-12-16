@file:Suppress("unused")

package com.chrynan.compose.web

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ProvidableCompositionLocal
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import com.chrynan.colors.theme.Colors
import com.chrynan.colors.theme.lightColors
import kotlinx.browser.window

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
 * Determines whether the current system theme is set to dark mode.
 */
@Composable
@ReadOnlyComposable
fun isSystemInDarkTheme(): Boolean = internalIsSystemInDarkTheme()

@Composable
@ReadOnlyComposable
internal fun internalIsSystemInDarkTheme(): Boolean =
    window.matchMedia("(prefers-color-scheme: dark)").matches