package com.m.databindingdemo.present

import android.content.Intent
import android.view.View
import android.widget.Toast
import com.m.databindingdemo.event.MessageEvent
import com.m.databindingdemo.ui.activities.EventBusActivity
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import org.jetbrains.anko.longToast

/**
 * Created by James on 16/03/2018.
 */
class EventPresent {

    fun sendMessage(view: View){
        EventBus.getDefault().post(MessageEvent("test event send"))
//        val context = view.context
//        val intent: Intent?
//        intent = Intent(context, EventBusActivity::class.java)
//        context.startActivity(intent)
    }
}