package com.chrynan.colors.sample.android.presenter

import com.chrynan.colors.sample.android.action.GeneratePaletteFromResourceAction
import com.chrynan.colors.sample.android.action.GeneratePaletteFromUriAction
import com.chrynan.colors.sample.android.reducer.PaletteReducer
import com.chrynan.colors.sample.android.state.PaletteChange
import com.chrynan.colors.sample.android.state.PaletteIntent
import com.chrynan.colors.sample.android.state.PaletteState
import com.chrynan.presentation.BasePresenter
import com.chrynan.presentation.View
import com.chrynan.presentation.invoke
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.launchIn

class PalettePresenter(
    override val view: View<PaletteIntent, PaletteState>,
    private val reducer: PaletteReducer,
    private val generatePaletteFromResources: GeneratePaletteFromResourceAction,
    private val generatePaletteFromUri: GeneratePaletteFromUriAction
) : BasePresenter<PaletteIntent, PaletteState, PaletteChange>() {

    override fun onBind() {
        super.onBind()

        view.intents()
            .perform { intent, state ->
                when (intent) {
                    is PaletteIntent.LoadResource -> generatePaletteFromResources(intent, state)
                    is PaletteIntent.LoadUri -> generatePaletteFromUri(intent, state)
                }
            }
            .reduceWith(reducer)
            .startWithInitialState()
            .render()
            .catch { } // TODO perform error handling
            .launchIn(coroutineScope)
    }
}
