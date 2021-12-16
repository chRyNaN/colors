package com.chrynan.colors.theme

import com.chrynan.colors.Color

data class SimpleColors internal constructor(
    override val primary: Color,
    override val primaryVariant: Color,
    override val secondary: Color,
    override val secondaryVariant: Color,
    override val error: Color,
    override val backgroundPrimary: Color,
    override val backgroundSecondary: Color,
    override val onPrimary: Color,
    override val onSecondary: Color,
    override val onError: Color,
    override val onBackgroundPrimary: Color,
    override val onBackgroundSecondary: Color,
    override val textPrimary: Color = onPrimary,
    override val textSecondary: Color = onSecondary,
    override val textTertiary: Color,
    override val textError: Color = onError,
    override val isLight: Boolean
) : Colors
