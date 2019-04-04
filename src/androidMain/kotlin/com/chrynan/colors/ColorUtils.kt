package com.chrynan.colors

import android.annotation.TargetApi
import android.os.Build

fun Color.toAndroidColorInt(): Int = toColorInt().value

@TargetApi(Build.VERSION_CODES.O)
fun Color.toAndroidColor(): android.graphics.Color = android.graphics.Color.valueOf(toColorInt().value)