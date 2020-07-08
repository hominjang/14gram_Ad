package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        // 사운드는 Sound
        Button Sound = (Button) findViewById(R.id.Sound);
        // 알림은 Alert
        Button Alert = (Button) findViewById(R.id.Alert);
        // 자동로그인은 LoginType
        Button LoginType = (Button) findViewById(R.id.LoginType);


    }

    public void btnOnClick(View view) {
        Button Sound = (Button) findViewById(R.id.Sound);
        Button Alert = (Button) findViewById(R.id.Alert);
        Button LoginType = (Button) findViewById(R.id.LoginType);

        switch (view.getId()) {
            case R.id.Sound:
                if (Sound.getText().toString().equals("ON")) {
                    Sound.setText("OFF");
                } else if (Sound.getText().toString().equals("OFF")) {
                    Sound.setText("ON");
                }
                break;
            case R.id.Alert:
                if (Alert.getText().toString().equals("ON")) {
                    Alert.setText("OFF");
                } else if (Alert.getText().toString().equals("OFF")) {
                    Alert.setText("ON");
                }
                break;
            case R.id.LoginType:
                if (LoginType.getText().toString().equals("ON")) {
                    LoginType.setText("OFF");
                } else if (LoginType.getText().toString().equals("OFF")) {
                    LoginType.setText("ON");
                }
                break;
        }
    }


}
