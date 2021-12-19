package com.chrynan.colors.sample.android.presenter

import com.chrynan.colors.sample.android.action.LoadColorsAction
import com.chrynan.colors.sample.android.reducer.ColorListReducer
import com.chrynan.colors.sample.android.state.ColorListChange
import com.chrynan.colors.sample.android.state.ColorListIntent
import com.chrynan.colors.sample.android.state.ColorListState
import com.chrynan.presentation.BasePresenter
import com.chrynan.presentation.View
import com.chrynan.presentation.invoke
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.launchIn

class ColorListPresenter(
    override val view: View<ColorListIntent, ColorListState>,
    private val reducer: ColorListReducer,
    private val loadColors: LoadColorsAction
) : BasePresenter<ColorListIntent, ColorListState, ColorListChange>() {

    override fun onBind() {
        super.onBind()

        view.intents()
            .perform { intent, state ->
                when (intent) {
                    is ColorListIntent.Load -> loadColors(intent, state)
                }
            }
            .reduceWith(reducer)
            .startWithInitialState()
            .render()
            .catch { } // TODO log message
            .launchIn(coroutineScope)
    }
}
