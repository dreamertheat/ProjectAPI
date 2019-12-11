//
// Created by dream on 12/11/2019.
//

#include "native-lib.h"
#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring
//com_jamesreubengruta_projectapi_constants_api_Keys
JNICALL
Java_com_jamesreubengruta_projectapi_constants_api_Keys_api_key(JNIEnv *env, jobject object) {
    std::string api_key = "UgeegMYaxXP3Omb9N5Un8y0EfBcI4WFIwquzKc0f";
    return env->NewStringUTF(api_key.c_str());
}