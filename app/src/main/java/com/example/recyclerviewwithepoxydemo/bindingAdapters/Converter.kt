package com.example.recyclerviewwithepoxydemo.bindingAdapters

import android.widget.EditText
import android.widget.TextView
import androidx.databinding.InverseMethod

object Converter {
    @InverseMethod("intToString")
    @JvmStatic fun intToString(
        view: TextView,
        value: Int
    ): String {
        return value.toString()
    }

}