package com.cumulation.retrofitexample.network.api;


import com.cumulation.retrofitexample.network.ApiServices;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiRetrofit {
    private static ApiServices retrofitServ;

    static {
        retrofitServ = null;
    }

    public static void setUpBaseUrl() {
        try {
            Retrofit retrofit = new Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl("https://moviesdatabase.p.rapidapi.com")
                    .client(HttpClientWithIntercept.client)
                    .build();
            retrofitServ = retrofit.create(ApiServices.class);
        } catch (Exception e) {
            System.out.println("exception: " + e);
        }
    }
}

