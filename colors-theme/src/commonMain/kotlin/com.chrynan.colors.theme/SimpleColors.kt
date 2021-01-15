package com.chrynan.colors.theme

import com.chrynan.colors.Color

data class SimpleColors internal constructor(
    override val colorPrimary: Color,
    override val colorPrimaryVariant: Color,
    override val colorSecondary: Color,
    override val colorSecondaryVariant: Color,
    override val colorError: Color,
    override val colorBackgroundPrimary: Color,
    override val colorBackgroundSecondary: Color,
    override val colorOnPrimary: Color,
    override val colorOnSecondary: Color,
    override val colorOnError: Color,
    override val colorOnBackgroundPrimary: Color,
    override val colorOnBackgroundSecondary: Color,
    override val colorTextPrimary: Color = colorOnPrimary,
    override val colorTextSecondary: Color = colorOnSecondary,
    override val colorTextTertiary: Color,
    override val colorTextError: Color = colorOnError,
    override val isLight: Boolean
) : Colors
