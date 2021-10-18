package com.ice.repositorioejercicios.SharedPreferences

import com.ice.repositorioejercicios.Clases.UserVipApplication.Companion.prefs

class SharedPreferencesPresenter (private val sharedPreferencesView : SharedPreferencesContract.View, private val sharedPreferencesModel : SharedPreferencesContract.Model) : SharedPreferencesContract.Presenter{

    override fun checkUserValues(){
        sharedPreferencesView.checkUserValues(prefs.getNombre().isNotEmpty())
    }

    override fun guardarUsuario(vip : Boolean, name : String){
        prefs.guardarNombre(name)
        prefs.guardarVIP(vip)
    }

}