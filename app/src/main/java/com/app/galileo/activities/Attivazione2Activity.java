package com.app.galileo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

import com.app.galileo.R;

public class Attivazione2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attivazione2);
        new Handler().postDelayed(() -> {
            startActivity(new Intent(Attivazione2Activity.this, Attivazione3Activity.class));
            finish();
        }, 3000);
    }
}