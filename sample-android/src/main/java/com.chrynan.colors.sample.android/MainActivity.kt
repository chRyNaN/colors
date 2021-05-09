package com.chrynan.colors.sample.android

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview
import com.chrynan.colors.Color
import com.chrynan.colors.extension.namedColors
import com.chrynan.colors.jetpack.compose.toJetpackComposeColor

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                ColorsList()
            }
        }
    }

    @Composable
    @OptIn(ExperimentalUnsignedTypes::class)
    fun ColorsList() {
        LazyColumn {
            items(items = Color.namedColors.toList(), key = { it.color.colorLong }) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(100.dp)
                        .background(it.color.toJetpackComposeColor()),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .wrapContentHeight(),
                        text = it.name() ?: "",
                        fontSize = 48.sp,
                        textAlign = TextAlign.Start,
                        color = Color.WHITE.toJetpackComposeColor()
                    )
                }
            }
        }
    }

    @Preview
    @Composable
    fun Preview() {
        ColorsList()
    }
}
