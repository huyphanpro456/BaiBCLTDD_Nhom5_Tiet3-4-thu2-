package com.example.appmonan;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class GioiThieu extends AppCompatActivity {
    Button bt_tieptuc;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gioithieu);
        bt_tieptuc = (Button) findViewById(R.id.bt_tieptuc);
        bt_tieptuc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLogin();
            }
        });



    }

    public void openLogin() {
        Intent it=new Intent(GioiThieu.this,DangKi.class);
        startActivity(it);
    }
}
