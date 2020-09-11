package com.example.quizapp21;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.quizapp21.adapter.MainPagerAdapter;
import com.example.quizapp21.ui.main.MainFragment;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private MainPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.main_view_pager);

        adapter = new MainPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);

    }
}