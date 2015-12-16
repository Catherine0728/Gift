package com.example.catherine.gift.retrofit;

import retrofit.GsonConverterFactory;
import retrofit.Retrofit;
import retrofit.RxJavaCallAdapterFactory;

/**
 * Created by catherine on 15/12/14.
 */
public class RestApiAdapter {

    /**
     * @return
     */
    public static Retrofit getInstance() {
        return new Retrofit.Builder()
                .baseUrl("http://api.openweathermap.org/data/2.5")
                .addConverterFactory(GsonConverterFactory.create())
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .build();
    }
}
