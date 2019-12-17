package com.jamesreubengruta.projectapi.presentation.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import com.jamesreubengruta.core.domain.models.NASA.NasaAPODModel
import com.jamesreubengruta.projectapi.R
import com.jamesreubengruta.projectapi.constants.api.Keys
import kotlinx.android.synthetic.main.activity_main.*

class SecamActivity : AppCompatActivity() {



    override fun onCreate(sis: Bundle?) {
        super.onCreate(sis)
        setContentView(R.layout.activity_main)
    }


}
