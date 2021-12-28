package com.chrynan.colors.sample.android.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListScope
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.chrynan.colors.*
import com.chrynan.colors.space.ColorModel

@Suppress("FunctionName")
internal fun LazyListScope.ContentRow(
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

@Suppress("FunctionName")
internal fun LazyListScope.ComponentRow(
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
        NamedColorTextContent(
            text = componentValue.toString(),
            textColor = textColor
        )
    }
}

@Suppress("FunctionName")
internal fun LazyListScope.ComponentRowRgbaColor(
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
        NamedColorTextContent(
            text = componentValue.toString(),
            textColor = textColor
        )
    }
}
