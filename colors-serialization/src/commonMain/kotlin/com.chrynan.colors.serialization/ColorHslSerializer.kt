@file:Suppress("unused")

package com.chrynan.colors.serialization

import com.chrynan.colors.Color
import com.chrynan.colors.convertHslComponentsToColor
import com.chrynan.colors.toHslComponents
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

object ColorHslSerializer : KSerializer<Color> {

    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("Color") {
        element("hue", Float.serializer().descriptor)
        element("saturation", Float.serializer().descriptor)
        element("lightness", Float.serializer().descriptor)
    }

    override fun serialize(encoder: Encoder, value: Color) {
        val rgbaColor = value.toRgbaColor()
        val components = rgbaColor.toHslComponents()

        val compositeEncoder = encoder.beginStructure(descriptor)

        compositeEncoder.encodeFloatElement(descriptor, 0, components[0])
        compositeEncoder.encodeFloatElement(descriptor, 1, components[1])
        compositeEncoder.encodeFloatElement(descriptor, 2, components[2])

        compositeEncoder.endStructure(descriptor)
    }

    override fun deserialize(decoder: Decoder): Color {
        val compositeDecoder = decoder.beginStructure(descriptor)

        val hue = compositeDecoder.decodeFloatElement(descriptor, 0)
        val saturation = compositeDecoder.decodeFloatElement(descriptor, 1)
        val lightness = compositeDecoder.decodeFloatElement(descriptor, 2)

        compositeDecoder.endStructure(descriptor)

        return floatArrayOf(hue, saturation, lightness).convertHslComponentsToColor()
    }
}
