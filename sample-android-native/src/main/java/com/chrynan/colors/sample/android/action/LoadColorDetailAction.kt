package com.chrynan.colors.sample.android.action

import com.chrynan.colors.sample.android.state.ColorDetailChange
import com.chrynan.colors.sample.android.state.ColorDetailIntent
import com.chrynan.colors.sample.android.state.ColorDetailState
import com.chrynan.colors.sample.android.util.toColorData
import com.chrynan.presentation.Action
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class LoadColorDetailAction : Action<ColorDetailIntent.Load, ColorDetailState, ColorDetailChange> {

    override suspend fun perform(
        intent: ColorDetailIntent.Load,
        state: ColorDetailState?
    ): Flow<ColorDetailChange> =
        flow {
            emit(ColorDetailChange.StartedLoading(intent.namedColor))

            try {
                val namedColor = intent.namedColor

                emit(
                    ColorDetailChange.Loaded(
                        namedColor = namedColor,
                        colorData = namedColor.color.toColorData()
                    )
                )
            } catch (e: Exception) {
                emit(
                    ColorDetailChange.EncounteredError(
                        message = e.message ?: "Error loading color detail"
                    )
                )
            }
        }
}
