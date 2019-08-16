package com.example.hybss.constraintactivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ShareElementActivity extends AppCompatActivity {
    ImageView iv_share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share_element);

        iv_share = findViewById(R.id.iv_share);

        findViewById(R.id.btn_share_element).setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(ShareElementActivity.this, ShareElement2Activity.class);
//                startActivity(intent);
                startActivity(intent, ActivityOptions.makeSceneTransitionAnimation(
                        ShareElementActivity.this, iv_share, "test").toBundle());
            }
        });
    }
}
