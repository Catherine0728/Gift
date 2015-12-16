package com.example.catherine.gift.ui.activity;


import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.catherine.gift.R;
import com.example.catherine.gift.model.Gift;
import com.example.catherine.gift.model.WeatherData;
import com.example.catherine.gift.ui.base.BaseActivity;
import com.example.catherine.gift.ui.p.WeatherP;
import com.example.catherine.gift.utills.ThreadQuene;

import javax.inject.Inject;

import butterknife.Bind;
import rx.Observable;

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
        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                weatherP.getWeather("Budapest,hu","metric");

            }
        });
//        ViewObservable.clicks(findViewById(R.id.btn_dot), false).subscribe(new Action1<OnClickEvent>() {
//            @Override
//            public void call(OnClickEvent onClickEvent) {
//                for (int i = 0; i < 5; i++) {
//                    Gift gift = new Gift();
//                    gift.setName("redBull");
//                    gift.setAge(11);
//                    new ThreadQuene(getApplication(), gift).start();
//                }
//            }
//        });
    }

    @Override
    public void setListener() {

    }

    @Override
    public void setComponent() {

    }

}
