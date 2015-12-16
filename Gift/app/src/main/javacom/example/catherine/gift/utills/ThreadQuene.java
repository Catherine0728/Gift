package com.example.catherine.gift.utills;

import android.content.Context;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;

import com.example.catherine.gift.model.Gift;

/**
 * Created by catherine on 15/12/14.
 */
public class ThreadQuene extends Thread {
    Context context;
    Gift gift;
    HandlerQuene handlerQuene;
    public ThreadQuene(Context context, Gift gift) {
        this.context = context;
        this.gift = gift;
    }

    @Override
    public void run() {
        Looper.prepare();
        System.out.println(gift);
        handlerQuene=new HandlerQuene();
        Message msg = handlerQuene.obtainMessage();
        msg.what =1;
        msg.obj = gift;
        msg.sendToTarget();
        Looper.loop();
    }
}
