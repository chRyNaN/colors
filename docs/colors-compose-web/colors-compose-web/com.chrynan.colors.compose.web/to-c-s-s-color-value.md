//[colors-compose-web](../../index.md)/[com.chrynan.colors.compose.web](index.md)/[toCSSColorValue](to-c-s-s-color-value.md)

# toCSSColorValue

[js]\
fun [Color](../../../colors-core/colors-core/com.chrynan.colors/-color/index.md).[toCSSColorValue](to-c-s-s-color-value.md)(destinationColorSpace: [ColorSpace](../../../colors-core/colors-core/com.chrynan.colors.space/-color-space/index.md) = ColorSpaces.SRGB, renderIntent: [RenderIntent](../../../colors-core/colors-core/com.chrynan.colors.space/-render-intent/index.md) = RenderIntent.PERCEPTUAL): CSSColorValue

Converts this [Color](../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) to a CSSColorValue so that it can be used with compose-web components.

Note that this [Color](../../../colors-core/colors-core/com.chrynan.colors/-color/index.md) will first be converted to an [RgbaColor](../../../colors-core/colors-core/com.chrynan.colors/-rgba-color/index.md) so that it can be easily converted to a CSSColorValue.
