package com.example.vanluc.myapplication.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.vanluc.myapplication.R;

public class MainActivity extends AppCompatActivity {
    Button btn_Ex1,btn_Ex2,btn_Ex3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }

    private void initListener() {
        btn_Ex1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToExercise1();
            }
        });
        btn_Ex2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToExercise2();
            }
        });
        btn_Ex3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToExercise3();
            }
        });
    }

    private void initView() {
        btn_Ex1 = findViewById(R.id.btn_Ex1);
        btn_Ex2 = findViewById(R.id.btn_Ex2);
        btn_Ex3 = findViewById(R.id.btn_Ex3);
    }
    private void goToExercise1()
    {
        Intent intent = new Intent(MainActivity.this,Exercise1Activity.class);
        startActivity(intent);
    }
    private void goToExercise2()
    {
        Intent intent = new Intent(MainActivity.this,Exercise2Activity.class);
        startActivity(intent);
    }
    private void goToExercise3()
    {
        Intent intent = new Intent(MainActivity.this,Exercise3Activity.class);
        startActivity(intent);
    }
}
