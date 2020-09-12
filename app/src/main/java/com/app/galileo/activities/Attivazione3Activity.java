package com.app.galileo.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.app.galileo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Attivazione3Activity extends AppCompatActivity {
    @BindView(R.id.btn_salta_pagina)
    LinearLayout m_btn_salta_pagina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_attivazione3);
        ButterKnife.bind(this);
        m_btn_salta_pagina.setOnClickListener(c -> {
            startActivity(new Intent(Attivazione3Activity.this, Attivazione2Activity.class));
        });
    }
}