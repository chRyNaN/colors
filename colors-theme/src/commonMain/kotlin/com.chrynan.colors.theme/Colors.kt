package com.chrynan.colors.theme

import com.chrynan.colors.Color

/**
 * Represents common colors used in an application theme. This component is useful for centralizing the colors for an
 * application, so it is easier to change the values in a single location and it will propagate properly throughout the
 * application.
 *
 * @see [ColorTheme] To support types or multiple sets of [Colors].
 */
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

    val accentPrimary: Color

    val accentSecondary: Color

    val onAccentPrimary: Color

    val onAccentSecondary: Color

    val isLight: Boolean

    companion object
}
