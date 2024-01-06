//[colors-core](../../../index.md)/[com.chrynan.colors.space](../index.md)/[ColorSpace](index.md)/[getMinValue](get-min-value.md)

# getMinValue

[common]\
abstract fun [getMinValue](get-min-value.md)(component: [Int](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-int/index.html)): [Float](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-float/index.html)

Returns the minimum valid value for the specified component of this color space's color model.

#### Return

A floating point value less than [getMaxValue](get-max-value.md)

#### Parameters

common

| | |
|---|---|
| component | The index of the component, from `0` to `3`, inclusive. |

#### See also

| |
|---|
| [ColorSpace.getMaxValue](get-max-value.md) |
| [ColorModel.componentCount](../-color-model/component-count.md) |
