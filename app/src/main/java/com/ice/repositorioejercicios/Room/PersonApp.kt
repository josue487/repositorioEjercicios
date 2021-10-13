package com.ice.repositorioejercicios.Room

import android.app.Application
import androidx.room.Room

class PersonApp : Application() {

    val room = Room.databaseBuilder(this, PeopleDB ::class.java,"PersonRoom").build()

}