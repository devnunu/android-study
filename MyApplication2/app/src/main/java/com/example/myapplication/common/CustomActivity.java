package com.example.myapplication.common;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;

public class CustomActivity extends Activity {

    protected void showShortToast(String content) {
        Toast.makeText(getApplicationContext(), content, Toast.LENGTH_SHORT).show();
    }

    protected void startActivityWithoutParam(Class activity) {
        Intent intent = new Intent(this, activity);
        startActivity(intent);
    }
}
