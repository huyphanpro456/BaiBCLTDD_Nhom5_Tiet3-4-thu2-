package com.example.appmonan;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class QuanAnAdapter extends BaseAdapter {
    Context context;
    int Layout;
    List<QuanAn> arrayList;

    public QuanAnAdapter(Context context, int layout, List<QuanAn> arrayList) {
        this.context = context;
        Layout = layout;
        this.arrayList = arrayList;
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    static class ViewHolder {
        TextView tvtenQuan;
        TextView tvdiaChi;
        ImageView imgHinhAnh;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;
        if (convertView == null) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(Layout, null);
            viewHolder = new ViewHolder();

            viewHolder.tvtenQuan = (TextView) convertView.findViewById(R.id.product_tenquan);
            viewHolder.tvdiaChi = (TextView) convertView.findViewById(R.id.product_diachi);
            viewHolder.imgHinhAnh = (ImageView) convertView.findViewById(R.id.product_img);

            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.tvtenQuan.setText(arrayList.get(position).tenQuan);
        viewHolder.tvdiaChi.setText(arrayList.get(position).diaChi);
        viewHolder.imgHinhAnh.setImageResource(arrayList.get(position).hinhAnh);
        return convertView;
    }
}
