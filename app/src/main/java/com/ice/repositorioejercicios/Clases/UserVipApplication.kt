package com.ice.repositorioejercicios.Clases

import android.app.Application

class UserVipApplication : Application() {


    companion object {
        lateinit var prefs : Prefs
    }


    override fun onCreate() {
        super.onCreate()
        prefs  = Prefs(applicationContext)
    }


}