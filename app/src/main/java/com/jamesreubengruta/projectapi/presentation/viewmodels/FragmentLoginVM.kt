package com.jamesreubengruta.projectapi.presentation.viewmodels

import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jamesreubengruta.projectapi.framework.di.Interactors
import com.jamesreubengruta.projectapi.framework.di.MasterViewModel
import com.jamesreubengruta.projectapi.presentation.delegates.LoginProfileDelegate

class FragmentLoginVM(var c : android.app.Application, interactors: Interactors, val lpx : LoginProfileDelegate) : MasterViewModel(c, interactors) {


    private fun storeCreds(username:String, password: String):ArrayList<String>{
        var list = ArrayList<String>()
        list.add(username)
        list.add(password)
        return list
    }

    private var liveCreds = MutableLiveData<ArrayList<String>>()


    fun getCreds() : LiveData<ArrayList<String>>{
        return liveCreds as LiveData<ArrayList<String>>
    }


    fun login(username : String, password:String){
        Log.e("$username","$password")
        liveCreds.value = storeCreds(username,password)
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