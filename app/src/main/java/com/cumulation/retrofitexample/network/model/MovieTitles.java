package com.cumulation.retrofitexample.network.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class MovieTitles {
    @SerializedName("page")
    public Integer page;
    @SerializedName("next")
    public String next;
    @SerializedName("entries")
    public Integer entries;
    @SerializedName("results")
    public ArrayList<Results> results = new ArrayList<>();
}

