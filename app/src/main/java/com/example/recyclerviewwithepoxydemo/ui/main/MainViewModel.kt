package com.example.recyclerviewwithepoxydemo.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.example.superstore.util.errorHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


import com.example.recyclerviewwithepoxydemo.data.repository.MainRepository
import com.example.recyclerviewwithepoxydemo.ui.base.BaseViewModel
import com.example.superstore.util.DataState
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import com.example.recyclerviewwithepoxydemo.data.models.Character

@HiltViewModel
class MainViewModel @Inject constructor(
  private val repository: MainRepository
) : BaseViewModel(repository) {

    private val _character: MutableLiveData<DataState<List<Character>>> = MutableLiveData()
    val character:LiveData<DataState<List<Character>>> get() = _character

    init {
        getCharacter()
    }
    fun getCharacter(){
        viewModelScope.launch (Dispatchers.IO+ errorHandler(_character)){
            val response = repository.getCharacters()
            _character.postValue(DataState.Success(response.results))
        }
    }

}