LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)
LOCAL_SRC_FILES := ApiKeys.c
LOCAL_MODULE := ApiKeys
include $(BUILD_SHARED_LIBRARY)
