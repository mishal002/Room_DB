package com.example.sqldemo

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [ModelStudent::class], version = 1)
abstract class Room_db : RoomDatabase() {

    abstract fun dao_db(): Dao_db

    companion object {
        fun createRoomDb(context: Context): Room_db {
            var room = Room.databaseBuilder(context.applicationContext, Room_db::class.java, "Std")
                .allowMainThreadQueries().fallbackToDestructiveMigration().build()

            return room
        }
    }

}