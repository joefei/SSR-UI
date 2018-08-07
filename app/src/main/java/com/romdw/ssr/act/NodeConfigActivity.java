package com.romdw.ssr.act;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.romdw.ssr.R;
import com.romdw.ssr.util.ToastUtil;

/**
 * Created by ZeroVoid on 2018-7-30.
 */

public class NodeConfigActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_node_cfg);
        initView();
//        init();
    }

    private void initView() {
        TextView tvTitle = (TextView) findViewById(R.id.tvTopTitle);
        tvTitle.setText("节点配置");
        ImageView ivBack = (ImageView) findViewById(R.id.iv_back);
        ivBack.setVisibility(View.VISIBLE);
        ivBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                NodeConfigActivity.this.finish();
            }
        });
    }


}
