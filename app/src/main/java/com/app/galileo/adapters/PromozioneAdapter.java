package com.app.galileo.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.viewpager.widget.PagerAdapter;


import com.app.galileo.R;

import java.util.ArrayList;
import java.util.List;

public class PromozioneAdapter extends PagerAdapter {

    private Context context;
    private Integer cont;

    public PromozioneAdapter(Context context, Integer cont){

        this.context = context;
        this.cont = cont;

    }

    @Override
    public int getCount() {
        return cont;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {

        LayoutInflater inflater = LayoutInflater.from(context);
        ViewGroup layout = (ViewGroup) inflater.inflate(R.layout.single_list_promozione, container, false);
        container.addView(layout);



        return layout;
    }


}
