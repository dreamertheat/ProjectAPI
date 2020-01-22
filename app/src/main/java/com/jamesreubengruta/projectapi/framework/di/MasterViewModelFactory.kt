package com.jamesreubengruta.projectapi.framework.di

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

 object  MasterViewModelFactory : ViewModelProvider.Factory{
     lateinit var app : Application
     lateinit var interactors: Interactors

    fun injector(app : Application, interactors : Interactors){
        MasterViewModelFactory.app = app
        MasterViewModelFactory.interactors = interactors
    }
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(MasterViewModel::class.java.isAssignableFrom(modelClass)){
            return modelClass.getConstructor(Application::class.java, Interactors::class.java).
                newInstance(app,interactors)
        }else{
            throw IllegalStateException("Must be inherit from MasterViewModel.class")
        }
    }
}