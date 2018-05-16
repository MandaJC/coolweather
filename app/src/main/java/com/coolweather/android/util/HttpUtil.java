package com.coolweather.android.util;

import okhttp3.Address;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by lyzwj on 2018/5/16.
 */

public class HttpUtil {
    public static void sendOkHttpRequest(String add, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(add).build();
        client.newCall(request).enqueue(callback);
    }
}
