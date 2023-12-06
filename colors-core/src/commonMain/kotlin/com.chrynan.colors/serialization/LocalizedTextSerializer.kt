@file:Suppress("unused")

package com.chrynan.colors.serialization

import com.chrynan.colors.LocalizedText
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

object LocalizedTextSerializer : KSerializer<LocalizedText> {

    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("LocalizedText") {
        element("languageCode", String.serializer().descriptor)
        element("value", String.serializer().descriptor)
    }

    override fun serialize(encoder: Encoder, value: LocalizedText) {
        val compositeEncoder = encoder.beginStructure(descriptor)

        compositeEncoder.encodeStringElement(descriptor, 0, value.languageCode)
        compositeEncoder.encodeStringElement(descriptor, 1, value.value)

        compositeEncoder.endStructure(descriptor)
    }

    override fun deserialize(decoder: Decoder): LocalizedText {
        val compositeDecoder = decoder.beginStructure(descriptor)

        val languageCode = compositeDecoder.decodeStringElement(descriptor, 0)
        val value = compositeDecoder.decodeStringElement(descriptor, 1)

        compositeDecoder.endStructure(descriptor)

        return LocalizedText(languageCode = languageCode, value = value)
    }
}

inline fun LocalizedText.Companion.serializer(): KSerializer<LocalizedText> =
    LocalizedTextSerializer
