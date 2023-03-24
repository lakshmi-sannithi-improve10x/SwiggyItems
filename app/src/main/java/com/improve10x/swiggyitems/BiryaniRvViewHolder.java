package com.improve10x.swiggyitems;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class BiryaniRvViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageIv;
    public TextView day1Txt;
    public TextView personNameTXt;
    public TextView addressTxt;
    public TextView timeTxt;
    public TextView ratingTxt;
    public BiryaniRvViewHolder(@NonNull View itemView) {
        super(itemView);
          imageIv = itemView.findViewById(R.id.biryani_iv);
          day1Txt = itemView.findViewById(R.id.day1_txt);
          personNameTXt = itemView.findViewById(R.id.personname_txt);
          addressTxt = itemView.findViewById(R.id.address_txt);
          timeTxt = itemView.findViewById(R.id.time_txt);
          ratingTxt = itemView.findViewById(R.id.rating_txt);
    }
}
