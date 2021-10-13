package com.ice.repositorioejercicios.Room

import androidx.room.*

@Dao
interface PersonDao {

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