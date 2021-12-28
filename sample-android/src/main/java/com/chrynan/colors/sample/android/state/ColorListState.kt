package com.chrynan.colors.sample.android.state

import com.chrynan.colors.NamedColor
import com.chrynan.presentation.Change
import com.chrynan.presentation.Intent
import com.chrynan.presentation.State

sealed class ColorListState : State {

    object Loading : ColorListState()

    data class DisplayingColors(val colors: List<NamedColor>) : ColorListState()

    data class DisplayingError(
        val message: String,
        val colors: List<NamedColor> = emptyList()
    ) : ColorListState()
}

sealed class ColorListIntent : Intent {

    object Load : ColorListIntent()
}

sealed class ColorListChange : Change {

    object StartedLoading : ColorListChange()

    data class Loaded(val colors: List<NamedColor>) : ColorListChange()

    data class EncounteredError(
        val message: String,
        val colors: List<NamedColor> = emptyList()
    ) : ColorListChange()
}
