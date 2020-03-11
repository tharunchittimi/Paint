package com.example.paint.dashboardfragments.fragmentcatalouge;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;

import com.example.paint.dashboardfragments.fragmentcatalouge.subcatalogougefragments.ChildFragment1;
import com.example.paint.R;
import com.example.paint.dashboard.HomeScreen;
import com.google.android.material.tabs.TabLayout;

public class FragmentCatalouge extends Fragment {
    private TabLayout tabLayout;
    private ViewPager viewPagerCatalouge;
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    FragmentManager fr;

    ImageView imageView3;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.activity_fragment_catalouge, container, false);
        viewPagerCatalouge = view.findViewById(R.id.viewPagerCatalouge);
        tabLayout = view.findViewById(R.id.tabLayout);
        viewPagerCatalouge.setAdapter(new ViewPagerAdapter(getChildFragmentManager()));
        tabLayout.setupWithViewPager(viewPagerCatalouge);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        imageView3 = (ImageView) view.findViewById(R.id.imgFilterCart);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPagerCatalouge.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }

    public class ViewPagerAdapter extends FragmentStatePagerAdapter {
        private Fragment[] childFragments;

        private ViewPagerAdapter(@NonNull FragmentManager fm) {
            super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
            childFragments = new Fragment[]{
//                    ChildFragment1.getInstance(),
////                    ChildFragment1.getInstance(),
////                    ChildFragment1.getInstance(),
                    new ChildFragment1(),
                    new ChildFragment1(),
                    new ChildFragment1(),
            };
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return childFragments[position];
        }

        @Nullable
        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {

                case 0:
                    return "Trending";
                case 1:
                    return "Top Rated";
                case 2:
                    return "Lowest Prices";
            }
            return null;
        }

        @Override
        public int getCount() {
            return childFragments.length;
        }

        @Override
        public Parcelable saveState() {

            return null;
        }
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ((HomeScreen) getActivity()).visibleImageIconAll();
    }

}
