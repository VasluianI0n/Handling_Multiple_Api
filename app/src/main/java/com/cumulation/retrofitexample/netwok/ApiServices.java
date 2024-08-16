package com.cumulation.retrofitexample.netwok;

import com.cumulation.retrofitexample.netwok.model.Genres;
import com.cumulation.retrofitexample.netwok.model.MovieTitles;

import retrofit2.Response;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiServices {
    @GET("/titles/utils/genres")
    Response<Genres> getGenres() throws Exception;

    @GET("/titles")
    Response<MovieTitles> getMovieTitles(
            @Query("genre") String genre,
            @Query("page") Integer page
    ) throws Exception;
}
