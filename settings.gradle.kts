pluginManagement {
    repositories {
        // NOTE: Order matters here, as the first listed repository will be checked for dependencies first.
        mavenCentral()
        gradlePluginPortal()
        google()
        maven("https://repo.repsy.io/mvn/chrynan/public")
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
        maven("https://maven.pkg.jetbrains.space/kotlin/p/wasm/experimental")
    }
}

plugins {
    // Apply the foojay-resolver plugin to allow automatic download of JDKs
    id("org.gradle.toolchains.foojay-resolver-convention") version "0.7.0"

    // See https://jmfayard.github.io/refreshVersions
    id("de.fayard.refreshVersions") version "0.60.3"
}

rootProject.name = "colors"

include(":colors-core")
include(":colors-extension")
include(":colors-theme")
include(":colors-palette")
include(":colors-compose")
//include(":colors-compose-web")
//include(":sample-android")
