package com.doudou.cn.testretrofit.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by jinliang on 16/3/19.
 */
public class Picture implements Serializable {


    @SerializedName("large")
    public String large;

    @SerializedName("medium")
    public String mMedium;

    @SerializedName("thumbnail")
    public String mThumbnail;

}
