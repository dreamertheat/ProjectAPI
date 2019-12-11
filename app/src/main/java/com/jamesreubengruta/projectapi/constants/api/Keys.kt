package com.jamesreubengruta.projectapi.constants.api

object Keys {

    init {
        System.loadLibrary("native-lib")
    }

    external fun api_key(): String
   // external fun openweather_api_key(): String
}