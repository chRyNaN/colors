@file:Suppress("unused")

package com.chrynan.colors.compose.web

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import kotlinx.browser.window

@Composable
@ReadOnlyComposable
internal actual fun internalIsSystemInDarkTheme(): Boolean =
    window.matchMedia("(prefers-color-scheme: dark)").matches
