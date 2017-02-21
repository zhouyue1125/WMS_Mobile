package com.example.administrator.wms_mobile;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class LoginActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.activity_login);
        //relativeLayout.setBackgroundColor(Color.WHITE);
        relativeLayout.setBackground(getResources().getDrawable(R.mipmap.login_bgimage));

        Button btngetout = (Button) findViewById(R.id.getout);
        Button btnLogin = (Button) findViewById(R.id.login);
        btngetout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(LoginActivity.this ,MenuActivity.class);
                startActivity(intent);
            }
        });
    }
}
