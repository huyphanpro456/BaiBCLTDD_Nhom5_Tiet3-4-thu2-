package com.example.appmonan;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class DangNhap  extends AppCompatActivity {
    Button btdangnhap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dangnhap);
        btdangnhap = (Button) findViewById(R.id.bt_dangnhap);
        btdangnhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openToi();
            }
        });

    }

    public void openToi() {
        Intent it=new Intent(DangNhap.this,Toi.class);
        startActivity(it);
    }

}
