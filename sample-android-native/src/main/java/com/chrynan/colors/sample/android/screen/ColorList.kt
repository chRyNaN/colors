package com.chrynan.colors.sample.android

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
        LazyColumn {
            items(items = state.colors, key = { it.color.colorLong.value }) {
                val textColor = if (it.color.contrast(Color.White) > 0.5f) {
                    Color.White
                } else {
                    Color.Black
                }
                val secondaryTextColor = textColor.copy(component4 = textColor.alpha / 2)

                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp)
                        .background(it.color.toComposeColor())
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
}
