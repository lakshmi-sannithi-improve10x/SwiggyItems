package com.improve10x.swiggyitems;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SoupsRvViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageUrlIv;
    public TextView soupNameTxt;
    public TextView descriptionTxt;
    public TextView servingNoTxt;
    public TextView itemWeightTxt;
    public TextView costTxt;
    public SoupsRvViewHolder(@NonNull View itemView) {
        super(itemView);
        imageUrlIv = itemView.findViewById(R.id.image_iv);
        soupNameTxt = itemView.findViewById(R.id.soupname_txt);
        descriptionTxt = itemView.findViewById(R.id.description_txt);
        servingNoTxt = itemView.findViewById(R.id.servingno_txt);
        itemWeightTxt = itemView.findViewById(R.id.weight_txt);
        costTxt = itemView.findViewById(R.id.cost_txt);
    }
}
