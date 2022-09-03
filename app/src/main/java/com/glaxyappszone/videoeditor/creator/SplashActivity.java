package com.glaxyappszone.videoeditor.creator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;



public class SplashActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                openmainactivity();

            }
        }, 4000);

    }

    private void openmainactivity() {
                startActivity(new Intent(SplashActivity.this,  HomeActivity.class));
                finish();

    }

    @Override
    protected void onResume() {

     //   MyApplication.intrest_ad_is_loaded=true;
        super.onResume();
    }
}
