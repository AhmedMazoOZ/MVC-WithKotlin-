package com.example.mvpwithkotlin

import com.example.mvpwithkotlin.model.user

class FakeDatabase {
    fun generateCurrentUser():user{
        return user("Ahmed azooz",1995)
    }
}