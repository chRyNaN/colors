package com.chrynan.colors.theme.serialization

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

@OptIn(ExperimentalSerializationApi::class)
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

    override fun serialize(encoder: Encoder, value: Colors) {
        val compositeEncoder = encoder.beginStructure(descriptor)

        compositeEncoder.encodeSerializableElement(
            descriptor,
            0,
            colorSerializer,
            value.primary
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            1,
            colorSerializer,
            value.primaryVariant
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            2,
            colorSerializer,
            value.secondary
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            3,
            colorSerializer,
            value.secondaryVariant
        )
        compositeEncoder.encodeSerializableElement(descriptor, 4, colorSerializer, value.error)
        compositeEncoder.encodeSerializableElement(
            descriptor,
            5,
            colorSerializer,
            value.backgroundPrimary
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            6,
            colorSerializer,
            value.backgroundSecondary
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            7,
            colorSerializer,
            value.onPrimary
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            8,
            colorSerializer,
            value.onSecondary
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            9,
            colorSerializer,
            value.onError
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            10,
            colorSerializer,
            value.onBackgroundPrimary
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            11,
            colorSerializer,
            value.onBackgroundSecondary
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            12,
            colorSerializer,
            value.textPrimary
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            13,
            colorSerializer,
            value.textSecondary
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            14,
            colorSerializer,
            value.textTertiary
        )
        compositeEncoder.encodeSerializableElement(
            descriptor,
            15,
            colorSerializer,
            value.textError
        )
        compositeEncoder.encodeBooleanElement(descriptor, 16, value.isLight)

        compositeEncoder.endStructure(descriptor)
    }

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
                primary = colorPrimary,
                primaryVariant = colorPrimaryVariant,
                secondary = colorSecondary,
                secondaryVariant = colorSecondaryVariant,
                backgroundPrimary = colorBackgroundPrimary,
                backgroundSecondary = colorBackgroundSecondary,
                error = colorError,
                onPrimary = colorOnPrimary,
                onSecondary = colorOnSecondary,
                onBackgroundPrimary = colorOnBackgroundPrimary,
                onBackgroundSecondary = colorOnBackgroundSecondary,
                onError = colorOnError,
                textPrimary = colorTextPrimary,
                textSecondary = colorTextSecondary,
                textTertiary = colorTextTertiary,
                textError = colorTextError
            )
        } else {
            darkColors(
                primary = colorPrimary,
                primaryVariant = colorPrimaryVariant,
                secondary = colorSecondary,
                secondaryVariant = colorSecondaryVariant,
                backgroundPrimary = colorBackgroundPrimary,
                backgroundSecondary = colorBackgroundSecondary,
                error = colorError,
                onPrimary = colorOnPrimary,
                onSecondary = colorOnSecondary,
                onBackgroundPrimary = colorOnBackgroundPrimary,
                onBackgroundSecondary = colorOnBackgroundSecondary,
                onError = colorOnError,
                textPrimary = colorTextPrimary,
                textSecondary = colorTextSecondary,
                textTertiary = colorTextTertiary,
                textError = colorTextError
            )
        }
    }
}

inline fun Colors.Companion.serializer(colorSerializer: KSerializer<Color>): KSerializer<Colors> =
    ColorsSerializer(colorSerializer)
