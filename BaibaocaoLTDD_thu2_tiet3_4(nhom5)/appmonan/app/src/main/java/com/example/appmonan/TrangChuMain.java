package com.example.appmonan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;

public class TrangChuMain extends AppCompatActivity {
    GridView gridView;
    ArrayList<QuanAn> arrayList;
    QuanAnAdapter anAdapter;
    public Button bt_giaohang;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.trangchu);


        gridView = (GridView) findViewById(R.id.GV_trangchu);
        arrayList = new ArrayList<>();
        arrayList.add(new QuanAn("Bún Đậu Mắm Tôm", "20 Phan Đăng Lưu", R.drawable.a6));
        arrayList.add(new QuanAn("Chè Xuân Trang", "31 Lê Duẩn", R.drawable.a9));
        arrayList.add(new QuanAn("Xứ Nẫu Quán", "46 Lê Hồng Phong", R.drawable.a10));
        arrayList.add(new QuanAn("BenBen Food & Drink", "40 Phan Tứ", R.drawable.a11));
        arrayList.add(new QuanAn("Ốp La Heo Quay", "43 Quang Dũng", R.drawable.a12));
        arrayList.add(new QuanAn("HighLand", "115 Nguyễn Văn Linh", R.drawable.a13));

        anAdapter = new QuanAnAdapter(this, R.layout.product_gridview, arrayList);
        gridView.setAdapter(anAdapter);


        bt_giaohang=(Button) findViewById(R.id.bt_giaohang);
       bt_giaohang.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent intent= new Intent(TrangChuMain.this,GiaoHangAtivity.class);
               startActivity(intent);
           }
       });
    }

}