package com.chrynan.colors.serialization

import com.chrynan.colors.*
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

@ExperimentalUnsignedTypes
object ColorRgbaIntSerializer : KSerializer<Color> {

    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("Color") {
        element("red", Int.serializer().descriptor)
        element("green", Int.serializer().descriptor)
        element("blue", Int.serializer().descriptor)
        element("alpha", Int.serializer().descriptor)
    }

    override fun serialize(encoder: Encoder, value: Color) {
        val rgbaColor = value.toRgbaColor()

        val compositeEncoder = encoder.beginStructure(descriptor)

        compositeEncoder.encodeIntElement(descriptor, 0, rgbaColor.redInt)
        compositeEncoder.encodeIntElement(descriptor, 1, rgbaColor.greenInt)
        compositeEncoder.encodeIntElement(descriptor, 2, rgbaColor.blueInt)
        compositeEncoder.encodeIntElement(descriptor, 3, rgbaColor.alphaInt)

        compositeEncoder.endStructure(descriptor)
    }

    override fun deserialize(decoder: Decoder): Color {
        val compositeDecoder = decoder.beginStructure(descriptor)

        val red = compositeDecoder.decodeIntElement(descriptor, 0)
        val green = compositeDecoder.decodeIntElement(descriptor, 1)
        val blue = compositeDecoder.decodeIntElement(descriptor, 2)
        val alpha = compositeDecoder.decodeIntElement(descriptor, 3)

        compositeDecoder.endStructure(descriptor)

        return RgbaColor(red = red, green = green, blue = blue, alpha = alpha)
    }
}
