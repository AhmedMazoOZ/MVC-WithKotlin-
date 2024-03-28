package com.example.mvpwithkotlin

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.mvpwithkotlin.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    val api=FakeApiService()
    val database=FakeDatabase()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        fetchuser()

    }

    fun fetchwisdom(view: View) {
        val result=api.getrandomwisdom()
        binding.apply {
            dateTxt.text=result.date
            wisdomTxt.text=result.content
        }
    }
    fun fetchuser() {
        val result=database.generateCurrentUser()
        binding.title.text=result.username
    }
}