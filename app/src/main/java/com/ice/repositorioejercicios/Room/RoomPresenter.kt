package com.ice.repositorioejercicios.Room

import android.content.Context

class RoomPresenter (private val roomView : RoomContract.View) : RoomContract.Presenter {

    private lateinit var app : PersonApp


    override fun init(context : Context){
        app = context as PersonApp
    }

    override fun getAll(){
        app.room.personDao().getAll()
    }
}