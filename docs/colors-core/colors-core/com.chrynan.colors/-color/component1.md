//[colors-core](../../../index.md)/[com.chrynan.colors](../index.md)/[Color](index.md)/[component1](component1.md)

# component1

[common]\
abstract operator fun [component1](component1.md)(): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)

The first component of this [Color](index.md) defined by the [colorSpace](color-space.md)s [ColorModel](../../com.chrynan.colors.space/-color-model/index.md).

For a [ColorModel.RGB](../../com.chrynan.colors.space/-color-space/index.md), this would the red value.

This is used for destructuring the [Color](index.md) into it's color components. For example, for an RGB Color:

```kotlin
val (red, green, blue, alpha) = color
```
