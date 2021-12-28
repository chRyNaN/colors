package com.chrynan.colors.sample.android.action

import android.content.Context
import android.graphics.drawable.BitmapDrawable
import coil.ImageLoader
import coil.request.ImageRequest
import com.chrynan.colors.palette.Palette
import com.chrynan.colors.palette.generate
import com.chrynan.colors.sample.android.state.PaletteChange
import com.chrynan.colors.sample.android.state.PaletteIntent
import com.chrynan.colors.sample.android.state.PaletteState
import com.chrynan.presentation.Action
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class GeneratePaletteFromUriAction(
    private val context: Context,
    private val imageLoader: ImageLoader
) : Action<PaletteIntent.LoadUri, PaletteState, PaletteChange> {

    override suspend fun perform(
        intent: PaletteIntent.LoadUri,
        state: PaletteState?
    ): Flow<PaletteChange> = flow {
        emit(PaletteChange.StartedLoading)

        try {
            val request = ImageRequest.Builder(context)
                .data(intent.uri)
                .build()

            val result = imageLoader.execute(request)
            val drawable = result.drawable

            if (drawable is BitmapDrawable) {
                val palette = Palette.generate(drawable)

                emit(PaletteChange.Loaded(palette = palette))
            } else {
                emit(PaletteChange.EncounteredError(message = "Error generating palette."))
            }
        } catch (e: Exception) {
            emit(PaletteChange.EncounteredError(message = e.message ?: "Error generating palette."))
        }
    }
}
