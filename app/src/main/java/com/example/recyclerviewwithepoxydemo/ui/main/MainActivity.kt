package com.example.recyclerviewwithepoxydemo.ui.main


import android.util.Log
import com.example.recyclerviewwithepoxydemo.R
import com.example.recyclerviewwithepoxydemo.character
import com.example.recyclerviewwithepoxydemo.databinding.ActivityMainBinding
import com.example.recyclerviewwithepoxydemo.ui.base.BaseActivity
import com.example.recyclerviewwithepoxydemo.ui.uiModel.CharacterEpoxyModel
import com.example.superstore.util.getData
import dagger.hilt.android.AndroidEntryPoint
import com.example.recyclerviewwithepoxydemo.data.models.Character

private const val TAG = "MainActivity"

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainViewModel>(
    layoutId = R.layout.activity_main,
    viewModelClass = MainViewModel::class.java
) {
    private var characters: MutableList<Character> = mutableListOf()
    val rickAndMortyEpoxyController = RickAndMortyEpoxyController()
    override fun onInitView() {
        binding.epoxyRvCharacters.setController(rickAndMortyEpoxyController)
    }

    override fun onInitViewModel() {
        viewModel.character.observe(this) {
            it.getData()?.let { it1 ->
                rickAndMortyEpoxyController.setData(it1)
            }
        }

    }
}