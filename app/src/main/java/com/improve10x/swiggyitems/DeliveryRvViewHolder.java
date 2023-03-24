package com.improve10x.swiggyitems;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DeliveryRvViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageUrlIv;
    public TextView dishNameTxt;
    public TextView homeNameTxt;
    public TextView ratingTxt;
    public DeliveryRvViewHolder(@NonNull View itemView) {
        super(itemView);
        imageUrlIv = itemView.findViewById(R.id.image_iv);
        dishNameTxt = itemView.findViewById(R.id.dishname_txt);
        homeNameTxt = itemView.findViewById(R.id.homename_txt);
        ratingTxt = itemView.findViewById(R.id.rating_txt);
    }
}
