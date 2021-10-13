package com.ice.repositorioejercicios.Room

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class PersonRoom(
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val name :  String,
    val age : Int,
    val address : String
)
