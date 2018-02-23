package com.m.databindingdemo.present

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.Toast
import com.m.databindingdemo.ui.activities.RecycleViewActivity

/**
 * Created by James on 06/02/2018.
 */
class MyHandlers {

    fun onClickFriend(view: View) {
        Toast.makeText(view.context,"test method reference",Toast.LENGTH_LONG).show()
    }

    fun test(context: Context) {
        val intent = Intent(context, RecycleViewActivity::class.java)

    }
}