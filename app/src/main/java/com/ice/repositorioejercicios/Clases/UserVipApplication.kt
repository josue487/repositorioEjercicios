package com.ice.repositorioejercicios.Clases

import android.app.Application
import com.ice.repositorioejercicios.Dagger2.Component
import com.ice.repositorioejercicios.Dagger2.DaggerComponent
import com.ice.repositorioejercicios.Dagger2.Module

class UserVipApplication : Application() {


    companion object {
        lateinit var prefs : Prefs
    }


    private lateinit var hackRoComponent : Component

    override fun onCreate() {
        super.onCreate()
        hackRoComponent = DaggerComponent.builder().module(Module()).build()
        prefs  = Prefs(applicationContext)
    }


    fun getComponent() = hackRoComponent




}