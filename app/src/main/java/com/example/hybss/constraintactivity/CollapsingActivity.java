package com.example.hybss.constraintactivity;

import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.WindowManager;


public class CollapsingActivity extends AppCompatActivity {
    private CollapsingToolbarLayout ctl;
    private Toolbar tool_bar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_collapsing);
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);

        ctl = findViewById(R.id.ctl);
        tool_bar = findViewById(R.id.tool_bar);
        ctl.setTitle("");

        tool_bar.setTitleTextColor(ContextCompat.getColor(this, android.R.color.white));
        ctl.setCollapsedTitleTextColor(ContextCompat.getColor(this, R.color.white));
        ctl.setExpandedTitleColor(ContextCompat.getColor(this, R.color.white));
    }
}
