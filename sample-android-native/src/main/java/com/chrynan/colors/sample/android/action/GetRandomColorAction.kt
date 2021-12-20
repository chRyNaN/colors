package com.chrynan.colors.sample.android.action

import com.chrynan.colors.darker
import com.chrynan.colors.nextColor
import com.chrynan.colors.sample.android.state.RandomColorChange
import com.chrynan.colors.sample.android.state.RandomColorIntent
import com.chrynan.colors.sample.android.state.RandomColorState
import com.chrynan.colors.sample.android.util.content
import com.chrynan.colors.sample.android.util.normalize
import com.chrynan.presentation.Action
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlin.random.Random

class GetRandomColorAction :
    Action<RandomColorIntent.GetRandomColor, RandomColorState, RandomColorChange> {

    private val random = Random.Default

    override suspend fun perform(
        intent: RandomColorIntent.GetRandomColor,
        state: RandomColorState?
    ): Flow<RandomColorChange> = flow {
        try {
            val color = random.nextColor().normalize()
            val textColor = color.content()
            val secondaryTextColor = textColor.copy(component4 = textColor.alpha / 2)
            val colorVariant = color.toRgbaColor().darker(by = 0.25f)
            val colorVariantContentColor = colorVariant.content()

            emit(
                RandomColorChange.RetrievedColor(
                    color = color,
                    contentColor = textColor,
                    secondaryContentColor = secondaryTextColor,
                    colorVariant = colorVariant,
                    colorVariantContentColor = colorVariantContentColor,
                )
            )
        } catch (e: Exception) {
            emit(
                RandomColorChange.EncounteredError(
                    message = e.message ?: "Error generating random color."
                )
            )
        }
    }
}
