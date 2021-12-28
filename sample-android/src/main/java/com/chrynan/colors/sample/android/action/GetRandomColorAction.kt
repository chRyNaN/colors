package com.chrynan.colors.sample.android.action

import com.chrynan.colors.nextColor
import com.chrynan.colors.sample.android.state.RandomColorChange
import com.chrynan.colors.sample.android.state.RandomColorIntent
import com.chrynan.colors.sample.android.state.RandomColorState
import com.chrynan.colors.sample.android.util.content
import com.chrynan.colors.sample.android.util.toColorData
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
            val color = random.nextColor()
            val colorData = color.toColorData()

            emit(
                RandomColorChange.RetrievedColor(
                    color = colorData.background,
                    contentColor = colorData.foreground,
                    secondaryContentColor = colorData.foregroundSecondary,
                    colorVariant = colorData.foregroundAccent,
                    colorVariantContentColor = colorData.foregroundAccent.content(),
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
