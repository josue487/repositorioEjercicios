package com.ice.repositorioejercicios.Result

import com.ice.repositorioejercicios.Clases.UserVipApplication
import com.ice.repositorioejercicios.Clases.UserVipApplication.Companion.prefs

class ResultPresenter(private val resultView : ResultContract.View, private val resultModel: ResultContract.Model) : ResultContract.Presenter {
    override fun iniciarApp() {
        resultView.iniciarApp(prefs.getNombre(),prefs.getVip())
    }

    override fun cerrarSecion() {
        prefs.wipe()
    }

}