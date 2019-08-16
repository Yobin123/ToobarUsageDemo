
package com.example.hybss.constraintactivity;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


/**
 * 利用AppbarLayout实现相关效果吸顶效果
 */
public class SuctionTopActivity extends AppCompatActivity {

    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coordinator);
        context = this;
    }

}
