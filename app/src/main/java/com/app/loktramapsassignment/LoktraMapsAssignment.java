package com.app.loktramapsassignment;

import android.app.Application;
import android.content.Context;
import android.support.multidex.MultiDex;

public class LoktraMapsAssignment extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
