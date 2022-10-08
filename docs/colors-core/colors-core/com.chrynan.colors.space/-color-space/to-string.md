//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[ColorSpace](index.md)/[toString](to-string.md)

# toString

[common]\
open override fun [toString](to-string.md)(): [String](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-string/index.html)

Returns a string representation of the object. This method returns a string equal to the value of:

```kotlin
    "$name "(id=$id, model=$model)"
```

For instance, the string representation of the [sRGB](../-color-spaces/-s-r-g-b.md) color space is equal to the following value:

```kotlin
    sRGB IEC61966-2.1 (id=0, model=RGB)
```

#### Return

A string representation of the object
