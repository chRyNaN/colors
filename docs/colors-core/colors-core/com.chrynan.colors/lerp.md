//[colors-core](../../index.md)/[com.chrynan.colors](index.md)/[lerp](lerp.md)

# lerp

[common]\
fun [lerp](lerp.md)(start: [Color](-color/index.md), stop: [Color](-color/index.md), fraction: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)): [Color](-color/index.md)

Linear interpolate between two [Color](-color/index.md)s, [start](lerp.md) and [stop](lerp.md) with [fraction](lerp.md) between the two. The [ColorSpace](../com.chrynan.colors.space/-color-space/index.md) of the result is always the [ColorSpace](-color/color-space.md) of [stop](lerp.md). [fraction](lerp.md) should be between 0 and 1, inclusive.
