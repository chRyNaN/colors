package com.chrynan.colors.sample.android.action

import com.chrynan.colors.Color
import com.chrynan.colors.extension.namedColors
import com.chrynan.colors.sample.android.state.ColorListChange
import com.chrynan.colors.sample.android.state.ColorListIntent
import com.chrynan.colors.sample.android.state.ColorListState
import com.chrynan.presentation.Action
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class LoadColorsAction : Action<ColorListIntent.Load, ColorListState, ColorListChange> {

    override suspend fun perform(
        intent: ColorListIntent.Load,
        state: ColorListState?
    ): Flow<ColorListChange> =
        flow {
            emit(ColorListChange.StartedLoading)

            try {
                val colors = Color.namedColors.toList().sortedBy { it.name() }

                emit(ColorListChange.Loaded(colors = colors))
            } catch (e: Exception) {
                emit(
                    ColorListChange.EncounteredError(
                        message = e.message ?: "Error loading colors."
                    )
                )
            }
        }
}
