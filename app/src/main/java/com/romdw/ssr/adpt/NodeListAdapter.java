package com.romdw.ssr.adpt;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.romdw.ssr.R;
import com.romdw.ssr.act.NodeConfigActivity;
import com.romdw.ssr.util.ToastUtil;

import java.util.HashMap;
import java.util.List;

/**
 * Created by ZeroVoid on 2018-7-30.
 */

public class NodeListAdapter extends RecyclerView.Adapter<NodeListAdapter.NormalTextViewHolder> {

    private final LayoutInflater mLayoutInflater;
    private final Context mContext;
    private List<HashMap<String, String>> mData;

    public NodeListAdapter(Context context, List<HashMap<String, String>> data) {
        mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
        mData = data;
    }

    @Override
    public NodeListAdapter.NormalTextViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new NodeListAdapter.NormalTextViewHolder(mLayoutInflater.inflate(R.layout.item_node_list, parent, false), mContext);
    }

    @Override
    public void onBindViewHolder(NodeListAdapter.NormalTextViewHolder holder, int position) {
        HashMap<String, String> map1 = mData.get(position);
        holder.tvName.setText(map1.get("name"));
        holder.tvUploadSpeed.setText(map1.get("upload"));
        holder.tvDownloadSpeed.setText(map1.get("download"));
        holder.tvPing.setText(map1.get("ping"));
        holder.tvGroup.setText(map1.get("group"));
        String flag = map1.get("flag");
        if ("ca".equals(flag)) {
            holder.ivFlag.setImageResource(R.drawable.ic_flag_ca);
        } else if ("cn".equals(flag)) {
            holder.ivFlag.setImageResource(R.drawable.ic_flag_cn);
        }
        holder.tvName.setTag(map1.get("name"));
    }

    @Override
    public int getItemCount() {
        return mData == null ? 0 : mData.size();
    }

    public static class NormalTextViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        TextView tvUploadSpeed;
        TextView tvDownloadSpeed;
        TextView tvPing;
        TextView tvGroup;
        ImageView ivFlag;
        private Context mContext;

        public Dialog onCreateDialog() {
            String[] array = {"连接节点", "查看配置", "删除节点"};
            AlertDialog.Builder builder = new AlertDialog.Builder(mContext);
            builder.setTitle("请选择操作")
                    .setItems(array, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            switch (which) {
                                case 0:
                                    ToastUtil.show(mContext, "连接节点", Toast.LENGTH_SHORT);
                                    break;
                                case 1:
                                    ToastUtil.show(mContext, "查看配置", Toast.LENGTH_SHORT);
                                    Intent intent = new Intent(mContext, NodeConfigActivity.class);
                                    mContext.startActivity(intent);
                                    break;
                                case 2:
                                    ToastUtil.show(mContext, "删除节点", Toast.LENGTH_SHORT);
                                    break;
                            }

                        }
                    });
            return builder.create();
        }

        NormalTextViewHolder(View view, final Context context) {
            super(view);
            mContext = context;
            tvName = (TextView) view.findViewById(R.id.tvName);
            tvUploadSpeed = (TextView) view.findViewById(R.id.tvUploadSpeed);
            tvDownloadSpeed = (TextView) view.findViewById(R.id.tvDownloadSpeed);
            tvPing = (TextView) view.findViewById(R.id.tvPing);
            tvGroup = (TextView) view.findViewById(R.id.tvGroup);
            ivFlag = (ImageView) view.findViewById(R.id.ivFlag);
            view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onCreateDialog().show();
                }
            });
        }
    }


}
