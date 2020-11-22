package com.example.appmonan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class SecondFragment extends Fragment {
    private View mRootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_second, container, false);
        ArrayList<GiaoHang> arrayList = new ArrayList<>();
        ListView lv = (ListView) mRootView.findViewById(R.id.lv_banchay);
        GiaoHang banchay1 = new GiaoHang("Bánh Tráng Cô Thê", "34/4 Trưng Nữ Vương", R.drawable.a22);
//        GiaoHang banchay2 = new GiaoHang("Bông Food & Drink", "90 Nguyễn Du", R.drawable.a23);
//        GiaoHang banchay3 = new GiaoHang("Cơm Gà Nam Chợ Mới ", "491 Hoàng Diệu", R.drawable.a24);
//        GiaoHang banchay4 = new GiaoHang("Motte Pizza", "146 Lê Lợi", R.drawable.a6);
//        GiaoHang banchay5 = new GiaoHang("Milan Milktae", "26 Lê Thánh Tôn", R.drawable.a6);


        GiaoHangAdapter2 giaoHangAdapter2 = new GiaoHangAdapter2(mRootView.getContext(),R.layout.giaohang_list_2,arrayList);
        arrayList.add(banchay1);
//        arrayList.add(banchay2);
//        arrayList.add(banchay3);
//        arrayList.add(banchay4);
//        arrayList.add(banchay5);


        lv.setAdapter(giaoHangAdapter2);
        return mRootView;
    }
}
