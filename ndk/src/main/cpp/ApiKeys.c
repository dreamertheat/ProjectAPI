//
// Created by dream on 12/11/2019.
//

#include "ApiKeys.h"
#include <string.h>

JNIEXPORT jstring * JNICALL Java_com_jamesreubengruta_constants_ApiKeys_getNASAApiKey
(JNIEnv *env, jclass c){
    return (*env)->NewStringUTF(env,"UgeegMYaxXP3Omb9N5Un8y0EfBcI4WFIwquzKc0f");
}

JNIEXPORT jstring * JNICALL Java_com_jamesreubengruta_constants_ApiKeys_getOpenweatherApiKey
(JNIEnv *env, jclass c){
    return (*env)->NewStringUTF(env,"343dbeff28a4ffe7d39bab9cfafa74c3");
}

JNIEXPORT jdouble JNICALL Java_com_jamesreubengruta_constants_ApiKeys_getCPie
        (JNIEnv *env, jclass c){
    return 3.14159265358979323846;
}