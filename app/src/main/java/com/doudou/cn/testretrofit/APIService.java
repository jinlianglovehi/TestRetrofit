package com.doudou.cn.testretrofit;

import com.doudou.cn.testretrofit.model.PeopleResponse;

import retrofit.http.GET;
import retrofit.http.Url;
import rx.Observable;

/**
 * Created by jinliang on 16/3/19.
 * 接口数据的调用
 */
public interface APIService {
    @GET
    Observable<PeopleResponse> fetchPeople(@Url String url);

}
