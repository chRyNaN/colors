package com.chrynan.colors.sample.android.composable

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.composed
import androidx.compose.ui.graphics.graphicsLayer

@Composable
fun CollapsingToolbarLayout(
    toolbar: @Composable () -> Unit,
    content: LazyListScope.() -> Unit
) {
    Box {
        val lazyListState = rememberLazyListState()

        LazyColumn {
            item {
                Box(
                    modifier = Modifier
                        .collapsingToolbar(lazyListState = lazyListState)
                        .wrapContentHeight()
                        .fillMaxWidth()
                ) {
                    toolbar()
                }
            }

            content()
        }
    }
}

private fun Modifier.collapsingToolbar(lazyListState: LazyListState): Modifier = composed {
    var scrolledY = remember { 0f }
    var previousOffset = remember { 0 }

    graphicsLayer {
        scrolledY += lazyListState.firstVisibleItemScrollOffset - previousOffset
        translationY = scrolledY * 0.5f
        previousOffset = lazyListState.firstVisibleItemScrollOffset
    }
}
