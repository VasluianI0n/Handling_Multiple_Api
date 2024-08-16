package com.cumulation.retrofitexample.network.model;

import com.google.gson.annotations.SerializedName;

public class TitleType {
    @SerializedName("text")
    public String text;
    @SerializedName("id")
    public String id;
    @SerializedName("isSeries")
    public Boolean isSeries;
    @SerializedName("isEpisode")
    public Boolean isEpisode;
    @SerializedName("__typename")
    public String _typename;
}
