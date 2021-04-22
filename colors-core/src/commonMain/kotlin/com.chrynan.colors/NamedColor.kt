@file:Suppress("unused")

package com.chrynan.colors

/**
 * Represents a [Color] that has a [Set] of localized [names]. This could be useful to associate a
 * [String] name with a [Color].
 *
 * @property [names] The [Set] of [LocalizedName]s for this [NamedColor] instance.
 * @property [color] The [Color] instance this [NamedColor] represents.
 */
data class NamedColor(
    val names: Set<LocalizedName>,
    val color: Color
) {

    /**
     * Retrieves the first name for the provided [languageCode]. If there are multiple [names] with
     * the provided [languageCode], then the first one is returned. If there are no [names] for the
     * provided [languageCode], then null is returned. The [languageCode] defaults to the value of
     * "en".
     */
    fun name(languageCode: String = "en"): String? =
        names.firstOrNull { it.languageCode == languageCode }?.value

    /**
     * Retrieves a [Set] of [LocalizedName]s from the [names] value that match the provided
     * [languageCode].
     */
    fun namesForLanguageCode(languageCode: String): Set<LocalizedName> =
        names.filter { it.languageCode == languageCode }.toSet()
}

/**
 * Creates a [NamedColor] with the provided [name], [color], and [languageCode]. The [languageCode]
 * defaults to a value of "en".
 */
fun NamedColor(name: String, color: Color, languageCode: String = "en"): NamedColor {
    val localizedName = LocalizedName(languageCode = languageCode, value = name)

    return NamedColor(names = setOf(localizedName), color = color)
}
