@file:Suppress("unused")

package com.chrynan.colors.compose.web

import com.chrynan.colors.Color
import org.jetbrains.compose.web.css.CSSColorValue

@Suppress("ACTUAL_WITHOUT_EXPECT")
actual typealias ComposeColor = CSSColorValue

actual fun Color.toComposeColor(): ComposeColor = toCSSColorValue()
