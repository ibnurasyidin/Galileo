package com.app.galileo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class AttivazioneActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attivazione);
        new Handler().postDelayed(() -> {
            startActivity(new Intent(AttivazioneActivity.this, Attivazione2Activity.class));
        }, 3000);
    }
}