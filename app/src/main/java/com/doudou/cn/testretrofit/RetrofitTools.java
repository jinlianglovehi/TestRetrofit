package com.doudou.cn.testretrofit;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

/**
 * Created by jinliang on 16/3/19.
 */
public class RetrofitTools {


    private Retrofit retrofit;
    private final static String BASE_URL = "http://api.randomuser.me/";

    //    构造函数
    public RetrofitTools() {
        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }


    private static RetrofitTools instance;
    //  接口的调用；
    private static APIService apiService;

    public  static  RetrofitTools getInstance() {
        if (instance == null) {
            synchronized (RetrofitTools.class) {
                if (instance == null) {
                    instance = new RetrofitTools();
                }
            }
        }
        return instance;
    }


    //  获取apiService接口的方式的调用
    public APIService getAPIService() {
        if (apiService == null) {
            synchronized (APIService.class) {
                if (apiService == null) {
                    apiService = retrofit.create(APIService.class);
                }
            }
        }
        return apiService;
    }
}
