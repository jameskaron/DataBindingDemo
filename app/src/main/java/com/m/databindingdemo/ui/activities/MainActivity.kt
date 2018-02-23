package com.m.databindingdemo.ui.activities

import android.databinding.DataBindingUtil
import android.databinding.Observable
import android.os.Bundle
import com.m.databindingdemo.R
import com.m.databindingdemo.databinding.ActivityMainBinding
import com.m.databindingdemo.present.MyHandlers
import com.m.databindingdemo.model.Task
import com.m.databindingdemo.model.User
import com.m.databindingdemo.present.Present
import com.m.databindingdemo.util.DataBindingUtils
import com.m.databindingdemo.viewholder.BaseActivity
import com.m.databindingdemo.viewholder.MainActivityVM
import org.jetbrains.anko.startActivity

class MainActivity : BaseActivity() {


    private var mainActivityVM: MainActivityVM? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainActivityVM = MainActivityVM()

        setViewModel()

        addCallBack()
    }

    private fun addCallBack() {

        DataBindingUtils.addCallBack(
                this,
                mainActivityVM?.goToSimple,
                object : Observable.OnPropertyChangedCallback() {
                    override fun onPropertyChanged(p0: Observable?, p1: Int) {
                        goToNext()
                    }

                })
    }

    override fun setViewModel() {
        val binding = DataBindingUtil.setContentView<ActivityMainBinding>(this, R.layout.activity_main)
        var user = User()
        user.firstname.set("firstname")
        user.lastname.set("lastname")
        user.displayName.set("displayname")
        user.isAdult.set(true)
        //Observable Collection
        user.map["firstName"] = "Google"
        user.map["lastName"] = "Inc."
        user.map["age"] = 17

        user.obList.add("Google")
        user.obList.add("Inc.")
        user.obList.add(17)

        binding.user = user
        binding.handlers = MyHandlers()
        binding.task = Task()
        binding.present = Present()
        binding.index = 1
        binding.userList = listOf("a","b","c")
        binding.firstname = "firstname"
        binding.map = mapOf("firstname" to "value")
        binding.obMap = user.map
        binding.obList = user.obList

        binding.mainActivityVM = mainActivityVM


    }

    fun goToNext() {
        startActivity<RecycleViewActivity>()
    }


}
