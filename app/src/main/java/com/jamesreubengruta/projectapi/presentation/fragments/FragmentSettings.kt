package com.jamesreubengruta.projectapi.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jamesreubengruta.projectapi.R
import com.jamesreubengruta.projectapi.presentation.viewmodels.FragmentLoginVM

class FragmentSettings() : Fragment() {

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
        return inflater.inflate(R.layout.fragment_settings, container, false)
    }



}