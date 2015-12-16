package com.example.catherine.gift.ui.m;

import com.example.catherine.gift.model.WeatherData;
import com.example.catherine.gift.retrofit.ApiMaps;
import com.example.catherine.gift.retrofit.RestApiAdapter;

import rx.Observable;

/**
 * Created by catherine on 15/12/16.
 */
public class WeatherM {
    public Observable<WeatherData> getWeather(String place, String units) {
        final ApiMaps apiManager = RestApiAdapter.getInstance().create(ApiMaps.class);
        return apiManager.getWeatherData(place, units);
    }
}
