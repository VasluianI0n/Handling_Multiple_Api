package com.cumulation.retrofitexample.repo;

import com.cumulation.retrofitexample.netwok.ApiServices;
import com.cumulation.retrofitexample.netwok.api.ApiHandler;
import com.cumulation.retrofitexample.netwok.api.NetworkResult;
import com.cumulation.retrofitexample.netwok.model.Genres;
import com.cumulation.retrofitexample.netwok.model.MovieTitles;

import javax.inject.Inject;

public class NetworkRepositoryImp implements NetworkRepository, ApiHandler {

    private final ApiServices apiServices;

    @Inject
    public NetworkRepositoryImp(ApiServices apiServices) {
        this.apiServices = apiServices;
    }

    @Override
    public NetworkResult<Genres> getGenres() throws Exception {
        return handleApi(() -> apiServices.getGenres());
    }

    @Override
    public NetworkResult<MovieTitles> getMovieTitles(String genre, Integer page) throws Exception {
        return handleApi(() -> apiServices.getMovieTitles(genre, page));
    }
    @Override
    public NetworkResult<MovieTitles> getMovieTitles() throws Exception {
        return handleApi(() -> apiServices.getMovieTitles(null, null));
    }
}
