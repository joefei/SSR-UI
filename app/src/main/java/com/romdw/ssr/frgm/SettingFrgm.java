package com.romdw.ssr.frgm;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.romdw.ssr.R;
import com.romdw.ssr.adpt.SettingRvAdapter;

import java.util.ArrayList;
import java.util.List;


/**
 * UserFrgm
 * Created on 2018-07-30 07:26:35.
 */
public class SettingFrgm extends Fragment {

    private RecyclerView rv;


    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View root = inflater.inflate(R.layout.frgm_setting, container, false);
        initView(root);
        return root;
    }

    private void initView(View root) {
        TextView tvTitle = (TextView) root.findViewById(R.id.tvTopTitle);
        tvTitle.setText("设置");
        rv = (RecyclerView) root.findViewById(R.id.rvSetting);
        initRv();
    }

    private void initRv() {
        rv.setLayoutManager(new LinearLayoutManager(getActivity()));
        rv.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));
        List<String> data = new ArrayList<>();
        data.add("1");
        data.add("2");
        data.add("3");
        data.add("4");
        data.add("5");
        data.add("6");
        data.add("7");
        data.add("8");
        data.add("9");
        data.add("10");
        rv.setAdapter(new SettingRvAdapter(getActivity(), data));
    }

}