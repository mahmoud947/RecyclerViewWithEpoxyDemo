package com.example.recyclerviewwithepoxydemo.ui.base

import androidx.lifecycle.ViewModel
import com.example.recyclerviewwithepoxydemo.data.base.BaseRepository
import javax.inject.Inject

open class BaseViewModel @Inject constructor(
    private val repository: BaseRepository
) : ViewModel() {


//    fun changeLocal(lng: LNG) {
//        repository.changeLocal(lng)
//    }
//
//    fun getLocal(): LNG = repository.getLocal()
//
//    fun getLocalizationByKey(keys: List<String>, lng: LNG): LiveData<Map<String, String>> =
//        liveData(Dispatchers.IO + errorHandle()) {
//            val localizationResponse = repository.getScreenLocalization(keys)
//            when (lng) {
//                LNG.AR -> {
//                    emit(localizationResponse.mapValues {
//                        it.value.ABBR_AR
//                    })
//                }
//                LNG.EN -> {
//                    emit(localizationResponse.mapValues {
//                        it.value.ABBR
//                    })
//                }
//
//            }
//
//
//        }

    override fun onCleared() {
        super.onCleared()

    }
}