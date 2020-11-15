package com.example.foody.PageHomeDetailFood;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foody.R;

import java.util.ArrayList;

public class GirdViewBaseAdapter extends BaseAdapter {
    public ArrayList<GirdViewBean> arrayingListener;
    Context mContext;


    public GirdViewBaseAdapter(ArrayList<GirdViewBean> mListenerList, Context context) {
        mContext = context;
        this.arrayingListener = new ArrayList<GirdViewBean>();
        this.arrayingListener =mListenerList;
    }

    public class ViewHolder {
        ImageView mItemPic;
        TextView mLangName,moTa,tiMe;
    }

    @Override
    public int getCount() {
        return arrayingListener.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayingListener.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View view, ViewGroup parent) {
        final ViewHolder holder;
        if (view == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.grid_item, null);
            holder = new ViewHolder();
            holder.mItemPic = (ImageView) view.findViewById(R.id.img1);
            holder.mLangName=(TextView)view.findViewById(R.id.name1);
            holder.moTa=(TextView)view.findViewById(R.id.mota1);
            holder.tiMe=(TextView)view.findViewById(R.id.gio1);

            view.setTag(holder);
        } else {
            holder = (ViewHolder) view.getTag();

        }
        try {
            int image = arrayingListener.get(position).getImage();
            holder.mItemPic.setImageResource(image);
            holder.mLangName.setText(arrayingListener.get(position).getLangName());
            holder.moTa.setText(arrayingListener.get(position).getMoTa());
            holder.tiMe.setText(arrayingListener.get(position).getTiMe());
        }catch (Exception ex){


        }

        return view;
    }

}
