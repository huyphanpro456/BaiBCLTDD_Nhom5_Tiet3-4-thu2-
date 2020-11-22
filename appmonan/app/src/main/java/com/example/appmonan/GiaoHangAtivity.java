package com.example.appmonan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;

public class GiaoHangAtivity extends AppCompatActivity {
    public ViewPager mVpDemo;
    Button bt_thongbao;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.giaohang);
        initView();

        bt_thongbao=(Button) findViewById(R.id.id_thongbao_gh);
        bt_thongbao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GiaoHangAtivity.this,ThongBaoActivity.class));
            }
        });

    }
    private void initView() {
        mVpDemo =(ViewPager) findViewById(R.id.vp_demo);
        mVpDemo.setAdapter(new GiaoHangTabAdapter(getSupportFragmentManager()));
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tl_demo);
        tabLayout.setupWithViewPager(mVpDemo);
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener(){

            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }

        });
    }



}