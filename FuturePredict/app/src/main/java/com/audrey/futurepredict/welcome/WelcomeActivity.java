package com.audrey.futurepredict.welcome;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;

import com.audrey.futurepredict.MainActivity;
import com.audrey.futurepredict.R;

import java.util.Timer;
import java.util.TimerTask;

public class WelcomeActivity extends AppCompatActivity {

    private int count = 3;
    //private RelativeLayout rl;
    private MyRunnable runnable;
    private Handler handler = new Handler() {
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            // bt_wel.setText(count-- + "");
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //目的是让状态栏全透明(沉浸式)
        //StatusBarUtil.setTransparent(WelcomeActivity.this);

        runnable = new MyRunnable();
        handler.postDelayed(runnable, 2000);
        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                //要执行的操作
                handler.sendEmptyMessage(1);
            }
        };
        //创建一个定时器
        Timer timer = new Timer();
        timer.schedule(task, 0, 1000);
    }

    class MyRunnable implements Runnable {
        @Override
        public void run() {

            Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
            startActivity(intent);
            finish();
            handler.removeCallbacks(runnable);
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        handler.removeCallbacks(runnable);
    }
}
