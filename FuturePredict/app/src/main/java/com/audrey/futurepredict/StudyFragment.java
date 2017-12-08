package com.audrey.futurepredict;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by dell on 2017/12/5.
 */

public class StudyFragment extends Fragment {

    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_study, container, false);

        initView();


        return view;

    }

    private void initView() {

        TextView title_tv = view.findViewById(R.id.title_tv);
        title_tv.setText("学习");

    }
}
