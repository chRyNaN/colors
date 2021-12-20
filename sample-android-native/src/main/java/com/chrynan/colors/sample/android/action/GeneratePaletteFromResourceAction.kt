package com.chrynan.colors.sample.android.action

import android.content.Context
import com.chrynan.colors.palette.Palette
import com.chrynan.colors.palette.generate
import com.chrynan.colors.sample.android.state.PaletteChange
import com.chrynan.colors.sample.android.state.PaletteIntent
import com.chrynan.colors.sample.android.state.PaletteState
import com.chrynan.presentation.Action
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GeneratePaletteFromResourceAction(
    private val context: Context
) : Action<PaletteIntent.LoadResource, PaletteState, PaletteChange> {

    override suspend fun perform(
        intent: PaletteIntent.LoadResource,
        state: PaletteState?
    ): Flow<PaletteChange> = flow {
        emit(PaletteChange.StartedLoading)

        try {
            val palette = Palette.generate(context, intent.resourceId)

            emit(PaletteChange.Loaded(palette = palette))
        } catch (e: Exception) {
            emit(PaletteChange.EncounteredError(message = e.message ?: "Error generating palette."))
        }
    }
}
