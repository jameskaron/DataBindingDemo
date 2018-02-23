package com.m.databindingdemo.present

import android.view.View
import android.widget.TextView
import android.widget.Toast
import com.m.databindingdemo.model.Task

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

}