package com.chrynan.colors.sample.android.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
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
import com.chrynan.presentation.PresenterFactory
import com.chrynan.presentation.compose.layout.Layout

class ColorDetailScreen(private val namedColor: NamedColor) :
    Layout<ColorDetailIntent, ColorDetailState, ColorDetailChange>() {

    override val presenterFactory: PresenterFactory<ColorDetailIntent, ColorDetailState, ColorDetailChange> =
        PresenterFactory { view ->
            ColorDetailPresenter(
                view = view,
                reducer = ColorDetailReducer(),
                loadDetail = LoadColorDetailAction()
            )
        }

    @Composable
    override fun OnLayout(state: ColorDetailState) {
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
                    TextContent(text = namedColor.name() ?: "", textColor = textColor)
                }

                ContentRow(header = "CSS Value", headerTextColor = secondaryTextColor) {
                    TextContent(text = color.cssValue, textColor = textColor)
                }

                ContentRow(header = "Color Int", headerTextColor = secondaryTextColor) {
                    TextContent(
                        text = color.colorInt.value.toString(),
                        textColor = textColor
                    )
                }

                ContentRow(header = "Color Long", headerTextColor = secondaryTextColor) {
                    TextContent(
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
                        TextContent(text = color.hue.toString(), textColor = textColor)
                    }

                    ContentRow(header = "Saturation", headerTextColor = secondaryTextColor) {
                        TextContent(text = color.saturation.toString(), textColor = textColor)
                    }

                    ContentRow(header = "Lightness", headerTextColor = secondaryTextColor) {
                        TextContent(text = color.lightness.toString(), textColor = textColor)
                    }
                }

                ContentRow(header = "Luminance", headerTextColor = secondaryTextColor) {
                    TextContent(text = color.luminance().toString(), textColor = textColor)
                }

                ContentRow(header = "Color Model", headerTextColor = secondaryTextColor) {
                    TextContent(text = color.colorSpace.model.toString(), textColor = textColor)
                }

                ContentRow(header = "Color Space", headerTextColor = secondaryTextColor) {
                    TextContent(text = color.colorSpace.toString(), textColor = textColor)
                }

                item {
                    Box(modifier = Modifier.height(320.dp))
                }
            }
        }
    }
}

@Composable
fun Header(text: String, color: Color) {
    Text(
        text = text,
        fontSize = 14.sp,
        fontWeight = FontWeight.Bold,
        color = color.toComposeColor()
    )
}

@Suppress("FunctionName")
fun LazyListScope.ContentRow(
    header: String,
    headerTextColor: Color,
    isContentSelectable: Boolean = true,
    content: @Composable () -> Unit
) {
    item {
        Column(modifier = Modifier.padding(top = 16.dp)) {
            Header(text = header, color = headerTextColor)

            if (isContentSelectable) {
                SelectionContainer {
                    content()
                }
            } else {
                content()
            }
        }
    }
}

@Composable
private fun TextContent(
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

@Suppress("FunctionName")
private fun LazyListScope.ComponentRow(
    color: Color,
    componentIndex: Int,
    headerTextColor: Color,
    textColor: Color
) {
    var headerText = when (componentIndex) {
        0 -> "Component One"
        1 -> "Component Two"
        2 -> "Component Three"
        3 -> "Component Four"
        else -> throw IllegalStateException("Invalid Component index = $componentIndex")
    }

    if (color.colorSpace.model == ColorModel.RGB) {
        val additionalText = when (componentIndex) {
            0 -> " (Red)"
            1 -> " (Green)"
            2 -> " (Blue)"
            3 -> " (Alpha)"
            else -> throw IllegalStateException("Invalid Component index = $componentIndex")
        }

        headerText += additionalText
    }

    val componentValue = when (componentIndex) {
        0 -> color.component1()
        1 -> color.component2()
        2 -> color.component3()
        3 -> color.component4()
        else -> throw IllegalStateException("Invalid Component index = $componentIndex")
    }

    ContentRow(header = headerText, headerTextColor = headerTextColor) {
        TextContent(
            text = componentValue.toString(),
            textColor = textColor
        )
    }
}

@Suppress("FunctionName")
private fun LazyListScope.ComponentRowRgbaColor(
    color: RgbaColor,
    componentIndex: Int,
    headerTextColor: Color,
    textColor: Color
) {
    var headerText = when (componentIndex) {
        0 -> "Component One Int"
        1 -> "Component Two Int"
        2 -> "Component Three Int"
        3 -> "Component Four Int"
        else -> throw IllegalStateException("Invalid Component index = $componentIndex")
    }

    if (color.colorSpace.model == ColorModel.RGB) {
        val additionalText = when (componentIndex) {
            0 -> " (Red)"
            1 -> " (Green)"
            2 -> " (Blue)"
            3 -> " (Alpha)"
            else -> throw IllegalStateException("Invalid Component index = $componentIndex")
        }

        headerText += additionalText
    }

    val componentValue = when (componentIndex) {
        0 -> color.redInt
        1 -> color.greenInt
        2 -> color.blueInt
        3 -> color.alphaInt
        else -> throw IllegalStateException("Invalid Component index = $componentIndex")
    }

    ContentRow(header = headerText, headerTextColor = headerTextColor) {
        TextContent(
            text = componentValue.toString(),
            textColor = textColor
        )
    }
}