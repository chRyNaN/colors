@file:Suppress("unused")

package com.chrynan.colors.compose

import com.chrynan.colors.Color

@Suppress("ACTUAL_WITHOUT_EXPECT")
actual typealias ComposeMultiplatformColor = androidx.compose.ui.graphics.Color

actual fun Color.toComposeMultiplatformColor(): ComposeMultiplatformColor = toComposeColor()
