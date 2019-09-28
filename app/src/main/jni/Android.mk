LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := ndkutil-jni

LOCAL_SRC_FILES := ndkutil.c

include $(BUILD_SHARED_LIBRARY)