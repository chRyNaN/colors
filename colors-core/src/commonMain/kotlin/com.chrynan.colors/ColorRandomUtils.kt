@file:Suppress("unused")

package com.chrynan.colors

import kotlin.random.Random

fun Random.nextColor(): Color {
    val red = nextInt(from = 0, until = 255)
    val green = nextInt(from = 0, until = 255)
    val blue = nextInt(from = 0, until = 255)

    return Color(red = red, green = green, blue = blue)
}
