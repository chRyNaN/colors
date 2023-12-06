@file:Suppress("unused")

package com.chrynan.colors.serialization

import com.chrynan.colors.ColorLong
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

@OptIn(ExperimentalSerializationApi::class)
object ColorLongSerializer : KSerializer<ColorLong> {

    override val descriptor: SerialDescriptor = Long.serializer().descriptor

    override fun serialize(encoder: Encoder, value: ColorLong) {
        encoder.encodeInline(descriptor).encodeLong(value.value)
    }

    override fun deserialize(decoder: Decoder): ColorLong =
        ColorLong(decoder.decodeInline(descriptor).decodeLong())
}

@OptIn(ExperimentalSerializationApi::class)
inline fun ColorLong.Companion.serializer(): KSerializer<ColorLong> = ColorLongSerializer
