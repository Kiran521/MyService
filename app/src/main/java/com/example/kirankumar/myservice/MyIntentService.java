package com.example.kirankumar.myservice;

import android.app.IntentService;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by kirankumar on 2/2/17.
 */

public class MyIntentService extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public MyIntentService(String name) {
        super(name);
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Toast.makeText(this, " onHandleIntent Started", Toast.LENGTH_LONG).show();

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Toast.makeText(this, " onStartCommand Started", Toast.LENGTH_LONG).show();
        return super.onStartCommand(intent, flags, startId);
    }

    @Override
    public void onCreate() {
        Toast.makeText(this, " onCreate Started", Toast.LENGTH_LONG).show();
        super.onCreate();
    }

    @Override
    public void onDestroy() {
        Toast.makeText(this, " onDestroy Started", Toast.LENGTH_LONG).show();
        super.onDestroy();
    }

    @Override
    public void onStart(Intent intent, int startId) {
        Toast.makeText(this, " onStart Started", Toast.LENGTH_LONG).show();
        super.onStart(intent, startId);
    }
}
