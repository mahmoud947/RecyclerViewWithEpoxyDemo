package com.example.recyclerviewwithepoxydemo.data.models


import androidx.annotation.Keep

@Keep
data class Info(
    val count: Int,
    val next: String,
    val pages: Int,
    val prev: Any
)