package com.app.galileo.activities;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.app.galileo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AttivazioneActivity extends AppCompatActivity {
    @BindView(R.id.btn_conferma)
    Button m_btn_conferma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attivazione);
        ButterKnife.bind(this);
        m_btn_conferma.setOnClickListener(c -> {
            startActivity(new Intent(AttivazioneActivity.this, Attivazione2Activity.class));
        });
    }
}