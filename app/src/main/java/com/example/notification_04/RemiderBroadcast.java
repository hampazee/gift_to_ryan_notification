package com.example.notification_04;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

public class RemiderBroadcast extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent){

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context,"notify")
                .setSmallIcon(R.drawable.ic_android_black_24dp)
                .setContentTitle("here comes the pupu")
                .setContentText("eat shit")
                .setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(context);

        notificationManagerCompat.notify(200,builder.build());


    }
}
