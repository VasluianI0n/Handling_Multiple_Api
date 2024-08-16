package com.cumulation.retrofitexample.network.model;

import com.google.gson.annotations.SerializedName;

public class PrimaryImage {
    @SerializedName("id")
    public String id;
    @SerializedName("width")
    public Integer width;
    @SerializedName("height")
    public Integer height;
    @SerializedName("url")
    public String url;
    @SerializedName("caption")
    public Caption caption = new Caption();
    @SerializedName("__typename")
    public String _typename;
}
