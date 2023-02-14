package com.example.recyclerviewwithepoxydemo.data.models


import androidx.annotation.Keep

@Keep
data class CharacterResponse(
    val info: Info,
    val results: List<Character>
)