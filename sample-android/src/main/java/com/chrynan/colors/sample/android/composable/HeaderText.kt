package com.chrynan.colors.sample.android.composable

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.chrynan.colors.Color
import com.chrynan.colors.compose.toComposeColor

@Composable
internal fun Header(text: String, color: Color) {
    Text(
        text = text,
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        color = color.toComposeColor()
    )
}
