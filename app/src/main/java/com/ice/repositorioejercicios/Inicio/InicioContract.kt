package com.ice.repositorioejercicios.Inicio

import android.view.View

interface InicioContract {

    interface View{
        fun initActivityNivelBasico(v : android.view.View)
        fun initActivityçNivelMedio(v : android.view.View)
        fun initActivityReciclerView(v : android.view.View)
        fun initActivityViewPage(v : android.view.View)
        fun initActivityPicker(v : android.view.View)
        fun initActivityWebView(view: android.view.View)
        fun initActivitySharedPreferences(view: android.view.View)
    }

    interface Presenter{

    }

    interface Model{

    }
}