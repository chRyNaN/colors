@file:Suppress("MemberVisibilityCanBePrivate")

package com.chrynan.colors.buildSrc

object LibraryConstants {

    const val group = "com.chrynan.colors"
    const val owner = "chrynan"
    const val repoName = "colors"
    const val versionName = "0.7.2"
    const val versionCode = 24
    const val versionDescription = "Release $versionName ($versionCode)"
    const val license = "Apache-2.0"
    const val vcsUrl = "https://github.com/chRyNaN/colors.git"

    object Android {

        const val compileSdkVersion = 31
        const val minSdkVersion = 23
        const val targetSdkVersion = 31
    }
}
