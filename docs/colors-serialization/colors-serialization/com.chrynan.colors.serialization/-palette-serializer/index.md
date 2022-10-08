//[colors-serialization](../../../index.md)/[com.chrynan.colors.serialization](../index.md)/[PaletteSerializer](index.md)

# PaletteSerializer

[common]\
class [PaletteSerializer](index.md)(swatchSerializer: KSerializer&lt;[Swatch](../../../../colors-palette/colors-palette/com.chrynan.colors.palette/-swatch/index.md)&gt;) : KSerializer&lt;[Palette](../../../../colors-palette/colors-palette/com.chrynan.colors.palette/-palette/index.md)&gt;

## Constructors

| | |
|---|---|
| [PaletteSerializer](-palette-serializer.md) | [common]<br>fun [PaletteSerializer](-palette-serializer.md)(swatchSerializer: KSerializer&lt;[Swatch](../../../../colors-palette/colors-palette/com.chrynan.colors.palette/-swatch/index.md)&gt;) |

## Functions

| Name | Summary |
|---|---|
| [deserialize](deserialize.md) | [common]<br>open override fun [deserialize](deserialize.md)(decoder: Decoder): [Palette](../../../../colors-palette/colors-palette/com.chrynan.colors.palette/-palette/index.md) |
| [serialize](serialize.md) | [common]<br>open override fun [serialize](serialize.md)(encoder: Encoder, value: [Palette](../../../../colors-palette/colors-palette/com.chrynan.colors.palette/-palette/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [descriptor](descriptor.md) | [common]<br>open override val [descriptor](descriptor.md): SerialDescriptor |
