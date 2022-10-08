//[colors-serialization](../../../index.md)/[com.chrynan.colors.serialization](../index.md)/[SwatchSerializer](index.md)

# SwatchSerializer

[common]\
class [SwatchSerializer](index.md)(colorSerializer: KSerializer&lt;[Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md)&gt;) : KSerializer&lt;[Swatch](../../../../colors-palette/colors-palette/com.chrynan.colors.palette/-swatch/index.md)&gt;

## Constructors

| | |
|---|---|
| [SwatchSerializer](-swatch-serializer.md) | [common]<br>fun [SwatchSerializer](-swatch-serializer.md)(colorSerializer: KSerializer&lt;[Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md)&gt;) |

## Functions

| Name | Summary |
|---|---|
| [deserialize](deserialize.md) | [common]<br>open override fun [deserialize](deserialize.md)(decoder: Decoder): [Swatch](../../../../colors-palette/colors-palette/com.chrynan.colors.palette/-swatch/index.md) |
| [serialize](serialize.md) | [common]<br>open override fun [serialize](serialize.md)(encoder: Encoder, value: [Swatch](../../../../colors-palette/colors-palette/com.chrynan.colors.palette/-swatch/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [descriptor](descriptor.md) | [common]<br>open override val [descriptor](descriptor.md): SerialDescriptor |
