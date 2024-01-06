//[colors-core](../../../index.md)/[com.chrynan.colors](../index.md)/[BaseColor](index.md)/[toRgbaColor](to-rgba-color.md)

# toRgbaColor

[common]\
open override fun [toRgbaColor](to-rgba-color.md)(destinationColorSpace: [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md), renderIntent: [RenderIntent](../../com.chrynan.colors.space/-render-intent/index.md)): [RgbaColor](../-rgba-color/index.md)

Converts this [Color](../-color/index.md) instance into a [RgbaColor](../-rgba-color/index.md). If this [Color](../-color/index.md) instance is already an [RgbaColor](../-rgba-color/index.md), then it should simply be returned.

#### Parameters

common

| | |
|---|---|
| destinationColorSpace | The destination [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md) to convert this [Color](../-color/index.md) to. Note that this [ColorSpace](../../com.chrynan.colors.space/-color-space/index.md) value must have a [ColorModel](../../com.chrynan.colors.space/-color-model/index.md) of [ColorModel.RGB](../../com.chrynan.colors.space/-color-model/-r-g-b/index.md) or an exception is thrown. |
| renderIntent | The [RenderIntent](../../com.chrynan.colors.space/-render-intent/index.md) used when converting this [Color](../-color/index.md) to the [destinationColorSpace](../../com.chrynan.colors.space/-color-space/index.md). |
