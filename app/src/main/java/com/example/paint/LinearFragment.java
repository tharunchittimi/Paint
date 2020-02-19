package com.example.paint;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

public class LinearFragment extends Fragment {
    private ArrayList<StagData> stagData;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v4 = inflater.inflate(R.layout.linear_fragment, container, false);

        RecyclerView staggeredRecycle =v4.findViewById(R.id.linearRecycle);
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

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        staggeredRecycle.setLayoutManager(linearLayoutManager);
        LinearAdapter objCustomAdapter1 = new LinearAdapter(stagData);
        staggeredRecycle.setAdapter(objCustomAdapter1);
        return v4;
    }
}
