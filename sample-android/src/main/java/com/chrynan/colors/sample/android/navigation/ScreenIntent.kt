package com.chrynan.colors.sample.android.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Colorize
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Palette
import androidx.compose.material.icons.filled.Shuffle
import androidx.compose.ui.graphics.vector.ImageVector
import com.chrynan.colors.NamedColor
import com.chrynan.colors.sample.android.R

sealed class ScreenIntent(
    @StringRes val title: Int,
    val icon: ImageVector
) {

    object ColorList : ScreenIntent(
        title = R.string.screen_name_color_list,
        icon = Icons.Filled.List
    )

    data class ColorDetail(val namedColor: NamedColor) : ScreenIntent(
        title = R.string.screen_name_color_details,
        icon = Icons.Filled.Colorize
    )

    object Palette : ScreenIntent(
        title = R.string.screen_name_palette,
        icon = Icons.Filled.Palette
    )

    object RandomColor : ScreenIntent(
        title = R.string.screen_name_random_color,
        icon = Icons.Filled.Shuffle
    )
}
