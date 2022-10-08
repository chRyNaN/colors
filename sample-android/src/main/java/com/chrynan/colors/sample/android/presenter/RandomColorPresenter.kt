package com.chrynan.colors.sample.android.presenter

import com.chrynan.colors.sample.android.action.GetRandomColorAction
import com.chrynan.colors.sample.android.reducer.RandomColorReducer
import com.chrynan.colors.sample.android.state.RandomColorChange
import com.chrynan.colors.sample.android.state.RandomColorIntent
import com.chrynan.colors.sample.android.state.RandomColorState
import com.chrynan.presentation.ViewModel
import com.chrynan.presentation.invoke
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.launchIn

class RandomColorPresenter(
    private val reducer: RandomColorReducer,
    private val getRandomColor: GetRandomColorAction
) : ViewModel<RandomColorIntent, RandomColorState, RandomColorChange>() {

    @OptIn(FlowPreview::class)
    override fun onBind() {
        super.onBind()

        this.intents
            .perform { intent, state ->
                when (intent) {
                    is RandomColorIntent.GetRandomColor -> getRandomColor(intent, state)
                }
            }
            .reduceWith(reducer)
            .startWithInitialState()
            .render()
            .catch { } // TODO handle error
            .launchIn(coroutineScope)
    }
}
