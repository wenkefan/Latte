package com.fwk.latte;

import android.app.Application;

import com.fwk.latte.core.app.Latte;

/**
 * Created by 范文轲 on 2018/1/15.
 */

public class LatteApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Latte.init(this)
                .withApiHost("127.0.0.0")
                .configure();
    }
}
