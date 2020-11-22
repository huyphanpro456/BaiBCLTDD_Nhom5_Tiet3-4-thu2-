package com.example.appmonan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class GiaoHangAdapter1 extends ArrayAdapter<GiaoHang> {
    private Context context;
    private int resource;
    private ArrayList<GiaoHang> arrList;


    public GiaoHangAdapter1(@NonNull Context context, int resource, ArrayList<GiaoHang> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        this.arrList=objects;
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView,  ViewGroup parent) {
        convertView = LayoutInflater.from(context).inflate(R.layout.giaohang_list_1,parent,false);
        ImageView ig_sp = (ImageView) convertView.findViewById(R.id.product_img);
        TextView tv_tenquan = (TextView) convertView.findViewById(R.id.product_ten_an_no);
        TextView tv_diachi = (TextView) convertView.findViewById(R.id.product_dchi_an_no);
        GiaoHang giaoHang = arrList.get(position);
        ig_sp.setImageResource(giaoHang.hinhanh);
        tv_tenquan.setText(giaoHang.tenquan);
        tv_diachi.setText(giaoHang.diachi);

        return convertView;
    }
}