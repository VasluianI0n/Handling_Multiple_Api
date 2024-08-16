package com.cumulation.retrofitexample.repo;



import com.cumulation.retrofitexample.network.ApiServices;
import com.cumulation.retrofitexample.network.api.ApiHandler;
import com.cumulation.retrofitexample.network.api.NetworkResult;
import com.cumulation.retrofitexample.network.model.Genres;
import com.cumulation.retrofitexample.network.model.MovieTitles;

import javax.inject.Inject;

public class NetworkRepositoryImp implements NetworkRepository, ApiHandler {

    private ApiServices apiServices;

    @Inject
    public NetworkRepositoryImp(ApiServices apiServices) {
        this.apiServices = apiServices;
    }

    @Override
    public NetworkResult<Genres> getGenres() {
        return handleApi(() -> apiServices.getGenres().execute());
    }

    @Override
    public NetworkResult<MovieTitles> getMovieTitles(String genre, Integer page) {
        return handleApi(() -> apiServices.getMovieTitles(genre, page).execute());
    }

    @Override
    public NetworkResult<MovieTitles> getMovieTitles() {
        return handleApi(() -> apiServices.getMovieTitles(null, null).execute());
    }
}