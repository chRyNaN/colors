package com.chrynan.colors.sample.android

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chrynan.colors.Color
import com.chrynan.colors.NamedColor
import com.chrynan.colors.contrast
import com.chrynan.colors.extension.namedColors
import com.chrynan.colors.jetpack.compose.toJetpackComposeColor

@Composable
@OptIn(ExperimentalUnsignedTypes::class)
fun ColorList(onColorSelected: (NamedColor) -> Unit) {
    LazyColumn {
        item {
            Box(modifier = Modifier.padding(16.dp)) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    text = "Colors",
                    textAlign = TextAlign.Center,
                    fontSize = 32.sp,
                    color = Color.WHITE.toJetpackComposeColor()
                )
            }
        }

        items(items = Color.namedColors.toList(), key = { it.color.colorLong.value }) {
            val textColor = if (it.color.contrast(Color.WHITE) > 0.5f) {
                Color.WHITE
            } else {
                Color.BLACK
            }

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(it.color.toJetpackComposeColor())
                    .clickable { onColorSelected.invoke(it) }
                    .padding(vertical = 16.dp)
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    text = it.name() ?: "",
                    fontSize = 24.sp,
                    textAlign = TextAlign.Center,
                    color = textColor.toJetpackComposeColor()
                )
            }
        }
    }
}
