package com.example.assignment.ui.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.assignment.Calendar;
import com.example.assignment.CheckList;
import com.example.assignment.R;

public class MainMenu extends AppCompatActivity {

    private static final int REQ_CODE = 97;
    private ImageButton calendarBtn;
    private ImageButton checkBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        calendarBtn = (ImageButton)findViewById(R.id.calendarBtn);
        checkBtn = (ImageButton)findViewById(R.id.checkBtn);

        calendarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callCalendarActivity();
            }
        });

        checkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callCheckActivity();
            }
        });
    }

    private void callCalendarActivity(){
        Intent intent = new Intent(this, Calendar.class);
        startActivityForResult(intent, REQ_CODE);
    }

    private void callCheckActivity(){
        Intent intent = new Intent(this, CheckList.class);
        startActivityForResult(intent, REQ_CODE);
    }

}