@file:Suppress("unused")

package com.chrynan.colors.compose

import com.chrynan.colors.Color
import org.jetbrains.compose.web.css.CSSColorValue

@Suppress("ACTUAL_WITHOUT_EXPECT")
actual typealias ComposeMultiplatformColor = CSSColorValue

actual fun Color.toComposeMultiplatformColor(): ComposeMultiplatformColor = toCSSColorValue()
