package com.chrynan.colors.sample.android

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chrynan.colors.Color
import com.chrynan.colors.NamedColor
import com.chrynan.colors.contrast
import com.chrynan.colors.jetpack.compose.toJetpackComposeColor

@Composable
@OptIn(ExperimentalUnsignedTypes::class)
fun ColorDetail(namedColor: NamedColor) {
    val textColor = if (namedColor.color.contrast(Color.WHITE) > 0.5f) {
        Color.WHITE
    } else {
        Color.BLACK
    }
    val secondaryTextColor = textColor.copy(component4 = textColor.alpha / 2)

    Box(
        modifier = Modifier
            .background(namedColor.color.toJetpackComposeColor())
            .padding(16.dp)
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        CollapsingToolbarLayout(toolbar = {
            Box(modifier = Modifier.height(240.dp).fillMaxWidth())
        }) {
            contentRow(header = "Name", headerTextColor = secondaryTextColor) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    text = namedColor.name() ?: "",
                    fontSize = 24.sp,
                    color = textColor.toJetpackComposeColor()
                )
            }

            contentRow(header = "CSS Value", headerTextColor = secondaryTextColor) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    text = namedColor.color.cssValue,
                    fontSize = 24.sp,
                    color = textColor.toJetpackComposeColor()
                )
            }

            contentRow(header = "Color Int", headerTextColor = secondaryTextColor) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    text = namedColor.color.colorInt.value.toString(),
                    fontSize = 24.sp,
                    color = textColor.toJetpackComposeColor()
                )
            }

            contentRow(header = "Color Long", headerTextColor = secondaryTextColor) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    text = namedColor.color.colorLong.value.toString(),
                    fontSize = 24.sp,
                    color = textColor.toJetpackComposeColor()
                )
            }

            item {
                Box(modifier = Modifier.height(320.dp))
            }
        }
    }
}

@OptIn(ExperimentalUnsignedTypes::class)
@Composable
fun header(text: String, color: Color) {
    Text(
        text = text,
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        color = color.toJetpackComposeColor()
    )
}

fun LazyListScope.contentRow(
    header: String,
    headerTextColor: Color,
    content: @Composable () -> Unit
) {
    item {
        Column(modifier = Modifier.padding(top = 16.dp)) {
            header(text = header, color = headerTextColor)
            content()
        }
    }
}
