package com.example.paint.dashboardfragments.fragmenthome.fragmentslidermenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.paint.R;

public class SliderTwo extends PagerAdapter {
    Context context;
    LayoutInflater layoutInflater;
    public SliderTwo(Context context) {
        this.context = context;
        layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
    }
    public int[] slide_image = {
            R.drawable.interior,
            R.drawable.exterior,
            R.drawable.cafecoffe,
    };

    @Override
    public int getCount() {
        return slide_image.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View view1 = layoutInflater.inflate(R.layout.slider_two, container, false);
        ImageView imageView = view1.findViewById(R.id.img12);

        imageView.setImageResource(slide_image[position]);
        container.addView(view1);

        return  view1;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView((View) object);
    }
}
