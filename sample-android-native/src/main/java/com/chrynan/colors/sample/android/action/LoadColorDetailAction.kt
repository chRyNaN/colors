package com.chrynan.colors.sample.android.action

import com.chrynan.colors.Color
import com.chrynan.colors.contrast
import com.chrynan.colors.sample.android.state.ColorDetailChange
import com.chrynan.colors.sample.android.state.ColorDetailIntent
import com.chrynan.colors.sample.android.state.ColorDetailState
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
                val textColor = if (namedColor.color.contrast(Color.White) > 0.5f) {
                    Color.White
                } else {
                    Color.Black
                }
                val secondaryTextColor = textColor.copy(component4 = textColor.alpha / 2)

                emit(
                    ColorDetailChange.Loaded(
                        namedColor = namedColor,
                        textColor = textColor,
                        secondaryTextColor = secondaryTextColor
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
