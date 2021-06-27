package com.chrynan.colors.sample.android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.chrynan.colors.Color
import com.chrynan.colors.NamedColor

@ExperimentalUnsignedTypes
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            val navController = rememberNavController()

            NavHost(navController = navController, startDestination = "color_list") {
                composable("color_list") { ColorList(onColorSelected = { navController.navigate("color_detail/${it.name()}/${it.color.colorInt.value}") }) }
                composable(
                    "color_detail/{colorName}/{colorInt}",
                    arguments = listOf(
                        navArgument("colorName") { type = NavType.StringType },
                        navArgument("colorInt") { type = NavType.IntType })
                ) { backStackEntry ->
                    val colorName = backStackEntry.arguments?.getString("colorName")
                    val colorInt = backStackEntry.arguments?.getInt("colorInt")
                    val namedColor = NamedColor(name = colorName!!, color = Color(colorInt!!))

                    ColorDetail(namedColor = namedColor)
                }
            }
        }
    }
}
