package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class UserInformation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_information);

        // 카페명은 CafeName
        // 이름은 Name
        // 영업시작/종료는 StartTime/CloseTime
        // 비밀번호/비밀번호 체크는 Password/PasswordCheck
        // 전화번호는 PhoneNumber
        // 이메일은 Email
        // 변경 버튼은 Change1

        // 좌석 수는 Seat
        // 카페좌석관리 Change2
        Button Change2 = (Button) findViewById(R.id.Change2);

        Change2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (v.getContext(), CafeSeatControll.class);
                startActivity(intent);
            }
        });

    }
}
