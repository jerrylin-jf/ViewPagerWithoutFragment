package com.example.jerry.myapplication;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<String> listDate = new ArrayList<>();
        listDate.add("1");
        listDate.add("2");
        listDate.add("3");

        ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new ViewPagerAdapter(this, listDate));
    }
}
