package com.example.paint.dashboardfragments.fragmentcamera.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.paint.R;
import com.example.paint.dashboardfragments.fragmentcamera.model.ScrollData;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class HorizontalScrollAdapter extends RecyclerView.Adapter<HorizontalScrollAdapter.ViewHolder> {

    private ArrayList<ScrollData> scrollData;

    public HorizontalScrollAdapter(ArrayList<ScrollData> scrollData) {
        this.scrollData = scrollData;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HorizontalScrollAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_scroll, parent, false));

    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalScrollAdapter.ViewHolder holder, int position) {
        ScrollData objScrollData = scrollData.get(position);
        holder.imageView.setImageResource(objScrollData.poster);
    }

    @Override
    public int getItemCount() {
        return scrollData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.circleImage);
        }
    }
}
