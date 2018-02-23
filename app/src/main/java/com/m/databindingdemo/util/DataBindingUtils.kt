package com.m.databindingdemo.util

import android.databinding.Observable
import android.util.ArrayMap
import com.m.databindingdemo.viewholder.BaseActivity

/**
 * Created by James on 22/02/2018.
 */
class DataBindingUtils {

    companion object {

        var commonMap  = ArrayMap<BaseActivity, ArrayMap<Observable, Observable.OnPropertyChangedCallback>>()

        fun addCallBack(baseActivity: BaseActivity, observable: Observable?, callback: Observable.OnPropertyChangedCallback){
            var callbackArrayMap = commonMap[baseActivity]
            if (callbackArrayMap == null) {
                callbackArrayMap = ArrayMap()
                commonMap[baseActivity] = callbackArrayMap
            }
            observable?.addOnPropertyChangedCallback(callback)
            callbackArrayMap[observable] = callback
        }

        fun removeCallBack(activity: BaseActivity) {
            var callbackArrayMap = commonMap[activity]
            if (callbackArrayMap != null) {
                for (observable in callbackArrayMap.keys) {
                    observable.removeOnPropertyChangedCallback(callbackArrayMap[observable])
                }
            }
        }
    }


}