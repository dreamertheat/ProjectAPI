package com.jamesreubengruta.projectapi.presentation.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.jamesreubengruta.projectapi.R
import com.jamesreubengruta.projectapi.presentation.activities.login_profile.LoginProfile
import com.jamesreubengruta.projectapi.presentation.adapters.settingsAdapter
import com.jamesreubengruta.projectapi.presentation.viewmodels.FragmentLoginVM
import com.jamesreubengruta.projectapi.presentation.viewmodels.FragmentLoginVMF
import kotlinx.android.synthetic.main.fragment_profile.*

class FragmentProfile : Fragment() {

    private lateinit var vm : FragmentLoginVM


    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val vmf = FragmentLoginVMF(this.activity!!.application,(this.activity as LoginProfile))
        vm = ViewModelProvider(this.requireActivity(),vmf).get(FragmentLoginVM::class.java)
        //vm = FragmentLoginVM(this.activity?.application!!,(this.activity as LoginProfile).getLpx())
        vm.getCreds().observe(this, Observer{ c->
            var temp : String = ""
            c.forEach {
                temp+=it
            }
            tv_message.text = temp
        } )
        recycler()
    }

    fun recycler(){

        vm.getCreds().observe(this,Observer{
            rv_list.adapter = settingsAdapter(it,this.requireContext())
        })


        rv_list.layoutManager = LinearLayoutManager(this.requireContext())

    }


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }


}