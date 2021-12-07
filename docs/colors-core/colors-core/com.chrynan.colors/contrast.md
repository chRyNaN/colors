//[colors-core](../../index.md)/[com.chrynan.colors](index.md)/[contrast](contrast.md)

# contrast

[common]\
fun [Color](-color/index.md).[contrast](contrast.md)(other: [Color](-color/index.md)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)

Retrieves a [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), in the range of 0.0f to 1.0f, indicating the amount of contrast between this [Color](-color/index.md) and the provided [other](-color/index.md). A value of 0.0f indicates the lowest contrast value, and a value of 1.0f indicates the highest contrast value.

Note that this compares the [Color.luminance](-color/luminance.md) values of the [Color](-color/index.md)s.

## See also

common

| | |
|---|---|
| [com.chrynan.colors.Color](-color/luminance.md) |  |
