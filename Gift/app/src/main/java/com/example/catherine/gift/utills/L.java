package com.example.catherine.gift.utills;

import android.os.Process;

/**
 * Created by catherine on 15/12/17.
 * 日志
 */
public class L {
    private static String TAG = "GIFT";

    public static int v(String s) {
        return android.util.Log.v(TAG, "tid:" + Process.myTid() + "; -->" + s);
    }

    public static int d(String s) {
        return android.util.Log.d(TAG, "tid:" + Process.myTid() + "; -->" + s);

    }

    public static int e(String s) {
        return android.util.Log.e(TAG, "tid:" + Process.myTid() + "; -->" + s);

    }

    public static int i(String s) {
        return android.util.Log.i(TAG, "tid:" + Process.myTid() + "; -->" + s);

    }

    public static int w(String s) {
        return android.util.Log.w(TAG, "tid:" + Process.myTid() + "; -->" + s);

    }
}
