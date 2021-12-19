package com.chrynan.colors.sample.android.reducer

import com.chrynan.colors.sample.android.state.ColorListChange
import com.chrynan.colors.sample.android.state.ColorListState
import com.chrynan.presentation.Reducer

class ColorListReducer : Reducer<ColorListState, ColorListChange> {

    override suspend fun reduce(
        previous: ColorListState?,
        change: ColorListChange
    ): ColorListState =
        when (change) {
            is ColorListChange.StartedLoading -> ColorListState.Loading
            is ColorListChange.Loaded -> ColorListState.DisplayingColors(colors = change.colors)
            is ColorListChange.EncounteredError -> ColorListState.DisplayingError(
                message = change.message,
                colors = change.colors
            )
        }
}
