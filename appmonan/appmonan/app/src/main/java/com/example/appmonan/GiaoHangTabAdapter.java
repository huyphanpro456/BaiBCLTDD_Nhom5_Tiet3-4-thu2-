package com.example.appmonan;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

public class GiaoHangTabAdapter extends FragmentStatePagerAdapter {
    private String listTab[] = {"Gần Tôi", "Bán Chạy", "Giao Nhanh"};
    private FristFragment mFristFragment;
    private SecondFragment mSecondFragmet;
    private ThirdFragment mThirdFragmet;
    public GiaoHangTabAdapter(@NonNull FragmentManager fm) {
        super(fm);
        mFristFragment = new FristFragment();
        mSecondFragmet =  new SecondFragment();
        mThirdFragmet = new ThirdFragment();
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return mFristFragment;
        }else if (position == 1){
            return mSecondFragmet;


        }else if (position == 2) {
            return mThirdFragmet;
        }
        return null;
    }

    @Override
    public int getCount() {
        return listTab.length;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return listTab[position];
    }

}
