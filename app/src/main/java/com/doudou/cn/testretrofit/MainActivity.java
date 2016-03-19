package com.doudou.cn.testretrofit;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

import com.doudou.cn.testretrofit.model.PeopleResponse;
import com.google.gson.Gson;

import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

public class MainActivity extends Activity {
    final String URL = "http://api.randomuser.me/?results=10&nat=en";

    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RetrofitTools.getInstance().getAPIService()
                     .fetchPeople(URL)
                     .subscribeOn(Schedulers.io())
                     .observeOn(AndroidSchedulers.mainThread())
                     .subscribe(list -> handData(list), error -> handError("加载数据失败"));


    }

    private void handError(String str) {
        Log.i(TAG, "handError 处理加载失败处理");
    }


    private PeopleResponse handData(PeopleResponse list) {

        String result = new Gson().toJson(list);
        Log.i(TAG, "handData 加载成功后数据：" + result);
        return null;
    }

}
