package com.chrynan.colors.sample.android.composable

import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.chrynan.colors.Color
import com.chrynan.colors.NamedColor
import com.chrynan.colors.compose.toComposeColor

@Composable
internal fun NamedColorTextContent(
    namedColor: NamedColor,
    primaryTextColor: Color,
    secondaryTextColor: Color
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
            text = namedColor.name() ?: "",
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            color = primaryTextColor.toComposeColor()
        )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            text = namedColor.color.cssValue,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            color = secondaryTextColor.toComposeColor()
        )
    }
}

@Composable
internal fun NamedColorTextContent(
    text: String,
    textColor: Color
) {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        text = text,
        fontSize = 24.sp,
        color = textColor.toComposeColor()
    )
}
