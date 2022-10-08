//[colors-core](../../index.md)/[com.chrynan.colors](index.md)/[inverse](inverse.md)

# inverse

[common]\
fun [RgbaColor](-rgba-color/index.md).[inverse](inverse.md)(): [RgbaColor](-rgba-color/index.md)

&quot;Inverses&quot; this [RgbaColor](-rgba-color/index.md) by subtracting each component [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) value from the max [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html) value of 255, then returning a new [RgbaColor](-rgba-color/index.md) with those new component values.

**Note:** That this does not change [RgbaColor.alpha](../../../colors-core/com.chrynan.colors/-rgba-color/alpha.md) value.
