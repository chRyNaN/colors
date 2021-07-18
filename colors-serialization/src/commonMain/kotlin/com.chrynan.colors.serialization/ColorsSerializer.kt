package com.chrynan.colors.serialization

import com.chrynan.colors.Color
import com.chrynan.colors.theme.Colors
import com.chrynan.colors.theme.darkColors
import com.chrynan.colors.theme.lightColors
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.KSerializer
import kotlinx.serialization.builtins.serializer
import kotlinx.serialization.descriptors.SerialDescriptor
import kotlinx.serialization.descriptors.buildClassSerialDescriptor
import kotlinx.serialization.encoding.Decoder
import kotlinx.serialization.encoding.Encoder

class ColorsSerializer(private val colorSerializer: KSerializer<Color>) :
    KSerializer<Colors> {

    override val descriptor: SerialDescriptor = buildClassSerialDescriptor("Colors") {
        element("colorPrimary", colorSerializer.descriptor)
        element("colorPrimaryVariant", colorSerializer.descriptor)
        element("colorSecondary", colorSerializer.descriptor)
        element("colorSecondaryVariant", colorSerializer.descriptor)
        element("colorError", colorSerializer.descriptor)
        element("colorBackgroundPrimary", colorSerializer.descriptor)
        element("colorBackgroundSecondary", colorSerializer.descriptor)
        element("colorOnPrimary", colorSerializer.descriptor)
        element("colorOnSecondary", colorSerializer.descriptor)
        element("colorOnError", colorSerializer.descriptor)
        element("colorOnBackgroundPrimary", colorSerializer.descriptor)
        element("colorOnBackgroundSecondary", colorSerializer.descriptor)
        element("colorTextPrimary", colorSerializer.descriptor)
        element("colorTextSecondary", colorSerializer.descriptor)
        element("colorTextTertiary", colorSerializer.descriptor)
        element("colorTextError", colorSerializer.descriptor)
        element("isLight", Boolean.serializer().descriptor)
    }

    @ExperimentalSerializationApi
    override fun serialize(encoder: Encoder, value: Colors) {
        val compositeEncoder = encoder.beginStructure(descriptor)

        compositeEncoder.encodeSerializableElement(
            descriptor,
            0,
            colorSerializer,
            value.colorPrimary
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            1,
            colorSerializer,
            value.colorPrimaryVariant
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            2,
            colorSerializer,
            value.colorSecondary
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            3,
            colorSerializer,
            value.colorSecondaryVariant
        )
        compositeEncoder.encodeSerializableElement(descriptor, 4, colorSerializer, value.colorError)
        compositeEncoder.encodeSerializableElement(
            descriptor,
            5,
            colorSerializer,
            value.colorBackgroundPrimary
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            6,
            colorSerializer,
            value.colorBackgroundSecondary
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            7,
            colorSerializer,
            value.colorOnPrimary
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            8,
            colorSerializer,
            value.colorOnSecondary
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            9,
            colorSerializer,
            value.colorOnError
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            10,
            colorSerializer,
            value.colorOnBackgroundPrimary
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            11,
            colorSerializer,
            value.colorOnBackgroundSecondary
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            12,
            colorSerializer,
            value.colorTextPrimary
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            13,
            colorSerializer,
            value.colorTextSecondary
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            14,
            colorSerializer,
            value.colorTextTertiary
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            15,
            colorSerializer,
            value.colorTextError
        )
        compositeEncoder.encodeBooleanElement(descriptor, 16, value.isLight)

        compositeEncoder.endStructure(descriptor)
    }

    @ExperimentalUnsignedTypes
    @ExperimentalSerializationApi
    override fun deserialize(decoder: Decoder): Colors {
        val compositeDecoder = decoder.beginStructure(descriptor)

        val colorPrimary =
            compositeDecoder.decodeSerializableElement(descriptor, 0, colorSerializer)
        val colorPrimaryVariant =
            compositeDecoder.decodeSerializableElement(descriptor, 1, colorSerializer)
        val colorSecondary =
            compositeDecoder.decodeSerializableElement(descriptor, 2, colorSerializer)
        val colorSecondaryVariant =
            compositeDecoder.decodeSerializableElement(descriptor, 3, colorSerializer)
        val colorError = compositeDecoder.decodeSerializableElement(descriptor, 4, colorSerializer)
        val colorBackgroundPrimary =
            compositeDecoder.decodeSerializableElement(descriptor, 5, colorSerializer)
        val colorBackgroundSecondary =
            compositeDecoder.decodeSerializableElement(descriptor, 6, colorSerializer)
        val colorOnPrimary =
            compositeDecoder.decodeSerializableElement(descriptor, 7, colorSerializer)
        val colorOnSecondary =
            compositeDecoder.decodeSerializableElement(descriptor, 8, colorSerializer)
        val colorOnError =
            compositeDecoder.decodeSerializableElement(descriptor, 9, colorSerializer)
        val colorOnBackgroundPrimary =
            compositeDecoder.decodeSerializableElement(descriptor, 10, colorSerializer)
        val colorOnBackgroundSecondary =
            compositeDecoder.decodeSerializableElement(descriptor, 11, colorSerializer)
        val colorTextPrimary =
            compositeDecoder.decodeSerializableElement(descriptor, 12, colorSerializer)
        val colorTextSecondary =
            compositeDecoder.decodeSerializableElement(descriptor, 13, colorSerializer)
        val colorTextTertiary =
            compositeDecoder.decodeSerializableElement(descriptor, 14, colorSerializer)
        val colorTextError =
            compositeDecoder.decodeSerializableElement(descriptor, 15, colorSerializer)
        val isLight = compositeDecoder.decodeBooleanElement(descriptor, 16)

        compositeDecoder.endStructure(descriptor)

        return if (isLight) {
            lightColors(
                colorPrimary = colorPrimary,
                colorPrimaryVariant = colorPrimaryVariant,
                colorSecondary = colorSecondary,
                colorSecondaryVariant = colorSecondaryVariant,
                colorBackground = colorBackgroundPrimary,
                colorBackgroundSecondary = colorBackgroundSecondary,
                colorError = colorError,
                colorOnPrimary = colorOnPrimary,
                colorOnSecondary = colorOnSecondary,
                colorOnBackground = colorOnBackgroundPrimary,
                colorOnBackgroundSecondary = colorOnBackgroundSecondary,
                colorOnError = colorOnError,
                colorTextPrimary = colorTextPrimary,
                colorTextSecondary = colorTextSecondary,
                colorTextTertiary = colorTextTertiary,
                colorTextError = colorTextError
            )
        } else {
            darkColors(
                colorPrimary = colorPrimary,
                colorPrimaryVariant = colorPrimaryVariant,
                colorSecondary = colorSecondary,
                colorSecondaryVariant = colorSecondaryVariant,
                colorBackground = colorBackgroundPrimary,
                colorBackgroundSecondary = colorBackgroundSecondary,
                colorError = colorError,
                colorOnPrimary = colorOnPrimary,
                colorOnSecondary = colorOnSecondary,
                colorOnBackground = colorOnBackgroundPrimary,
                colorOnBackgroundSecondary = colorOnBackgroundSecondary,
                colorOnError = colorOnError,
                colorTextPrimary = colorTextPrimary,
                colorTextSecondary = colorTextSecondary,
                colorTextTertiary = colorTextTertiary,
                colorTextError = colorTextError
            )
        }
    }
}

inline fun Colors.Companion.serializer(colorSerializer: KSerializer<Color>): KSerializer<Colors> =
    ColorsSerializer(colorSerializer)
