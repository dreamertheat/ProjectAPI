package com.jamesreubengruta.projectapi.presentation.viewmodels

import android.content.Intent
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jamesreubengruta.projectapi.presentation.activities.unused.SecamActivity
import com.jamesreubengruta.projectapi.presentation.logic.LoginProfileX

class FragmentLoginVM(var c : android.app.Application, val lpx : LoginProfileX) : AndroidViewModel(c) {



    private fun storeCreds(username:String, password: String):MutableLiveData<ArrayList<String>>{
        var list = ArrayList<String>()
        list.add(username)
        list.add(password)

        return MutableLiveData<ArrayList<String>>().also {
            it.value = list
        }
    }

    private var liveCreds : MutableLiveData<ArrayList<String>> = storeCreds("x","x")


    fun getCreds() : LiveData<ArrayList<String>>{
        return liveCreds as LiveData<ArrayList<String>>
    }


    fun Login(username : String, password:String){
        Log.e("$username","$password")
        liveCreds = storeCreds(username,password)
        goToProfile(username,password)
    }

    private fun goToProfile(username : String, password:String){
        if(username.length>6&&password!=null){
            Log.e("$username is a valid username","$password is a valid password")
            lpx.showFragment()
        }else{
            Log.e("$username is not valid username","$password is a valid password")
        }
    }


}