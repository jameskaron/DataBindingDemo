package com.m.databindingdemo.viewholder

import android.content.Intent
import android.databinding.ObservableInt
import android.view.View
import com.m.databindingdemo.R
import com.m.databindingdemo.ui.activities.EventBusActivity
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
        var intent: Intent? = null

        when (view.id) {
            R.id.btn_to_recycler_one -> {
                intent = Intent(context, RecycleViewActivity::class.java)
            }
            R.id.btn_to_eventbus -> {
                intent = Intent(context, EventBusActivity::class.java)
            }
        }

        context.startActivity(intent)
    }


}