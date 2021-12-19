@file:OptIn(ExperimentalNavigationApi::class)

package com.chrynan.colors.sample.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.BackHandler
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chrynan.colors.Color
import com.chrynan.colors.extension.Red
import com.chrynan.colors.compose.toComposeColor
import com.chrynan.colors.sample.android.navigation.ScreenIntent
import com.chrynan.colors.sample.android.screen.ColorDetailScreen
import com.chrynan.colors.sample.android.screen.ColorListScreen
import com.chrynan.colors.sample.android.screen.PaletteScreen
import com.chrynan.navigation.compose.*
import com.chrynan.presentation.compose.layout.unaryPlus

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navigator = rememberNavigatorByIntent<ScreenIntent>(ScreenIntent.ColorList) { key ->
                when (key) {
                    ScreenIntent.ColorList -> {
                        +ColorListScreen(onColorSelected = {
                            navigator.goTo(ScreenIntent.ColorDetail(namedColor = it))
                        })
                    }
                    is ScreenIntent.ColorDetail -> {
                        +ColorDetailScreen(namedColor = key.namedColor)
                    }
                    ScreenIntent.Palette -> {
                        PaletteScreen()
                    }
                }
            }

            BackHandler {
                navigator.goBack()
            }

            Scaffold(
                bottomBar = {
                    BottomBar(navigator)
                }
            ) {
                Column {
                    Toolbar()

                    NavContainer(navigator)
                }
            }
        }
    }

    @Composable
    private fun Toolbar() {
        TopAppBar {
            Box(modifier = Modifier.padding(8.dp)) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    text = "Colors",
                    textAlign = TextAlign.Start,
                    fontSize = 24.sp,
                    color = Color.White.toComposeColor()
                )
            }
        }
    }

    @Composable
    private fun BottomBar(navigator: ComposeNavigatorByKey<ScreenIntent>) {
        val currentKey by navigator.currentKeyAsState()

        BottomNavigation {
            listOf(ScreenIntent.ColorList, ScreenIntent.Palette).forEach {
                BottomNavigationItem(
                    selected = currentKey == it,
                    selectedContentColor = Color.Red.toComposeColor(),
                    unselectedContentColor = Color.White.toComposeColor(),
                    icon = {
                        Icon(it.icon, contentDescription = "")
                    },
                    label = {
                        Text(stringResource(it.title))
                    },
                    onClick = {
                        navigator.goTo(it)
                    }
                )
            }
        }
    }
}
