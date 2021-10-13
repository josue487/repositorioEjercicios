package com.ice.repositorioejercicios

import android.content.Context
import android.content.SharedPreferences
import java.text.SimpleDateFormat
import java.util.*


//Para Date
fun Date?.customFormat() : String? {
    val formatear = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZZZ", Locale.getDefault())
    if(this!=null){
        return formatear.format(this)
    }
    return null
}

val Date?.formatSize : Int
get() = this.customFormat()?.length ?: 0



//Para Shared Preferences
fun SharedPreferences.guardarNombre (key:String, nombre:String){
    this.edit().putString(key, nombre).apply()
}

fun SharedPreferences.guardarBooleano (key:String, vip:Boolean){
    this.edit().putBoolean(key, vip).apply()
}

fun SharedPreferences.limpiarPreferencias (){
    this.edit().clear().apply()
}