package com.improve10x.swiggyitems;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class SoupsRvAdapter extends RecyclerView.Adapter<SoupsRvViewHolder> {
    public SoupsItems[] items;
    public SoupsRvAdapter(SoupsItems[] soupsItems){
        items = soupsItems;
    }
    @NonNull
    @Override
    public SoupsRvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.soups_items,parent,false);
        SoupsRvViewHolder viewHolder = new SoupsRvViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SoupsRvViewHolder holder, int position) {
      SoupsItems item = items[position];
      holder.soupNameTxt.setText(item.soupName);
      holder.descriptionTxt.setText(item.description);
      holder.servingNoTxt.setText(item.servingNo);
      holder.itemWeightTxt.setText(item.itemWeight);
      holder.costTxt.setText(item.cost);
        Picasso.get().load(item.imageUrl).into(holder.imageUrlIv);

    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
