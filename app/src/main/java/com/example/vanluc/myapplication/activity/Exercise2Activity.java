package com.example.vanluc.myapplication.activity;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.vanluc.myapplication.R;

public class Exercise2Activity extends AppCompatActivity {
    Button btn_Color1,btn_Color2,btn_Color3,btn_Clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise2);
        initView();
        initListener();
    }

    private void initListener() {
        btn_Color1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setBackgroundButton1();
            }
        });
        btn_Color2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setBackgroundButton2();
            }
        });
        btn_Color3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setBackgroundButton3();
            }
        });
        btn_Clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clearColorDefault();
            }
        });
    }

    private void initView() {
        btn_Color1 = findViewById(R.id.btn_Color1);
        btn_Color2 = findViewById(R.id.btn_Color2);
        btn_Color3 = findViewById(R.id.btn_Color3);
        btn_Clear = findViewById(R.id.btn_Clear);
    }
    @SuppressLint("ResourceAsColor")
    private  void setBackgroundButton1()
    {
        btn_Color1.setBackgroundColor(getResources().getColor(R.color.rbtnBlue,getResources().newTheme()));

    }
    @SuppressLint("ResourceAsColor")
    private  void setBackgroundButton2(){
        btn_Color2.setBackgroundColor(getResources().getColor(R.color.rbtnRed,getResources().newTheme()));
    }
    @SuppressLint("ResourceAsColor")
    private void setBackgroundButton3(){
        btn_Color3.setBackgroundColor(getResources().getColor(R.color.btnYellow,getResources().newTheme()));
    }
    @SuppressLint("ResourceAsColor")
    private void clearColorDefault()
    {
        btn_Color1.setBackgroundColor(getResources().getColor(R.color.btnClear,getResources().newTheme()));
        btn_Color2.setBackgroundColor(getResources().getColor(R.color.btnClear,getResources().newTheme()));
        btn_Color3.setBackgroundColor(getResources().getColor(R.color.btnClear,getResources().newTheme()));

    }

}
