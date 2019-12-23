package com.jamesreubengruta.projectapi.presentation.activities.unused

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.jamesreubengruta.core.domain.models.NASA.NasaAPODModel
import com.jamesreubengruta.projectapi.R
import com.jamesreubengruta.projectapi.presentation.viewmodels.BasicDataTransfer
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var temp_obj: NasaAPODModel? = null
    var temp_bundle : Bundle? = null;

    override fun onCreate(sis: Bundle?) {
        super.onCreate(sis)
        setContentView(R.layout.activity_main)




        val vm = ViewModelProvider.AndroidViewModelFactory(Application()).create(BasicDataTransfer::class.java)
        vm.strings().observe(this, Observer {
            it.forEach {
                Log.e("content","$it")
            }
        }


        )





        if(sis!=null) {
            temp_obj ?: sis!!.getSerializable("obj")
        }

        handleUI()

    }

    fun handleUI(){
        tv_greet.setOnClickListener {
            temp_obj = NasaAPODModel(title="mardok",url="mpme",explanation = "asd",copyright = "asda",
                date = "asd sa", hdurl = "asd 220", mediaType = "as aasd", serviceVersion = "22")
            Log.e("SAVED","SAVED");
            val x = temp_obj;
            tv_greet.text = x!!.title.toString()
        }

        b_txt.setOnClickListener {
            trasnfer();
        }
    }


    override fun onBackPressed() {

    }

    fun trasnfer(){
        val vm = ViewModelProvider.AndroidViewModelFactory(Application()).create(BasicDataTransfer::class.java)
        vm.goToSecam()
    }

    override fun onLowMemory() {
        super.onLowMemory()
    }


    override fun onStart() {
        super.onStart()
        if(temp_obj!=null)
        Log.e("stuff",temp_obj!!.title);

        else
            Log.e("none","none");
    }



    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
            outState.putSerializable("obj",temp_obj)

    }




}
