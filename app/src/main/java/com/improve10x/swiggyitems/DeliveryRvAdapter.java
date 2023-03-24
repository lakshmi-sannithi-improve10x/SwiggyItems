package com.improve10x.swiggyitems;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class DeliveryRvAdapter extends RecyclerView.Adapter<DeliveryRvViewHolder> {
    public DeliveryItems[] items;
    public DeliveryRvAdapter(DeliveryItems[] deliveryItems){
        items = deliveryItems;
    }
    @NonNull
    @Override
    public DeliveryRvViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.delivery_items,parent,false);
        DeliveryRvViewHolder viewHolder = new DeliveryRvViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DeliveryRvViewHolder holder, int position) {
        DeliveryItems item = items[position];
        holder.dishNameTxt.setText(item.dishName);
        holder.homeNameTxt.setText(item.homeName);
        holder.ratingTxt.setText(item.rating);
        Picasso.get().load(item.imageUrl).into(holder.imageUrlIv);

    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
