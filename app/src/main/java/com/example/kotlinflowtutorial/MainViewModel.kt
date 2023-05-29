package com.example.kotlinflowtutorial

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class MainViewModel : ViewModel() {

    lateinit var gamesData: LiveData<String>

    fun getGames(): Flow<String> {
        return flow {
            val games = listOf(
                "COD",
                "GTA",
                "Zelda",
                "FIFA",
                "BF",
                "Cuphead"
            )
            for (game in games){
                emit(game)
                delay(2000L)
        }
    }



    }
}