package com.m.databindingdemo.viewholder

import android.databinding.ObservableInt
import android.view.View
import android.support.v4.content.ContextCompat.startActivity
import android.content.Intent
import com.m.databindingdemo.ui.activities.RecycleViewActivity


/**
 * Created by James on 22/02/2018.
 */
class MainActivityVM {

    var goToSimple = ObservableInt()

    fun goToNext(view: View) {
        goToSimple.notifyChange()
    }

    fun onClick(view: View) {
        val context = view.context
        val intent = Intent(context, RecycleViewActivity::class.java)
        context.startActivity(intent)
    }

}