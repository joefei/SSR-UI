package com.romdw.ssr.adpt;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.romdw.ssr.R;
import com.romdw.ssr.util.ToastUtil;

import java.util.List;

/**
 * Created by ZeroVoid on 2018-7-30.
 */

public class SettingRvAdapter extends RecyclerView.Adapter<SettingRvAdapter.NormalTextViewHolder> {

    private final LayoutInflater mLayoutInflater;
    private final Context mContext;
    private List<String> mData;

    public SettingRvAdapter(Context context, List<String> data) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
        mData = data;
    }

    @Override
    public SettingRvAdapter.NormalTextViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new NormalTextViewHolder(mLayoutInflater.inflate(R.layout.item_setting, parent, false), mContext);
    }

    @Override
    public void onBindViewHolder(NormalTextViewHolder holder, int position) {
        holder.mTextView.setText(mData.get(position));
    }

    @Override
    public int getItemCount() {
        return mData == null ? 0 : mData.size();
    }

    public static class NormalTextViewHolder extends RecyclerView.ViewHolder {
        TextView mTextView;

        NormalTextViewHolder(View view, final Context context) {
            super(view);
            mTextView = (TextView) view.findViewById(R.id.textView);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ToastUtil.show(context, "", Toast.LENGTH_SHORT);
                }
            });
        }
    }

}