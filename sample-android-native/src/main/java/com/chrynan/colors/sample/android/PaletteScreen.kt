package com.chrynan.colors.sample.android

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chrynan.colors.Color
import com.chrynan.colors.compose.toJetpackComposeColor
import com.chrynan.colors.palette.Palette
import com.chrynan.colors.palette.Swatch
import com.chrynan.colors.palette.generate

@Composable
fun PaletteScreen() {
    val context = LocalContext.current

    val paletteState = remember { mutableStateOf<Palette?>(null) }

    LaunchedEffect(paletteState) {
        paletteState.value =
            Palette.generate(context = context, resourceId = R.drawable.palette_test_tertiary)
    }

    Column {
        LazyColumn {
            item {
                Image(
                    painter = painterResource(R.drawable.palette_test_tertiary),
                    contentDescription = "Palette test image."
                )
            }

            Log.d("Palette", "palette = ${paletteState.value}")

            if (paletteState.value != null) {
                paletteState.value?.dominantSwatch?.let { swatch ->
                    item {
                        SwatchLayout(swatch = swatch, title = "Dominant")
                    }
                }
                paletteState.value?.vibrantSwatch?.let { swatch ->
                    item {
                        SwatchLayout(swatch = swatch, title = "Vibrant")
                    }
                }
                paletteState.value?.vibrantLightSwatch?.let { swatch ->
                    item {
                        SwatchLayout(swatch = swatch, title = "Vibrant Light")
                    }
                }
                paletteState.value?.vibrantDarkSwatch?.let { swatch ->
                    item {
                        SwatchLayout(swatch = swatch, title = "Vibrant Dark")
                    }
                }
                paletteState.value?.mutedSwatch?.let { swatch ->
                    item {
                        SwatchLayout(swatch = swatch, title = "Muted")
                    }
                }
                paletteState.value?.mutedLightSwatch?.let { swatch ->
                    item {
                        SwatchLayout(swatch = swatch, title = "Muted Light")
                    }
                }
                paletteState.value?.mutedDarkSwatch?.let { swatch ->
                    item {
                        SwatchLayout(swatch = swatch, title = "Muted Dark")
                    }
                }
            }

            item {
                Box(modifier = Modifier.height(400.dp).fillMaxWidth())
            }
        }
    }
}

@Composable
private fun SwatchLayout(
    swatch: Swatch,
    title: String
) {
    val textColor = swatch.primaryOnColor

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .background(swatch.color.toJetpackComposeColor())
            .padding(vertical = 16.dp)
    ) {
        SwatchName(
            text = title,
            textColor = textColor
        )
    }
}

@Composable
private fun SwatchName(
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
            color = textColor.toJetpackComposeColor()
        )
    }
}
