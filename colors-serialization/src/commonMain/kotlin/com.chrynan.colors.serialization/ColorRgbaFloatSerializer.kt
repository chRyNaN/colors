package com.chrynan.colors.serialization

import com.chrynan.colors.Color
import com.chrynan.colors.RgbaColor
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

@ExperimentalUnsignedTypes
object ColorRgbaFloatSerializer : KSerializer<Color> {

    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("Color") {
        element("red", Float.serializer().descriptor)
        element("green", Float.serializer().descriptor)
        element("blue", Float.serializer().descriptor)
        element("alpha", Float.serializer().descriptor)
    }

    override fun serialize(encoder: Encoder, value: Color) {
        val rgbaColor = value.toRgbaColor()

        val compositeEncoder = encoder.beginStructure(descriptor)

        compositeEncoder.encodeFloatElement(descriptor, 0, rgbaColor.red)
        compositeEncoder.encodeFloatElement(descriptor, 1, rgbaColor.green)
        compositeEncoder.encodeFloatElement(descriptor, 2, rgbaColor.blue)
        compositeEncoder.encodeFloatElement(descriptor, 3, rgbaColor.alpha)

        compositeEncoder.endStructure(descriptor)
    }

    override fun deserialize(decoder: Decoder): Color {
        val compositeDecoder = decoder.beginStructure(descriptor)

        val red = compositeDecoder.decodeFloatElement(descriptor, 0)
        val green = compositeDecoder.decodeFloatElement(descriptor, 1)
        val blue = compositeDecoder.decodeFloatElement(descriptor, 2)
        val alpha = compositeDecoder.decodeFloatElement(descriptor, 3)

        compositeDecoder.endStructure(descriptor)

        return RgbaColor(red = red, green = green, blue = blue, alpha = alpha)
    }
}
