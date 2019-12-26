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

class FragmentLogin(private val lpx : LoginProfileX) : Fragment(), View.OnClickListener {

    private lateinit var vm : FragmentLoginVM

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        //vm = ViewModelProvider.AndroidViewModelFactory(this.activity!!.application).create(FragmentLoginVM::class.java)
        val vmf = FragmentLoginVMF(this.activity!!.application,lpx)
        vm = ViewModelProvider(this.requireActivity(), vmf).get(FragmentLoginVM::class.java)
        bt_login.setOnClickListener(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onClick(v: View?) {
        if(v==bt_login){
            vm.login(et_username.text.toString(),et_password.text.toString())

        }
    }

}