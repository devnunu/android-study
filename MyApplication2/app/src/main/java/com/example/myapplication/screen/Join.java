package com.example.myapplication.screen;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.myapplication.R;
import com.example.myapplication.common.CustomActivity;
import com.example.myapplication.utils.StringUtil;

public class Join extends CustomActivity implements View.OnClickListener {

    private EditText mInputId, mInputPassword, mInputPasswordConfirm;
    private Button mButtonSubmit;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.screen_join);

        mInputId = findViewById(R.id.edittext_id);
        mInputPassword = findViewById(R.id.edittext_password);
        mInputPasswordConfirm = findViewById(R.id.edittext_password_confirm);
        mButtonSubmit = findViewById(R.id.button_submit);

        mButtonSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.button_submit) handleJoin();
    }

    private void handleJoin() {
        String inputId = mInputId.getText().toString();
        String inputPassword = mInputPassword.getText().toString();
        String inputPasswordConfirm = mInputPasswordConfirm.getText().toString();

        boolean isAllInputExist = !StringUtil.isEmptyString(inputId) && !StringUtil.isEmptyString(inputPassword) && !StringUtil.isEmptyString(inputPasswordConfirm);
        boolean isPasswordCorrect = inputPassword.equals(inputPasswordConfirm);

        if (!isAllInputExist) {
            showShortToast("모든 값을 입력해주세요");
        } else if (!isPasswordCorrect) {
            showShortToast("비밀번호가 일치하지 않습니다");
        } else {
            finish();
        }
    }
}
