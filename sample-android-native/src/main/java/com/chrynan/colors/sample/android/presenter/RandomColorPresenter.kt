package com.chrynan.colors.sample.android.presenter

import com.chrynan.colors.sample.android.action.GetRandomColorAction
import com.chrynan.colors.sample.android.reducer.RandomColorReducer
import com.chrynan.colors.sample.android.state.RandomColorChange
import com.chrynan.colors.sample.android.state.RandomColorIntent
import com.chrynan.colors.sample.android.state.RandomColorState
import com.chrynan.presentation.BasePresenter
import com.chrynan.presentation.View
import com.chrynan.presentation.invoke
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.launchIn

class RandomColorPresenter(
    override val view: View<RandomColorIntent, RandomColorState>,
    private val reducer: RandomColorReducer,
    private val getRandomColor: GetRandomColorAction
) :
    BasePresenter<RandomColorIntent, RandomColorState, RandomColorChange>() {

    override fun onBind() {
        super.onBind()

        view.intents()
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
