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
import com.romdw.ssr.adpt.NodeListAdapter;
import com.romdw.ssr.adpt.SettingRvAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


/**
 * UserFrgm
 * Created on 2018-07-30 07:26:35.
 */
public class NodeListFragment extends Fragment {

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
        List<HashMap<String, String>> data = new ArrayList<>();
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("flag", "cn");
        map1.put("name", "中国-vip-CPP-100Mbps");
        map1.put("ping", "50ms");
        map1.put("group", "ROM环球网络");
        map1.put("upload", "476KB↑");
        map1.put("download", "234KB↓");
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("flag", "ca");
        map2.put("name", "加拿大-vip-CPP-100Mbps");
        map2.put("ping", "150ms");
        map2.put("group", "ROM环球网络");
        map2.put("upload", "476KB↑");
        map2.put("download", "234KB↓");
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("flag", "cn");
        map3.put("name", "中国-vip-CPP-100Mbps");
        map3.put("ping", "50ms");
        map3.put("group", "ROM环球网络");
        map3.put("upload", "476KB↑");
        map3.put("download", "234KB↓");
        HashMap<String, String> map4 = new HashMap<>();
        map4.put("flag", "ca");
        map4.put("name", "中国-vip-CPP-100Mbps");
        map4.put("ping", "50ms");
        map4.put("group", "ROM环球网络");
        map4.put("upload", "476KB↑");
        map4.put("download", "234KB↓");
        HashMap<String, String> map5 = new HashMap<>();
        map5.put("flag", "cn");
        map5.put("name", "中国-vip-CPP-100Mbps");
        map5.put("ping", "50ms");
        map5.put("group", "ROM环球网络");
        map5.put("upload", "476KB↑");
        map5.put("download", "234KB↓");
        HashMap<String, String> map6 = new HashMap<>();
        map6.put("flag", "ca");
        map6.put("name", "加拿大-vip-CPP-100Mbps");
        map6.put("ping", "50ms");
        map6.put("group", "ROM环球网络");
        map6.put("upload", "476KB↑");
        map6.put("download", "234KB↓");

        data.add(map1);
        data.add(map2);
        data.add(map3);
        data.add(map4);
        data.add(map5);
        data.add(map6);

        rv.setAdapter(new NodeListAdapter(getActivity(), data));

    }
}