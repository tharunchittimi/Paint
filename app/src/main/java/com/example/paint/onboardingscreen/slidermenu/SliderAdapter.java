package com.example.paint.onboardingscreen.slidermenu;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.example.paint.R;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context) {
        this.context = context;
    }

    public int[] slide_image = {
            R.drawable.img,
            R.drawable.slide2,
            R.drawable.slide3,
    };
    public String[] slide_heading = {
            "Plan",
            "Preview",
            "Paint",

    };
    public String[] slide_descs = {

            "Plan Schedule a free onsite \nconsultation by giving us a call",
            "Get personalized design  and color \nassistance to your living space",
            "watch on experts \nbeautifully transform your space",
    };

    @Override
    public int getCount() {

        return slide_heading.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (ConstraintLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = layoutInflater.inflate(R.layout.slider, container, false);

        ImageView imageView = view.findViewById(R.id.img1);
        TextView textView = view.findViewById(R.id.txt1);
        TextView textView1 = view.findViewById(R.id.txt2);
        TextView textView2 = view.findViewById(R.id.txt4);

        imageView.setImageResource(slide_image[position]);
        textView.setText(slide_heading[position]);
        textView1.setText(slide_descs[position]);

        container.addView(view);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout) object);
    }
}
