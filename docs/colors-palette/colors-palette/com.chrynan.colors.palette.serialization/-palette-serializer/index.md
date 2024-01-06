//[colors-palette](../../../index.md)/[com.chrynan.colors.palette.serialization](../index.md)/[PaletteSerializer](index.md)

# PaletteSerializer

[common]\
class [PaletteSerializer](index.md)(swatchSerializer: KSerializer&lt;[Swatch](../../com.chrynan.colors.palette/-swatch/index.md)&gt;) : KSerializer&lt;[Palette](../../com.chrynan.colors.palette/-palette/index.md)&gt;

## Constructors

| | |
|---|---|
| [PaletteSerializer](-palette-serializer.md) | [common]<br>constructor(swatchSerializer: KSerializer&lt;[Swatch](../../com.chrynan.colors.palette/-swatch/index.md)&gt;) |

## Properties

| Name | Summary |
|---|---|
| [descriptor](descriptor.md) | [common]<br>open override val [descriptor](descriptor.md): SerialDescriptor |

## Functions

| Name | Summary |
|---|---|
| [deserialize](deserialize.md) | [common]<br>open override fun [deserialize](deserialize.md)(decoder: Decoder): [Palette](../../com.chrynan.colors.palette/-palette/index.md) |
| [serialize](serialize.md) | [common]<br>open override fun [serialize](serialize.md)(encoder: Encoder, value: [Palette](../../com.chrynan.colors.palette/-palette/index.md)) |
