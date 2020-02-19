package com.example.paint;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import com.rd.PageIndicatorView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private ViewPager viewPager;
    private SliderAdapter sliderAdapter;
    private PageIndicatorView pageIndicatorView;
    TextView textViewNext;
    TextView textViewSkip;

    private final Handler handler = new Handler();
    private Runnable updateRunnable;
    private final long delayTime = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewPager1);
        pageIndicatorView = findViewById(R.id.pageIndicatorView1);
        sliderAdapter = new SliderAdapter(this);
        viewPager.setAdapter(sliderAdapter);
        pageIndicatorView.setViewPager(viewPager);

        textViewSkip = findViewById(R.id.txt3);
        textViewNext = findViewById(R.id.txt4);
        textViewSkip.setOnClickListener(this);
        textViewNext.setOnClickListener(this);

        updateRunnable = new Runnable() {
            @Override
            public void run() {
                int currentPosition = viewPager.getCurrentItem();
                if (currentPosition == ((SliderAdapter) sliderAdapter).getCount() - 1) {
                    viewPager.setCurrentItem(0, true);
                } else {
                    viewPager.setCurrentItem(currentPosition + 1, true);
                }
            }
        };

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {

                if (position == 2) {
                    textViewSkip.setVisibility(View.INVISIBLE);
                } else {
                    textViewSkip.setVisibility(View.VISIBLE);
                }
                if (position == 2) {
                    textViewNext.setText("START");
                } else textViewNext.setText("NEXT");
            }

            @Override
            public void onPageScrollStateChanged(int state) {

                if (state == ViewPager.SCROLL_STATE_IDLE) {
                    handler.removeCallbacks(updateRunnable);
                    handler.postDelayed(updateRunnable, delayTime);
                }else{
                    handler.removeCallbacks(updateRunnable);
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.txt3:
                startActivity(new Intent(this, Login.class));
                finish();
                break;
            case R.id.txt4:
                if (viewPager.getCurrentItem() == viewPager.getAdapter().getCount() - 1) {
                    startActivity(new Intent(this, Login.class));
                    finish();
                } else
                    viewPager.setCurrentItem(viewPager.getCurrentItem() + 1, false);
                break;
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        handler.removeCallbacks(updateRunnable);
    }

    @Override
    protected void onResume() {
        super.onResume();
        handler.postDelayed(updateRunnable,delayTime);
    }

}
