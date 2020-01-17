package com.jamesreubengruta.projectapi.presentation.viewmodels

import androidx.lifecycle.AndroidViewModel
import com.jamesreubengruta.projectapi.framework.di.Interactors
import com.jamesreubengruta.projectapi.framework.di.MasterViewModel
import com.jamesreubengruta.projectapi.presentation.delegates.LoginProfileDelegate

class LoginProfileVM(var c : android.app.Application, private val interactors : Interactors,  private val lpx : LoginProfileDelegate ) : MasterViewModel(c, interactors) {







}