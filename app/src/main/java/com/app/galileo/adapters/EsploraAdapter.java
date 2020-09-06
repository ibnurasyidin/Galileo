package com.app.galileo.adapters;

import android.content.Context;
import android.database.Cursor;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;


import com.app.galileo.R;

import java.io.Serializable;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class EsploraAdapter extends RecyclerView.Adapter<EsploraAdapter.RubbishViewHolder>  {


    private Context mContext;
    private int count;


    public EsploraAdapter(Context context,int count){
        this.mContext =context;
        this.count = count;

    }



    @NonNull
    @Override
    public RubbishViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_list_esplora, parent, false);
        RubbishViewHolder holder = new RubbishViewHolder(view);




        return holder;

    }

    @Override
    public void onBindViewHolder(@NonNull RubbishViewHolder holder, int position) {




    }

    @Override
    public int getItemCount() {
        return count;
    }



    public class RubbishViewHolder extends RecyclerView.ViewHolder {


        public RubbishViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }


    }






}
