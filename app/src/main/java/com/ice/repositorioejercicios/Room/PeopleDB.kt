package com.ice.repositorioejercicios.Room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [PersonRoom::class],
    version = 1
)
abstract class PeopleDB : RoomDatabase() {
    abstract fun personDao() : PersonDao
}