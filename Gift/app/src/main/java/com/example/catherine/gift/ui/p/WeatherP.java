package com.example.catherine.gift.ui.p;

import com.example.catherine.gift.model.WeatherData;
import com.example.catherine.gift.ui.m.WeatherM;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;

/**
 * Created by catherine on 15/12/16.
 */
public class WeatherP {
    WeatherM weatherM;

    public WeatherP(WeatherM weatherM) {
        this.weatherM = weatherM;
    }

    public void getWeather(final String place, final String units) {
        Observable<WeatherData> getWeatherData = weatherM.getWeather(place, units);
        getWeatherData.observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<WeatherData>() {
                    @Override
                    public void onCompleted() {
                        System.out.println("oncompleted");
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.println("onerror");
                    }

                    @Override
                    public void onNext(WeatherData weatherData) {
                        System.out.println("onnext");
                    }
                });
    }

}
