package com.example.hybss.constraintactivity;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

/**
 * 注意事项
 * 1. mToolBar.setNavigationOnclickListener(); //用于设置左上角导航图标的点击事件
 * 2. mToolbar.inflateMenu(R.menu.toolbar_menu); // 右边menu数据
 * 3. mToolbar.setOnMenuItemClickListener(); // 点击菜单item的响应事件
 * 4. **注意：**
 * 使用时候需要修改为无actionBar主题，否则会出现问题（查看style下的theme）
 * 必须使用V7包下的Toolbar,同时继承支持Toolbar的AppCompatActivity,否则可能如setSupportActionBar方法可能使用不了。
 */
public class ToolbarActivity extends AppCompatActivity {
    private Toolbar mToolbar;
    private Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
        context = this;
        mToolbar = findViewById(R.id.tool_bar);
        mToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, "点击导航按钮", Toast.LENGTH_SHORT).show();
            }
        });

        mToolbar.inflateMenu(R.menu.toolbar_menu);
        mToolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                return false;
            }
        });
//        setSupportActionBar(mToolbar); //设置支持actionBar
    }
}
