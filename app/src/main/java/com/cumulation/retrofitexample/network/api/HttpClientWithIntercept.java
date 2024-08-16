package com.cumulation.retrofitexample.network.api;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

public class HttpClientWithIntercept {
    public static final OkHttpClient client;

    static {
        client = new OkHttpClient.Builder()
                .connectTimeout(1, TimeUnit.MINUTES)
                .readTimeout(30, TimeUnit.SECONDS)
                .writeTimeout(15, TimeUnit.SECONDS)
                .addInterceptor(new HeaderInterceptor())
                .build();
    }
}
