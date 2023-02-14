package com.example.recyclerviewwithepoxydemo.ui.main

import com.airbnb.epoxy.TypedEpoxyController
import com.example.recyclerviewwithepoxydemo.BR
import com.example.recyclerviewwithepoxydemo.character
import com.example.recyclerviewwithepoxydemo.data.models.Character

class RickAndMortyEpoxyController:TypedEpoxyController<List<Character>> (){
    override fun buildModels(data: List<Character>?) {
        data?.forEachIndexed {index, character ->
            character {
                id(index)
                character(character)
            }
        }
    }
}