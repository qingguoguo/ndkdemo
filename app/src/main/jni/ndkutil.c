#include "com_qgg_ndkdemo_NdkUtil.h"

JNIEXPORT jstring JNICALL Java_com_qgg_ndkdemo_NdkUtil_ndkHelloWorld
  (JNIEnv *env, jobject obj){
     return (*env)->NewStringUTF(env,"hello ndk");
  }
