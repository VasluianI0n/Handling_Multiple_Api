package com.cumulation.retrofitexample.network.model;

import com.google.gson.annotations.SerializedName;

public class ReleaseYear {
    @SerializedName("year")
    public Integer year;
    @SerializedName("endYear")
    public String endYear;
    @SerializedName("__typename")
    public String _typename;
}
