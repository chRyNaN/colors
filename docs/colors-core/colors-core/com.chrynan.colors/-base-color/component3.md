//[colors-core](../../../index.md)/[com.chrynan.colors](../index.md)/[BaseColor](index.md)/[component3](component3.md)

# component3

[common]\
open operator override fun [component3](component3.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)

The third component of this [Color](../-color/index.md) defined by the [colorSpace](color-space.md)s [ColorModel](../../com.chrynan.colors.space/-color-model/index.md).

For a [ColorModel.RGB](../../com.chrynan.colors.space/-color-space/index.md), this would the blue value.

This is used for destructuring the [Color](../-color/index.md) into it's color components. For example, for an RGB Color:

```kotlin
val (red, green, blue, alpha) = color
```
