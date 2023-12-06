package com.chrynan.colors.palette.serialization

import com.chrynan.colors.Color
import com.chrynan.colors.palette.Swatch
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.nullable
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

@OptIn(ExperimentalSerializationApi::class)
class SwatchSerializer(private val colorSerializer: KSerializer<Color>) :
    KSerializer<Swatch> {

    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("Swatch") {
        element("color", colorSerializer.descriptor)
        element("primaryOnColor", colorSerializer.descriptor)
        element("secondaryOnColor", colorSerializer.descriptor)
        element("population", Int.serializer().nullable.descriptor)
    }

    override fun serialize(encoder: Encoder, value: Swatch) {
        val compositeEncoder = encoder.beginStructure(descriptor)

        compositeEncoder.encodeSerializableElement(descriptor, 0, colorSerializer, value.color)
        compositeEncoder.encodeSerializableElement(
            descriptor,
            1,
            colorSerializer,
            value.primaryOnColor
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            2,
            colorSerializer,
            value.secondaryOnColor
        )
        compositeEncoder.encodeNullableSerializableElement(
            descriptor,
            3,
            Int.serializer(),
            value.population
        )

        compositeEncoder.endStructure(descriptor)
    }

    override fun deserialize(decoder: Decoder): Swatch {
        val compositeDecoder = decoder.beginStructure(descriptor)

        val color = compositeDecoder.decodeSerializableElement(descriptor, 0, colorSerializer)
        val primaryOnColor =
            compositeDecoder.decodeSerializableElement(descriptor, 1, colorSerializer)
        val secondaryOnColor =
            compositeDecoder.decodeSerializableElement(descriptor, 2, colorSerializer)
        val population = compositeDecoder.decodeNullableSerializableElement(
            descriptor,
            3,
            Int.serializer().nullable
        )

        compositeDecoder.endStructure(descriptor)

        return Swatch(
            color = color,
            primaryOnColor = primaryOnColor,
            secondaryOnColor = secondaryOnColor,
            population = population
        )
    }
}

inline fun Swatch.Companion.serializer(colorSerializer: KSerializer<Color>): KSerializer<Swatch> =
    SwatchSerializer(colorSerializer)
