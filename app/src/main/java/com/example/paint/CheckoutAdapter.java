package com.example.paint;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CheckoutAdapter extends RecyclerView.Adapter<CheckoutAdapter.ViewHolder> {
    private ArrayList<CheckoutData> checkoutData;

    public CheckoutAdapter(ArrayList<CheckoutData> checkoutData) {
        this.checkoutData = checkoutData;
    }

    @NonNull
    @Override
    public CheckoutAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CheckoutAdapter.ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.checkout_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CheckoutData objCartData = checkoutData.get(position);
        holder.title.setText(objCartData.title);
        holder.name.setText(objCartData.name);
        holder.qty.setText(objCartData.qty);
        holder.size.setText(objCartData.size);
        holder.txt.setText(objCartData.txt);

        Glide.with(holder.poster).load(objCartData.poster).into(holder.poster);
    }

    @Override
    public int getItemCount() {
        return checkoutData.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView title;
        TextView name;
        TextView qty;
        TextView size;
        Button txt;
        ImageView poster;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id.textView16);
            name = itemView.findViewById(R.id.textView17);
            qty = itemView.findViewById(R.id.textView18);
            size = itemView.findViewById(R.id.textView19);
            txt = itemView.findViewById(R.id.btn23);
            poster = itemView.findViewById(R.id.cartImg);
        }
    }
}
