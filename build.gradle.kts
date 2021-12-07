import com.chrynan.colors.buildSrc.LibraryConstants

group = LibraryConstants.group
version = LibraryConstants.versionName

buildscript {
    repositories {
        google()
        jcenter()
        maven { url = uri("https://repo.repsy.io/mvn/chrynan/public") }
        maven { url = uri("https://dl.bintray.com/chrynan/chrynan") }
        maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
    }
    dependencies {
        classpath("com.android.tools.build:gradle:7.1.0-beta04")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.31")
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:1.5.30")
        classpath("org.jetbrains.kotlin:kotlin-serialization:1.5.32")
        classpath("org.jetbrains.compose:compose-gradle-plugin:1.0.0")
    }
}

apply(plugin = "org.jetbrains.dokka")

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
        maven { url = uri("https://jitpack.io") }
        maven { url = uri("https://repo.repsy.io/mvn/chrynan/public") }
        maven { url = uri("https://maven.pkg.jetbrains.space/public/p/compose/dev") }
    }
}

// Documentation
tasks.named<org.jetbrains.dokka.gradle.DokkaMultiModuleTask>("dokkaGfmMultiModule").configure {
    outputDirectory.set(file("${projectDir.path}/docs"))
}
