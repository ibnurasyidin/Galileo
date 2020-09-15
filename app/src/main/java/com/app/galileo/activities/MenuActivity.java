package com.app.galileo.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;


import com.app.galileo.R;
import com.app.galileo.adapters.DocumentatiAdapter;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ButterKnife.bind(this);
    }
    @OnClick(R.id.imv_close) void abbonamento(){
       onBackPressed();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.hold,R.anim.fade_out_right);

    }

    @OnClick(R.id.btn_profilo) void profil(){

    }

    @OnClick(R.id.btn_fatture) void btn_fatture(){
        Intent intent = new Intent(this,LeMieFattureActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_diagnostica) void btn_diagnostica(){
        Intent intent = new Intent(this,VerificaLaTuaLineaActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_paga_online) void btn_paga_online(){
        Intent intent = new Intent(this,PagaOnlineActivity.class);
        startActivity(intent);
    }
    @OnClick(R.id.btn_modulistica) void btn_modulistica(){
        Intent intent = new Intent(this, DocumentiActivity.class);
        startActivity(intent);
    }
    @OnClick(R.id.btn_addebito) void btn_addebito(){
        Intent intent = new Intent(this, AddebitoAutomaticoInContoActivity.class);
        startActivity(intent);
    }
    @OnClick(R.id.btn_dettaglio) void btn_dettaglio(){
        Intent intent = new Intent(this, DettaglioSegnalazioniETiicket.class);
        startActivity(intent);
    }

}
