package com.chrynan.colors.sample.android.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chrynan.colors.Color
import com.chrynan.colors.compose.toComposeColor
import com.chrynan.colors.palette.Swatch

@Suppress("FunctionName")
internal fun LazyListScope.SwatchItem(
    swatch: Swatch?,
    name: String,
    onClick: (Swatch) -> Unit
) {
    if (swatch != null) {
        item {
            Box(modifier = Modifier.clickable { onClick(swatch) }) {
                SwatchLayout(swatch = swatch, title = name)
            }
        }
    }
}

@Composable
internal fun SwatchLayout(
    swatch: Swatch,
    title: String
) {
    val textColor = swatch.primaryOnColor

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(swatch.color.toComposeColor())
            .padding(vertical = 16.dp)
    ) {
        SwatchName(
            text = title,
            textColor = textColor
        )
    }
}

@Composable
internal fun SwatchName(
    text: String,
    textColor: Color
) {
    Column(
        modifier = Modifier.fillMaxWidth()
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            text = text,
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            color = textColor.toComposeColor()
        )
    }
}
