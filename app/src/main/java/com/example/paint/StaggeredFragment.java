package com.example.paint;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public  class StaggeredFragment extends Fragment {
    private ArrayList<StagData> stagData;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v3 = inflater.inflate(R.layout.staggered_fragment, container, false);

        RecyclerView staggeredRecycle =v3.findViewById(R.id.stagRecycle);
        stagData=new ArrayList<>();

        stagData.add(new StagData("Feather Art", R.drawable.stagwallart));
        stagData.add(new StagData("Humming", R.drawable.humming));
        stagData.add(new StagData("Mandala Girl", R.drawable.mandalgirl));
        stagData.add(new StagData("Mandala Art", R.drawable.mandalaaart));
        stagData.add(new StagData("Feather Art", R.drawable.stagwallart));
        stagData.add(new StagData("Humming Bird", R.drawable.humming));
        stagData.add(new StagData("Mandala Girl", R.drawable.mandalgirl));
        stagData.add(new StagData("Mandala Art", R.drawable.mandalaaart));
        stagData.add(new StagData("Feather Art", R.drawable.stagwallart));
        stagData.add(new StagData("Humming Bird", R.drawable.humming));
        stagData.add(new StagData("Mandala Girl", R.drawable.mandalgirl));
        stagData.add(new StagData("Mandala Art", R.drawable.mandalaaart));

        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        staggeredRecycle.setLayoutManager(staggeredGridLayoutManager);
        StaggeredAdapter objCustomAdapter1 = new StaggeredAdapter(stagData);
        staggeredRecycle.setAdapter(objCustomAdapter1);

        return v3;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ((WallArt) getActivity()).visibleImageIconBack();
    }
}
