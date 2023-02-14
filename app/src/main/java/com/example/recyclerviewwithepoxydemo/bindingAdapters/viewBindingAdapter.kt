package com.example.recyclerviewwithepoxydemo.bindingAdapters

import android.view.View
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import androidx.paging.LoadState
import com.example.recyclerviewwithepoxydemo.R


@BindingAdapter("goneIfTrue")
fun goneIfTrue(view: View, boolean: Boolean) {
    view.visibility = if (boolean) View.GONE else View.VISIBLE
}


@BindingAdapter("setLoadingState")
fun bindLoadingState(view: View,loadState: LoadState){
    view.isVisible = loadState is LoadState.Loading
}
@BindingAdapter("setErrorState")
fun bindErrorState(view: View,loadState: LoadState){
    view.isVisible = loadState is LoadState.Error
}