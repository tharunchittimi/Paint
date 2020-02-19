package com.example.paint;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Checkout extends AppCompatActivity {
    private ArrayList<CheckoutData> checkoutData;

    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkout);

        RecyclerView rv_checkout = findViewById(R.id.checkoutRecycle);
        checkoutData = new ArrayList<>();

        checkoutData.add(new CheckoutData(R.drawable.wallart, "Bird", "Wall Art", "Qty : 1", "Size : 33-44'", "Rs 6500"));
        checkoutData.add(new CheckoutData(R.drawable.stencils, "Feather", "Wall Stencils", "Qty : 1", "Size : 33-44'", "Rs 3500"));
        checkoutData.add(new CheckoutData(R.drawable.wallpaper, "Mandala Girl", "Wall Paper", "Qty : 1", "Size : 33-44'", "Rs 2500"));
        checkoutData.add(new CheckoutData(R.drawable.textures, "Mandala Art", "Textures", "Qty : 2", "Size : 33-44'", "Rs 4500"));
        checkoutData.add(new CheckoutData(R.drawable.colour, "Bird", "Wall Art", "Qty : 1", "Size : 33-44'", "Rs 6500"));
        checkoutData.add(new CheckoutData(R.drawable.wallart, "Feather", "Wall Stencils", "Qty : 1", "Size : 33-44'", "Rs 6500"));
        checkoutData.add(new CheckoutData(R.drawable.stencils, "Mandala Girl", "Wall Paper", "Qty : 1", "Size : 33-44'", "Rs 1500"));
        checkoutData.add(new CheckoutData(R.drawable.wallpaper, "Mandala Art", "Textures", "Qty : 3", "Size : 33-44'", "Rs 4500"));
        checkoutData.add(new CheckoutData(R.drawable.textures, "Bird", "Wall Art", "Qty : 1", "Size : 33-44'", "Rs 6500"));
        checkoutData.add(new CheckoutData(R.drawable.colour, "Feather", "Wall Stencils", "Qty : 1", "Size : 33-44'", "Rs 4500"));
        checkoutData.add(new CheckoutData(R.drawable.wallart, "Mandala Girl", "Wall Paper", "Qty : 5", "Size : 33-44'", "Rs 2500"));
        checkoutData.add(new CheckoutData(R.drawable.stencils, "Mandala Art", "Textures", "Qty : 1", "Size : 33-44'", "Rs 3500"));
        checkoutData.add(new CheckoutData(R.drawable.wallpaper, "Bird", "Wall Art", "Qty : 1", "Size : 33-44'", "Rs 5500"));
        checkoutData.add(new CheckoutData(R.drawable.textures, "Feather", "Wall Stencils", "Qty : 1", "Size : 33-44'", "Rs 1500"));
        checkoutData.add(new CheckoutData(R.drawable.colour, "Mandala Girl", "Wall Paper", "Qty : 1", "Size : 33-44'", "Rs 2500"));
        checkoutData.add(new CheckoutData(R.drawable.wallart, "Mandala Art", "Textures", "Qty : 1", "Size : 33-44'", "Rs 3500"));
        checkoutData.add(new CheckoutData(R.drawable.stencils, "Bird", "Colour", "Qty : 1", "Size : 33-44'", "Rs 4500"));
        checkoutData.add(new CheckoutData(R.drawable.wallpaper, "Feather", "Wall Stencils", "Qty : 2", "Size : 33-44'", "Rs 4500"));
        checkoutData.add(new CheckoutData(R.drawable.textures, "Mandala Girl", "Textures", "Qty : 1", "Size : 33-44'", "Rs 1500"));
        checkoutData.add(new CheckoutData(R.drawable.colour, "Mandala Art", "Colour", "Qty : 1", "Size : 33-44'", "Rs 2500"));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rv_checkout.setLayoutManager(linearLayoutManager);
        CheckoutAdapter objCustomAdapter = new CheckoutAdapter(checkoutData);
        rv_checkout.setAdapter(objCustomAdapter);

        imageView1 = (ImageView) findViewById(R.id.imgBackIcon);
        imageView2 = (ImageView) findViewById(R.id.imgFilterSearch);
        imageView3 = (ImageView) findViewById(R.id.imgFilterFav);
        imageView4 = (ImageView) findViewById(R.id.imgFilterCart);

        TextView textView = findViewById(R.id.txtCreate);
        textView.setText("Checkout");

        imageView1.setVisibility(View.VISIBLE);
        imageView2.setVisibility(View.GONE);
        imageView3.setVisibility(View.VISIBLE);
        imageView4.setVisibility(View.GONE);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Button button = findViewById(R.id.btnn11);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Checkout.this, UserDetails.class);
                startActivity(i);
            }
        });
    }
}
