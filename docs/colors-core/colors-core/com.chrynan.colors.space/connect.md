//[colors-core](../../index.md)/[com.chrynan.colors.space](index.md)/[connect](connect.md)

# connect

[common]\
fun [ColorSpace](-color-space/index.md).[connect](connect.md)(destination: [ColorSpace](-color-space/index.md) = ColorSpaces.SRGB, intent: [RenderIntent](-render-intent/index.md) = RenderIntent.PERCEPTUAL): [Connector](-connector/index.md)

Connects two color spaces to allow conversion from the source color space to the destination color space. If the source and destination color spaces do not have the same profile connection space (CIE XYZ with the same white point), they are chromatically adapted to use the CIE standard illuminant [D50](-illuminant/-d50.md) as needed.

If the source and destination are the same, an optimized connector is returned to avoid unnecessary computations and loss of precision.

#### Return

A non-null connector between the two specified color spaces

#### Parameters

common

| | |
|---|---|
| destination | The color space to convert colors to |
| intent | The render intent to map colors from the source to the destination |
