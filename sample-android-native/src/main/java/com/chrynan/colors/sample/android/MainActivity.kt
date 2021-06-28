package com.chrynan.colors.sample.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavBackStackEntry
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.chrynan.colors.Color
import com.chrynan.colors.NamedColor
import com.chrynan.colors.jetpack.compose.toJetpackComposeColor

@ExperimentalUnsignedTypes
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()

            Column {
                // Toolbar()

                NavHost(navController = navController, startDestination = "color_list") {
                    composable("color_list") {
                        ColorList(onColorSelected = {
                            navController.navigateToColorDetail(namedColor = it)
                        })
                    }
                    composable(
                        "color_detail/{colorName}/{colorInt}?colorHex={colorHex}",
                        arguments = listOf(
                            navArgument("colorName") { type = NavType.StringType },
                            navArgument("colorInt") { type = NavType.IntType },
                            navArgument("colorHex") { type = NavType.StringType })
                    ) { backStackEntry ->
                        val namedColor = backStackEntry.getNamedColorArgument()

                        ColorDetail(namedColor = namedColor)
                    }
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
                    color = Color.WHITE.toJetpackComposeColor()
                )
            }
        }
    }

    private fun NavController.navigateToColorDetail(namedColor: NamedColor) {
        val cssValue = namedColor.color.cssValue

        val path = if (cssValue.startsWith('#')) {
            "color_detail/${namedColor.name()}/${namedColor.color.colorInt.value}?colorHex=${
                cssValue.substring(
                    startIndex = 1
                )
            }"
        } else {
            "color_detail/${namedColor.name()}/${namedColor.color.colorInt.value}"
        }

        navigate(path)
    }

    private fun NavBackStackEntry.getNamedColorArgument(): NamedColor {
        val colorName = arguments?.getString("colorName")!!
        val colorInt = arguments?.getInt("colorInt")!!
        val colorHex = arguments?.getString("colorHex")

        val color = colorHex?.let { Color("#$it") } ?: Color(colorInt)

        return NamedColor(
            name = colorName,
            color = color
        )
    }
}
