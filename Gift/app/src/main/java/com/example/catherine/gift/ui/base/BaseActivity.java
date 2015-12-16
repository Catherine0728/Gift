package com.example.catherine.gift.ui.base;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by catherine on 15/12/10.
 */
public abstract class BaseActivity extends FragmentActivity {
    public Context context;
    public Activity activity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=this;
        activity=this;
        getArgs();
        setView();
        initView();
        setListener();
        setComponent();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    public abstract void getArgs();

    public abstract void initView();

    public abstract void setView();

    public abstract void setListener();

    public abstract void setComponent();
}
