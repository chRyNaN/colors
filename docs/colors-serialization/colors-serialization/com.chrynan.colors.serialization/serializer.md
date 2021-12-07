//[colors-serialization](../../index.md)/[com.chrynan.colors.serialization](index.md)/[serializer](serializer.md)

# serializer

[common]\
inline fun [ColorInt.Companion](../../../colors-core/colors-core/com.chrynan.colors/-color-int/-companion/index.md).[serializer](serializer.md)(): KSerializer&lt;[ColorInt](../../../colors-core/colors-core/com.chrynan.colors/-color-int/index.md)&gt;

inline fun [ColorLong.Companion](../../../colors-core/colors-core/com.chrynan.colors/-color-long/-companion/index.md).[serializer](serializer.md)(): KSerializer&lt;[ColorLong](../../../colors-core/colors-core/com.chrynan.colors/-color-long/index.md)&gt;

inline fun [Colors.Companion](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/-companion/index.md).[serializer](serializer.md)(colorSerializer: KSerializer&lt;[Color](../../../colors-core/colors-core/com.chrynan.colors/-color/index.md)&gt;): KSerializer&lt;[Colors](../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md)&gt;

inline fun [LocalizedText.Companion](../../../colors-core/colors-core/com.chrynan.colors/-localized-text/-companion/index.md).[serializer](serializer.md)(): KSerializer&lt;[LocalizedText](../../../colors-core/colors-core/com.chrynan.colors/-localized-text/index.md)&gt;

inline fun [NamedColor.Companion](../../../colors-core/colors-core/com.chrynan.colors/-named-color/-companion/index.md).[serializer](serializer.md)(colorSerializer: KSerializer&lt;[Color](../../../colors-core/colors-core/com.chrynan.colors/-color/index.md)&gt;): KSerializer&lt;[NamedColor](../../../colors-core/colors-core/com.chrynan.colors/-named-color/index.md)&gt;

inline fun [Palette.Companion](../../../colors-palette/colors-palette/com.chrynan.colors.palette/-palette/-companion/index.md).[serializer](serializer.md)(swatchSerializer: KSerializer&lt;[Swatch](../../../colors-palette/colors-palette/com.chrynan.colors.palette/-swatch/index.md)&gt;): KSerializer&lt;[Palette](../../../colors-palette/colors-palette/com.chrynan.colors.palette/-palette/index.md)&gt;

inline fun [Swatch.Companion](../../../colors-palette/colors-palette/com.chrynan.colors.palette/-swatch/-companion/index.md).[serializer](serializer.md)(colorSerializer: KSerializer&lt;[Color](../../../colors-core/colors-core/com.chrynan.colors/-color/index.md)&gt;): KSerializer&lt;[Swatch](../../../colors-palette/colors-palette/com.chrynan.colors.palette/-swatch/index.md)&gt;
