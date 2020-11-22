package com.example.appmonan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class ThongBaoActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<ThongBao> arrayList;
    ThongBaoAdapter anAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.thongbao);


        listView = (ListView) findViewById(R.id.lv_thongbao);
        arrayList = new ArrayList<>();
        arrayList.add(new ThongBao("Popeye[Now x PopEye]", "Quán đang có nhiều combo kết hợp giữa há cảo, xiên que và bánh bao kim sa ngon ngất ngây con gà tây. Đặt Now nhập mã FSXTRA để được giảm 15k trên phí vận chuyển - đơn tối thiểu 30k, NOWFOOD111 giảm 50k - đơn tối thiểu 161k,  mã FSCT và APYEUTHICH để được freeship tới 3km.", R.drawable.a29));
        arrayList.add(new ThongBao("Giảm từ 20% ~ 40% Buffer,tặng Món đặt chỗ qua NowTable", "Chỉ với 11k ăn thỏa thích các món chỉ có thể là Siêu Deal Now Food 11k thôi nha. Nhanh tay săn ngay deal hỡi nào, bỏ qua thì tiếc lắm nha", R.drawable.a16));
        arrayList.add(new ThongBao("Ưu đãi đến 50% Top nhà hàng tháng 11", "Đa dạng lựa chọn từ món Hoa, món Nhật, món Hàn, món Việt cho đến các món Âu Mỹ vô cùng hấp dẫn. Chần chờ gì nữa, nhanh tay đặt bàn qua NowTable hoặc gọi 1900 6044 để nhận ngay ưu đãi tới 50%!", R.drawable.a18));
        arrayList.add(new ThongBao("nhập mã DEALXIN giảm ngay 30k cho đơn từ 50k.", "Lập kèo cuối tuần có ưu đãi quán ngon lại về như Mama, Hotpot...ưu dãi tới 40% giảm trên hóa đơn khi đặt chỗ trước qua NowTable", R.drawable.a29));
        arrayList.add(new ThongBao("Siêu ưu đãi HIGHLAND Coffee", "Chiêu đãi món xịn. Đặt hàng HighLand Coffee giảm ngáy 25k cho hóa đơn 100k, giảm 60k cho đơn 200k. Ưu đãi chỉ từ 2-30/11, nhanh tay đón vài ly HighLand về nhâm nhi cả ngày nhé", R.drawable.a29));
        arrayList.add(new ThongBao("Popeye[Now x PopEye]", "Quán đang có nhiều combo kết hợp giữa há cảo, xiên que và bánh bao kim sa ngon ngất ngây con gà tây. Đặt Now nhập mã FSXTRA để được giảm 15k trên phí vận chuyển - đơn tối thiểu 30k, NOWFOOD111 giảm 50k - đơn tối thiểu 161k,  mã FSCT và APYEUTHICH để được freeship tới 3km.", R.drawable.a29));

        anAdapter = new ThongBaoAdapter(this, R.layout.product_thongbao, arrayList);
        listView.setAdapter(anAdapter);


    }

}