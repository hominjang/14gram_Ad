package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);

        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        // 위에 뜨는 카페이름은 CafeName
        // 그 밑에 뜨는 아이디는 Name

        // 개인 설정하러가는 꺾쇠는 UserInfo
        LinearLayout UserInfo = (LinearLayout) findViewById(R.id.UserInfo);
        // 설정은 Setting
        ImageView Setting = (ImageView) findViewById(R.id.Setting);

        // 카페 활성화/비활성화는 Active
        // 카페 좌석은 Seat

        // 카페 영업 시작 시간은 StartTime
        // 카페 영업 종료 시간은 CloseTime
        // CLOSE 버튼 Close

        // 좌석 관리 버튼은 SeatAdminister
        // 홈버튼은 Home
        Button Home = (Button) findViewById(R.id.Home);
        // 카페관리 버튼은 CafeAdminister
        Button CafeAdminister = (Button) findViewById(R.id.CafeAdminister);

        UserInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), UserInformation.class);
                startActivity(intent);
            }
        });

        Setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), Setting.class);
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
