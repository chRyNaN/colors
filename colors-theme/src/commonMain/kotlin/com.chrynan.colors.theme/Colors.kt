package com.chrynan.colors.theme

import com.chrynan.colors.Color

interface Colors {

    val primary: Color

    val primaryVariant: Color

    val secondary: Color

    val secondaryVariant: Color

    val error: Color

    val backgroundPrimary: Color

    val backgroundSecondary: Color

    val onPrimary: Color

    val onSecondary: Color

    val onError: Color

    val onBackgroundPrimary: Color

    val onBackgroundSecondary: Color

    val textPrimary: Color

    val textSecondary: Color

    val textTertiary: Color

    val textError: Color

    val isLight: Boolean

    companion object
}
