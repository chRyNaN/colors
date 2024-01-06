//[colors-extension](../../../index.md)/[com.chrynan.colors.extension.serialization](../index.md)/[NamedColorSerializer](index.md)

# NamedColorSerializer

[common]\
class [NamedColorSerializer](index.md)(colorSerializer: KSerializer&lt;[Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md)&gt;) : KSerializer&lt;[NamedColor](../../../../colors-core/colors-core/com.chrynan.colors/-named-color/index.md)&gt;

## Constructors

| | |
|---|---|
| [NamedColorSerializer](-named-color-serializer.md) | [common]<br>constructor(colorSerializer: KSerializer&lt;[Color](../../../../colors-core/colors-core/com.chrynan.colors/-color/index.md)&gt;) |

## Properties

| Name | Summary |
|---|---|
| [descriptor](descriptor.md) | [common]<br>open override val [descriptor](descriptor.md): SerialDescriptor |

## Functions

| Name | Summary |
|---|---|
| [deserialize](deserialize.md) | [common]<br>open override fun [deserialize](deserialize.md)(decoder: Decoder): [NamedColor](../../../../colors-core/colors-core/com.chrynan.colors/-named-color/index.md) |
| [serialize](serialize.md) | [common]<br>open override fun [serialize](serialize.md)(encoder: Encoder, value: [NamedColor](../../../../colors-core/colors-core/com.chrynan.colors/-named-color/index.md)) |
