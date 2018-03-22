package com.m.databindingdemo.present

import android.view.View
import android.widget.Toast
import com.m.databindingdemo.event.MessageEvent
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import org.jetbrains.anko.longToast

/**
 * Created by James on 16/03/2018.
 */
class EventPresent {

    fun sendMessage(){
        println("================")
        EventBus.getDefault().post(MessageEvent("test event send"))
    }
}