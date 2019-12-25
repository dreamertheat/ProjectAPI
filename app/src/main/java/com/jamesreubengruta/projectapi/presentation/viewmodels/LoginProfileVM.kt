package com.jamesreubengruta.projectapi.presentation.viewmodels

import android.content.Intent
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jamesreubengruta.projectapi.presentation.activities.unused.SecamActivity
import com.jamesreubengruta.projectapi.presentation.logic.LoginProfileX

class LoginProfileVM(var c : android.app.Application, private val lpx : LoginProfileX ) : AndroidViewModel(c) {





    fun Login(username : String, password:String){
        Log.e("$username","$password")
        goToProfile(username,password)
    }

    private fun goToProfile(username : String, password:String){
        if(username!=null&&password!=null){

        }
    }

}