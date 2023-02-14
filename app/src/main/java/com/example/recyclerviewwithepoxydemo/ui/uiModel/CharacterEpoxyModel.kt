package com.example.recyclerviewwithepoxydemo.ui.uiModel
import androidx.databinding.ViewDataBinding
import com.airbnb.epoxy.DataBindingEpoxyModel
import com.example.recyclerviewwithepoxydemo.BR
import com.example.recyclerviewwithepoxydemo.R
import com.example.recyclerviewwithepoxydemo.data.models.Character

data class CharacterEpoxyModel(
    val character: Character
): DataBindingEpoxyModel() {
    override fun getDefaultLayout(): Int {
        TODO("Not yet implemented")
    }

    override fun setDataBindingVariables(binding: ViewDataBinding?) {
        TODO("Not yet implemented")
    }


}