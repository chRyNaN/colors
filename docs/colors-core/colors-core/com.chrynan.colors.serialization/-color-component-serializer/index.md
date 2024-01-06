//[colors-core](../../../index.md)/[com.chrynan.colors.serialization](../index.md)/[ColorComponentSerializer](index.md)

# ColorComponentSerializer

[common]\
object [ColorComponentSerializer](index.md) : KSerializer&lt;[Color](../../com.chrynan.colors/-color/index.md)&gt;

## Properties

| Name | Summary |
|---|---|
| [descriptor](descriptor.md) | [common]<br>open override val [descriptor](descriptor.md): SerialDescriptor |

## Functions

| Name | Summary |
|---|---|
| [deserialize](deserialize.md) | [common]<br>open override fun [deserialize](deserialize.md)(decoder: Decoder): [Color](../../com.chrynan.colors/-color/index.md) |
| [serialize](serialize.md) | [common]<br>open override fun [serialize](serialize.md)(encoder: Encoder, value: [Color](../../com.chrynan.colors/-color/index.md)) |
