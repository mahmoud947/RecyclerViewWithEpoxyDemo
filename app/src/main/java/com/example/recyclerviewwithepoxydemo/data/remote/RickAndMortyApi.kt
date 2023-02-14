package com.example.recyclerviewwithepoxydemo.data.remote

import com.example.recyclerviewwithepoxydemo.data.models.CharacterResponse
import retrofit2.http.GET


interface RickAndMortyApi {
@GET("character")
suspend fun getCharacters():CharacterResponse
}