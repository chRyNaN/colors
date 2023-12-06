import com.chrynan.colors.buildSrc.LibraryConstants

group = LibraryConstants.group
version = LibraryConstants.versionName

plugins {
    kotlin("jvm") version "1.9.20" apply false
    kotlin("multiplatform") version "1.9.20" apply false
    kotlin("plugin.serialization") version "1.9.20" apply false
    id("com.android.library") version "8.1.0" apply false
    id("com.android.application") version "8.1.0" apply false
    id("org.jetbrains.compose") version "1.5.10" apply false
    id("org.jetbrains.dokka") version "1.9.10"
    //id("org.jetbrains.kotlinx.binary-compatibility-validator") version "0.13.2"
    id("com.mikepenz.aboutlibraries.plugin") version "10.8.3" apply false
}

allprojects {
    repositories {
        // NOTE: Order matters here, as the first listed repository will be checked for dependencies first.
        mavenCentral()
        google()
        maven("https://repo.repsy.io/mvn/chrynan/public")
        maven("https://maven.pkg.jetbrains.space/public/p/compose/dev")
    }
}

rootProject.plugins.withType<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootPlugin> {
    rootProject.the<org.jetbrains.kotlin.gradle.targets.js.nodejs.NodeJsRootExtension>().nodeVersion = "16.0.0"
}

// Documentation
tasks.named<org.jetbrains.dokka.gradle.DokkaMultiModuleTask>("dokkaGfmMultiModule").configure {
    outputDirectory.set(file("${projectDir.path}/docs"))
}
