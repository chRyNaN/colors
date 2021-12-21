# colors

Kotlin Multi-platform Color Support. This allows using Colors in multi-platform presentation code
like View Data classes and Mappers. Compatible with Jetpack Compose. <br/>
<img alt="GitHub tag (latest by date)" src="https://img.shields.io/github/v/tag/chRyNaN/colors">

```kotlin
val white = Color("#FFFFFF")
val black = Color(red = 0, green = 0, blue = 0)

println("White: colorLong = ${white.colorLong}; cssValue = ${white.cssValue}")
println("Black: colorLong = ${black.colorLong}; cssValue = ${black.cssValue}")
```

## Usage

To obtain a `Color` instance, use one of the constructor functions:

```kotlin
Color("#FFFFFF")

Color(255, 255, 255, 255)

Color(0xFFFFFFFF)

// Or to obtain a specific Color type, like RgbaColor
RgbaColor(255, 255, 255, 255)
```

Using properties from the `Color` interface:

```kotlin
// sRGB Color Int
color.colorInt

// Color components and ColorSpace encoded into a Long
color.colorLong

// CSS Value
color.cssValue

// ColorSpace
color.colorSpace

// Alpha value
color.alpha

// Specific Color components
color.component1()

// All Color Components - Example for an RGBA Color
val (red, green, blue, alpha) = color

// Color Components as a FloatArray
color.components
```

## Building the library

The library is provided through [Repsy.io](https://repsy.io). Checkout the
[releases page](https://github.com/chRyNaN/colors/releases) to get the latest version. <br/>
<img alt="GitHub tag (latest by date)" src="https://img.shields.io/github/v/tag/chRyNaN/colors">

### Repository

```groovy
repositories {
    maven { url = "https://repo.repsy.io/mvn/chrynan/public" }
}
```

### Dependencies

**Core:**

```groovy
implementation "com.chrynan.colors:colors-core:$VERSION"
```

**Extensions:**

```groovy
implementation "com.chrynan.colors:colors-extension:$VERSION"
```

**Theme:**

```groovy
implementation "com.chrynan.colors:colors-theme:$VERSION"
```

**Serialization:**

```groovy
implementation "com.chrynan.colors:colors-serialization:$VERSION"
```

**Jetpack Compose:**

```groovy
implementation "com.chrynan.colors:colors-compose:$VERSION"
```

## Documentation

More detailed documentation is available in the [docs](docs) folder. The entry point to the
documentation can be found [here](docs/index.md).

## Sample

Checkout the [Android Sample Project](sample-android-native) for an example of using the library.

## License

```
Copyright 2021 chRyNaN

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
