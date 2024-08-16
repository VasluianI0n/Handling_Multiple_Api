package com.cumulation.retrofitexample.network.model;

import com.google.gson.annotations.SerializedName;

public class Caption {
    @SerializedName("plainText")
    public String plainText;
    @SerializedName("__typename")
    public String _typename;
}
