package com.example.foody.PageHomeDetailFood;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.foody.R;

import java.util.List;

public class AdapterFood extends BaseAdapter {
    private Context context;
    private int layout;
    private List<Food> peopleList;

    public AdapterFood(Context context, int layout, List<Food> peopleList) {
        this.context = context;
        this.layout = layout;
        this.peopleList = peopleList;
    }

    @Override
    public int getCount() {
        return peopleList.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }
    private class ViewHolder{
        ImageView img;
        TextView txtName,txtGia;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder holder;
        if(view==null)
        {
            LayoutInflater inflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(layout,null);
            holder=new ViewHolder();
            holder.img=(ImageView) view.findViewById(R.id.img);
            holder.txtName=(TextView) view.findViewById(R.id.text);
            holder.txtGia=(TextView) view.findViewById(R.id.gia);

            view.setTag(holder);
        }
        else
            holder= (ViewHolder) view.getTag();
        Food people=peopleList.get(i);
        holder.img.setImageResource(people.getImg());
        holder.txtName.setText(people.getTitle1());
        holder.txtGia.setText(people.getTitle2());
        return view;

    }
}
