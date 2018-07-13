package com.example.vanluc.myapplication.activity;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vanluc.myapplication.R;

import static com.example.vanluc.myapplication.R.color.rbtnRed;

public class Exercise1Activity extends AppCompatActivity {
    Button rbtn_Red,rbtn_White,rbtn_Blue;
    TextView tv_SetColor;
    Button btn_SetCor,btn_Cancel;
    RadioGroup rg_Color;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exercise1);
        initView();
        initListener();
    }

    private void initListener() {
        btn_SetCor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setColor();
            }
        });
        btn_Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancelColor();
            }
        });
    }

    private void cancelColor() {
    }

    private  void initView()
    {
        btn_Cancel = findViewById(R.id.btn_Cancel);
        btn_SetCor = findViewById(R.id.btn_SetColor);
        rbtn_Blue = findViewById(R.id.rbtn_Blue);
        rbtn_Red = findViewById(R.id.rbtn_Red);
        rbtn_White = findViewById(R.id.rbtn_White);
       tv_SetColor = findViewById(R.id.tv_SetColor);
        rg_Color = findViewById(R.id.rgColor);
    }
    private void setColor()
    {
        int idCheck = rg_Color.getCheckedRadioButtonId();
        switch (idCheck)
        {
            case R.id.rbtn_Red:
                setBackgroundRadioButtonRed();
                break;
            case R.id.rbtn_White:
                setBackgroundRadioButtonWhite();
                break;
            case R.id.rbtn_Blue:
                setBackgroundRadioButtonBlue();
                break;
            default:
                Toast.makeText(this, "Mời bạn chọn màu", Toast.LENGTH_SHORT).show();                    
        }
    }

    @SuppressLint("ResourceAsColor")
    private void setBackgroundRadioButtonRed(){
        tv_SetColor.setBackgroundColor(getResources().getColor(R.color.btnYellow,getResources().newTheme()));
    }
    @SuppressLint("ResourceAsColor")
    private void setBackgroundRadioButtonWhite(){
        tv_SetColor.setBackgroundColor(getResources().getColor(R.color.rbtnWhite,getResources().newTheme()));
    }
    @SuppressLint("ResourceAsColor")
    private void setBackgroundRadioButtonBlue(){
        tv_SetColor.setBackgroundColor(getResources().getColor(R.color.rbtnBlue,getResources().newTheme()));
    }
}
