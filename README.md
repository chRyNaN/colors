# colors

Kotlin Multiplatform Color Support.

```kotlin
val white = hex("#FFFFFF")
val black = rgba(red = 0, green = 0, blue = 0, alpha = 255)

println("White: colorInt = ${white.colorInt}; cssValue = ${white.cssValue}")
println("Black: colorInt = ${black.colorInt}; cssValue = ${black.cssValue}")
```

## Building the Library

The library is provided through [Bintray](https://bintray.com/chrynan/chrynan). Checkout the [releases page](https://github.com/chRyNaN/colors/releases) to get the latest version.

### Repository

```groovy
repositories {
    maven {
        url = uri("https://dl.bintray.com/chrynan/chrynan")
    }
}
```

### Dependencies

**Kotlin Common:**
```groovy
implementation "com.chrynan.colors:colors-core:$VERSION"
```

**Kotlin JVM:**
```groovy
implementation "com.chrynan.colors:colors-core:$VERSION"
```

**Kotlin JS:**
```groovy
implementation "com.chrynan.colors:colors-core:$VERSION"
```

**Kotlin iOS ARM64:**
```groovy
implementation "com.chryan.colors:colors-core-iosarm64:$VERSION"
```

**Kotlin iOS x64:**
```groovy
implementation "com.chrynan.colors:colors-core-iosx64:$VERSION"
```
