package com.chrynan.colors.sample.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.*
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.chrynan.colors.Color
import com.chrynan.colors.NamedColor
import com.chrynan.colors.extension.RED
import com.chrynan.colors.compose.toJetpackComposeColor

@ExperimentalUnsignedTypes
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()

            Scaffold(
                bottomBar = {
                    BottomBar(navController)
                }
            ) {
                MainContent(navController)
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

    @Composable
    private fun BottomBar(navController: NavController) {
        val currentRoute = navController.currentBackStackEntry?.destination?.route

        BottomNavigation {
            listOf(Screens.Colors, Screens.Palette).forEach {
                BottomNavigationItem(
                    selected = currentRoute == it.route,
                    selectedContentColor = Color.RED.toJetpackComposeColor(),
                    unselectedContentColor = Color.WHITE.toJetpackComposeColor(),
                    icon = {
                        Icon(it.icon, contentDescription = "")
                    },
                    label = {
                        Text(stringResource(it.title))
                    },
                    onClick = {
                        navController.navigate(it.route)
                    }
                )
            }
        }
    }

    @Composable
    private fun MainContent(navController: NavHostController) {
        NavHost(navController = navController, startDestination = Screens.Colors.route) {
            navigation(startDestination = Screens.Colors.List.route, route = Screens.Colors.route) {
                composable(Screens.Colors.List.route) {
                    ColorListScreen(onColorSelected = {
                        navController.navigateToColorDetail(namedColor = it)
                    })
                }
                composable(
                    "${Screens.Colors.Detail.route}/{colorName}/{colorInt}?colorHex={colorHex}",
                    arguments = listOf(
                        navArgument("colorName") { type = NavType.StringType },
                        navArgument("colorInt") { type = NavType.IntType },
                        navArgument("colorHex") { type = NavType.StringType })
                ) { backStackEntry ->
                    val namedColor = backStackEntry.getNamedColorArgument()

                    ColorDetailScreen(namedColor = namedColor)
                }
            }
            composable(Screens.Palette.route) {
                PaletteScreen()
            }
        }
    }

    private fun NavController.navigateToColorDetail(namedColor: NamedColor) {
        val cssValue = namedColor.color.cssValue

        val path = if (cssValue.startsWith('#')) {
            "${Screens.Colors.Detail.route}/${namedColor.name()}/${namedColor.color.colorInt.value}?colorHex=${
                cssValue.substring(
                    startIndex = 1
                )
            }"
        } else {
            "${Screens.Colors.Detail.route}/${namedColor.name()}/${namedColor.color.colorInt.value}"
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
