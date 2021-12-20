package com.chrynan.colors.sample.android.action

import com.chrynan.colors.Color
import com.chrynan.colors.contrast
import com.chrynan.colors.nextColor
import com.chrynan.colors.sample.android.state.RandomColorChange
import com.chrynan.colors.sample.android.state.RandomColorIntent
import com.chrynan.colors.sample.android.state.RandomColorState
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
            val textColor = if (color.contrast(Color.White) > 0.5f) {
                Color.White
            } else {
                Color.Black
            }
            val secondaryTextColor = textColor.copy(component4 = textColor.alpha / 2)

            emit(
                RandomColorChange.RetrievedColor(
                    color = color,
                    textColor = textColor,
                    secondaryTextColor = secondaryTextColor
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
