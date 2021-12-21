//[colors-core](../../index.md)/[com.chrynan.colors](index.md)/[contrasting](contrasting.md)

# contrasting

[common]\
fun [Color](-color/index.md).[contrasting](contrasting.md)(factor: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = 0.5f, conditional: [Color](-color/index.md) = Color.White, default: [Color](-color/index.md) = Color.Black): [Color](-color/index.md)

Retrieves the most contrasting [Color](-color/index.md) with this [Color](-color/index.md) from the provided values.

If the [Color.contrast](contrast.md) value with [this](-color/index.md) and the [conditional](-color/index.md) is greater than [factor](contrasting.md), then the [conditional](-color/index.md) is returned. Otherwise, the [default](-color/index.md) is returned.

This function could be useful for getting a [Color](-color/index.md) to overlay over [this](../../../colors-core/com.chrynan.colors/index.md) color that has enough contrast.

## See also

common

| | |
|---|---|
| [Color.contrast](contrast.md) |  |

## Parameters

common

| | |
|---|---|
| factor | The value that the contrast has to be greater than, for the [conditional](contrasting.md) color to be used. This defaults to 0.5f. |
| conditional | The [Color](-color/index.md) to return if it has a higher contrast value with [this](../../../colors-core/com.chrynan.colors/index.md) color than [factor](contrasting.md). This defaults to [Color.White](-color/-companion/-white.md). |
| default | The [Color](-color/index.md) to return if the conditional statement is not met. This defaults to [Color.Black](-color/-companion/-black.md). |
