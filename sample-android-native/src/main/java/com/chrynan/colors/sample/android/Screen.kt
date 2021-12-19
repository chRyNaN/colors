package com.chrynan.colors.sample.android

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Colorize
import androidx.compose.material.icons.filled.Palette
import androidx.compose.ui.graphics.vector.ImageVector
import com.chrynan.colors.NamedColor
import com.chrynan.navigation.NavigationIntent

sealed class Screen(
    @StringRes val title: Int,
    val icon: ImageVector
) : NavigationIntent {

    object ColorList : Screen(
        title = R.string.screen_name_color_list,
        icon = Icons.Filled.Colorize
    )

    data class ColorDetail(val namedColor: NamedColor) : Screen(
        title = R.string.screen_name_color_details,
        icon = Icons.Filled.Colorize
    )

    object Palette : Screen(
        title = R.string.screen_name_palette,
        icon = Icons.Filled.Palette
    )
}
