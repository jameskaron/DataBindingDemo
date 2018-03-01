package com.m.databindingdemo.ui.adapters

import android.databinding.DataBindingUtil
import android.support.v7.widget.RecyclerView
import android.support.v7.widget.RecyclerView.ViewHolder
import android.view.LayoutInflater
import android.view.ViewGroup
import com.m.databindingdemo.BR
import com.m.databindingdemo.R
import com.m.databindingdemo.databinding.RecyclerViewItemBinding
import com.m.databindingdemo.model.User

/**
 * Created by James on 23/02/2018.
 */
class RecyclerViewAdapter(private var userList: MutableList<User>) : RecyclerView.Adapter<RecyclerViewAdapter.TestViewHolder>() {

    override fun getItemCount(): Int  = userList.size

    override fun onBindViewHolder(holder: TestViewHolder?, position: Int) {
        holder?.bind(userList[position])
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): TestViewHolder {
        val binding = DataBindingUtil.inflate<RecyclerViewItemBinding>(
                LayoutInflater.from(parent?.context),
                R.layout.recycler_view_item,
                parent,
                false
        )
        return TestViewHolder(binding)
    }


    class TestViewHolder(private val binding: RecyclerViewItemBinding) : ViewHolder(binding.root) {
        fun bind(data: User) {
//            binding.setVariable(BR.user,data)
            binding.user = data
            binding.executePendingBindings()
        }
    }
}