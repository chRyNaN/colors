package com.chrynan.colors.sample.android.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chrynan.colors.Color
import com.chrynan.colors.compose.toComposeColor

@Composable
internal fun Toolbar(
    titleText: String = "Colors",
    backgroundColor: Color,
    textColor: Color
) {
    TopAppBar(
        backgroundColor = backgroundColor.toComposeColor()
    ) {
        Box(modifier = Modifier.padding(8.dp)) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                text = titleText,
                textAlign = TextAlign.Start,
                fontSize = 24.sp,
                color = textColor.toComposeColor()
            )
        }
    }
}
