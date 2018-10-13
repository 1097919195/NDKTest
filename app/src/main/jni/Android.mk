LOCAL_PATH := $(call my-dir)
include $(CLEAR_VARS)

LOCAL_MODULE := Java2C
LOCAL_C_INCLUDES := zjl_example_com_ndktest_Java2CJNI.h
LOCAL_SRC_FILES := Java2C.cpp

LOCAL_LDLIBS := -llog

include $(BUILD_SHARED_LIBRARY)

