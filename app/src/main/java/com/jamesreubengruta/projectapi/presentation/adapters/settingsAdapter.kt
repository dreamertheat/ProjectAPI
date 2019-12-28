package com.jamesreubengruta.projectapi.presentation.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.jamesreubengruta.projectapi.R
import kotlinx.android.synthetic.main.list_help.view.*

class settingsAdapter(val data : ArrayList<String>, val context: Context): RecyclerView.Adapter<VH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        return VH(LayoutInflater.from(context).inflate(R.layout.list_help, parent,  false));
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: VH, pos: Int) {

        holder.title.text = data.get(pos)
        holder.detail.text = "detailed data: ${data.get(pos)}"
    }

}

class VH(v: View): RecyclerView.ViewHolder(v){
    var icon = v.iv_icon
    var symbol = v.iv_symbol
    var title = v.tv_title
    var detail = v.tv_detail

}