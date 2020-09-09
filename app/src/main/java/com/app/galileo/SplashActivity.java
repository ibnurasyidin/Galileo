package com.app.galileo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SplashActivity extends AppCompatActivity {

    @BindView(R.id.imv_logo)
    ImageView m_imv_logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        ButterKnife.bind(this);
        m_imv_logo.animate().rotation(360).setDuration(6000).start();
        new Handler().postDelayed(() -> {
            startActivity(new Intent(SplashActivity.this, WelcomeScreen.class));
        }, 6000);
    }
}