package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Situation extends Activity {

    ArrayList<EventData> EventDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_situation);


        // x 이미지 Cancel
        ImageView Cancel = (ImageView) findViewById(R.id.Cancel);
        // 선택삭제 버튼 Delete

        Cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        EventDataList = new ArrayList<EventData>();
        EventDataList.add(new EventData("치즈케이크", 2000,3000));

        ListView EventList = (ListView)findViewById(R.id.EventList);
        EventAdapter eventAdapter = new EventAdapter(EventDataList);
        EventList.setAdapter(eventAdapter);
    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        //바깥레이어 클릭시 안닫히게
        if(event.getAction()==MotionEvent.ACTION_OUTSIDE){
            return false;
        }
        return true;
    }

}


