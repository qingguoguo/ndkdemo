package com.qgg.ndkdemo;

/**
 * 作者：王青 wangqing
 * 创建日期：2019/9/27 on 17:30
 * 描述：
 */
public class NdkUtil {

    static {
        //System.loadLibrary("ndkutil-jni");
        System.loadLibrary("ndkfrom-run");
    }

    public native static String ndkHelloWorld();
}
