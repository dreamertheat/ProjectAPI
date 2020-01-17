package com.jamesreubengruta.projectapi.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jamesreubengruta.projectapi.presentation.delegates.LoginProfileDelegate

class FragmentLoginVMF(private val c : android.app.Application, private val lpx: Any): ViewModelProvider.AndroidViewModelFactory(c) {


    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return FragmentLoginVM(c,lpx as LoginProfileDelegate) as T
    }

}