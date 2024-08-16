package com.cumulation.retrofitexample.network.api;

import com.example.apihandler.network.api.DataState;

public class Converter {
    public static <T extends Object> DataState<T> convertToDataState(NetworkResult<T> networkResult) {
        if (networkResult instanceof NetworkResult.Success) {
            return new DataState.Success<>(((NetworkResult.Success<T>) networkResult).data);
        } else if (networkResult instanceof NetworkResult.Error) {
            return new DataState.Failure(((NetworkResult.Error<T>) networkResult).errorMsg.toString());
        } else if (networkResult instanceof NetworkResult.Exception) {
            return new DataState.Failure(((NetworkResult.Exception<T>) networkResult).e.getMessage());
        }
        return null;
    }
}
