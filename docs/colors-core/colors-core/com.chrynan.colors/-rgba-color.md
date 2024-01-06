//[colors-core](../../index.md)/[com.chrynan.colors](index.md)/[RgbaColor](-rgba-color.md)

# RgbaColor

[common]\
fun [RgbaColor](-rgba-color.md)(red: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), green: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), blue: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html), alpha: [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html) = Color.OPAQUE_ALPHA, colorSpace: [ColorSpace](../com.chrynan.colors.space/-color-space/index.md) = ColorSpaces.SRGB): [RgbaColor](-rgba-color/index.md)

Create a [RgbaColor](-rgba-color/index.md) by passing individual [red](-rgba-color.md), [green](-rgba-color.md), [blue](-rgba-color.md), [alpha](-rgba-color.md), and [colorSpace](-rgba-color.md) components. The default [color space](../com.chrynan.colors.space/-color-space/index.md) is [SRGB](../com.chrynan.colors.space/-color-spaces/-s-r-g-b.md) and the default [alpha](-rgba-color.md) is `1.0` (opaque). [colorSpace](-rgba-color.md) must have a [ColorSpace.componentCount](../com.chrynan.colors.space/-color-space/component-count.md) of

1. 

[common]\
fun [RgbaColor](-rgba-color.md)(red: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), green: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), blue: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html), alpha: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) = Color.OPAQUE_INT_OPACITY, colorSpace: [ColorSpace](../com.chrynan.colors.space/-color-space/index.md) = ColorSpaces.SRGB): [RgbaColor](-rgba-color/index.md)

Retrieves a [RgbaColor](-rgba-color/index.md) from the provided color values.

Note that the provided values will be coerced into the SRGB Color Range.

#### See also

| |
|---|
| [RgbaColor](-rgba-color/index.md) |
