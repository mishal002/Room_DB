package com.example.sqldemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.sqldemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var room_db = Room_db.createRoomDb(this)


        binding.submitBtn.setOnClickListener {
            var s1 = ModelStudent(0, binding.nameEdt.text.toString(), binding.phoneEdt.text.toString(), binding.emailEdt.text.toString())
            room_db.dao_db().insertData(s1)
        }
    }

}