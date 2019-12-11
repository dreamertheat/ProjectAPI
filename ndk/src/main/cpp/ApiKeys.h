//
// Created by dream on 12/11/2019.
//
#include <jni.h>
#ifndef PROJECTAPI_APIKEYS_H
#define PROJECTAPI_APIKEYS_H
#ifdef __cplusplus
extern "C" {
#endif //PROJECTAPI_APIKEYS_H

JNIEXPORT jstring * JNICALL Java_com_jamesreubengruta_constants_ApiKeys_getNASAApiKey
(JNIEnv *, jclass);
JNIEXPORT jstring * JNICALL Java_com_jamesreubengruta_constants_ApiKeys_getOpenweatherApiKey
(JNIEnv *, jclass);
JNIEXPORT jdouble JNICALL Java_com_jamesreubengruta_constants_ApiKeys_getCPie
        (JNIEnv *, jclass);

#ifdef __cplusplus
}
#endif
#endif