@file:Suppress("unused")

package com.chrynan.colors.theme

import com.chrynan.colors.Color

@ExperimentalUnsignedTypes
fun lightColors(
    colorPrimary: Color = Color("#6200EE"),
    colorPrimaryVariant: Color = Color("#3700B3"),
    colorSecondary: Color = Color("#03DAC6"),
    colorSecondaryVariant: Color = Color("#018786"),
    colorBackground: Color = Color.WHITE,
    colorBackgroundSecondary: Color = Color.WHITE,
    colorError: Color = Color("#B00020"),
    colorOnPrimary: Color = Color.WHITE,
    colorOnSecondary: Color = Color.BLACK,
    colorOnBackground: Color = Color.BLACK,
    colorOnBackgroundSecondary: Color = Color.BLACK,
    colorOnError: Color = Color.WHITE,
    colorTextPrimary: Color = colorOnPrimary,
    colorTextSecondary: Color = colorOnSecondary,
    colorTextTertiary: Color = Color.BLACK,
    colorTextError: Color = colorOnError,
): Colors = SimpleColors(
    colorPrimary = colorPrimary,
    colorPrimaryVariant = colorPrimaryVariant,
    colorSecondary = colorSecondary,
    colorSecondaryVariant = colorSecondaryVariant,
    colorBackgroundPrimary = colorBackground,
    colorBackgroundSecondary = colorBackgroundSecondary,
    colorError = colorError,
    colorOnPrimary = colorOnPrimary,
    colorOnSecondary = colorOnSecondary,
    colorOnBackgroundPrimary = colorOnBackground,
    colorOnBackgroundSecondary = colorOnBackgroundSecondary,
    colorOnError = colorOnError,
    colorTextPrimary = colorTextPrimary,
    colorTextSecondary = colorTextSecondary,
    colorTextTertiary = colorTextTertiary,
    colorTextError = colorTextError,
    isLight = true
)

@ExperimentalUnsignedTypes
fun darkColors(
    colorPrimary: Color = Color("#BB86FC"),
    colorPrimaryVariant: Color = Color("#3700B3"),
    colorSecondary: Color = Color("#03DAC6"),
    colorSecondaryVariant: Color = Color("#121212"),
    colorBackground: Color = Color("#121212"),
    colorBackgroundSecondary: Color = Color("#121212"),
    colorError: Color = Color("#CF6679"),
    colorOnPrimary: Color = Color.BLACK,
    colorOnSecondary: Color = Color.BLACK,
    colorOnBackground: Color = Color.WHITE,
    colorOnBackgroundSecondary: Color = Color.WHITE,
    colorOnError: Color = Color.BLACK,
    colorTextPrimary: Color = colorOnPrimary,
    colorTextSecondary: Color = colorOnSecondary,
    colorTextTertiary: Color = Color.WHITE,
    colorTextError: Color = colorOnError,
): Colors = SimpleColors(
    colorPrimary = colorPrimary,
    colorPrimaryVariant = colorPrimaryVariant,
    colorSecondary = colorSecondary,
    colorSecondaryVariant = colorSecondaryVariant,
    colorBackgroundPrimary = colorBackground,
    colorBackgroundSecondary = colorBackgroundSecondary,
    colorError = colorError,
    colorOnPrimary = colorOnPrimary,
    colorOnSecondary = colorOnSecondary,
    colorOnBackgroundPrimary = colorOnBackground,
    colorOnBackgroundSecondary = colorOnBackgroundSecondary,
    colorOnError = colorOnError,
    colorTextPrimary = colorTextPrimary,
    colorTextSecondary = colorTextSecondary,
    colorTextTertiary = colorTextTertiary,
    colorTextError = colorTextError,
    isLight = false
)
