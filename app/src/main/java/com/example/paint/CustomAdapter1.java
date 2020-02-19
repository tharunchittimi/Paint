package com.example.paint;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CustomAdapter1 extends RecyclerView.Adapter<CustomAdapter1.ViewHolder> {
    private ArrayList<DataItems> dataItems;

    public CustomAdapter1(ArrayList<DataItems> dataItems) {
        this.dataItems = dataItems;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_cata, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        DataItems objDataItems = dataItems.get(position);
        holder.title.setText(objDataItems.title);
        Glide.with(holder.poster).load(objDataItems.poster).into(holder.poster);
        if (position == 0) {
            RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) holder.cardViewItem.getLayoutParams();
            params.setMargins(48, 0, 0, 0);
            holder.cardViewItem.setLayoutParams(params);
        }
    }

    @Override
    public int getItemCount() {
        return dataItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView poster;
        TextView title;
        CardView cardViewItem;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            poster = itemView.findViewById(R.id.img15);
            title = itemView.findViewById(R.id.txtView);
            cardViewItem = itemView.findViewById(R.id.cardViewCata);
        }
    }
}
