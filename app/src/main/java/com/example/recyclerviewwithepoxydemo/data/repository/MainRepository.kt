package com.example.recyclerviewwithepoxydemo.data.repository

import com.example.recyclerviewwithepoxydemo.data.base.BaseRepository
import com.example.recyclerviewwithepoxydemo.data.models.CharacterResponse
import com.example.recyclerviewwithepoxydemo.data.remote.RickAndMortyApi
import javax.inject.Inject

class MainRepository @Inject constructor(
  private val api: RickAndMortyApi
) : BaseRepository() {

    suspend fun getCharacters():CharacterResponse = api.getCharacters()
}