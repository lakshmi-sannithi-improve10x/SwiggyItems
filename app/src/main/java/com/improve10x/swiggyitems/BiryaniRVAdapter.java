package com.improve10x.swiggyitems;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class BiryaniRVAdapter extends RecyclerView.Adapter<BiryaniRvViewHolder> {
    public BiryaniItems[] items;
    public BiryaniRVAdapter(BiryaniItems[] biryaniItems){
         items = biryaniItems;
    }
    @NonNull
    @Override
    public BiryaniRvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.biryani_items,parent,false);
        BiryaniRvViewHolder viewHolder = new BiryaniRvViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull BiryaniRvViewHolder holder, int position) {
      BiryaniItems item = items[position];
      holder.day1Txt.setText(item.day1);
      holder.personNameTXt.setText(item.personName);
      holder.addressTxt.setText(item.address);
      holder.timeTxt.setText(item.time);
      holder.ratingTxt.setText(item.rating);
        Picasso.get().load(item.imageUrl).into(holder.imageIv);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
