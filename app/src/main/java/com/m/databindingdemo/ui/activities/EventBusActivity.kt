package com.m.databindingdemo.ui.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.Toast
import com.m.databindingdemo.R
import com.m.databindingdemo.event.MessageEvent
import kotlinx.android.synthetic.main.activity_event_bus.*
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import org.jetbrains.anko.sdk25.coroutines.onClick
import org.jetbrains.anko.startActivity

class EventBusActivity : AppCompatActivity() {

//    private val eventBus = EventBus.builder().addIndex(MyEventBusIndex()).build()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_bus)

        EventBus.getDefault().register(this)

        btn_eventbus.onClick {
//            EventBus.getDefault().post(MessageEvent("test event send"))
//            eventBus.post(MessageEvent("test event send"))
            startActivity<MainActivity>()
        }
    }


    override fun onDestroy() {
        super.onDestroy()
//        eventBus.unregister(this)
        EventBus.getDefault().unregister(this)

    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onMessageEvent(event: MessageEvent) {
        Toast.makeText(this,"test received event message", Toast.LENGTH_LONG)
        btn_eventbus.text = event.message
        Log.d("test", "test")
    }
}
