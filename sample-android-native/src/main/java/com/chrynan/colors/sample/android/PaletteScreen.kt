package com.chrynan.colors.sample.android

import androidx.compose.foundation.Image
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource

@Composable
fun PaletteScreen() {
    LazyColumn {
        item {
            Image(
                painter = painterResource(R.drawable.palette_test_default),
                contentDescription = "Palette test image."
            )
        }
    }
}
