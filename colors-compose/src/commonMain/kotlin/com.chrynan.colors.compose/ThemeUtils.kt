@file:Suppress("unused")

package com.chrynan.colors.compose

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable

@Composable
@ReadOnlyComposable
fun isSystemInDarkTheme(): Boolean = internalIsSystemInDarkTheme()

@Composable
@ReadOnlyComposable
internal expect fun internalIsSystemInDarkTheme(): Boolean
