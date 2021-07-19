package com.chrynan.colors.sample.android

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ColorLens
import androidx.compose.material.icons.filled.Colorize
import androidx.compose.material.icons.filled.Palette
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screens(
    val route: String,
    @StringRes val title: Int,
    val icon: ImageVector
) {

    object Colors : Screens(
        route = "colors",
        title = R.string.screen_name_color_list,
        icon = Icons.Filled.Colorize
    ) {

        object List : Screens(
            route = "color_list",
            title = R.string.screen_name_color_list,
            icon = Icons.Filled.Colorize
        )

        object Detail : Screens(
            route = "color_details",
            title = R.string.screen_name_color_details,
            icon = Icons.Filled.Colorize
        )
    }

    object Palette : Screens(
        route = "palette",
        title = R.string.screen_name_palette,
        icon = Icons.Filled.Palette
    )
}
