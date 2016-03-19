package com.doudou.cn.testretrofit.model;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by jinliang on 16/3/19.
 */
public class Localtion implements Serializable {

    @SerializedName("street")
    public String mStreet;

    @SerializedName("city")
    public String mCity;

    @SerializedName("state")
    public String mState;

    @SerializedName("zip")
    public String mZip;


}
