package com.cumulation.retrofitexample.network.api;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Response;

public class HeaderInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        okhttp3.Request originalRequest = chain.request();

        okhttp3.Request modifiedRequest = originalRequest.newBuilder()
                .header("X-RapidAPI-Key", "71c648bc0cmshe9ddfd78997b89ep179d2cjsn8d1411198a4f")
                .header("X-RapidAPI-Host", "moviesdatabase.p.rapidapi.com")
                .build();

        return chain.proceed(modifiedRequest);
    }
}
