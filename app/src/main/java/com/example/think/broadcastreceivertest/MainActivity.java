package com.example.think.broadcastreceivertest;

import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button sendBoastcast;
    //NetworkStateReceiver receiver;
    //IntentFilter filter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendBoastcast=(Button)findViewById(R.id.send);
        //filter=new IntentFilter();
        //filter.addAction("com.example.think.broadcastreceivertest.MY_BROASTCAST");
        //receiver=new NetworkStateReceiver();
        //registerReceiver(receiver,filter);

        sendBoastcast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent("com.example.think.broadcastreceivertest.MY_BROASTCAST");
                sendBroadcast(intent);
            }
        });
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //unregisterReceiver(receiver);
    }
}
