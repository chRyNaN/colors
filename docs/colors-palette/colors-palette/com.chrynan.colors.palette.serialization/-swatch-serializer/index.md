//[colors-palette](../../../index.md)/[com.chrynan.colors.palette.serialization](../index.md)/[SwatchSerializer](index.md)

# SwatchSerializer

[common]\
class [SwatchSerializer](index.md)(colorSerializer: KSerializer&lt;[Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md)&gt;) : KSerializer&lt;[Swatch](../../com.chrynan.colors.palette/-swatch/index.md)&gt;

## Constructors

| | |
|---|---|
| [SwatchSerializer](-swatch-serializer.md) | [common]<br>constructor(colorSerializer: KSerializer&lt;[Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md)&gt;) |

## Properties

| Name | Summary |
|---|---|
| [descriptor](descriptor.md) | [common]<br>open override val [descriptor](descriptor.md): SerialDescriptor |

## Functions

| Name | Summary |
|---|---|
| [deserialize](deserialize.md) | [common]<br>open override fun [deserialize](deserialize.md)(decoder: Decoder): [Swatch](../../com.chrynan.colors.palette/-swatch/index.md) |
| [serialize](serialize.md) | [common]<br>open override fun [serialize](serialize.md)(encoder: Encoder, value: [Swatch](../../com.chrynan.colors.palette/-swatch/index.md)) |
