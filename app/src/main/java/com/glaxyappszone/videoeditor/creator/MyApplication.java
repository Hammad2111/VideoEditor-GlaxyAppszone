package com.glaxyappszone.videoeditor.creator;

import android.app.Application;

import com.google.android.gms.ads.MobileAds;


public class MyApplication extends Application {

    private static AppOpenManager appOpenManager;
    public static Boolean intrest_ad_is_loaded = false;
    private static MyApplication app;
    @Override
    public void onCreate() {
        super.onCreate();
        MobileAds.initialize(
                this,
                initializationStatus -> {
                });

        appOpenManager = new AppOpenManager(this);
        app = this;




    }

    public static MyApplication getInstance() {
        return app;
    }

}
