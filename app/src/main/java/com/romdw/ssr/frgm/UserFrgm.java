package com.romdw.ssr.frgm;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.romdw.ssr.R;


/**
 * 用户中心
 * Created on 2018-07-30 07:26:35.
 */
public class UserFrgm extends Fragment {

    //用户名
    private String mName = "AV明";

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.frgm_user, container, false);
        initView(root);
        return root;
    }

    private void initView(View root) {
        TextView tvTitle = (TextView) root.findViewById(R.id.tvTopTitle);
        tvTitle.setText("嗨,欢迎 " + mName + " 登入");
        ImageView ivLevel = (ImageView) root.findViewById(R.id.iv_back);
//        ivLevel.setImageResource(R.drawable.main_home_selected);
    }

}