@file:Suppress("unused")

package com.chrynan.colors.theme

import com.chrynan.colors.Color

fun lightColors(
    primary: Color = Color("#6200EE"),
    primaryVariant: Color = Color("#3700B3"),
    secondary: Color = Color("#03DAC6"),
    secondaryVariant: Color = Color("#018786"),
    background: Color = Color.WHITE,
    backgroundSecondary: Color = Color.WHITE,
    error: Color = Color("#B00020"),
    onPrimary: Color = Color.WHITE,
    onSecondary: Color = Color.BLACK,
    onBackground: Color = Color.BLACK,
    onBackgroundSecondary: Color = Color.BLACK,
    onError: Color = Color.WHITE,
    textPrimary: Color = onPrimary,
    textSecondary: Color = onSecondary,
    textTertiary: Color = Color.BLACK,
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
    onPrimary: Color = Color.BLACK,
    onSecondary: Color = Color.BLACK,
    onBackground: Color = Color.WHITE,
    onBackgroundSecondary: Color = Color.WHITE,
    onError: Color = Color.BLACK,
    textPrimary: Color = onPrimary,
    textSecondary: Color = onSecondary,
    textTertiary: Color = Color.WHITE,
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
