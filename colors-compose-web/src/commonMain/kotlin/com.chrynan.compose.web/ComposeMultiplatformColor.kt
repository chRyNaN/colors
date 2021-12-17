package com.chrynan.compose.web

import com.chrynan.colors.Color

expect class ComposeColor

expect fun Color.toComposeColor(): ComposeColor
