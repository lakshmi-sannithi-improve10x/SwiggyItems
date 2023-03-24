package com.improve10x.swiggyitems;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class BiryaniActivity extends AppCompatActivity {
     public BiryaniItems[] biryaniItems;
     RecyclerView biryaniItemsRv;
     public  BiryaniRVAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biryani);
        initViews();
        createBiryaniData();
        setupAdapter();
        connectAdapter();

    }

    private void connectAdapter() {
        biryaniItemsRv.setLayoutManager(new LinearLayoutManager(this));
        biryaniItemsRv.setAdapter(adapter);
    }

    private void setupAdapter() {
        adapter = new BiryaniRVAdapter(biryaniItems);
    }

    private void initViews() {
        biryaniItemsRv = findViewById(R.id.biryaniitems_rv);
    }

    private void createBiryaniData() {
        biryaniItems = new BiryaniItems[3];

        biryaniItems[0] = new BiryaniItems();
        biryaniItems[0].imageUrl = "https://images.aws.nestle.recipes/resized/f5f3c6a20b42a6ce30b154e04b54f3e5_maggi_liquid_mixes_beryani_944_531.png";
        biryaniItems[0].day1 = "Tuesday 01";
        biryaniItems[0].personName = "B'sBalkans H...";
        biryaniItems[0].address = "Arabic";
        biryaniItems[0].time = "12mins";
        biryaniItems[0].rating = "4.8/5";

        biryaniItems[1] = new BiryaniItems();
        biryaniItems[1].imageUrl = "https://images.aws.nestle.recipes/resized/f5f3c6a20b42a6ce30b154e04b54f3e5_maggi_liquid_mixes_beryani_944_531.png";
        biryaniItems[1].day1 = "Monday 31";
        biryaniItems[1].personName = "Syriana";
        biryaniItems[1].address = "Arabic";
        biryaniItems[1].time = "23mins";
        biryaniItems[1].rating = "4.3/5";

        biryaniItems[2] = new BiryaniItems();
        biryaniItems[2].imageUrl = "https://images.aws.nestle.recipes/resized/f5f3c6a20b42a6ce30b154e04b54f3e5_maggi_liquid_mixes_beryani_944_531.png";
        biryaniItems[2].day1 = "Tuesday 01";
        biryaniItems[2].personName = "B'sBalkans H...";
        biryaniItems[2].address = "Arabic";
        biryaniItems[2].time = "12mins";
        biryaniItems[2].rating = "4.8/5";
    }
}