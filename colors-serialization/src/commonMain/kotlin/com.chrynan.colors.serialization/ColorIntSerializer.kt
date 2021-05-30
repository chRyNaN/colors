@file:Suppress("unused")

package com.chrynan.colors.serialization

import com.chrynan.colors.ColorInt
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

@ExperimentalSerializationApi
object ColorIntSerializer : KSerializer<ColorInt> {

    override val descriptor: SerialDescriptor = Int.serializer().descriptor

    override fun serialize(encoder: Encoder, value: ColorInt) {
        encoder.encodeInline(descriptor).encodeInt(value.value)
    }

    override fun deserialize(decoder: Decoder): ColorInt =
        ColorInt(decoder.decodeInline(descriptor).decodeInt())
}

@ExperimentalSerializationApi
inline fun ColorInt.Companion.serializer(): KSerializer<ColorInt> = ColorIntSerializer
