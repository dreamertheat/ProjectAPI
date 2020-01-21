package com.jamesreubengruta.projectapi.presentation.activities.login_profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.jamesreubengruta.projectapi.R
import com.jamesreubengruta.projectapi.framework.di.MasterViewModelFactory
import com.jamesreubengruta.projectapi.presentation.fragments.FragmentLogin
import com.jamesreubengruta.projectapi.presentation.fragments.FragmentProfile
import com.jamesreubengruta.projectapi.presentation.delegates.LoginProfileDelegate
import com.jamesreubengruta.projectapi.presentation.viewmodels.LoginProfileVM

class LoginProfile : AppCompatActivity(), View.OnClickListener, LoginProfileDelegate {

    private lateinit var vm : LoginProfileVM

    fun getLpx():LoginProfileDelegate{
        return this
    }

    override fun onClick(v: View?) {

    }

    override fun onCreate(sis: Bundle?) {

        super.onCreate(sis)
        setContentView(R.layout.activity_login_profile)
        //vm = ViewModelProvider.AndroidViewModelFactory(Application()).create(LoginProfileVM::class.java)


        //val vmf = LoginProfileVMF(application,this)
        vm = ViewModelProvider(this, MasterViewModelFactory()).get(LoginProfileVM::class.java)

        //default fragment
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
