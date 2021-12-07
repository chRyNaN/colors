//[colors-core](../../../index.md)/[com.chrynan.colors](../index.md)/[Color](index.md)/[toRgbaColor](to-rgba-color.md)

# toRgbaColor

[common]\
abstract fun [toRgbaColor](to-rgba-color.md)(destinationColorSpace: [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md) = ColorSpaces.SRGB, renderIntent: [RenderIntent](../../com.chrynan.colors.space/-render-intent/index.md) = RenderIntent.PERCEPTUAL): [RgbaColor](../-rgba-color/index.md)

Converts this [Color](index.md) instance into a [RgbaColor](../-rgba-color/index.md). If this [Color](index.md) instance is already an [RgbaColor](../-rgba-color/index.md), then it should simply be returned.

## Parameters

common

| | |
|---|---|
| destinationColorSpace | The destination [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md) to convert this [Color](index.md) to. Note that this [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md) value must have a [ColorModel](../../com.chrynan.colors.space/-color-model/index.md) of [ColorModel.RGB](../../com.chrynan.colors.space/-color-model/-r-g-b/index.md) or an exception is thrown. |
| renderIntent | The [RenderIntent](../../com.chrynan.colors.space/-render-intent/index.md) used when converting this [Color](index.md) to the [destinationColorSpace](../../com.chrynan.colors.space/-color-space/index.md). |
