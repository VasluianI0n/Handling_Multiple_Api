package com.cumulation.retrofitexample.repo;

import com.cumulation.retrofitexample.netwok.api.NetworkResult;
import com.cumulation.retrofitexample.netwok.model.Genres;
import com.cumulation.retrofitexample.netwok.model.MovieTitles;

public interface NetworkRepository {
    NetworkResult<Genres> getGenres() throws Exception;
    NetworkResult<MovieTitles> getMovieTitles(String genre, Integer page) throws Exception;
    NetworkResult<MovieTitles> getMovieTitles() throws Exception;
}

