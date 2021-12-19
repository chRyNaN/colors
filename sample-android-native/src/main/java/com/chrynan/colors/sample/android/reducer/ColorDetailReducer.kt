package com.chrynan.colors.sample.android.reducer

import com.chrynan.colors.RgbaColor
import com.chrynan.colors.sample.android.state.ColorDetailChange
import com.chrynan.colors.sample.android.state.ColorDetailState
import com.chrynan.presentation.Reducer
import com.chrynan.colors.hue
import com.chrynan.colors.lightness
import com.chrynan.colors.saturation

class ColorDetailReducer : Reducer<ColorDetailState, ColorDetailChange> {

    override suspend fun reduce(
        previous: ColorDetailState?,
        change: ColorDetailChange
    ): ColorDetailState =
        when (change) {
            is ColorDetailChange.StartedLoading -> ColorDetailState.Loading(change.namedColor)
            is ColorDetailChange.Loaded -> ColorDetailState.DisplayingColor(
                namedColor = change.namedColor,
                textColor = change.textColor,
                secondaryTextColor = change.secondaryTextColor,
                cssValue = change.namedColor.color.cssValue,
                colorInt = change.namedColor.color.colorInt.toString(),
                colorLong = change.namedColor.color.colorLong.toString(),
                hue = (change.namedColor.color as? RgbaColor)?.hue?.toString(),
                saturation = (change.namedColor.color as? RgbaColor)?.saturation?.toString(),
                lightness = (change.namedColor.color as? RgbaColor)?.lightness?.toString(),
                luminance = change.namedColor.color.luminance().toString(),
                colorModel = change.namedColor.color.colorSpace.model.toString(),
                colorSpace = change.namedColor.color.colorSpace.toString()
            )
            is ColorDetailChange.EncounteredError -> ColorDetailState.DisplayingError(change.message)
        }
}
