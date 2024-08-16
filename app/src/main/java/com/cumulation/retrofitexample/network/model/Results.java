package com.cumulation.retrofitexample.network.model;

import com.google.gson.annotations.SerializedName;

public class Results {
    @SerializedName("id")
    public String id;
    @SerializedName("primaryImage")
    public PrimaryImage primaryImage = new PrimaryImage();
    @SerializedName("titleType")
    public TitleType titleType = new TitleType();
    @SerializedName("titleText")
    public TitleText titleText = new TitleText();
    @SerializedName("originalTitleText")
    public OriginalTitleText originalTitleText = new OriginalTitleText();
    @SerializedName("releaseYear")
    public ReleaseYear releaseYear = new ReleaseYear();
    @SerializedName("releaseDate")
    public ReleaseDate releaseDate = new ReleaseDate();
}
