package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CafeAdminister extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_administer);


        // 첫번째 EditText는 Info
        // 첫번째 버튼은 Register1

        // 품목명 EditText는 SaleProduct
        // 가격 전자는 Price1 후자는 Price2
        // 현황 버튼은 Register2
        Button Situation = (Button) findViewById(R.id.Register2);
        // 등록 버튼은 Register3

        Button Home = (Button) findViewById(R.id.Home);
        Button CafeAdminister = (Button) findViewById(R.id.CafeAdminister);

        Home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Situation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Situation.class);
                startActivity(intent);
            }
        });

        CafeAdminister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), CafeAdminister.class);
                startActivity(intent);
            }
        });

    }
}
