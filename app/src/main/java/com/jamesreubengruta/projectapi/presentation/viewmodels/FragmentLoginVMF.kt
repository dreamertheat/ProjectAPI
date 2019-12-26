package com.jamesreubengruta.projectapi.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.jamesreubengruta.projectapi.presentation.logic.LoginProfileX

class FragmentLoginVMF(private val c : android.app.Application, private val lpx: LoginProfileX): ViewModelProvider.AndroidViewModelFactory(c) {


    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return FragmentLoginVM(c,lpx) as T
    }

}