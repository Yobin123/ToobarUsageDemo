package com.example.hybss.constraintactivity;

import android.animation.Animator;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.transition.Explode;
import android.transition.Fade;
import android.transition.Slide;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * 揭露动画，利用createCircularReveal(View view,int centerX,int centerY,float startRadius,float endRadius)
 * view为要展示的动画控件
 * centerX,centerY为相应的中心点
 * startRadius ,endRadius 开始半径，和结束半径
 * 其中以控件的有下角为参考点
 * <p>
 * 转场动画：
 * 种类
 * 1.explode()
 * 2.slide
 */
public class RevealCircularActivity extends AppCompatActivity {
    private Context context;
    private ImageView iv_reveal;
    private Button btn_start1, btn_start2, btn_start3;

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTransitionAnimation();
        setContentView(R.layout.activity_reveal_circular);
        context = this;

        iv_reveal = findViewById(R.id.iv_reveal);

        btn_start1 = findViewById(R.id.btn_start1);

        btn_start2 = findViewById(R.id.btn_start2);

        btn_start3 = findViewById(R.id.btn_start3);

        btn_start1.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                int width = iv_reveal.getMeasuredWidth();
                int height = iv_reveal.getMeasuredHeight();
                float radius = (float) Math.sqrt(width * width + height * height);
                Animator animator = ViewAnimationUtils.createCircularReveal(iv_reveal, width, height, radius, 0);

                animator.setDuration(2000);
                animator.start();

            }
        });
        btn_start2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                int width = iv_reveal.getMeasuredWidth();
                int height = iv_reveal.getMeasuredHeight();
                float radius = (float) Math.sqrt(width * width + height * height);
                Animator animator = ViewAnimationUtils.createCircularReveal(iv_reveal, width, height, 0, radius);

                animator.setDuration(2000);
                animator.start();
            }
        });

        btn_start3.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void onClick(View v) {
                int width = iv_reveal.getMeasuredWidth();
                int height = iv_reveal.getMeasuredHeight();
                float radius = (float) Math.sqrt(width * width + height * height);
                Animator animator = ViewAnimationUtils.createCircularReveal(iv_reveal, width / 2, height / 2, 0, radius / 2);

                animator.setDuration(2000);
                animator.start();
            }
        });

    }


    /**
     * 设置转场动画
     */
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    private void setTransitionAnimation() { //设置动画形式
        getWindow().requestFeature(Window.FEATURE_CONTENT_TRANSITIONS);
        // getWindow().setEnterTransition(new Explode()); //分解动画
//        getWindow().setExitTransition(new Explode());
//        getWindow().setEnterTransition(new Slide()); //滑动动画
//        getWindow().setExitTransition(new Slide());
        getWindow().setEnterTransition(new Fade()); //首次进入显示动画
        getWindow().setExitTransition(new Fade());//首次进入该页面返回动画

        getWindow().setReturnTransition(new Explode()); //调用finishAfterTransition退出时，当前页的退出动画
        getWindow().setReenterTransition(new Slide());//再次进入页面显示动画
    }

    @Override
    public void finishAfterTransition() {
        super.finishAfterTransition();
    }
}
