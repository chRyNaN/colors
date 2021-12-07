package com.chrynan.colors.sample.android

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chrynan.colors.Color
import com.chrynan.colors.NamedColor
import com.chrynan.colors.contrast
import com.chrynan.colors.extension.namedColors
import com.chrynan.colors.compose.toJetpackComposeColor

@Composable
@OptIn(ExperimentalUnsignedTypes::class)
fun ColorListScreen(onColorSelected: (NamedColor) -> Unit) {
    LazyColumn {
        items(items = Color.namedColors.toList(), key = { it.color.colorLong.value }) {
            val textColor = if (it.color.contrast(Color.WHITE) > 0.5f) {
                Color.WHITE
            } else {
                Color.BLACK
            }
            val secondaryTextColor = textColor.copy(component4 = textColor.alpha / 2)

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp)
                    .background(it.color.toJetpackComposeColor())
                    .clickable { onColorSelected.invoke(it) }
                    .padding(vertical = 16.dp)
            ) {
                TextContent(
                    namedColor = it,
                    primaryTextColor = textColor,
                    secondaryTextColor = secondaryTextColor
                )
            }
        }
    }
}

@Composable
private fun TextContent(
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
            color = primaryTextColor.toJetpackComposeColor()
        )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            text = namedColor.color.cssValue,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            color = secondaryTextColor.toJetpackComposeColor()
        )
    }
}
