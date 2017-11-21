package com.example.a32150.mybroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by 32150 on 2017/11/21.
 */

public class BroadcastReceiver2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        String event = intent.getAction();
        Toast.makeText(context, event, Toast.LENGTH_SHORT).show();
    }
}
