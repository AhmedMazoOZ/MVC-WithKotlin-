package com.example.mvpwithkotlin

import com.example.mvpwithkotlin.model.Wisdom

class FakeApiService {

    private val wisdom_txt = listOf<Wisdom> (
        Wisdom("wisdom one", "27-3-2024"),
        Wisdom("wisdom two", "28-3-2024"),
        Wisdom("wisdom three", "29-3-2024"),
        Wisdom("wisdom four", "30-3-2024"),
        Wisdom("wisdom five", "31-3-2024"),
        Wisdom("wisdom six", "1-4-2024")
    )


    fun getrandomwisdom():Wisdom{
        val randwisdom=(Math.random()*wisdom_txt.size).toInt()
        return wisdom_txt[randwisdom]
    }
}


