package com.chrynan.colors.sample.android.presenter

import com.chrynan.colors.sample.android.action.GeneratePaletteFromResourceAction
import com.chrynan.colors.sample.android.action.GeneratePaletteFromUriAction
import com.chrynan.colors.sample.android.reducer.PaletteReducer
import com.chrynan.colors.sample.android.state.PaletteChange
import com.chrynan.colors.sample.android.state.PaletteIntent
import com.chrynan.colors.sample.android.state.PaletteState
import com.chrynan.presentation.ViewModel
import com.chrynan.presentation.invoke
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.launchIn

class PalettePresenter(
    private val reducer: PaletteReducer,
    private val generatePaletteFromResources: GeneratePaletteFromResourceAction,
    private val generatePaletteFromUri: GeneratePaletteFromUriAction
) : ViewModel<PaletteIntent, PaletteState, PaletteChange>() {

    @OptIn(FlowPreview::class)
    override fun onBind() {
        super.onBind()

        this.intents
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
