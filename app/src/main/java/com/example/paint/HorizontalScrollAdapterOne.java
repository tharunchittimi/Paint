package com.example.paint;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class HorizontalScrollAdapterOne extends RecyclerView.Adapter<HorizontalScrollAdapterOne.ViewHolder> {
    private ArrayList<ScrollData> scrollData;

    public HorizontalScrollAdapterOne(ArrayList<ScrollData> scrollData) {
        this.scrollData = scrollData;
    }
    @NonNull
    @Override
    public HorizontalScrollAdapterOne.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new HorizontalScrollAdapterOne.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.horizontal_scroll2, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HorizontalScrollAdapterOne.ViewHolder holder, int position) {
        ScrollData objScrollData = scrollData.get(position);
        holder.imageView.setImageResource(objScrollData.poster);
    }

    @Override
    public int getItemCount() {
        return scrollData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.circleImage1);
        }
    }
}
