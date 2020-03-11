package com.example.paint.wallartscreen.wallArtTabsItem.staggaredview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.paint.hummingbirdscreen.HummingBird;
import com.example.paint.R;
import com.example.paint.wallartscreen.wallArtTabsItem.model.StagData;

import java.util.ArrayList;

public class StaggeredAdapter extends RecyclerView.Adapter<StaggeredAdapter.ViewHolder> {
    private ArrayList<StagData> stagData;

    public StaggeredAdapter(ArrayList<StagData> stagData) {
        this.stagData = stagData;
    }
Context context;

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new StaggeredAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.recycle_staggered,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull final StaggeredAdapter.ViewHolder holder, int position) {
        StagData objDataItems = stagData.get(position);
        holder.title.setText(objDataItems.title);
        Glide.with(holder.itemView).load(objDataItems.poster).into(holder.poster);

            holder.itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    context=v.getContext();
                    Intent intent =new Intent(context, HummingBird.class);
                    intent.putExtra(HummingBird.EXTRA_MESSAGE,stagData.get(holder.getAdapterPosition()).title);
                    intent.putExtra(HummingBird.EXTRA_POSTER,stagData.get(holder.getAdapterPosition()).poster);
                    context.startActivity(intent);
                }
            });
    }

    @Override
    public int getItemCount() {
        return stagData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView poster;
        TextView title;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            poster = itemView.findViewById(R.id.stagImg);
            title = itemView.findViewById(R.id.stagTxt);
        }
    }

}
