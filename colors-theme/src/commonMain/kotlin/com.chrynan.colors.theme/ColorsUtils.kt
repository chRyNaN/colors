@file:Suppress("unused")

package com.chrynan.colors.theme

import com.chrynan.colors.Color

fun lightColors(
    primary: Color = Color("#6200EE"),
    primaryVariant: Color = Color("#3700B3"),
    secondary: Color = Color("#03DAC6"),
    secondaryVariant: Color = Color("#018786"),
    background: Color = Color.White,
    backgroundSecondary: Color = Color.White,
    error: Color = Color("#B00020"),
    onPrimary: Color = Color.White,
    onSecondary: Color = Color.Black,
    onBackground: Color = Color.Black,
    onBackgroundSecondary: Color = Color.Black,
    onError: Color = Color.White,
    textPrimary: Color = onPrimary,
    textSecondary: Color = onSecondary,
    textTertiary: Color = Color.Black,
    textError: Color = onError,
): Colors = SimpleColors(
    primary = primary,
    primaryVariant = primaryVariant,
    secondary = secondary,
    secondaryVariant = secondaryVariant,
    backgroundPrimary = background,
    backgroundSecondary = backgroundSecondary,
    error = error,
    onPrimary = onPrimary,
    onSecondary = onSecondary,
    onBackgroundPrimary = onBackground,
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
    background: Color = Color("#121212"),
    backgroundSecondary: Color = Color("#121212"),
    error: Color = Color("#CF6679"),
    onPrimary: Color = Color.Black,
    onSecondary: Color = Color.Black,
    onBackground: Color = Color.White,
    onBackgroundSecondary: Color = Color.White,
    onError: Color = Color.Black,
    textPrimary: Color = onPrimary,
    textSecondary: Color = onSecondary,
    textTertiary: Color = Color.White,
    textError: Color = onError,
): Colors = SimpleColors(
    primary = primary,
    primaryVariant = primaryVariant,
    secondary = secondary,
    secondaryVariant = secondaryVariant,
    backgroundPrimary = background,
    backgroundSecondary = backgroundSecondary,
    error = error,
    onPrimary = onPrimary,
    onSecondary = onSecondary,
    onBackgroundPrimary = onBackground,
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
