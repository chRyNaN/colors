package com.chrynan.colors.sample.android.state

import com.chrynan.colors.Color
import com.chrynan.colors.NamedColor
import com.chrynan.colors.sample.android.data.ColorData
import com.chrynan.presentation.Change
import com.chrynan.presentation.Intent
import com.chrynan.presentation.State

sealed class ColorDetailState : State {

    data class Loading(val namedColor: NamedColor) : ColorDetailState()

    data class DisplayingColor(
        val namedColor: NamedColor,
        val colorData: ColorData,
        val textColor: Color,
        val secondaryTextColor: Color,
        val cssValue: String,
        val colorInt: String,
        val colorLong: String,
        val hue: String?,
        val saturation: String?,
        val lightness: String?,
        val luminance: String,
        val colorModel: String,
        val colorSpace: String
    ) : ColorDetailState()

    data class DisplayingError(
        val message: String
    ) : ColorDetailState()
}

sealed class ColorDetailIntent : Intent {

    data class Load(val namedColor: NamedColor) : ColorDetailIntent()
}

sealed class ColorDetailChange : Change {

    data class StartedLoading(val namedColor: NamedColor) : ColorDetailChange()

    data class Loaded(
        val namedColor: NamedColor,
        val colorData: ColorData
    ) : ColorDetailChange()

    data class EncounteredError(
        val message: String
    ) : ColorDetailChange()
}
