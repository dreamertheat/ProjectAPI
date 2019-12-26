package com.jamesreubengruta.projectapi.presentation.activities.login_profile

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.jamesreubengruta.projectapi.R
import com.jamesreubengruta.projectapi.presentation.fragments.FragmentHelp
import com.jamesreubengruta.projectapi.presentation.fragments.FragmentLogin
import com.jamesreubengruta.projectapi.presentation.fragments.FragmentProfile
import com.jamesreubengruta.projectapi.presentation.fragments.FragmentSettings
import com.jamesreubengruta.projectapi.presentation.logic.LoginProfileX
import com.jamesreubengruta.projectapi.presentation.viewmodels.LoginProfileVM
import com.jamesreubengruta.projectapi.presentation.viewmodels.LoginProfileVMF

class LoginProfile : AppCompatActivity(), View.OnClickListener, LoginProfileX {

    private lateinit var vm : LoginProfileVM

    fun getLpx():LoginProfileX{
        return this
    }

    override fun onClick(v: View?) {
    }

    override fun onCreate(sis: Bundle?) {

        super.onCreate(sis)
        setContentView(R.layout.activity_login_profile)
        //vm = ViewModelProvider.AndroidViewModelFactory(Application()).create(LoginProfileVM::class.java)
        val vmf = LoginProfileVMF(application,this)
        vm = ViewModelProvider(this, vmf).get(LoginProfileVM::class.java)

        setUpView(FragmentLogin(this))

    }

    override fun showFragment() {
        setUpView(FragmentProfile())
    }

    private fun setUpView( frag:Fragment){

        var fragman = supportFragmentManager.beginTransaction()
        fragman.replace(R.id.rl_fragment, frag)
        fragman.addToBackStack("fragger")
       /* fragman.add(R.id.rl_fragment, FragmentSettings())
        fragman.add(R.id.rl_fragment, FragmentHelp())
        fragman.add(R.id.rl_fragment, FragmentProfile())*/
        fragman.commit()

    }


}
