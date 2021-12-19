package com.chrynan.colors.sample.android.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.runtime.getValue
import com.chrynan.colors.Color
import com.chrynan.colors.NamedColor
import com.chrynan.colors.contrast
import com.chrynan.colors.compose.toComposeColor
import com.chrynan.colors.sample.android.action.LoadColorsAction
import com.chrynan.colors.sample.android.presenter.ColorListPresenter
import com.chrynan.colors.sample.android.reducer.ColorListReducer
import com.chrynan.colors.sample.android.state.ColorListChange
import com.chrynan.colors.sample.android.state.ColorListIntent
import com.chrynan.colors.sample.android.state.ColorListState
import com.chrynan.presentation.PresenterFactory
import com.chrynan.presentation.compose.layout.Layout

class ColorListScreen(private val onColorSelected: (NamedColor) -> Unit) :
    Layout<ColorListIntent, ColorListState, ColorListChange>() {

    override val presenterFactory: PresenterFactory<ColorListIntent, ColorListState, ColorListChange> =
        PresenterFactory { view ->
            ColorListPresenter(
                view = view,
                reducer = ColorListReducer(),
                loadColors = LoadColorsAction()
            )
        }

    @Composable
    override fun OnLayout(state: ColorListState) {
        when (state) {
            is ColorListState.Loading -> renderLoading()
            is ColorListState.DisplayingColors -> renderColors(state = state)
            is ColorListState.DisplayingError -> Text(state.message)
        }
    }

    override fun onBind() {
        super.onBind()

        intent(ColorListIntent.Load)
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
    private fun renderColors(state: ColorListState.DisplayingColors) {
        val listState = rememberLazyListState()

        val toolbarColorName by remember {
            derivedStateOf {
                state.colors[listState.firstVisibleItemIndex].name()
            }
        }

        val toolbarBackgroundColor by remember {
            derivedStateOf {
                state.colors[listState.firstVisibleItemIndex].color.getContentColor()
            }
        }

        Box {
            LazyColumn(state = listState) {
                items(items = state.colors, key = { it.color.colorLong.value }) {
                    val contentColor = it.color.getContentColor()
                    val textColor = contentColor.getTextColor()
                    val secondaryTextColor = textColor.getSecondaryTextColor()

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .background(contentColor.toComposeColor())
                            .clickable { onColorSelected.invoke(it) }
                            .padding(vertical = 16.dp)
                    ) {
                        TextContent(
                            namedColor = it,
                            primaryTextColor = textColor,
                            secondaryTextColor = secondaryTextColor
                        )
                    }
                }
            }

            Toolbar(
                titleText = toolbarColorName ?: "Colors",
                backgroundColor = toolbarBackgroundColor,
                textColor = toolbarBackgroundColor.getTextColor()
            )
        }
    }

    @Composable
    private fun Toolbar(
        titleText: String = "Colors",
        backgroundColor: Color,
        textColor: Color
    ) {
        TopAppBar(
            backgroundColor = backgroundColor.toComposeColor()
        ) {
            Box(modifier = Modifier.padding(8.dp)) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentHeight(),
                    text = titleText,
                    textAlign = TextAlign.Start,
                    fontSize = 24.sp,
                    color = textColor.toComposeColor()
                )
            }
        }
    }

    @Composable
    private fun TextContent(
        namedColor: NamedColor,
        primaryTextColor: Color,
        secondaryTextColor: Color
    ) {
        Column(
            modifier = Modifier.fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                text = namedColor.name() ?: "",
                fontSize = 24.sp,
                textAlign = TextAlign.Center,
                color = primaryTextColor.toComposeColor()
            )
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight(),
                text = namedColor.color.cssValue,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                color = secondaryTextColor.toComposeColor()
            )
        }
    }

    private fun Color.getContentColor(): Color = if (this.alpha == 0f) Color.White else this

    private fun Color.getTextColor(): Color =
        if (contrast(Color.White) > 0.5f) {
            Color.White
        } else {
            Color.Black
        }

    private fun Color.getSecondaryTextColor(): Color = copy(component4 = alpha / 2)
}
