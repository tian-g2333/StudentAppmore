package com.android.hys.studentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_LoginUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__login_up);

        Button signup=(Button)findViewById(R.id.reg_btn_sure);
        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = ((EditText) findViewById(R.id.reg_username)).getText().toString();
                String password = ((EditText) findViewById(R.id.reg_password)).getText().toString();
                String password2 = ((EditText) findViewById(R.id.reg_password2)).getText().toString();
                if (password.equals(password2)) {
                    if (UserService.signUp(name, password))
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(Activity_LoginUp.this, "注册成功", Toast.LENGTH_SHORT).show();
                            }
                        });
                    else {
                        runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                Toast.makeText(Activity_LoginUp.this, "注册失败", Toast.LENGTH_SHORT).show();
                            }
                        });
                    }
                } else {
                    runOnUiThread(new Runnable() {
                        @Override
                        public void run() {
                            Toast.makeText(Activity_LoginUp.this, "注册失败", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
            }
        });

    }
}