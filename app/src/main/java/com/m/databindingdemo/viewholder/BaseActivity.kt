package com.m.databindingdemo.viewholder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

open abstract class BaseActivity : AppCompatActivity() {

    abstract fun setViewModel()

}
