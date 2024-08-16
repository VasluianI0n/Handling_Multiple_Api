package com.cumulation.retrofitexample.network.model;

import com.google.gson.annotations.SerializedName;

public class ReleaseDate {
    @SerializedName("day")
    public Integer day;
    @SerializedName("month")
    public Integer month;
    @SerializedName("year")
    public Integer year;
    @SerializedName("__typename")
    public String _typename;
}
