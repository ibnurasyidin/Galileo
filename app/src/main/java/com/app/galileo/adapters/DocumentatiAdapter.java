package com.app.galileo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.galileo.R;

import butterknife.ButterKnife;

public class DocumentatiAdapter extends RecyclerView.Adapter<DocumentatiAdapter.RubbishViewHolder>  {


    private Context mContext;
    private int count;


    public DocumentatiAdapter(Context context, int count){
        this.mContext =context;
        this.count = count;

    }



    @NonNull
    @Override
    public RubbishViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_list_documenti, parent, false);
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
