package com.jamesreubengruta.projectapi.presentation.activities.login_profile

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.lifecycle.ViewModelProvider
import com.jamesreubengruta.projectapi.R
import com.jamesreubengruta.projectapi.presentation.fragments.FragmentLogin
import com.jamesreubengruta.projectapi.presentation.logic.LoginProfileX
import com.jamesreubengruta.projectapi.presentation.viewmodels.LoginProfileVM
import com.jamesreubengruta.projectapi.presentation.viewmodels.LoginProfileVMF

class LoginProfile : AppCompatActivity(), View.OnClickListener, LoginProfileX {

    private lateinit var vm : LoginProfileVM


    override fun onClick(v: View?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(sis: Bundle?) {

        super.onCreate(sis)
        setContentView(R.layout.activity_login_profile)
        //vm = ViewModelProvider.AndroidViewModelFactory(Application()).create(LoginProfileVM::class.java)
        vm = LoginProfileVM(application,this)


        setUpView()

    }

    override fun showFragment() {

    }

    private fun setUpView(){

        val fragLogin = FragmentLogin();
        var fragman = supportFragmentManager.beginTransaction()
        fragman.replace(R.id.rl_fragment, fragLogin)
        fragman.commit()



    }
}
