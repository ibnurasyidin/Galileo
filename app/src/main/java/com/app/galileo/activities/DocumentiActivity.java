package com.app.galileo.activities;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.app.galileo.R;
import com.app.galileo.adapters.DocumentatiAdapter;
import com.app.galileo.adapters.EsploraAdapter;
import com.app.galileo.adapters.PromozioneAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DocumentiActivity extends AppCompatActivity {


    @BindView(R.id.recylerview)
    RecyclerView recylerview;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_documenti);
        ButterKnife.bind(this);

        DocumentatiAdapter documentatiAdapter = new DocumentatiAdapter(this,3);
        recylerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recylerview.setAdapter(documentatiAdapter);
    }
}
