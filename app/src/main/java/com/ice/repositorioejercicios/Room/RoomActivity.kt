package com.ice.repositorioejercicios.Room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ice.repositorioejercicios.R

class roomActivity : AppCompatActivity() {

    val app = applicationContext as PersonApp

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)

        val people = app.room.personDao().getAll()

    }
}