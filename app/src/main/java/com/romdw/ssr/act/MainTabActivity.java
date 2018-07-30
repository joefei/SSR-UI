package com.romdw.ssr.act;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.romdw.ssr.adpt.MainTabPageAdapter;
import com.romdw.ssr.R;
import com.romdw.ssr.frgm.NodeListFragment;
import com.romdw.ssr.frgm.SettingFrgm;
import com.romdw.ssr.frgm.UserFrgm;
import com.romdw.ssr.util.ToastUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;


public class MainTabActivity extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;
    private PagerAdapter myFragmentPagerAdapter;

    private List<String> mTitles;

    private int[] tabIcons = {
            R.drawable.slct_tab_home,
            R.drawable.slct_tab_home,
            R.drawable.slct_tab_home
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        init();
    }

    private void initView() {
        mTabLayout = (TabLayout) findViewById(R.id.tablayout);
        mViewPager = (ViewPager) findViewById(R.id.viewpager);
    }


    private void init() {
        List<Fragment> fragments = new ArrayList<>();
        UserFrgm df = new UserFrgm();
        fragments.add(df);
        NodeListFragment f2 = new NodeListFragment();
        fragments.add(f2);
        SettingFrgm f3 = new SettingFrgm();
        fragments.add(f3);
        mTitles = new ArrayList<>();
        mTitles.add("用户中心");
        mTitles.add("节点信息");
        mTitles.add("设置");
        myFragmentPagerAdapter = new MainTabPageAdapter(getSupportFragmentManager(), fragments, mTitles);
        mViewPager.setAdapter(myFragmentPagerAdapter);
        mTabLayout.setupWithViewPager(mViewPager, false);
        mViewPager.setOffscreenPageLimit(3);
        setupTabIcons();
    }

    private void setupTabIcons() {
        mTabLayout.getTabAt(0).setCustomView(getTabView(0));
        mTabLayout.getTabAt(1).setCustomView(getTabView(1));
        mTabLayout.getTabAt(2).setCustomView(getTabView(2));
    }

    public View getTabView(int position) {
        View view = LayoutInflater.from(this).inflate(R.layout.item_tab, null);
        TextView txt_title = (TextView) view.findViewById(R.id.iv_tab_name);
        txt_title.setText(mTitles.get(position));
        ImageView img_title = (ImageView) view.findViewById(R.id.iv_icon);
        img_title.setImageResource(tabIcons[position]);
        return view;
    }

    @Override
    public void onBackPressed() {
        exitBy2Click();
    }

    private static boolean isExit = false;

    private void exitBy2Click() {
        if (!isExit) {
            isExit = true;
            ToastUtil.showShort(this, "再按一次退出程序");
            new Timer().schedule(new TimerTask() {
                @Override
                public void run() {
                    isExit = false;
                }
            }, 1500);
        } else {
            finish();
        }
    }
}
