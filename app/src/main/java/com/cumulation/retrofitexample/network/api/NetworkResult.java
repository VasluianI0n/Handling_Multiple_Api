package com.cumulation.retrofitexample.network.api;

public class NetworkResult<T extends Object> {
    public static class Success<T extends Object> extends NetworkResult<T> {
        private int code;
        protected T data;

        public Success(int code, T data) {
            this.code = code;
            this.data = data;
        }
    }

    public static class Error<T extends Object> extends NetworkResult<T> {
        private int code;
        protected String errorMsg;

        public Error(int code, String errorMsg) {
            this.code = code;
            this.errorMsg = errorMsg;
        }
    }

    public static class Exception<T extends Object> extends NetworkResult<T> {
        protected Throwable e;

        public Exception(Throwable e) {
            this.e = e;
        }
    }
}




