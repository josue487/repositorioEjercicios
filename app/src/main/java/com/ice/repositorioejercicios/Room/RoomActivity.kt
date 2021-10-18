package com.ice.repositorioejercicios.Room

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ice.repositorioejercicios.R

class roomActivity : AppCompatActivity() , RoomContract.View{

    val roomPresenter = RoomPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_room)

        val people = roomPresenter.getAll()

    }
}