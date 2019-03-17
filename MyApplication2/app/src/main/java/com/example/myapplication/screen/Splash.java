package com.example.myapplication.screen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;

import com.airbnb.lottie.LottieAnimationView;
import com.example.myapplication.R;
import com.example.myapplication.common.CustomActivity;

public class Splash extends CustomActivity {

    private final int SPLASH_DISPAYED_TIME = 5000;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_splash);

        new Handler().postDelayed(new Runnable() {
            public void run() {
                startActivity(new Intent(Splash.this, Login.class));
                finish();
            }
        }, SPLASH_DISPAYED_TIME);
    }
}
