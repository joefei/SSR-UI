package com.romdw.ssr.frgm;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.romdw.ssr.R;
import com.romdw.ssr.util.ToastUtil;


/**
 * 用户中心
 * Created on 2018-07-30 07:26:35.
 */
public class UserFrgm extends Fragment {

    //用户名
    private String mName = "AV明";
    private RelativeLayout rlLink;

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
        root.findViewById(R.id.rlLink).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtil.show(getActivity(), "连接", Toast.LENGTH_SHORT);
            }
        });
//        ivLevel.setImageResource(R.drawable.main_home_selected);
    }

}