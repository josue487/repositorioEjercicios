package com.ice.repositorioejercicios.Clases

import android.content.Context
import com.ice.repositorioejercicios.guardarBooleano
import com.ice.repositorioejercicios.guardarNombre
import com.ice.repositorioejercicios.limpiarPreferencias

class Prefs(val context : Context) {
    val SHARED_NAME = "MyBD"
    val SHARED_NOMBRE_USUARIO = "NombreDeUsuario"
    val SHARED_VIP = "vip"
    val storage = context.getSharedPreferences(SHARED_NAME, 0)

    fun guardarNombre( nombre : String){
        storage.guardarNombre(SHARED_NOMBRE_USUARIO, nombre)
    }

    fun guardarVIP(vip:Boolean){
        storage.guardarBooleano(SHARED_VIP,vip)
    }

    fun getNombre() : String {
        return storage.getString(SHARED_NOMBRE_USUARIO,"")!!
    }

    fun getVip() : Boolean{
        return storage.getBoolean(SHARED_VIP,false)
    }

    fun wipe(){
        storage.limpiarPreferencias()
    }

}