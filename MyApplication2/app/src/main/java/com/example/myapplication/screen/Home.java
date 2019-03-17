package com.example.myapplication.screen;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.example.myapplication.R;
import com.example.myapplication.common.CustomActivity;

public class Home extends CustomActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_home);
    }
}
