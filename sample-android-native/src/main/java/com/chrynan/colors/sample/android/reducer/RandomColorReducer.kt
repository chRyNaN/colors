package com.chrynan.colors.sample.android.reducer

import com.chrynan.colors.sample.android.state.RandomColorChange
import com.chrynan.colors.sample.android.state.RandomColorState
import com.chrynan.presentation.Reducer

class RandomColorReducer : Reducer<RandomColorState, RandomColorChange> {

    override suspend fun reduce(
        previous: RandomColorState?,
        change: RandomColorChange
    ): RandomColorState =
        when (change) {
            is RandomColorChange.RetrievedColor -> RandomColorState.DisplayingColor(
                color = change.color,
                contentColor = change.contentColor,
                secondaryContentColor = change.secondaryContentColor,
                colorVariant = change.colorVariant,
                colorVariantContentColor = change.colorVariantContentColor
            )
            is RandomColorChange.EncounteredError -> RandomColorState.DisplayingError(message = change.message)
        }
}
