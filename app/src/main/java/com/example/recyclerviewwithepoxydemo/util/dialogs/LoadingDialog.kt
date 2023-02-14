package com.example.recyclerviewwithepoxydemo.util.dialogs

import android.app.Activity
import android.view.LayoutInflater
import androidx.appcompat.app.AlertDialog
import com.example.recyclerviewwithepoxydemo.R


class LoadingDialog constructor(
    private val activity: Activity,

    ) {
    private lateinit var dialog: AlertDialog
    private var isShow: Boolean = false
    fun startLoadingDialog() {
        if (isShow)
            return
        isShow = true
        val builder: AlertDialog.Builder = AlertDialog.Builder(activity, R.style.WrapContentDialog)
        val inflater: LayoutInflater = activity.layoutInflater
        builder.setView(inflater.inflate(R.layout.loading_dialog, null))
        builder.setCancelable(false)
        dialog = builder.create()
        dialog.show()

    }

    fun dismissDialog() {
        if (isShow) {
            dialog.dismiss()
            isShow = false
        }

    }
}