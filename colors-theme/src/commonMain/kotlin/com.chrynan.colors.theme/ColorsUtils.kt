@file:Suppress("unused")

package com.chrynan.colors.theme

import com.chrynan.colors.Color

/**
 * Constructs a [Colors] instance where the [Colors.isLight] value returns `true`.
 */
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
    textError: Color = onError,
    accentPrimary: Color = secondary,
    accentSecondary: Color = secondaryVariant,
    onAccentPrimary: Color = onSecondary,
    onAccentSecondary: Color = onSecondary
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
    accentPrimary = accentPrimary,
    accentSecondary = accentSecondary,
    onAccentPrimary = onAccentPrimary,
    onAccentSecondary = onAccentSecondary,
    isLight = true
)

/**
 * Constructs a [Colors] instance where the [Colors.isLight] value returns `false`.
 */
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
    textError: Color = onError,
    accentPrimary: Color = secondary,
    accentSecondary: Color = secondaryVariant,
    onAccentPrimary: Color = onSecondary,
    onAccentSecondary: Color = onSecondary
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
    accentPrimary = accentPrimary,
    accentSecondary = accentSecondary,
    onAccentPrimary = onAccentPrimary,
    onAccentSecondary = onAccentSecondary,
    isLight = false
)

/**
 * A convenience property delegating to the [Colors.backgroundSecondary] property. This is to be inline with the
 * Jetpack Compose Material Design Colors instance.
 */
val Colors.surface: Color
    get() = backgroundSecondary

/**
 * A convenience property delegating to the [Colors.onBackgroundSecondary] property. This is to be inline with the
 * Jetpack Compose Material Design Colors instance.
 */
val Colors.onSurface: Color
    get() = onBackgroundSecondary

/**
 * Creates a shallow copy of this [Colors] instance overriding the provided parameter values. This is similar to
 * performing a copy on a data class. If a parameter value is not provided, this [Colors] corresponding value will be
 * used instead.
 */
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
    accentPrimary: Color = this.accentPrimary,
    accentSecondary: Color = this.accentSecondary,
    onAccentPrimary: Color = this.onAccentPrimary,
    onAccentSecondary: Color = this.onAccentSecondary,
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
    accentPrimary = accentPrimary,
    accentSecondary = accentSecondary,
    onAccentPrimary = onAccentPrimary,
    onAccentSecondary = onAccentSecondary,
    isLight = isLight
)
