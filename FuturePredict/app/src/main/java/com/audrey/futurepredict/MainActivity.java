package com.audrey.futurepredict;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hjm.bottomtabbar.BottomTabBar;

public class MainActivity extends AppCompatActivity {

    private BottomTabBar tabBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //目的是让状态栏全透明
        //StatusBarUtil.setTransparent(MainActivity.this);

        tabBar = (BottomTabBar) findViewById(R.id.main_tabBar);
        tabBar.init(getSupportFragmentManager())
                .setImgSize(45,45)
                .setFontSize(11)
                .setChangeColor(Color.YELLOW, Color.GRAY)
                .addTabItem("学习", R.mipmap.study_checked, R.mipmap.study, StudyFragment.class)
                .addTabItem("课程", R.mipmap.curriculum_check, R.mipmap.curriculum, CurriculumFragment.class)
                .addTabItem("我的", R.mipmap.user_checked, R.mipmap.user, UserFragment.class)
                .isShowDivider(false);

        //ActivityUtils.strartWithLogin(UserActivity.this, new Intent(UserActivity.this, UserCenterActivity.class));


    }
}
