package com.example.dangdinh_b2_tinhtoan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
//khai báo các biến giao diẹn
    EditText edta, edtb,edtc;
    Button btnTong,btnTru,btnTich,btnThuong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        tham chieu id cho các biến
        edta=findViewById(R.id.edta);
        edtb=findViewById(R.id.edtb);
        edtc=findViewById(R.id.edtc);
        btnTong=findViewById(R.id.btnTong);
        btnTru=findViewById(R.id.btnTru);
        btnTich=findViewById(R.id.btnTich);
        btnThuong=findViewById(R.id.btnThuong);
//        xử lý
        btnTong.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int a=Integer.parseInt(edta.getText().toString());
                int b=Integer.parseInt(edtb.getText().toString());
                int c=a+b;
                edtc.setText(c+" ");
            }
        });
        btnTru.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int a=Integer.parseInt(edta.getText().toString());
                int b=Integer.parseInt(edtb.getText().toString());
                int c=a-b;
                edtc.setText(c+" ");
            }
        });
        btnTich.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int a=Integer.parseInt(edta.getText().toString());
                int b=Integer.parseInt(edtb.getText().toString());
                int c=a*b;
                edtc.setText(c+" ");
            }
        });
        btnThuong.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int a=Integer.parseInt(edta.getText().toString());
                int b=Integer.parseInt(edtb.getText().toString());
                int c=a/b;
                edtc.setText(c+" ");
            }
        });
    }
}