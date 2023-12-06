package com.chrynan.colors.serialization

import com.chrynan.colors.space.ColorSpace
import com.chrynan.colors.space.ColorSpaces
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

object ColorSpaceSerializer : KSerializer<ColorSpace> {

    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("ColorSpace") {
        element("name", String.serializer().descriptor)
        element("model", ColorModelTypeNameSerializer.descriptor)
        element("id", Int.serializer().descriptor)
    }

    override fun serialize(encoder: Encoder, value: ColorSpace) {
        val compositeEncoder = encoder.beginStructure(descriptor)

        compositeEncoder.encodeStringElement(descriptor, 0, value.name)
        compositeEncoder.encodeSerializableElement(
            ColorModelTypeNameSerializer.descriptor,
            1,
            ColorModelTypeNameSerializer,
            value.model
        )
        compositeEncoder.encodeIntElement(descriptor, 2, value.id)

        compositeEncoder.endStructure(descriptor)
    }

    override fun deserialize(decoder: Decoder): ColorSpace {
        val compositeDecoder = decoder.beginStructure(descriptor)

        val name = compositeDecoder.decodeStringElement(descriptor, 0)
        val model =
            compositeDecoder.decodeSerializableElement(descriptor, 1, ColorModelTypeNameSerializer)
        val id = compositeDecoder.decodeIntElement(descriptor, 2)

        compositeDecoder.endStructure(descriptor)

        return ColorSpaces.getColorSpaceById(id = id)
    }
}
