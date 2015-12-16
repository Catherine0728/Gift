package com.example.catherine.gift.retrofit;

import com.example.catherine.gift.model.WeatherData;

import retrofit.http.GET;
import retrofit.http.Query;
import rx.Observable;

/**
 * Created by catherine on 15/12/14.
 */
public interface ApiMaps {
    /**
     * eg:one
     * */
    @GET("/weather")
    WeatherData getWeather(@Query("q") String place, @Query("units") String units);

    /**
     * eg:two
     * retrofit 支持 rxjava 整合
     * 这种方法适用于新接口
     */
    @GET("/weather")
    Observable<WeatherData> getWeatherData(@Query("q") String place, @Query("units") String units);
}
