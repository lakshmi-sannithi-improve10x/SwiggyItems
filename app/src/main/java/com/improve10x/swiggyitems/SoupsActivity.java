package com.improve10x.swiggyitems;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class SoupsActivity extends AppCompatActivity {
     public SoupsItems[] soupsItems;
     RecyclerView soupItemsRv;
     public SoupsRvAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soups);
        initViews();
        createSoupItemsData();
        setupAdapter();
        connectAdapter();
    }

    private void connectAdapter() {
        soupItemsRv.setLayoutManager(new LinearLayoutManager(this));
        soupItemsRv.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new SoupsRvAdapter(soupsItems);
    }

    private void initViews() {
        soupItemsRv = findViewById(R.id.soupsitems_rv);
    }

    private void createSoupItemsData() {
        soupsItems = new SoupsItems[3];

        soupsItems[0] = new SoupsItems();
        soupsItems[0].imageUrl = "https://images.immediate.co.uk/production/volatile/sites/30/2020/08/chicken_soup-4fdd786.jpg";
        soupsItems[0].soupName ="Chicken Soup";
        soupsItems[0].description = "chicken,vegetables,butter,tiny,pasta,green beans,carrots...";
        soupsItems[0].servingNo = "Serving:2";
        soupsItems[0].itemWeight = "Est.Weight:345gr";
        soupsItems[0].cost = "8.00$";

        soupsItems[1] = new SoupsItems();
        soupsItems[1].imageUrl = "https://images.immediate.co.uk/production/volatile/sites/30/2020/08/chicken_soup-4fdd786.jpg";
        soupsItems[1].soupName ="Beaf Soup";
        soupsItems[1].description = "beef(chopped),vegetables,butter,tiny vegetables";
        soupsItems[1].servingNo = "Serving:2";
        soupsItems[1].itemWeight = "Est.Weight:345gr";
        soupsItems[1].cost = "9.00$";

        soupsItems[2] = new SoupsItems();
        soupsItems[2].imageUrl = "https://images.immediate.co.uk/production/volatile/sites/30/2020/08/chicken_soup-4fdd786.jpg";
        soupsItems[2].soupName ="Beaf Soup";
        soupsItems[2].description = "beef(chopped),vegetables,butter,tiny vegetables";
        soupsItems[2].servingNo = "Serving:2";
        soupsItems[2].itemWeight = "Est.Weight:345gr";
        soupsItems[2].cost = "9.00$";
    }
}