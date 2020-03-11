package com.example.paint.dashboardfragments.fragmenthome;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.bumptech.glide.Glide;
import com.example.paint.R;
import com.example.paint.dashboardfragments.fragmenthome.fragmentslidermenu.SliderTwo;
import com.example.paint.dashboard.HomeScreen;
import com.rd.PageIndicatorView;


public class FragmentHome extends Fragment {
    private ViewPager viewPager1;
    private SliderTwo sliderTwo;
    private PageIndicatorView pageIndicatorView2;
//    private static FragmentHome objFragmentHome;
//
//    public static FragmentHome getInstance(){
//
//        if(objFragmentHome==null){
//            objFragmentHome= new FragmentHome();
//        }
//
//        return objFragmentHome;
//
//    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v1 = inflater.inflate(R.layout.activity_fragment_home, container, false);

        ImageView imageView =v1.findViewById(R.id.imgg10);

        Glide.with(this)
                .load(R.drawable.interior)
                .placeholder(R.drawable.interior)
                .into(imageView);

        ImageView imageView1 =v1.findViewById(R.id.imggg10);

        Glide.with(this)
                .load(R.drawable.exterior)
                .placeholder(R.drawable.exterior)
                .into(imageView1);

        return v1;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewPager1 = view.findViewById(R.id.viewPager2);
        pageIndicatorView2 = view.findViewById(R.id.pageIndicatorView2);
        sliderTwo = new SliderTwo(getActivity());
        viewPager1.setAdapter(sliderTwo);
        pageIndicatorView2.setViewPager(viewPager1);
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ((HomeScreen) getActivity()).visibleImageIconAll();
    }
}
