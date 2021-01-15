@file:Suppress("unused")

package com.chrynan.colors.theme

import com.chrynan.colors.Color
import com.chrynan.colors.hex

fun lightColors(
    colorPrimary: Color = hex("#6200EE"),
    colorPrimaryVariant: Color = hex("#3700B3"),
    colorSecondary: Color = hex("#03DAC6"),
    colorSecondaryVariant: Color = hex("#018786"),
    colorBackground: Color = Color.WHITE,
    colorBackgroundSecondary: Color = Color.WHITE,
    colorError: Color = hex("#B00020"),
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

fun darkColors(
    colorPrimary: Color = hex("#6200EE"),
    colorPrimaryVariant: Color = hex("#3700B3"),
    colorSecondary: Color = hex("#03DAC6"),
    colorSecondaryVariant: Color = hex("#018786"),
    colorBackground: Color = Color.WHITE,
    colorBackgroundSecondary: Color = Color.WHITE,
    colorError: Color = hex("#B00020"),
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
    isLight = false
)
