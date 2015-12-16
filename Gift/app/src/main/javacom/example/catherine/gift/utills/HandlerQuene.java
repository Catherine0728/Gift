package com.example.catherine.gift.utills;

import android.os.Handler;
import android.os.Message;

import com.example.catherine.gift.model.Gift;

import rx.Observable;

/**
 * Created by catherine on 15/12/14.
 */
public class HandlerQuene extends Handler {
    public void handleMessage(Message msg) {
        // process incoming messages here
        Gift gift = (Gift) msg.obj;
        System.out.println(gift + "====" + Thread.currentThread().getId());
    }
}
