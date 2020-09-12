package com.app.galileo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import com.app.galileo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class WelcomeScreen extends AppCompatActivity {
    @BindView(R.id.imb_lessinia)
    ImageButton m_imb_lessinia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_screen);
        ButterKnife.bind(this);
        m_imb_lessinia.setOnClickListener(c -> {
            startActivity(new Intent(WelcomeScreen.this, AttivazioneActivity.class));
        });
    }
}