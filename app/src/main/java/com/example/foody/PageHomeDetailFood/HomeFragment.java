package com.example.foody.PageHomeDetailFood;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.foody.R;
import com.example.foody.ViewPagerAdapter1;
import com.google.android.material.tabs.TabLayout;

public class HomeFragment extends Fragment {

    TabLayout mTapLayout;
    ViewPager mViewPager;
    ViewFlipper viewFlipper;
    //int[] arrHinh = {R.drawable.slide1,R.drawable.slide2,R.drawable.slide3};
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view;

        view = inflater.inflate(R.layout.fragment_home,container,false);
        //viewFlipper = (ViewFlipper)view.findViewById(R.id.viewflipper);
        //for (int i=0;i<arrHinh.length;i++){
            //ImageView imageView = new ImageView(getActivity());
            //imageView.setImageResource(arrHinh[i]);
            //viewFlipper.addView(imageView);
        //}
        //viewFlipper.setFlipInterval(1500);
        //viewFlipper.setAutoStart(true);
        viewFlipper = (ViewFlipper) view.findViewById(R.id.viewFlipper);
        viewFlipper.setFlipInterval(3000);
        viewFlipper.setAutoStart(true);

        /////
        mTapLayout = view.findViewById(R.id.tab_layout2);
        mViewPager = view.findViewById(R.id.viewpager2);
        ViewPagerAdapter1 viewPagerAdapter= new ViewPagerAdapter1(getActivity().getSupportFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager.setAdapter(viewPagerAdapter);
        mTapLayout.setupWithViewPager(mViewPager);

        return view;
    }
}
