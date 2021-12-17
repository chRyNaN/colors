@file:Suppress("unused")

package com.chrynan.colors.theme

/**
 * A color theme for an application. It provides a way structure the [Colors] for an application.
 */
interface ColorTheme {

    /**
     * Obtains the [Colors] for this [ColorTheme].
     */
    fun colors(): Colors
}

/**
 * A [ColorTheme] that is represented by [lightColors].
 */
interface LightColorTheme : ColorTheme {

    /**
     * Obtains the light [Colors] for this [ColorTheme].
     *
     * Note that implementing interfaces should make sure that returned [Colors] has
     * [Colors.isLight] set to true. Undefined behaviour if this is not implemented correctly.
     */
    val light: Colors

    /**
     * Obtains the light [Colors] for this [ColorTheme].
     *
     * Note that implementing interfaces should make sure that returned [Colors] has
     * [Colors.isLight] set to true. Undefined behaviour if this is not implemented correctly.
     */
    override fun colors(): Colors = light
}

/**
 * A [ColorTheme] that is represented by [darkColors].
 */
interface DarkColorTheme : ColorTheme {

    /**
     * Obtains the dark [Colors] for this [ColorTheme].
     *
     * Note that implementing interfaces should make sure that returned [Colors] has
     * [Colors.isLight] set to false. Undefined behaviour if this is not implemented correctly.
     */
    val dark: Colors

    /**
     * Obtains the dark [Colors] for this [ColorTheme].
     *
     * Note that implementing interfaces should make sure that returned [Colors] has
     * [Colors.isLight] set to false. Undefined behaviour if this is not implemented correctly.
     */
    override fun colors(): Colors = dark
}

/**
 * A [ColorTheme] that contains both light and dark [Colors].
 */
interface LightDarkColorTheme : LightColorTheme,
    DarkColorTheme {

    /**
     * Obtains the light [Colors] for this [ColorTheme].
     *
     * Note that implementing interfaces should make sure that returned [Colors] has
     * [Colors.isLight] set to true. Undefined behaviour if this is not implemented correctly.
     */
    override val light: Colors

    /**
     * Obtains the dark [Colors] for this [ColorTheme].
     *
     * Note that implementing interfaces should make sure that returned [Colors] has
     * [Colors.isLight] set to false. Undefined behaviour if this is not implemented correctly.
     */
    override val dark: Colors

    /**
     * Obtains the default [Colors] for this [ColorTheme]. This defaults to returning the [light]
     * [Colors].
     */
    override fun colors(): Colors = colors(isLight = true)
}

/**
 * Obtains the appropriate [Colors] instance depending on the provided [isLight] parameter value.
 * If the [isLight] parameter equals true, then [LightDarkColorTheme.light] [Colors] will be
 * returned. Otherwise, the [LightDarkColorTheme.dark] will be returned.
 */
fun LightDarkColorTheme.colors(isLight: Boolean): Colors = if (isLight) light else dark

/**
 * A class that can be used to place [ColorTheme]s on to as extension properties. This allows for
 * easy access to the various color themes within an application. For example:
 * ```
 * // Have the color theme as an extension property on this [ColorThemes] class:
 * val ColorThemes.myColorTheme: MyColorTheme get() = ...
 *
 * // Then access the color theme via the [Colors.themes] property:
 * Colors.themes.myColorTheme
 * ```
 */
class ColorThemes internal constructor() {

    companion object {

        internal val singleton: ColorThemes = ColorThemes()
    }
}

/**
 * Accesses the [ColorThemes] class that should contain all the apps color themes.
 */
val Colors.Companion.themes: ColorThemes
    get() = ColorThemes.singleton
