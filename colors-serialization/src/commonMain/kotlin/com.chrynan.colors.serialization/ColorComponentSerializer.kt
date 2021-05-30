@file:Suppress("unused")

package com.chrynan.colors.serialization

import com.chrynan.colors.Color
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

@ExperimentalUnsignedTypes
object ColorComponentSerializer : KSerializer<Color> {

    override val descriptor: SerialDescriptor
        get() = buildClassSerialDescriptor("Color") {
            element("componentOne", Float.serializer().descriptor)
            element("componentTwo", Float.serializer().descriptor)
            element("componentThree", Float.serializer().descriptor)
            element("componentFour", Float.serializer().descriptor)
            element("colorSpace", ColorSpaceSerializer.descriptor)
        }

    override fun serialize(encoder: Encoder, value: Color) {
        val compositeEncoder = encoder.beginStructure(descriptor)

        compositeEncoder.encodeFloatElement(descriptor, 0, value.component1())
        compositeEncoder.encodeFloatElement(descriptor, 1, value.component2())
        compositeEncoder.encodeFloatElement(descriptor, 2, value.component3())
        compositeEncoder.encodeFloatElement(descriptor, 3, value.component4())
        compositeEncoder.encodeSerializableElement(
            descriptor,
            4,
            ColorSpaceSerializer,
            value.colorSpace
        )

        compositeEncoder.endStructure(descriptor)
    }

    override fun deserialize(decoder: Decoder): Color {
        val compositeDecoder = decoder.beginStructure(descriptor)

        val componentOne = compositeDecoder.decodeFloatElement(descriptor, 0)
        val componentTwo = compositeDecoder.decodeFloatElement(descriptor, 1)
        val componentThree = compositeDecoder.decodeFloatElement(descriptor, 2)
        val componentFour = compositeDecoder.decodeFloatElement(descriptor, 3)
        val colorSpace =
            compositeDecoder.decodeSerializableElement(descriptor, 4, ColorSpaceSerializer)

        compositeDecoder.endStructure(descriptor)

        return Color(
            component1 = componentOne,
            component2 = componentTwo,
            component3 = componentThree,
            component4 = componentFour,
            colorSpace = colorSpace
        )
    }
}
