package com.m.databindingdemo.ui.activities

import android.databinding.DataBindingUtil
import android.os.Bundle
import com.m.databindingdemo.R
import com.m.databindingdemo.databinding.ActivityEventBus2Binding
import com.m.databindingdemo.present.EventPresent
import com.m.databindingdemo.viewholder.BaseActivity

class EventBus2Activity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_event_bus2)

        setViewModel()
    }

    override fun setViewModel() {
        val binding = DataBindingUtil.setContentView<ActivityEventBus2Binding>(this, R.layout.activity_event_bus2)

        binding.eventPresent = EventPresent()
    }
}
