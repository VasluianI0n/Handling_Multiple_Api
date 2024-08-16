package com.cumulation.retrofitexample.repo;


import com.cumulation.retrofitexample.network.api.NetworkResult;
import com.cumulation.retrofitexample.network.model.Genres;
import com.cumulation.retrofitexample.network.model.MovieTitles;

public interface NetworkRepository {
    NetworkResult<Genres> getGenres();

    NetworkResult<MovieTitles> getMovieTitles(String genre, Integer page);

    NetworkResult<MovieTitles> getMovieTitles();
}
