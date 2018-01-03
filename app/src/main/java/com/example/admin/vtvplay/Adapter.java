package com.example.admin.vtvplay;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.bumptech.glide.Glide;
import com.example.admin.vtvplay.livechanelData.Datum;

import java.util.ArrayList;

/**
 * Created by ADMIN on 1/2/2018.
 */

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private ArrayList<Datum> datumArrayList = new ArrayList<>();
    private Context context;

    public Adapter(ArrayList<Datum> datumArrayList, Context context) {
        this.datumArrayList = datumArrayList;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view;
        view = layoutInflater.inflate(R.layout.item_chanel, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Glide.with(context)
                .load(datumArrayList.get(position).getImage().getThumbnailUrl())
                .into(holder.btnImage);


    }

    @Override
    public int getItemCount() {
        return datumArrayList.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageButton btnImage;

        public ViewHolder(View itemView) {
            super(itemView);
            btnImage = itemView.findViewById(R.id.btnImage);
        }
    }
}
