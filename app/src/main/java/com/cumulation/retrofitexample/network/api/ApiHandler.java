package com.cumulation.retrofitexample.network.api;

import retrofit2.HttpException;
import retrofit2.Response;

public interface ApiHandler {
    default <T> NetworkResult<T> handleApi(ApiCall<T> execute) {
        try {
            Response<T> response = execute.call();
            // Log.d("response", response.toString());
            T body = response.body();
            // Log.d("response", body.toString());
            if (response.isSuccessful() && body != null) {
                return new NetworkResult.Success<>(response.code(), body);
            } else {
                return new NetworkResult.Error<>(response.code(), response.errorBody().toString());
            }
        } catch (HttpException e) {
            return new NetworkResult.Error<>(e.code(), e.getMessage());
        } catch (Throwable e) {
            return new NetworkResult.Exception(e);
        }
    }

    interface ApiCall<T> {
        Response<T> call() throws Exception;
    }
}
