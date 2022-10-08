package com.chrynan.colors.sample.android.screen

import android.annotation.SuppressLint
import android.content.Context
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import coil.ImageLoader
import com.chrynan.colors.palette.Swatch
import com.chrynan.colors.sample.android.R
import com.chrynan.colors.sample.android.action.GeneratePaletteFromResourceAction
import com.chrynan.colors.sample.android.action.GeneratePaletteFromUriAction
import com.chrynan.colors.sample.android.composable.SwatchItem
import com.chrynan.colors.sample.android.data.ColorData
import com.chrynan.colors.sample.android.presenter.PalettePresenter
import com.chrynan.colors.sample.android.reducer.PaletteReducer
import com.chrynan.colors.sample.android.state.PaletteChange
import com.chrynan.colors.sample.android.state.PaletteIntent
import com.chrynan.colors.sample.android.state.PaletteState
import com.chrynan.colors.sample.android.util.toColorData
import com.chrynan.presentation.ViewModel
import com.chrynan.presentation.compose.layout.Layout
import com.chrynan.presentation.compose.stateChanges
import com.chrynan.presentation.intent
import com.chrynan.presentation.viewModelFactory
import com.chrynan.ui.components.image.AsyncImage

class PaletteScreen(
    private val context: Context,
    private val imageLoader: ImageLoader,
    private val onSwatchSelected: (Swatch) -> Unit,
    private val onChangeColorData: (ColorData) -> Unit
) : Layout<PaletteIntent, PaletteState, PaletteChange>() {

    override val viewModel: ViewModel<PaletteIntent, PaletteState, PaletteChange> by viewModelFactory {
        PalettePresenter(
            reducer = PaletteReducer(),
            generatePaletteFromResources = GeneratePaletteFromResourceAction(context = context),
            generatePaletteFromUri = GeneratePaletteFromUriAction(
                context = context,
                imageLoader = imageLoader
            )
        )
    }

    private val resourceId = R.drawable.palette_test_tertiary

    @Composable
    override fun Content() {
        val state: PaletteState? by stateChanges()

        Column {
            AsyncImage(data = painterResource(resourceId))

            when (val state = state) {
                is PaletteState.Loading -> renderLoading()
                is PaletteState.DisplayingLoaded -> renderLoaded(state = state)
                is PaletteState.DisplayingError -> Text(state.message)
                else -> {}
            }
        }
    }

    override fun onBind() {
        super.onBind()

        intent(PaletteIntent.LoadResource(resourceId = resourceId))
    }

    @SuppressLint("ComposableNaming")
    @Composable
    private fun renderLoading() {
        Box(modifier = Modifier.fillMaxSize()) {
            CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
        }
    }

    @SuppressLint("ComposableNaming")
    @Composable
    private fun renderLoaded(state: PaletteState.DisplayingLoaded) {
        val paletteState by remember { mutableStateOf(state.palette) }

        paletteState.dominantSwatch?.let { swatch ->
            onChangeColorData(swatch.color.toColorData())
        }

        LazyColumn {
            SwatchItem(
                swatch = paletteState.dominantSwatch,
                name = "Dominant",
                onClick = onSwatchSelected
            )
            SwatchItem(
                swatch = paletteState.vibrantSwatch,
                name = "Vibrant",
                onClick = onSwatchSelected
            )
            SwatchItem(
                swatch = paletteState.vibrantLightSwatch,
                name = "Vibrant Light", onClick = onSwatchSelected
            )
            SwatchItem(
                swatch = paletteState.vibrantDarkSwatch,
                name = "Vibrant Dark", onClick = onSwatchSelected
            )
            SwatchItem(
                swatch = paletteState.mutedSwatch,
                name = "Muted",
                onClick = onSwatchSelected
            )
            SwatchItem(
                swatch = paletteState.mutedLightSwatch,
                name = "Muted Light",
                onClick = onSwatchSelected
            )
            SwatchItem(
                swatch = paletteState.mutedDarkSwatch,
                name = "Muted Dark",
                onClick = onSwatchSelected
            )
        }
    }
}
