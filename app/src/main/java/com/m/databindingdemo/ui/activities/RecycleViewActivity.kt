package com.m.databindingdemo.ui.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.m.databindingdemo.R
import com.m.databindingdemo.model.User
import com.m.databindingdemo.ui.adapters.RecyclerViewAdapter
import kotlinx.android.synthetic.main.activity_recycle_view.*

class RecycleViewActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view)

        val layoutManager = LinearLayoutManager(this)
        recycler_view.layoutManager = layoutManager
        recycler_view.adapter = RecyclerViewAdapter(initUsers())

    }

    private fun initUsers() : MutableList<User>{
        val userList = mutableListOf<User>()
        for (i in 1..5) {
            var user = User()
            user.firstname.set("name $i")
            user.age.set(i)
            userList.add(user)
        }
        return userList
    }
}
