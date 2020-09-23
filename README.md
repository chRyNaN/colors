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
implementation "com.chrynan.colors:colors-core-jvm:$VERSION"
```

**Kotlin JS:**
```groovy
implementation "com.chrynan.colors:colors-core-js:$VERSION"
```

**Kotlin iOS ARM64:**
```groovy
implementation "com.chryan.colors:colors-core-ios-arm64:$VERSION"
```

**Kotlin iOS x64:**
```groovy
implementation "com.chrynan.colors:colors-core-ios-x64:$VERSION"
```

## License
```
Copyright 2020 chRyNaN

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```
