package com.jamesreubengruta.projectapi.presentation.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.jamesreubengruta.projectapi.R
import com.jamesreubengruta.projectapi.constants.api.Keys

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
