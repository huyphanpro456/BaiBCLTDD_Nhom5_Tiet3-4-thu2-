package com.example.appmonan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class Toi extends AppCompatActivity {
    Button btTrangChu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toi);


        btTrangChu=(Button)findViewById(R.id.bt_trangchu);
        btTrangChu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfile();
            }
        });
    }
    public void openProfile(){
        Intent it=new Intent(Toi.this,TrangChuMain.class);
        startActivity(it);
    }

}

