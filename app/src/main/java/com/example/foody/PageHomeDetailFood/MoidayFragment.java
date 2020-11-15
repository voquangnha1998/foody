package com.example.foody.PageHomeDetailFood;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import com.example.foody.R;

import java.util.ArrayList;

public class MoidayFragment extends Fragment {
    GridView gridView;
    GirdViewBaseAdapter adapter;
    ArrayList<GirdViewBean> arr_bean;
    Context context;
    GirdViewBean girdViewBean;
    View v;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_moiday,container,false);
        gridView = v.findViewById(R.id.gridview1);
        arr_bean = new ArrayList<>();

        homeData();
        context = this.getActivity();
        adapter = new GirdViewBaseAdapter(arr_bean,context);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                Toast.makeText(context,arr_bean.get(position).getLangName(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getActivity(), DetailFood.class);
                intent.putExtra("name",arr_bean.get(position).getLangName());
                intent.putExtra("image",arr_bean.get(position).getImage());
                startActivity(intent);
            }
        });

        return v;
        ///////
    }
    private void homeData(){


        arr_bean.add(new GirdViewBean(R.drawable.imggrid1, "Highland Coffee","Tặng Món đặt chỗ qua NowTable","1h"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid2, "Nhà Hàng Parsley","Tặng Món đặt chỗ qua NowTable","30p"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid3,"Bắp Mễ","Tặng Món đặt chỗ qua NowTable","2h"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid4, "Bún Bò Huế xưa","Tặng Món đặt chỗ qua NowTable","3h"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid1, "Highland Coffee","Tặng Món đặt chỗ qua NowTable","1h"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid2, "Coco Outpost","Tặng Món đặt chỗ qua NowTable","30p"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid3,"Cơm Văn Phòng","Tặng Món đặt chỗ qua NowTable","2h"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid4, "Trà sửa Đô La","Tặng Món đặt chỗ qua NowTable","3h"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid1, "Thế Giới Ăn Vặt","Tặng Món đặt chỗ qua NowTable","1h"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid2, "GoGi House","Tặng Món đặt chỗ qua NowTable","30p"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid3,"Hong Cha","Tặng Món đặt chỗ qua NowTable","2h"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid4, "Beauty Spoon","Tặng Món đặt chỗ qua NowTable","3h"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid3,"Blue Whale","Tặng Món đặt chỗ qua NowTable","2h"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid4, "Trà sửa Đô La","Tặng Món đặt chỗ qua NowTable","3h"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid1, "Thế Giới Ăn Vặt","Tặng Món đặt chỗ qua NowTable","1h"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid2, "GoGi House","Tặng Món đặt chỗ qua NowTable","30p"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid3,"Hong Cha","Tặng Món đặt chỗ qua NowTable","2h"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid4, "Beauty Spoon","Tặng Món đặt chỗ qua NowTable","3h"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid3,"Blue Whale","Tặng Món đặt chỗ qua NowTable","2h"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid2, "Highland Coffee","Tặng Món đặt chỗ qua NowTable","30p"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid3,"Highland Coffee","Tặng Món đặt chỗ qua NowTable","2h"));
        arr_bean.add(new GirdViewBean(R.drawable.imggrid4, "Highland Coffee","Tặng Món đặt chỗ qua NowTable","3h"));
        adapter=new GirdViewBaseAdapter(arr_bean,this.getActivity());
        gridView.setAdapter(adapter);
    }

}