package com.chrynan.colors.serialization

import com.chrynan.colors.palette.Palette
import com.chrynan.colors.palette.Swatch
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.nullable
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.descriptors.nullable
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

class PaletteSerializer(private val swatchSerializer: KSerializer<Swatch>) :
    KSerializer<Palette> {

    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("Palette") {
        element("vibrantSwatch", swatchSerializer.descriptor.nullable)
        element("vibrantDarkSwatch", swatchSerializer.descriptor.nullable)
        element("vibrantLightSwatch", swatchSerializer.descriptor.nullable)
        element("mutedSwatch", swatchSerializer.descriptor.nullable)
        element("mutedDarkSwatch", swatchSerializer.descriptor.nullable)
        element("mutedLightSwatch", swatchSerializer.descriptor.nullable)
    }

    @ExperimentalSerializationApi
    override fun serialize(encoder: Encoder, value: Palette) {
        val compositeEncoder = encoder.beginStructure(descriptor)

        compositeEncoder.encodeNullableSerializableElement(
            descriptor,
            0,
            swatchSerializer.nullable,
            value.vibrantSwatch
        )
        compositeEncoder.encodeNullableSerializableElement(
            descriptor,
            1,
            swatchSerializer.nullable,
            value.vibrantDarkSwatch
        )
        compositeEncoder.encodeNullableSerializableElement(
            descriptor,
            2,
            swatchSerializer.nullable,
            value.vibrantLightSwatch
        )
        compositeEncoder.encodeNullableSerializableElement(
            descriptor,
            3,
            swatchSerializer.nullable,
            value.mutedSwatch
        )
        compositeEncoder.encodeNullableSerializableElement(
            descriptor,
            4,
            swatchSerializer.nullable,
            value.mutedDarkSwatch
        )
        compositeEncoder.encodeNullableSerializableElement(
            descriptor,
            5,
            swatchSerializer.nullable,
            value.mutedLightSwatch
        )

        compositeEncoder.endStructure(descriptor)
    }

    @ExperimentalSerializationApi
    override fun deserialize(decoder: Decoder): Palette {
        val compositeDecoder = decoder.beginStructure(descriptor)

        val vibrantSwatch = compositeDecoder.decodeNullableSerializableElement(
            descriptor,
            0,
            swatchSerializer.nullable
        )
        val vibrantDarkSwatch = compositeDecoder.decodeNullableSerializableElement(
            descriptor,
            1,
            swatchSerializer.nullable
        )
        val vibrantLightSwatch = compositeDecoder.decodeNullableSerializableElement(
            descriptor,
            2,
            swatchSerializer.nullable
        )
        val mutedSwatch = compositeDecoder.decodeNullableSerializableElement(
            descriptor,
            3,
            swatchSerializer.nullable
        )
        val mutedDarkSwatch = compositeDecoder.decodeNullableSerializableElement(
            descriptor,
            4,
            swatchSerializer.nullable
        )
        val mutedLightSwatch = compositeDecoder.decodeNullableSerializableElement(
            descriptor,
            5,
            swatchSerializer.nullable
        )

        compositeDecoder.endStructure(descriptor)

        return Palette(
            vibrantSwatch = vibrantSwatch,
            vibrantDarkSwatch = vibrantDarkSwatch,
            vibrantLightSwatch = vibrantLightSwatch,
            mutedSwatch = mutedSwatch,
            mutedDarkSwatch = mutedDarkSwatch,
            mutedLightSwatch = mutedLightSwatch
        )
    }
}

inline fun Palette.Companion.serializer(swatchSerializer: KSerializer<Swatch>): KSerializer<Palette> =
    PaletteSerializer(swatchSerializer)
