package com.jamesreubengruta.projectapi.framework.di

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

open class MasterViewModelFactory : ViewModelProvider.Factory{
    private lateinit var app : Application
    private lateinit var interactors: Interactors

    fun injector(ap : Application, int : Interactors){
        app = ap
        interactors = int
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