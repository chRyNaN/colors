package com.chrynan.colors.theme

import com.chrynan.colors.Color

interface Colors {

    val colorPrimary: Color

    val colorPrimaryVariant: Color

    val colorSecondary: Color

    val colorSecondaryVariant: Color

    val colorError: Color

    val colorBackgroundPrimary: Color

    val colorBackgroundSecondary: Color

    val colorOnPrimary: Color

    val colorOnSecondary: Color

    val colorOnError: Color

    val colorOnBackgroundPrimary: Color

    val colorOnBackgroundSecondary: Color

    val colorTextPrimary: Color

    val colorTextSecondary: Color

    val colorTextTertiary: Color

    val colorTextError: Color

    val isLight: Boolean

    companion object
}
