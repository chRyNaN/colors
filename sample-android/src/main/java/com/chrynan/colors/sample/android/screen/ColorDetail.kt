package com.chrynan.colors.sample.android.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.chrynan.colors.*
import com.chrynan.colors.compose.toComposeColor
import com.chrynan.colors.sample.android.composable.CollapsingToolbarLayout
import com.chrynan.colors.sample.android.action.LoadColorDetailAction
import com.chrynan.colors.sample.android.presenter.ColorDetailPresenter
import com.chrynan.colors.sample.android.reducer.ColorDetailReducer
import com.chrynan.colors.sample.android.state.ColorDetailChange
import com.chrynan.colors.sample.android.state.ColorDetailIntent
import com.chrynan.colors.sample.android.state.ColorDetailState
import com.chrynan.colors.space.ColorModel
import com.chrynan.presentation.compose.layout.Layout
import com.chrynan.colors.sample.android.composable.*
import com.chrynan.colors.sample.android.data.ColorData
import com.chrynan.presentation.Presenter
import com.chrynan.presentation.presenterFactory

class ColorDetailScreen(
    private val namedColor: NamedColor,
    private val onChangeColorData: (ColorData) -> Unit
) : Layout<ColorDetailIntent, ColorDetailState, ColorDetailChange>() {

    override val presenter: Presenter<ColorDetailIntent, ColorDetailState, ColorDetailChange> by presenterFactory { intents ->
        ColorDetailPresenter(
            intents = intents,
            reducer = ColorDetailReducer(),
            loadDetail = LoadColorDetailAction()
        )
    }

    @Composable
    override fun Content(state: ColorDetailState) {
        when (state) {
            is ColorDetailState.Loading -> renderLoading()
            is ColorDetailState.DisplayingColor -> renderDisplayingColor(state = state)
            is ColorDetailState.DisplayingError -> Text(state.message)
        }
    }

    override fun onBind() {
        super.onBind()

        intent(ColorDetailIntent.Load(namedColor = namedColor))
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
    fun renderDisplayingColor(state: ColorDetailState.DisplayingColor) {
        val namedColor = state.namedColor
        val textColor = state.textColor
        val secondaryTextColor = state.secondaryTextColor

        onChangeColorData(state.colorData)

        Box(
            modifier = Modifier
                .background(namedColor.color.toComposeColor())
                .padding(16.dp)
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            CollapsingToolbarLayout(toolbar = {
                Box(modifier = Modifier.height(240.dp).fillMaxWidth())
            }) {
                val color: Color = namedColor.color

                ContentRow(header = "Name", headerTextColor = secondaryTextColor) {
                    NamedColorTextContent(text = namedColor.name() ?: "", textColor = textColor)
                }

                ContentRow(header = "CSS Value", headerTextColor = secondaryTextColor) {
                    NamedColorTextContent(text = color.cssValue, textColor = textColor)
                }

                ContentRow(header = "Hex String", headerTextColor = secondaryTextColor) {
                    NamedColorTextContent(text = color.toHexString(), textColor = textColor)
                }

                ContentRow(header = "Color Int", headerTextColor = secondaryTextColor) {
                    NamedColorTextContent(
                        text = color.colorInt.value.toString(),
                        textColor = textColor
                    )
                }

                ContentRow(header = "Color Long", headerTextColor = secondaryTextColor) {
                    NamedColorTextContent(
                        text = color.colorLong.value.toString(),
                        textColor = textColor
                    )
                }

                (0 until 4).forEach { index ->
                    ComponentRow(
                        color = color,
                        headerTextColor = secondaryTextColor,
                        textColor = textColor,
                        componentIndex = index
                    )
                }

                if (namedColor.color.colorSpace.model == ColorModel.RGB && color is RgbaColor) {
                    (0 until 4).forEach { index ->
                        ComponentRowRgbaColor(
                            color = color,
                            headerTextColor = secondaryTextColor,
                            textColor = textColor,
                            componentIndex = index
                        )
                    }

                    ContentRow(header = "Hue", headerTextColor = secondaryTextColor) {
                        NamedColorTextContent(text = color.hue.toString(), textColor = textColor)
                    }

                    ContentRow(header = "Saturation", headerTextColor = secondaryTextColor) {
                        NamedColorTextContent(
                            text = color.saturation.toString(),
                            textColor = textColor
                        )
                    }

                    ContentRow(header = "Lightness", headerTextColor = secondaryTextColor) {
                        NamedColorTextContent(
                            text = color.lightness.toString(),
                            textColor = textColor
                        )
                    }
                }

                ContentRow(header = "Luminance", headerTextColor = secondaryTextColor) {
                    NamedColorTextContent(
                        text = color.luminance().toString(),
                        textColor = textColor
                    )
                }

                ContentRow(header = "Color Model", headerTextColor = secondaryTextColor) {
                    NamedColorTextContent(
                        text = color.colorSpace.model.toString(),
                        textColor = textColor
                    )
                }

                ContentRow(header = "Color Space", headerTextColor = secondaryTextColor) {
                    NamedColorTextContent(text = color.colorSpace.toString(), textColor = textColor)
                }

                item {
                    Box(modifier = Modifier.height(320.dp))
                }
            }
        }
    }
}

@Composable
private fun NamedColorTextContent(
    text: String,
    textColor: Color
) {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight(),
        text = text,
        fontSize = 24.sp,
        color = textColor.toComposeColor()
    )
}
