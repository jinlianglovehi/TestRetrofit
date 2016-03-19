package com.doudou.cn.testretrofit.model;


import android.graphics.Picture;
import android.location.Location;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by jinliang on 16/3/19.
 */
public class People implements Serializable {

    @SerializedName("gender")
    public String mGender;

    @SerializedName("name")
    public Name mName;

    @SerializedName("location")
    public Location mLocation;

    @SerializedName("email")
    public String mMail;

    @SerializedName("username")
    public String mUserName;

    @SerializedName("phone")
    public String mPhone;

    @SerializedName("cell")
    public String mCell;

    @SerializedName("picture")
    public Picture mPicture;

    public String mFullName;


}
