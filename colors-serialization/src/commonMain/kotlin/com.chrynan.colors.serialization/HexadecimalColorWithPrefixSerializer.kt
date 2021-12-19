@file:Suppress("unused")

package com.chrynan.colors.serialization

import com.chrynan.colors.Color
import com.chrynan.colors.HexadecimalColor
import kotlinx.serialization.KSerializer
import kotlinx.serialization.descriptors.PrimitiveKind
import kotlinx.serialization.descriptors.PrimitiveSerialDescriptor
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

object HexadecimalColorWithPrefixSerializer : KSerializer<HexadecimalColor> {

    override val descriptor: SerialDescriptor =
        PrimitiveSerialDescriptor("Color", PrimitiveKind.STRING)

    override fun serialize(encoder: Encoder, value: HexadecimalColor) {
        encoder.encodeString(value.hexString)
    }

    override fun deserialize(decoder: Decoder): HexadecimalColor =
        Color(hex = decoder.decodeString())
}
