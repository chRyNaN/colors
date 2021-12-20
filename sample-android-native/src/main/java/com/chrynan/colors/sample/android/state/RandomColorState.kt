package com.chrynan.colors.sample.android.state

import com.chrynan.colors.Color
import com.chrynan.presentation.Change
import com.chrynan.presentation.Intent
import com.chrynan.presentation.State

sealed class RandomColorState : State {

    data class DisplayingColor(
        val color: Color,
        val contentColor: Color,
        val secondaryContentColor: Color,
        val colorVariant: Color,
        val colorVariantContentColor: Color
    ) : RandomColorState()

    data class DisplayingError(val message: String) : RandomColorState()
}

sealed class RandomColorIntent : Intent {

    object GetRandomColor : RandomColorIntent() {

        override fun equals(other: Any?): Boolean = false
    }
}

sealed class RandomColorChange : Change {

    data class RetrievedColor(
        val color: Color,
        val contentColor: Color,
        val secondaryContentColor: Color,
        val colorVariant: Color,
        val colorVariantContentColor: Color
    ) : RandomColorChange()

    data class EncounteredError(val message: String) : RandomColorChange()
}
