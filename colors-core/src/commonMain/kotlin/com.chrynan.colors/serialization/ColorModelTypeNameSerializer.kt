package com.chrynan.colors.serialization

import com.chrynan.colors.space.ColorModel
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

object ColorModelTypeNameSerializer : KSerializer<ColorModel> {

    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("ColorModel", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, value: ColorModel) {
        encoder.encodeString(value.typeName)
    }

    override fun deserialize(decoder: Decoder): ColorModel {
        val typeName = decoder.decodeString()

        return ColorModel.getByTypeName(typeName)!!
    }
}
