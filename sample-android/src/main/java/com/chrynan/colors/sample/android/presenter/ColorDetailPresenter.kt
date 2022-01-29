package com.chrynan.colors.sample.android.presenter

import com.chrynan.colors.sample.android.action.LoadColorDetailAction
import com.chrynan.colors.sample.android.reducer.ColorDetailReducer
import com.chrynan.colors.sample.android.state.ColorDetailChange
import com.chrynan.colors.sample.android.state.ColorDetailIntent
import com.chrynan.colors.sample.android.state.ColorDetailState
import com.chrynan.presentation.BasePresenter
import com.chrynan.presentation.invoke
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.launchIn

class ColorDetailPresenter(
    override val intents: Flow<ColorDetailIntent>,
    private val reducer: ColorDetailReducer,
    private val loadDetail: LoadColorDetailAction
) : BasePresenter<ColorDetailIntent, ColorDetailState, ColorDetailChange>() {

    override fun onBind() {
        super.onBind()

        this.intents
            .perform { intent, state ->
                when (intent) {
                    is ColorDetailIntent.Load -> loadDetail(intent, state)
                }
            }
            .reduceWith(reducer)
            .startWithInitialState()
            .render()
            .catch { } // TODO log error
            .launchIn(coroutineScope)
    }
}
