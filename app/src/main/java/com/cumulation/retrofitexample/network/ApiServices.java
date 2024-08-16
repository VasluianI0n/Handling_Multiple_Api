package com.cumulation.retrofitexample.network;



import com.cumulation.retrofitexample.network.model.Genres;
import com.cumulation.retrofitexample.network.model.MovieTitles;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiServices {
    @GET("/titles/utils/genres")
    Call<Genres> getGenres();

    @GET("/titles")
    Call<MovieTitles> getMovieTitles(
            @Query("genre") String genre,
            @Query("page") Integer page
    );
}