package com.doudou.cn.testretrofit.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by jinliang on 16/3/19.
 */
public class PeopleResponse {

    @SerializedName("results")
    private List<User> mPeopleList;

    public List<User> getPeopleList() {
        return mPeopleList;
    }

    public class User{
        public People getPeople() {
            return mPeople;
        }

        @SerializedName("user")
        private People mPeople;
    }
}
