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

public class FristFragment extends Fragment {
    private View mRootView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mRootView = inflater.inflate(R.layout.fragment_first, container, false);
        ArrayList<GiaoHang> arrayList = new ArrayList<>();
        ListView lv = (ListView) mRootView.findViewById(R.id.lv_gantoi);
        GiaoHang gantoi1 = new GiaoHang("Bún Đậu Mắm Tôm", "20 Phan Đăng Lưu", R.drawable.a6);
        GiaoHang gantoi2 = new GiaoHang("Phố Cổ Hà Nội", "07 Đông Giang", R.drawable.a25);
        GiaoHang gantoi3 = new GiaoHang("Ram Cuốn Cải ", "337 Hải Phòng", R.drawable.a26);
        GiaoHang gantoi4 = new GiaoHang("Motte Pizza", "146 Lê Lợi", R.drawable.a27);
        GiaoHang gantoi5 = new GiaoHang("Milan Milktae", "26 Lê Thánh Tôn", R.drawable.a28);


        GiaoHangAdapter1 giaoHangAdapter1 = new GiaoHangAdapter1(mRootView.getContext(),R.layout.giaohang_list_1,arrayList);
        arrayList.add(gantoi1);
        arrayList.add(gantoi2);
        arrayList.add(gantoi3);
        arrayList.add(gantoi4);
        arrayList.add(gantoi5);


        lv.setAdapter(giaoHangAdapter1);
        return mRootView;
    }
}
