package com.example.notificationbadge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nex3z.notificationbadge.NotificationBadge;

public class MainActivity extends AppCompatActivity {
    NotificationBadge mBadge;
    private int mCount=0;
    Button increase;
    Button clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBadge=(NotificationBadge) findViewById(R.id.badgeId);
        increase=(Button)findViewById(R.id.increaseButton);
        clear=(Button)findViewById(R.id.clearButton);
        increase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBadge.setNumber(++mCount);
            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCount=0;
                mBadge.setNumber(mCount);
            }
        });



    }
}
