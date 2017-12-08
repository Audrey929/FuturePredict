package com.audrey.futurepredict;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by dell on 2017/12/5.
 */

public class UserFragment extends Fragment implements View.OnClickListener {

    private View view;
    private LinearLayout user_ll, down_ll,enshrine_ll,balance_ll,record_ll,messagecenter_ll,vip_ll,setting_ll,servicephone_ll;
    private ImageView user_iv;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_user, container, false);

        initView();


        return view;

    }

    private void initView() {

        TextView title_tv = view.findViewById(R.id.title_tv);
        ImageView title_iv = view.findViewById(R.id.left);

        user_ll = view.findViewById(R.id.user_ll);
        down_ll = view.findViewById(R.id.ll_down);
        enshrine_ll = view.findViewById(R.id.ll_enshrine);
        balance_ll = view.findViewById(R.id.ll_balance);
        record_ll = view.findViewById(R.id.ll_record);
        messagecenter_ll = view.findViewById(R.id.ll_messagecenter);
        vip_ll = view.findViewById(R.id.ll_vip);
        setting_ll = view.findViewById(R.id.ll_setting);
        servicephone_ll = view.findViewById(R.id.ll_servicephone);
        user_iv = view.findViewById(R.id.user_iv);


        //设置标题
        title_tv.setText("我的");
        //title_iv.setImageResource(R.mipmap.left_arrow);

        user_ll.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            //登录
            case R.id.user_ll:

                break;
            //下载
            case R.id.ll_down:
                break;
            //收藏
            case R.id.ll_enshrine:

                break;
            //余额
            case R.id.ll_balance:

                break;
            //记录
            case R.id.ll_record:

                break;
            //中心
            case R.id.ll_messagecenter:

                break;
            //中心
            case R.id.ll_vip:

                break;
            //中心
            case R.id.ll_setting:

                break;
            //中心
            case R.id.ll_servicephone:

                break;


        }
    }
}
