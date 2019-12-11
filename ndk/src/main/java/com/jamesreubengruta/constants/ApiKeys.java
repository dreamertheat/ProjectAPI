package com.jamesreubengruta.constants;

public class ApiKeys {

    public native static String getNASAApiKey();
    public native static char[] getOpenweatherApiKey();
    public native static double getCPie();
    static {
        System.loadLibrary("ApiKeys");
    }
}
