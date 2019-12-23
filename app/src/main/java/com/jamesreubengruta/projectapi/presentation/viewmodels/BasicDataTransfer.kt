package com.jamesreubengruta.projectapi.presentation.viewmodels

import android.content.Intent
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.jamesreubengruta.projectapi.presentation.activities.unused.SecamActivity

class BasicDataTransfer(var c : android.app.Application) : AndroidViewModel(c) {





    //mock data
    fun loadData() : ArrayList<String>{

        val names = ArrayList<String>()
        names.add("mat1")
        names.add("mat2")
        names.add("mat3")
        names.add("mat4")
        names.add("mat5")

        return names;

    }

    private val list : MutableLiveData<ArrayList<String>> by lazy {
        MutableLiveData<ArrayList<String>>().also {
            it.value=loadData()
        }
    }

    fun strings() : LiveData<ArrayList<String>>{

        return list as LiveData<ArrayList<String>>
    }

    fun goToSecam(){
        val d = Intent(c,
            SecamActivity::class.java)
        c.startActivity(d)
    }

    /*private fun mutableEntries() :  MutableLiveData<List<String>>{
        return mutableListOf<ArrayList<String>>() as MutableLiveData<List<String>>
    }*/

    //val getEntries = MutableLiveData<List<String>>()

}