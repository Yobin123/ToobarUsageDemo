package com.example.hybss.constraintactivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ShareElement2Activity extends AppCompatActivity {
    private ImageView iv_share_2;
    @SuppressLint("HandlerLeak")
    private Handler handler = new Handler() {
        @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
        @Override
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            iv_share_2.setImageResource(R.mipmap.ic_launcher);
            postponeEnterTransition();
        }
    };

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_element2);
        iv_share_2 = findViewById(R.id.iv_share_2);
        handler.sendEmptyMessageDelayed(0, 1000);
        startPostponedEnterTransition();
    }
}
