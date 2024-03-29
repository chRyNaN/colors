//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[OkLabColorSpace](index.md)/[getMaxValue](get-max-value.md)

# getMaxValue

[common]\
open override fun [getMaxValue](get-max-value.md)(component: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)

Returns the maximum valid value for the specified component of this color space's color model.

#### Return

A floating point value greater than [getMinValue](get-min-value.md)

#### Parameters

common

| | |
|---|---|
| component | The index of the component, from `0` to `3`, inclusive |

#### See also

| |
|---|
| [OkLabColorSpace.getMinValue](get-min-value.md) |
| [ColorModel.componentCount](../-color-model/component-count.md) |
