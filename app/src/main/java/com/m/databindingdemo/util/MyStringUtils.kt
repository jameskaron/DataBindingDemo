package com.m.databindingdemo.util

import android.databinding.BindingAdapter

/**
 * Created by James on 07/02/2018.
 */
class MyStringUtils {


    companion object {
        @JvmStatic
        fun capitalize(content: String) = "$content string util"
    }
}