package com.jamesreubengruta.projectapi.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.jamesreubengruta.projectapi.R
import com.jamesreubengruta.projectapi.presentation.logic.LoginProfileX
import com.jamesreubengruta.projectapi.presentation.viewmodels.FragmentLoginVM
import com.jamesreubengruta.projectapi.presentation.viewmodels.FragmentLoginVMF
import kotlinx.android.synthetic.main.fragment_login.*

class FragmentHelp() : Fragment() {

    private lateinit var vm : FragmentLoginVM

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //vm = ViewModelProvider.AndroidViewModelFactory(this.activity!!.application).create(FragmentLoginVM::class.java)

    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_help, container, false)
    }



}