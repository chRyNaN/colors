package com.chrynan.colors.sample.android.state

import com.chrynan.colors.palette.Palette
import com.chrynan.presentation.Change
import com.chrynan.presentation.Intent
import com.chrynan.presentation.State

sealed class PaletteState : State {

    object Loading : PaletteState()

    data class DisplayingLoaded(val palette: Palette) : PaletteState()

    data class DisplayingError(val message: String) : PaletteState()
}

sealed class PaletteIntent : Intent {

    data class LoadResource(val resourceId: Int) : PaletteIntent()

    data class LoadUri(val uri: String) : PaletteIntent()
}

sealed class PaletteChange : Change {

    object StartedLoading : PaletteChange()

    data class Loaded(val palette: Palette) : PaletteChange()

    data class EncounteredError(val message: String) : PaletteChange()
}
