package com.jamesreubengruta.projectapi.presentation.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import com.jamesreubengruta.core.domain.models.NASA.NasaAPODModel
import com.jamesreubengruta.projectapi.R
import com.jamesreubengruta.projectapi.constants.api.Keys
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var temp_obj: NasaAPODModel? = null
    var temp_bundle : Bundle? = null;
    override fun onCreate(sis: Bundle?) {
        super.onCreate(sis)
        setContentView(R.layout.activity_main)

        try {
            //Log.e("test", "${Keys.getNasaAPIKey()}")
        }catch (e : Exception){
           // Log.e("ERRORX","${e.stackTrace}")
        }
        if(sis!=null) {
            temp_obj ?: sis!!.getSerializable("obj")
        }
        tv_greet.setOnClickListener {
            temp_obj = NasaAPODModel(title="mardok",url="mpme",explanation = "asd",copyright = "asda",
                date = "asd sa", hdurl = "asd 220", mediaType = "as aasd", serviceVersion = "22")
            Log.e("SAVED","SAVED");
            val x = temp_obj;
            tv_greet.text = x!!.title.toString()
        }

    }


    override fun onBackPressed() {
        val bundle = Bundle();
        bundle.putSerializable("obj",temp_obj)
        temp_bundle = bundle;
        onSaveInstanceState(temp_bundle!!)
        super.onBackPressed()
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
