package com.jamesreubengruta.projectapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.jamesreubengruta.projectapi.constants.api.Keys
import com.jamesreubengruta.projectapi.constants.tools.Math

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            Log.e("test", "${Keys.getNasaAPIKey()}")
        }catch (e : Exception){
            Log.e("ERRORX","${e.stackTrace}")
        }

    }
}
