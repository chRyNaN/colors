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
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.getValue
import com.chrynan.colors.NamedColor
import com.chrynan.colors.compose.toComposeColor
import com.chrynan.colors.sample.android.action.LoadColorsAction
import com.chrynan.colors.sample.android.data.ColorData
import com.chrynan.colors.sample.android.presenter.ColorListPresenter
import com.chrynan.colors.sample.android.reducer.ColorListReducer
import com.chrynan.colors.sample.android.state.ColorListChange
import com.chrynan.colors.sample.android.state.ColorListIntent
import com.chrynan.colors.sample.android.state.ColorListState
import com.chrynan.presentation.PresenterFactory
import com.chrynan.presentation.compose.layout.Layout
import com.chrynan.colors.sample.android.util.*
import com.chrynan.colors.sample.android.composable.*
import com.chrynan.presentation.Presenter
import com.chrynan.presentation.presenterFactory

class ColorListScreen(
    private val onColorSelected: (NamedColor) -> Unit,
    private val onChangeColorData: (ColorData) -> Unit
) : Layout<ColorListIntent, ColorListState, ColorListChange>() {

    override val presenter: Presenter<ColorListIntent, ColorListState, ColorListChange> by presenterFactory { intents ->
        ColorListPresenter(
            intents = intents,
            reducer = ColorListReducer(),
            loadColors = LoadColorsAction()
        )
    }

    @Composable
    override fun Content(state: ColorListState) {
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

        val toolbarColorData by remember {
            derivedStateOf {
                state.colors[listState.firstVisibleItemIndex].color.toColorData()
            }
        }

        val bottomBarColorData by remember {
            derivedStateOf {
                val lastIndex = listState.layoutInfo.visibleItemsInfo.lastOrNull()?.index

                if (lastIndex != null) {
                    state.colors[lastIndex].color.toColorData()
                } else {
                    null
                }
            }
        }

        bottomBarColorData?.let { onChangeColorData.invoke(it) }

        Box {
            LazyColumn(modifier = Modifier.padding(top = 48.dp), state = listState) {
                items(items = state.colors, key = { it.color.colorLong.value }) {
                    val colorData = it.color.toColorData()
                    val contentColor = colorData.background
                    val textColor = colorData.foreground
                    val secondaryTextColor = colorData.foregroundSecondary

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .background(contentColor.toComposeColor())
                            .clickable { onColorSelected.invoke(it) }
                            .padding(vertical = 16.dp)
                    ) {
                        NamedColorTextContent(
                            namedColor = it,
                            primaryTextColor = textColor,
                            secondaryTextColor = secondaryTextColor
                        )
                    }
                }
            }

            Toolbar(
                titleText = toolbarColorName ?: "Colors",
                backgroundColor = toolbarColorData.background,
                textColor = toolbarColorData.foreground
            )
        }
    }
}
