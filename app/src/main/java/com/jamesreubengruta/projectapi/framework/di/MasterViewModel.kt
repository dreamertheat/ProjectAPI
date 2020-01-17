package com.jamesreubengruta.projectapi.framework.di

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModelProvider

open class MasterViewModel(a : Application, interactors: Interactors): AndroidViewModel(a){
    protected var app : MasterApplication = getApplication()
}