package com.app.galileo.activities;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import com.app.galileo.R;
import com.app.galileo.adapters.EsploraAdapter;
import com.app.galileo.adapters.PromozioneAdapter;
import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class HomePageActivity extends AppCompatActivity {

    @BindView(R.id.viewpager_promozione)
    ViewPager vp_promozione;
    @BindView(R.id.dots_indicator)
    DotsIndicator dotsIndicator;

    @BindView(R.id.recylerview)
    RecyclerView recylerview;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page_activity);
        ButterKnife.bind(this);

        PromozioneAdapter promozioneAdapter = new PromozioneAdapter(this,3);
        vp_promozione.setAdapter(promozioneAdapter);
        dotsIndicator.setViewPager(vp_promozione);


        recylerview.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));

        EsploraAdapter esploraAdapter = new EsploraAdapter(this,5);
        recylerview.setAdapter(esploraAdapter);


    }

    @OnClick(R.id.btn_piani) void piani(){
        Intent intent = new Intent(this,ScegliITuoiPianiActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.imv_menu)
    void btn() {
        //drawerLayout.openDrawer(GravityCompat.END);
        Intent myIntent = new Intent(this, MenuActivity.class);
        ActivityOptions options =
                ActivityOptions.makeCustomAnimation(this, R.anim.fade_in, R.anim.fade_out);
        this.startActivity(myIntent, options.toBundle());

    }

    @OnClick(R.id.btn_diagnostica) void btn_diagnostica(){
        Intent intent = new Intent(this,VerificaLaTuaLineaActivity.class);
        startActivity(intent);
    }
}
