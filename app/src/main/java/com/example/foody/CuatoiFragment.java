package com.example.foody;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;


public class CuatoiFragment extends Fragment {

    ListView lv;
    ListViewBaseAdapter adapter;
    ArrayList<ListViewBean> arr_bean;
    Context context;
    ListViewBean listViewBean;
    View v;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        v = inflater.inflate(R.layout.fragment_cuatoi,container,false);
        //lv = v.findViewById(R.id.list_foods2);
       // arr_bean = new ArrayList<>();

        //homeData();
        //context = this.getActivity();
        //adapter = new ListViewBaseAdapter(arr_bean,context);
        //lv.setAdapter(adapter);

        return v;
        ///////


    }
    private void homeData(){


        arr_bean.add(new ListViewBean(R.drawable.foody1, "[DN] CHỈ 1K vẫn phá cỗ xịn","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","1h"));
        arr_bean.add(new ListViewBean(R.drawable.foody3, "[DN] Gợi ý món CHAY","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","30p"));
        arr_bean.add(new ListViewBean(R.drawable.foody2,"[DN] MÓN NGON siêu RẺ","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","2h"));
        arr_bean.add(new ListViewBean(R.drawable.foody4, "[DN] Highland Coffee tặng bạn ","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","3h"));
        arr_bean.add(new ListViewBean(R.drawable.foody3, "[DN] CHỈ 1K vẫn phá cỗ xịn","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","2h"));
        arr_bean.add(new ListViewBean(R.drawable.foody1, "[DN] Gợi ý món CHAY","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","2h"));
        arr_bean.add(new ListViewBean(R.drawable.foody2,"[DN] MÓN NGON siêu RẺ","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","10p"));
        arr_bean.add(new ListViewBean(R.drawable.foody4, "[DN] Highland Coffee tặng bạn","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","9h"));
        arr_bean.add(new ListViewBean(R.drawable.foody3, "[DN] CHỈ 1K vẫn phá cỗ xịn","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","9h"));
        arr_bean.add(new ListViewBean(R.drawable.foody2, "[DN] Gợi ý món CHAY","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","9h"));
        arr_bean.add(new ListViewBean(R.drawable.foody2,"[DN] MÓN NGON siêu RẺ","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","9h"));
        arr_bean.add(new ListViewBean(R.drawable.foody1, "[DN] Highland Coffee tặng bạn","Giảm từ 20% ~ 40% Buffet + Tặng Món đặt chỗ qua NowTable","9h"));

        adapter=new ListViewBaseAdapter(arr_bean,this.getActivity());
        lv.setAdapter(adapter);
    }

}