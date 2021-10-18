package com.ice.repositorioejercicios.Room

import android.content.Context
import androidx.room.*

interface RoomContract {
    interface View{

    }
    interface Presenter{
        fun init(context : Context)
        fun getAll()
    }
    @Dao
    interface Model {

        @Query("Select * from PersonRoom")
        fun getAll() : List<PersonRoom>

        @Query("Select * from PersonRoom where id = :id")
        fun getById(id : Int) : PersonRoom

        @Update
        fun update(person : PersonRoom)

        @Insert
        fun insert(pople : List<PersonRoom>)

        @Delete
        fun delete(person : PersonRoom)
    }
}