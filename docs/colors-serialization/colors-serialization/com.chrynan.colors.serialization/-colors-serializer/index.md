//[colors-serialization](../../../index.md)/[com.chrynan.colors.serialization](../index.md)/[ColorsSerializer](index.md)

# ColorsSerializer

[common]\
class [ColorsSerializer](index.md)(colorSerializer: KSerializer&lt;[Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md)&gt;) : KSerializer&lt;[Colors](../../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md)&gt;

## Constructors

| | |
|---|---|
| [ColorsSerializer](-colors-serializer.md) | [common]<br>fun [ColorsSerializer](-colors-serializer.md)(colorSerializer: KSerializer&lt;[Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md)&gt;) |

## Functions

| Name | Summary |
|---|---|
| [deserialize](deserialize.md) | [common]<br>open override fun [deserialize](deserialize.md)(decoder: Decoder): [Colors](../../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md) |
| [serialize](serialize.md) | [common]<br>open override fun [serialize](serialize.md)(encoder: Encoder, value: [Colors](../../../../colors-theme/colors-theme/com.chrynan.colors.theme/-colors/index.md)) |

## Properties

| Name | Summary |
|---|---|
| [descriptor](descriptor.md) | [common]<br>open override val [descriptor](descriptor.md): SerialDescriptor |
