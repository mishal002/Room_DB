package com.example.sqldemo

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Student")
data class ModelStudent(

    @PrimaryKey(autoGenerate = true)
    val id : Int,
    val name : String,
    val phone : String,
    val email : String

)
