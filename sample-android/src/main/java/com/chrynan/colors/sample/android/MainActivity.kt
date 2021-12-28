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
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import coil.compose.LocalImageLoader
import com.chrynan.colors.NamedColor
import com.chrynan.colors.compose.toComposeColor
import com.chrynan.colors.sample.android.data.ColorData
import com.chrynan.colors.sample.android.navigation.ScreenIntent
import com.chrynan.colors.sample.android.screen.ColorDetailScreen
import com.chrynan.colors.sample.android.screen.ColorListScreen
import com.chrynan.colors.sample.android.screen.PaletteScreen
import com.chrynan.colors.sample.android.screen.RandomColorScreen
import com.chrynan.navigation.compose.*
import com.chrynan.presentation.compose.layout.unaryPlus

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            var colors by remember { mutableStateOf(ColorData()) }
            val context = LocalContext.current
            val imageLoader = LocalImageLoader.current

            val navigator = rememberNavigatorByIntent<ScreenIntent>(ScreenIntent.ColorList) { key ->
                when (key) {
                    ScreenIntent.ColorList -> {
                        +ColorListScreen(
                            onColorSelected = {
                                navigator.goTo(ScreenIntent.ColorDetail(namedColor = it))
                            },
                            onChangeColorData = { colors = it })
                    }
                    is ScreenIntent.ColorDetail -> {
                        +ColorDetailScreen(
                            namedColor = key.namedColor,
                            onChangeColorData = { colors = it })
                    }
                    ScreenIntent.Palette -> {
                        +PaletteScreen(
                            context = context,
                            imageLoader = imageLoader,
                            onSwatchSelected = {
                                navigator.goTo(
                                    ScreenIntent.ColorDetail(
                                        namedColor = NamedColor(name = "", color = it.color)
                                    )
                                )
                            },
                            onChangeColorData = { colors = it })
                    }
                    ScreenIntent.RandomColor -> {
                        +RandomColorScreen(onChangeColorData = { colors = it })
                    }
                }
            }

            BackHandler {
                navigator.goBack()
            }

            Scaffold(
                bottomBar = {
                    BottomBar(navigator = navigator, colors = colors)
                }
            ) {
                Column(modifier = Modifier.padding(bottom = 48.dp)) {
                    NavContainer(navigator)
                }
            }
        }
    }

    @Composable
    private fun BottomBar(
        navigator: ComposeNavigatorByKey<ScreenIntent>,
        colors: ColorData
    ) {
        val currentKey by navigator.currentKeyAsState()

        BottomNavigation(backgroundColor = colors.background.toComposeColor(), elevation = 16.dp) {
            listOf(ScreenIntent.ColorList, ScreenIntent.RandomColor, ScreenIntent.Palette).forEach {
                BottomNavigationItem(
                    selected = currentKey == it,
                    selectedContentColor = colors.foregroundAccent.toComposeColor(),
                    unselectedContentColor = colors.foreground.toComposeColor(),
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
