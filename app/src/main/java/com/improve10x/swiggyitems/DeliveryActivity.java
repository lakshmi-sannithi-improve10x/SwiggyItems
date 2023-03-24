package com.improve10x.swiggyitems;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class DeliveryActivity extends AppCompatActivity {
     public DeliveryItems[] deliveryItems;
     RecyclerView deliveryItemsRv;
     public DeliveryRvAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delivery);
        initViews();
        createDishesData();
        setupAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        deliveryItemsRv.setLayoutManager(new LinearLayoutManager(this));
        deliveryItemsRv.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new DeliveryRvAdapter(deliveryItems);
    }

    private void initViews() {
        deliveryItemsRv = findViewById(R.id.delivery_items_rv);
    }

    private void createDishesData() {
        deliveryItems = new DeliveryItems[3];

        deliveryItems[0] = new DeliveryItems();
        deliveryItems[0].imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2019/5/13/0/FNK_Falafel_H1_s4x3.jpg.rend.hgtvcom.616.462.suffix/1557773603107.jpeg";
        deliveryItems[0].dishName = "Fallafell";
        deliveryItems[0].homeName = "B's Balkan Home";
        deliveryItems[0].rating = "⭐ 4.5";

        deliveryItems[1] = new DeliveryItems();
        deliveryItems[1].imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2019/5/13/0/FNK_Falafel_H1_s4x3.jpg.rend.hgtvcom.616.462.suffix/1557773603107.jpeg";
        deliveryItems[1].dishName = "Beef soup";
        deliveryItems[1].homeName = "B's Balkan Home";
        deliveryItems[1].rating = "⭐ 4.5";

        deliveryItems[2] = new DeliveryItems();
        deliveryItems[2].imageUrl = "https://food.fnr.sndimg.com/content/dam/images/food/fullset/2019/5/13/0/FNK_Falafel_H1_s4x3.jpg.rend.hgtvcom.616.462.suffix/1557773603107.jpeg";
        deliveryItems[2].dishName = "Chicken soup";
        deliveryItems[2].homeName = "B's Balkan Home";
        deliveryItems[2].rating = "⭐ 4.5";
    }
}