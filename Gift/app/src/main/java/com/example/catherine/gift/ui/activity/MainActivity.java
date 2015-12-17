package com.example.catherine.gift.ui.activity;


import android.widget.Button;
import android.widget.TextView;

import com.example.catherine.gift.R;
import com.example.catherine.gift.ui.base.BaseActivity;
import com.example.catherine.gift.ui.p.WeatherP;
import com.jakewharton.rxbinding.view.RxView;

import javax.inject.Inject;

import butterknife.Bind;
import rx.functions.Action1;

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
        RxView.clicks(btnDot).subscribe(new Action1<Void>() {
            @Override
            public void call(Void aVoid) {
                weatherP.getWeather("BEIJING","metric");
            }
        });
    }


    @Override
    public void setListener() {

    }

    @Override
    public void setComponent() {
    }

}
