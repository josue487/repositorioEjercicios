package com.ice.repositorioejercicios.SharedPreferences

import android.view.View

interface SharedPreferencesContract {

    interface View{
        fun checkUserValues(existName : Boolean)
        fun goToDetail()
        fun accederAlDetalle(view: android.view.View)

    }
    interface Presenter{
        fun checkUserValues()
        fun guardarUsuario(vip : Boolean, name : String)
    }
    interface Model{

    }

}