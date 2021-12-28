package com.chrynan.colors.sample.android.reducer

import com.chrynan.colors.sample.android.state.PaletteChange
import com.chrynan.colors.sample.android.state.PaletteState
import com.chrynan.presentation.Reducer

class PaletteReducer : Reducer<PaletteState, PaletteChange> {

    override suspend fun reduce(previous: PaletteState?, change: PaletteChange): PaletteState =
        when (change) {
            is PaletteChange.StartedLoading -> PaletteState.Loading
            is PaletteChange.Loaded -> PaletteState.DisplayingLoaded(palette = change.palette)
            is PaletteChange.EncounteredError -> PaletteState.DisplayingError(message = change.message)
        }
}
