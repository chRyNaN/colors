//[colors-core](../../index.md)/[com.chrynan.colors](index.md)/[compositeOver](composite-over.md)

# compositeOver

[common]\
fun [Color](-color/index.md).[compositeOver](composite-over.md)(background: [Color](-color/index.md)): [Color](-color/index.md)

Composites [this](../../../colors-core/com.chrynan.colors/index.md) color on top of [background](composite-over.md) using the Porter-Duff 'source over' mode.

Both [this](../../../colors-core/com.chrynan.colors/index.md) and [background](composite-over.md) must not be pre-multiplied, and the resulting color will also not be pre-multiplied.

The [ColorSpace](../com.chrynan.colors.space/-color-space/index.md) of the result is always the [ColorSpace](-color/color-space.md) of [background](composite-over.md).

#### Return

the [Color](-color/index.md) representing [this](../../../colors-core/com.chrynan.colors/index.md) composited on top of [background](composite-over.md), converted to the color space of [background](composite-over.md).
