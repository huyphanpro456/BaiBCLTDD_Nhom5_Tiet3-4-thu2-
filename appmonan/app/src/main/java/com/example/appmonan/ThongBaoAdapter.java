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

public class ThongBaoAdapter extends BaseAdapter {
    Context context;
    int Layout;
    List<ThongBao> arrayList;

    public ThongBaoAdapter(Context context, int layout, List<ThongBao> arrayList) {
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
        TextView tvtieude;
        TextView tvnoidung;
        ImageView imgAnh;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder viewHolder;
        if (convertView == null) {

            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(Layout, null);
            viewHolder = new ViewHolder();

            viewHolder.tvtieude = (TextView) convertView.findViewById(R.id.product_tieude);
            viewHolder.tvnoidung = (TextView) convertView.findViewById(R.id.product_noidung);
            viewHolder.imgAnh = (ImageView) convertView.findViewById(R.id.product_img);

            convertView.setTag(viewHolder);

        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.tvtieude.setText(arrayList.get(position).tieude);
        viewHolder.tvnoidung.setText(arrayList.get(position).noidung);
        viewHolder.imgAnh.setImageResource(arrayList.get(position).Anh);
        return convertView;
    }
}
