package com.example.paint.dashboardfragments.fragmentcamera;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.paint.dashboardfragments.fragmentcamera.adapter.HorizontalScrollAdapter;
import com.example.paint.dashboardfragments.fragmentcamera.adapter.HorizontalScrollAdapterOne;
import com.example.paint.R;
import com.example.paint.dashboardfragments.fragmentcamera.model.ScrollData;
import com.example.paint.dashboard.HomeScreen;

import java.util.ArrayList;

public class FragmentCamera extends Fragment {

    ArrayList<ScrollData> scrollData;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v3 = inflater.inflate(R.layout.activity_fragment_camera, container, false);
//        setHasOptionsMenu(true);
        return v3;
    }
//    @Override
//    public void onPrepareOptionsMenu(Menu menu) {
//        menu.clear();
//    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        RecyclerView horizontalRv = view.findViewById(R.id.horizontalScroll);
        scrollData = new ArrayList<>();

        RecyclerView horizontalRv1 = view.findViewById(R.id.horizontalScroll1);
        scrollData = new ArrayList<>();

        scrollData.add(new ScrollData(R.color.colorAccent));
        scrollData.add(new ScrollData(R.color.violet));
        scrollData.add(new ScrollData(R.color.red));
        scrollData.add(new ScrollData(R.color.colorPrimary));
        scrollData.add(new ScrollData(R.color.colorAccent));
        scrollData.add(new ScrollData(R.color.yello));
        scrollData.add(new ScrollData(R.color.grey));
        scrollData.add(new ScrollData(R.color.light_blue));
        scrollData.add(new ScrollData(R.color.red));
        scrollData.add(new ScrollData(R.color.White));
        scrollData.add(new ScrollData(R.color.orange));
        scrollData.add(new ScrollData(R.color.Green));
        scrollData.add(new ScrollData(R.color.grey));
        scrollData.add(new ScrollData(R.color.colorAccent));
        scrollData.add(new ScrollData(R.color.yello));
        scrollData.add(new ScrollData(R.color.red));
        scrollData.add(new ScrollData(R.color.colorPrimary));
        scrollData.add(new ScrollData(R.color.violet));
        scrollData.add(new ScrollData(R.color.Green));
        scrollData.add(new ScrollData(R.color.grey));
        scrollData.add(new ScrollData(R.color.light_blue));
        scrollData.add(new ScrollData(R.color.violet));
        scrollData.add(new ScrollData(R.color.White));
        scrollData.add(new ScrollData(R.color.orange));
        scrollData.add(new ScrollData(R.color.colorAccent));
        scrollData.add(new ScrollData(R.color.colorAccent));


        scrollData.add(new ScrollData(R.color.orange));
        scrollData.add(new ScrollData(R.color.yello));
        scrollData.add(new ScrollData(R.color.grey));
        scrollData.add(new ScrollData(R.color.light_blue));
        scrollData.add(new ScrollData(R.color.red));
        scrollData.add(new ScrollData(R.color.gold));
        scrollData.add(new ScrollData(R.color.orange));
        scrollData.add(new ScrollData(R.color.Green));
        scrollData.add(new ScrollData(R.color.colorAccent));
        scrollData.add(new ScrollData(R.color.colorPrimary));
        scrollData.add(new ScrollData(R.color.colorPrimaryDark));
        scrollData.add(new ScrollData(R.color.orange));
        scrollData.add(new ScrollData(R.color.red));
        scrollData.add(new ScrollData(R.color.violet));
        scrollData.add(new ScrollData(R.color.yello));
        scrollData.add(new ScrollData(R.color.grey));
        scrollData.add(new ScrollData(R.color.light_blue));
        scrollData.add(new ScrollData(R.color.red));
        scrollData.add(new ScrollData(R.color.Green));
        scrollData.add(new ScrollData(R.color.orange));
        scrollData.add(new ScrollData(R.color.violet));
        scrollData.add(new ScrollData(R.color.yello));
        scrollData.add(new ScrollData(R.color.colorPrimary));
        scrollData.add(new ScrollData(R.color.violet));
        scrollData.add(new ScrollData(R.color.orange));
        scrollData.add(new ScrollData(R.color.Green));

        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2, GridLayoutManager.HORIZONTAL, false);
        horizontalRv1.setLayoutManager(gridLayoutManager);
        HorizontalScrollAdapterOne horizontalScrollAdapterOne = new HorizontalScrollAdapterOne(scrollData);
        horizontalRv1.setAdapter(horizontalScrollAdapterOne);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        horizontalRv.setLayoutManager(linearLayoutManager);
        HorizontalScrollAdapter horizontalScrollAdapter = new HorizontalScrollAdapter(scrollData);
        horizontalRv.setAdapter(horizontalScrollAdapter);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ((HomeScreen) getActivity()).hidealliconswithtext();
    }

}
