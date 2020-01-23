package com.jamesreubengruta.projectapi.presentation.activities.login_profile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.webkit.WebSettings
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.jamesreubengruta.projectapi.R
import com.jamesreubengruta.projectapi.framework.di.MasterViewModelFactory
import com.jamesreubengruta.projectapi.presentation.fragments.FragmentLogin
import com.jamesreubengruta.projectapi.presentation.fragments.FragmentProfile
import com.jamesreubengruta.projectapi.presentation.delegates.LoginProfileDelegate
import com.jamesreubengruta.projectapi.presentation.viewmodels.LoginProfileVM
import kotlinx.android.synthetic.main.activity_web_master.*

class WebMaster : AppCompatActivity(), View.OnClickListener, LoginProfileDelegate {

    private lateinit var vm : LoginProfileVM

    fun getLpx():LoginProfileDelegate{
        return this
    }

    override fun onClick(v: View?) {

    }

    override fun onCreate(sis: Bundle?) {

        super.onCreate(sis)
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);

        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_web_master)
        //vm = ViewModelProvider.AndroidViewModelFactory(Application()).create(LoginProfileVM::class.java)
        val wvc = CustomWVC("https://ph.speedycourse.com/?redirected=true",iv_icon)
        wv.setWebViewClient(wvc)

        wv.getSettings().setLoadsImagesAutomatically(true);

        wv.getSettings().setJavaScriptEnabled(true);

        wv.getSettings().setBuiltInZoomControls(true);

        wv.getSettings().setSupportZoom(true);

        wv.getSettings().setLoadWithOverviewMode(true);

        wv.getSettings().setUseWideViewPort(true);

        wv.getSettings().setAllowContentAccess(true);

        wv.loadUrl("https://ph.speedycourse.com/?redirected=true");

        //wv.setWebViewClient( WebViewClient())

        //val vmf = LoginProfileVMF(application,this)
        //vm = ViewModelProvider(this, MasterViewModelFactory()).get(LoginProfileVM::class.java)

        //default fragment
        //setUpView(FragmentLogin(this))

    }

    override fun showFragment() {

    }

    private fun setUpView( frag:Fragment){

       /* var fragman = supportFragmentManager.beginTransaction()
        fragman.replace(R.id.rl_fragment, frag)
        fragman.addToBackStack("fragger")
       *//* fragman.add(R.id.rl_fragment, FragmentSettings())
        fragman.add(R.id.rl_fragment, FragmentHelp())
        fragman.add(R.id.rl_fragment, FragmentProfile())*//*
        fragman.commit()*/

    }


}
