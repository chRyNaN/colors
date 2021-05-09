package com.chrynan.colors

/**
 * Represents a [String] text content [value] for a particular [languageCode]. This allows for
 * having the same [String] text content [value] localized for different languages.
 *
 * @property [languageCode] The language code of this text [value]. This defaults to "en" for
 * English.
 * @property [value] The [String] text content value.
 */
data class LocalizedText(
    val languageCode: String = "en",
    val value: String
)
