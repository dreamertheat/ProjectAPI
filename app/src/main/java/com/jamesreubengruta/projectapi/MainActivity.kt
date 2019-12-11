package com.jamesreubengruta.projectapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.jamesreubengruta.projectapi.constants.api.Keys

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("test","${Keys.nasa_api_key()}")


    }
}
