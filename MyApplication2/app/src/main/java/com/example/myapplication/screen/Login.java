package com.example.myapplication.screen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;
import com.example.myapplication.common.CustomActivity;

public class Login extends CustomActivity implements View.OnClickListener {

    private final String USER_ID = "test";
    private final String USER_PASSWORD = "1234";

    private EditText mInputId, mInputPassword;
    private Button mButtonJoin, mButtonLogin;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_login);

        mInputId = findViewById(R.id.edittext_id);
        mInputPassword = findViewById(R.id.edittext_password);
        mButtonJoin = findViewById(R.id.button_join);
        mButtonLogin = findViewById(R.id.button_login);

        mButtonJoin.setOnClickListener(this);
        mButtonLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_login)
            handleLogin();
        else if (v.getId() == R.id.button_join)
            startActivityWithoutParam(Join.class);
    }

    private void handleLogin() {
        if (checkIdAndPasswordCorrect())
            startActivityWithoutParam(Home.class);
        else
            showShortToast("아이디나 비밀번호가 일치하지 않습니다");
    }

    private boolean checkIdAndPasswordCorrect() {
        String inputId = mInputId.getText().toString();
        String inputPassword = mInputPassword.getText().toString();
        return inputId.equals(USER_ID) && inputPassword.equals(USER_PASSWORD);
    }
}
