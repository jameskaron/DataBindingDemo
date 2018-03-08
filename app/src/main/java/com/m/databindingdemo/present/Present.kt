package com.m.databindingdemo.present

import android.databinding.BindingAdapter
import android.graphics.drawable.Drawable
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.m.databindingdemo.model.Task
import com.squareup.picasso.Picasso


/**
 * Created by James on 06/02/2018.
 */
class Present {
    fun onSaveClick(view: View, task: Task){
        Toast.makeText(view.context,"do task${task.doTask()}", Toast.LENGTH_LONG).show()
    }

    fun onCompletedChanged(view: View, task: Task, completed: Boolean) {
        if (completed) {
            Toast.makeText(view.context,"do task${task.doTask()}", Toast.LENGTH_SHORT).show()
        }else{
            Toast.makeText(view.context,"do nothing", Toast.LENGTH_SHORT).show()
        }
    }

    fun onLongClicked(view: View, task: Task): Boolean{
        Toast.makeText(view.context,"do task${task.doTask()}", Toast.LENGTH_SHORT).show()
        return true
    }

    companion object {
        @JvmStatic
        @BindingAdapter("bind:text")
        fun customAdapter(view: TextView, text: String) {
            if (text == null){
                view.text = "n/a"
            }else{
                view.text = "test"
            }
        }
    }

}