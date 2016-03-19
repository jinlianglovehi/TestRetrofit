package com.doudou.cn.testretrofit.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by jinliang on 16/3/19.
 */
public class Name implements Serializable {


    @SerializedName("title")
    public String mTitle;

    @SerializedName("first")
    public String mFirts;

    @SerializedName("last")
    public String mLast;


}
