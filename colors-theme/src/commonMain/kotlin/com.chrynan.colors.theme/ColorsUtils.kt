@file:Suppress("unused")

package com.chrynan.colors.theme

import com.chrynan.colors.Color

fun lightColors(
    primary: Color = Color("#6200EE"),
    primaryVariant: Color = Color("#3700B3"),
    secondary: Color = Color("#03DAC6"),
    secondaryVariant: Color = Color("#018786"),
    backgroundPrimary: Color = Color.White,
    backgroundSecondary: Color = Color.White,
    error: Color = Color("#B00020"),
    onPrimary: Color = Color.White,
    onSecondary: Color = Color.Black,
    onBackgroundPrimary: Color = Color.Black,
    onBackgroundSecondary: Color = Color.Black,
    onError: Color = Color.White,
    textPrimary: Color = onPrimary,
    textSecondary: Color = onSecondary,
    textTertiary: Color = Color.Black,
    textError: Color = onError
): Colors = SimpleColors(
    primary = primary,
    primaryVariant = primaryVariant,
    secondary = secondary,
    secondaryVariant = secondaryVariant,
    backgroundPrimary = backgroundPrimary,
    backgroundSecondary = backgroundSecondary,
    error = error,
    onPrimary = onPrimary,
    onSecondary = onSecondary,
    onBackgroundPrimary = onBackgroundPrimary,
    onBackgroundSecondary = onBackgroundSecondary,
    onError = onError,
    textPrimary = textPrimary,
    textSecondary = textSecondary,
    textTertiary = textTertiary,
    textError = textError,
    isLight = true
)

fun darkColors(
    primary: Color = Color("#BB86FC"),
    primaryVariant: Color = Color("#3700B3"),
    secondary: Color = Color("#03DAC6"),
    secondaryVariant: Color = Color("#121212"),
    backgroundPrimary: Color = Color("#121212"),
    backgroundSecondary: Color = Color("#121212"),
    error: Color = Color("#CF6679"),
    onPrimary: Color = Color.Black,
    onSecondary: Color = Color.Black,
    onBackgroundPrimary: Color = Color.White,
    onBackgroundSecondary: Color = Color.White,
    onError: Color = Color.Black,
    textPrimary: Color = onPrimary,
    textSecondary: Color = onSecondary,
    textTertiary: Color = Color.White,
    textError: Color = onError
): Colors = SimpleColors(
    primary = primary,
    primaryVariant = primaryVariant,
    secondary = secondary,
    secondaryVariant = secondaryVariant,
    backgroundPrimary = backgroundPrimary,
    backgroundSecondary = backgroundSecondary,
    error = error,
    onPrimary = onPrimary,
    onSecondary = onSecondary,
    onBackgroundPrimary = onBackgroundPrimary,
    onBackgroundSecondary = onBackgroundSecondary,
    onError = onError,
    textPrimary = textPrimary,
    textSecondary = textSecondary,
    textTertiary = textTertiary,
    textError = textError,
    isLight = false
)

val Colors.surface: Color
    get() = backgroundSecondary

val Colors.onSurface: Color
    get() = onBackgroundSecondary

fun Colors.copy(
    primary: Color = this.primary,
    primaryVariant: Color = this.primaryVariant,
    secondary: Color = this.secondary,
    secondaryVariant: Color = this.secondaryVariant,
    backgroundPrimary: Color = this.backgroundPrimary,
    backgroundSecondary: Color = this.backgroundSecondary,
    error: Color = this.error,
    onPrimary: Color = this.onPrimary,
    onSecondary: Color = this.onSecondary,
    onBackgroundPrimary: Color = this.onBackgroundPrimary,
    onBackgroundSecondary: Color = this.onBackgroundSecondary,
    onError: Color = this.onError,
    textPrimary: Color = this.textPrimary,
    textSecondary: Color = this.textSecondary,
    textTertiary: Color = this.textTertiary,
    textError: Color = this.textError,
    isLight: Boolean = this.isLight
): Colors = SimpleColors(
    primary = primary,
    primaryVariant = primaryVariant,
    secondary = secondary,
    secondaryVariant = secondaryVariant,
    backgroundPrimary = backgroundPrimary,
    backgroundSecondary = backgroundSecondary,
    error = error,
    onPrimary = onPrimary,
    onSecondary = onSecondary,
    onBackgroundPrimary = onBackgroundPrimary,
    onBackgroundSecondary = onBackgroundSecondary,
    onError = onError,
    textPrimary = textPrimary,
    textSecondary = textSecondary,
    textTertiary = textTertiary,
    textError = textError,
    isLight = isLight
)
