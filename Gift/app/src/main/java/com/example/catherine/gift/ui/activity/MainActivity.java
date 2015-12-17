package com.example.catherine.gift.ui.activity;


import android.widget.Button;
import android.widget.TextView;

import com.example.catherine.gift.R;
import com.example.catherine.gift.component.AppComponent;
import com.example.catherine.gift.modules.WeatherModule;
import com.example.catherine.gift.ui.base.BaseActivity;
import com.example.catherine.gift.ui.p.WeatherP;
import com.example.catherine.gift.utills.L;
import com.jakewharton.rxbinding.view.RxView;

import javax.inject.Inject;

import butterknife.Bind;
import rx.Observer;

public class MainActivity extends BaseActivity {
    @Bind(R.id.tv_name)
    TextView tvName;
    @Bind(R.id.btn_dot)
    Button btnDot;
    @Inject
    WeatherP weatherP;

    @Override
    public void getArgs() {

    }

    @Override
    public void setView() {
        setContentView(R.layout.main);
    }

    @Override
    public void initView() {
        RxView.clicks(btnDot).subscribe(new Observer<Void>() {
            @Override
            public void onCompleted() {
              L.i("oncomplate");
            }

            @Override
            public void onError(Throwable e) {
                L.i("onerror＝＝＝＝"+e);
            }

            @Override
            public void onNext(Void aVoid) {
                weatherP.getWeather("BEIJING", "metric");

            }
        });
    }


    @Override
    public void setListener() {

    }

    @Override
    public void setComponent(AppComponent appComponent) {
       new WeatherModule();
    }

}
