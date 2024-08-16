package com.cumulation.retrofitexample.network.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

public class Genres {
    @SerializedName("results")
    private ArrayList<String> results = new ArrayList<>();

    public ArrayList<String> getResults() {
        return results;
    }

    public void setResults(ArrayList<String> results) {
        this.results = results;
    }
}