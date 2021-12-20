package com.chrynan.colors.sample.android.data

import com.chrynan.colors.Color
import com.chrynan.colors.extension.*
import com.chrynan.presentation.ViewData

data class ColorData(
    val background: Color = Color.CornflowerBlue,
    val foreground: Color = Color.White,
    val foregroundSecondary: Color = Color.White.copy(alpha = 0.5f),
    val foregroundAccent: Color = Color.Red
) : ViewData
