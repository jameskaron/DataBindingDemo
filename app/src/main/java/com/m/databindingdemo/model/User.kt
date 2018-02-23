package com.m.databindingdemo.model

import android.databinding.ObservableArrayList
import android.databinding.ObservableArrayMap
import android.databinding.ObservableBoolean
import android.databinding.ObservableField

/**
 * Created by James on 03/02/2018.
 */
class User {

    var firstname: ObservableField<String> = ObservableField()
    var lastname: ObservableField<String> = ObservableField()
    var isAdult: ObservableBoolean = ObservableBoolean()
    var displayName: ObservableField<String> = ObservableField()

    var map: ObservableArrayMap<String, Any> = ObservableArrayMap()
    var obList: ObservableArrayList<Any> = ObservableArrayList()

}