package com.example.sqldemo

import androidx.annotation.RequiresPermission.Read
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert


@Dao
interface Dao_db {

    @Insert
    fun insertData(std :  ModelStudent)

    @Read
    fun readData(std :  ModelStudent)

    @Delete
    fun delete(std : ModelStudent)
}