package com.audrey.futurepredict.welcome;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.audrey.futurepredict.MainActivity;
import com.audrey.futurepredict.R;

import java.util.ArrayList;
import java.util.List;

public class GuideActivity extends AppCompatActivity {

    private ViewPager vp;
    private Button bt;
    private SharedPreferences preferences;
    private List<View> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);

        //目的是让状态栏全透明(沉浸式)
        //StatusBarUtil.setTransparent(GuideActivity.this);

        //ButterKnife.bind(this);
        viewPager();

    }

    private void viewPager() {

        vp = (ViewPager) findViewById(R.id.vp_guide);
        //Vp滑动地四个页面
        View v1 = View.inflate(GuideActivity.this, R.layout.pager1, null);
        View v2 = View.inflate(GuideActivity.this, R.layout.pager2, null);
        View v3 = View.inflate(GuideActivity.this, R.layout.pager3, null);
        View v4 = View.inflate(GuideActivity.this, R.layout.pager4, null);
        View v5 = View.inflate(GuideActivity.this, R.layout.pager5, null);

        //把四个页面装到集合
        list.add(v1);
        list.add(v2);
        list.add(v3);
        list.add(v4);
        list.add(v5);

        bt = (Button) v5.findViewById(R.id.bt_pager5);

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor edit = preferences.edit();
                edit.putBoolean("sta", true);
                edit.commit();
                startActivity(new Intent(GuideActivity.this, MainActivity.class));
                GuideActivity.this.finish();
            }
        });

        //关联适配器
        vp.setAdapter(new MyAdapter());
        preferences = getSharedPreferences("User", MODE_PRIVATE);
        boolean b = preferences.getBoolean("sta", false);
        if (b) {
            startActivity(new Intent(GuideActivity.this, WelcomeActivity.class));
            GuideActivity.this.finish();
        }
    }











    /**
     * ViewPager引导页 适配器
     */
    class MyAdapter extends PagerAdapter {

        //数量
        @Override
        public int getCount() {
            return list.size();
        }

        @Override
        public boolean isViewFromObject(View view, Object object) {
            return view == object;
        }

        @Override
        public Object instantiateItem(ViewGroup container, int position) {
            container.addView(list.get(position));
            return list.get(position);
        }

        @Override
        public void destroyItem(ViewGroup container, int position, Object object) {
            container.removeView(list.get(position));
        }
    }
}
