@file:Suppress("unused")

package com.chrynan.colors.extension.serialization

import com.chrynan.colors.Color
import com.chrynan.colors.NamedColor
import com.chrynan.colors.serialization.LocalizedTextSerializer
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.SetSerializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

class NamedColorSerializer(private val colorSerializer: KSerializer<Color>) :
    KSerializer<NamedColor> {

    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("NamedColor") {
        element("names", SetSerializer(LocalizedTextSerializer).descriptor)
        element("color", colorSerializer.descriptor)
    }

    override fun serialize(encoder: Encoder, value: NamedColor) {
        val compositeEncoder = encoder.beginStructure(descriptor)

        compositeEncoder.encodeSerializableElement(
            descriptor,
            0,
            SetSerializer(LocalizedTextSerializer),
            value.names
        )
        compositeEncoder.encodeSerializableElement(descriptor, 1, colorSerializer, value.color)

        compositeEncoder.endStructure(descriptor)
    }

    override fun deserialize(decoder: Decoder): NamedColor {
        val compositeDecoder = decoder.beginStructure(descriptor)

        val names = compositeDecoder.decodeSerializableElement(
            descriptor,
            0,
            SetSerializer(LocalizedTextSerializer)
        )
        val color = compositeDecoder.decodeSerializableElement(descriptor, 1, colorSerializer)

        compositeDecoder.endStructure(descriptor)

        return NamedColor(names = names, color = color)
    }
}

inline fun NamedColor.Companion.serializer(colorSerializer: KSerializer<Color>): KSerializer<NamedColor> =
    NamedColorSerializer(colorSerializer)
