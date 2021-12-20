package com.chrynan.colors.sample.android.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Casino
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.chrynan.colors.*
import com.chrynan.colors.compose.toComposeColor
import com.chrynan.colors.sample.android.action.GetRandomColorAction
import com.chrynan.colors.sample.android.composable.CollapsingToolbarLayout
import com.chrynan.colors.sample.android.data.ColorData
import com.chrynan.colors.sample.android.presenter.RandomColorPresenter
import com.chrynan.colors.sample.android.reducer.RandomColorReducer
import com.chrynan.colors.sample.android.state.RandomColorChange
import com.chrynan.colors.sample.android.state.RandomColorIntent
import com.chrynan.colors.sample.android.state.RandomColorState
import com.chrynan.colors.space.ColorModel
import com.chrynan.presentation.PresenterFactory
import com.chrynan.presentation.compose.layout.Layout
import com.chrynan.colors.sample.android.composable.*

class RandomColorScreen(private val onChangeColorData: (ColorData) -> Unit) :
    Layout<RandomColorIntent, RandomColorState, RandomColorChange>() {

    override val presenterFactory: PresenterFactory<RandomColorIntent, RandomColorState, RandomColorChange> =
        PresenterFactory { view ->
            RandomColorPresenter(
                view = view,
                reducer = RandomColorReducer(),
                getRandomColor = GetRandomColorAction()
            )
        }

    @Composable
    override fun OnLayout(state: RandomColorState) {
        when (state) {
            is RandomColorState.DisplayingColor -> renderColor(state)
            is RandomColorState.DisplayingError -> Text(state.message)
        }
    }

    override fun onBind() {
        super.onBind()

        intent(RandomColorIntent.GetRandomColor)
    }

    @SuppressLint("ComposableNaming")
    @Composable
    private fun renderColor(state: RandomColorState.DisplayingColor) {
        val color = state.color
        val contentColor = state.contentColor
        val secondaryContentColor = state.secondaryContentColor

        onChangeColorData(
            ColorData(
                background = color,
                foreground = contentColor,
                foregroundSecondary = secondaryContentColor,
                foregroundAccent = state.colorVariant
            )
        )

        Box(
            modifier = Modifier
                .background(color.toComposeColor())
                .padding(16.dp)
                .fillMaxWidth()
                .fillMaxHeight()
        ) {
            CollapsingToolbarLayout(toolbar = {
                Box(modifier = Modifier.height(240.dp).fillMaxWidth())
            }) {

                item {
                    Box(modifier = Modifier.fillMaxWidth()) {
                        Button(
                            modifier = Modifier.align(Alignment.Center),
                            colors = ButtonDefaults.buttonColors(
                                backgroundColor = state.colorVariant.toComposeColor(),
                                contentColor = state.colorVariantContentColor.toComposeColor()
                            ),
                            shape = RoundedCornerShape(50),
                            onClick = { intent(RandomColorIntent.GetRandomColor) }
                        ) {
                            Row {
                                Icon(
                                    Icons.Filled.Casino,
                                    contentDescription = null,
                                    tint = state.colorVariantContentColor.toComposeColor()
                                )

                                Text(
                                    modifier = Modifier.padding(start = 8.dp),
                                    text = "Generate Next"
                                )
                            }
                        }
                    }
                }

                ContentRow(header = "CSS Value", headerTextColor = secondaryContentColor) {
                    NamedColorTextContent(text = color.cssValue, textColor = contentColor)
                }

                ContentRow(header = "Hex String", headerTextColor = secondaryContentColor) {
                    NamedColorTextContent(text = color.toHexString(), textColor = contentColor)
                }

                ContentRow(header = "Color Int", headerTextColor = secondaryContentColor) {
                    NamedColorTextContent(
                        text = color.colorInt.value.toString(),
                        textColor = contentColor
                    )
                }

                ContentRow(header = "Color Long", headerTextColor = secondaryContentColor) {
                    NamedColorTextContent(
                        text = color.colorLong.value.toString(),
                        textColor = contentColor
                    )
                }

                (0 until 4).forEach { index ->
                    ComponentRow(
                        color = color,
                        headerTextColor = secondaryContentColor,
                        textColor = contentColor,
                        componentIndex = index
                    )
                }

                if (state.color.colorSpace.model == ColorModel.RGB && color is RgbaColor) {
                    (0 until 4).forEach { index ->
                        ComponentRowRgbaColor(
                            color = color,
                            headerTextColor = secondaryContentColor,
                            textColor = contentColor,
                            componentIndex = index
                        )
                    }

                    ContentRow(header = "Hue", headerTextColor = secondaryContentColor) {
                        NamedColorTextContent(text = color.hue.toString(), textColor = contentColor)
                    }

                    ContentRow(header = "Saturation", headerTextColor = secondaryContentColor) {
                        NamedColorTextContent(
                            text = color.saturation.toString(),
                            textColor = contentColor
                        )
                    }

                    ContentRow(header = "Lightness", headerTextColor = secondaryContentColor) {
                        NamedColorTextContent(
                            text = color.lightness.toString(),
                            textColor = contentColor
                        )
                    }
                }

                ContentRow(header = "Luminance", headerTextColor = secondaryContentColor) {
                    NamedColorTextContent(
                        text = color.luminance().toString(),
                        textColor = contentColor
                    )
                }

                ContentRow(header = "Color Model", headerTextColor = secondaryContentColor) {
                    NamedColorTextContent(
                        text = color.colorSpace.model.toString(),
                        textColor = contentColor
                    )
                }

                ContentRow(header = "Color Space", headerTextColor = secondaryContentColor) {
                    NamedColorTextContent(
                        text = color.colorSpace.toString(),
                        textColor = contentColor
                    )
                }

                item {
                    Box(modifier = Modifier.height(320.dp))
                }
            }
        }
    }
}
