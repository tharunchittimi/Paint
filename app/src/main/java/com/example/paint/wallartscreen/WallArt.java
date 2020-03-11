package com.example.paint.wallartscreen;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.paint.wallartscreen.wallArtTabsItem.linearview.LinearFragment;
import com.example.paint.R;
import com.example.paint.wallartscreen.wallArtTabsItem.staggaredview.StaggeredFragment;
import com.example.paint.cartitem.Cart;
import com.google.android.material.tabs.TabLayout;

public class WallArt extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wall_art);
//        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);

        viewPager = findViewById(R.id.viewPagerWallArt);
        tabLayout = findViewById(R.id.tabLayoutWallArt1);

        imageView1 = (ImageView) findViewById(R.id.imgBackIcon);
        imageView2 = (ImageView) findViewById(R.id.imgFilterSearch);
        imageView3 = (ImageView) findViewById(R.id.imgFilterFav);
        imageView4 = (ImageView) findViewById(R.id.imgFilterCart);

        viewPager.setAdapter(new ViewPagerAdapter(getSupportFragmentManager()));

        tabLayout.setSelectedTabIndicatorColor(getResources().getColor(R.color.White));
        tabLayout.setupWithViewPager(viewPager);

        TextView textView = findViewById(R.id.txtCreate);
        textView.setText("Wall Art");

        int[] imgResId = {
                R.drawable.ic_grid,
                R.drawable.ic_linear
        };

        for (int i = 0; i < imgResId.length; i++) {
            tabLayout.getTabAt(i).setIcon(imgResId[i]);
        }

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.WHITE, PorterDuff.Mode.SRC_IN);

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
                tab.getIcon().setColorFilter(Color.parseColor("#345499"), PorterDuff.Mode.SRC_IN);
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
             finish();
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(WallArt.this, Cart.class);
                startActivity(i);
            }
        });
    }

    public void visibleImageIconBack() {
        imageView1.setVisibility(View.VISIBLE);
        imageView2.setVisibility(View.GONE);
        imageView3.setVisibility(View.VISIBLE);
        imageView4.setVisibility(View.VISIBLE);
    }

    public class ViewPagerAdapter extends FragmentPagerAdapter {
        private Fragment[] childFragments;

        public ViewPagerAdapter(@NonNull FragmentManager fm) {
            super(fm);
            childFragments = new Fragment[]{
                    new StaggeredFragment(),
                    new LinearFragment(),
            };
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return childFragments[position];
        }

        @Override
        public int getCount() {
            return childFragments.length;
        }
    }
}
