package com.example.catherine.gift.modules;

import com.example.catherine.gift.ui.activity.MainActivity;
import com.example.catherine.gift.ui.m.WeatherM;
import com.example.catherine.gift.ui.p.WeatherP;

import dagger.Module;
import dagger.Provides;

/**
 * Created by catherine on 15/12/17.
 */
@Module(
        includes = {
                MainActivity.class,
        }
)
public class WeatherModule {
    public WeatherModule() {
    }

    @Provides
    WeatherP provideWeatherP(WeatherM weatherM) {

        return new WeatherP(weatherM);

    }

    @Provides
    WeatherM provideWeatherM() {
        return new WeatherM();
    }
}
