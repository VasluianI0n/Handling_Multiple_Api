package com.example.apihandler.network.api

sealed class DataState<out T : Any> {
    object Init : DataState<Nothing>()
    data class Success<out T : Any>(val data: T) : DataState<T>()
    data class Failure(val errorMsg: String?) : DataState<Nothing>()
}