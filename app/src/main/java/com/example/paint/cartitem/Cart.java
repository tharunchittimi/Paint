package com.example.paint.cartitem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.paint.checkoutitem.Checkout;
import com.example.paint.R;
import com.example.paint.cartitem.adapter.CartAdapter;
import com.example.paint.cartitem.model.CartData;

import java.util.ArrayList;

public class Cart extends AppCompatActivity {
    private ArrayList<CartData> cartData;

    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        RecyclerView rv_cart = findViewById(R.id.cartRecycle);
        cartData = new ArrayList<>();

        cartData.add(new CartData(R.drawable.wallart, "Bird", "Wall Art", "Qty : 1", "Size : 33-44'", "Rs 6500"));
        cartData.add(new CartData(R.drawable.stencils, "Feather", "Wall Stencils", "Qty : 1", "Size : 33-44'", "Rs 3500"));
        cartData.add(new CartData(R.drawable.wallpaper, "Mandala Girl", "Wall Paper", "Qty : 1", "Size : 33-44'", "Rs 2500"));
        cartData.add(new CartData(R.drawable.textures, "Mandala Art", "Textures", "Qty : 2", "Size : 33-44'", "Rs 4500"));
        cartData.add(new CartData(R.drawable.colour, "Bird", "Wall Art", "Qty : 1", "Size : 33-44'", "Rs 6500"));
        cartData.add(new CartData(R.drawable.wallart, "Feather", "Wall Stencils", "Qty : 1", "Size : 33-44'", "Rs 6500"));
        cartData.add(new CartData(R.drawable.stencils, "Mandala Girl", "Wall Paper", "Qty : 1", "Size : 33-44'", "Rs 1500"));
        cartData.add(new CartData(R.drawable.wallpaper, "Mandala Art", "Textures", "Qty : 3", "Size : 33-44'", "Rs 4500"));
        cartData.add(new CartData(R.drawable.textures, "Bird", "Wall Art", "Qty : 1", "Size : 33-44'", "Rs 6500"));
        cartData.add(new CartData(R.drawable.colour, "Feather", "Wall Stencils", "Qty : 1", "Size : 33-44'", "Rs 4500"));
        cartData.add(new CartData(R.drawable.wallart, "Mandala Girl", "Wall Paper", "Qty : 5", "Size : 33-44'", "Rs 2500"));
        cartData.add(new CartData(R.drawable.stencils, "Mandala Art", "Textures", "Qty : 1", "Size : 33-44'", "Rs 3500"));
        cartData.add(new CartData(R.drawable.wallpaper, "Bird", "Wall Art", "Qty : 1", "Size : 33-44'", "Rs 5500"));
        cartData.add(new CartData(R.drawable.textures, "Feather", "Wall Stencils", "Qty : 1", "Size : 33-44'", "Rs 1500"));
        cartData.add(new CartData(R.drawable.colour, "Mandala Girl", "Wall Paper", "Qty : 1", "Size : 33-44'", "Rs 2500"));
        cartData.add(new CartData(R.drawable.wallart, "Mandala Art", "Textures", "Qty : 1", "Size : 33-44'", "Rs 3500"));
        cartData.add(new CartData(R.drawable.stencils, "Bird", "Colour", "Qty : 1", "Size : 33-44'", "Rs 4500"));
        cartData.add(new CartData(R.drawable.wallpaper, "Feather", "Wall Stencils", "Qty : 2", "Size : 33-44'", "Rs 4500"));
        cartData.add(new CartData(R.drawable.textures, "Mandala Girl", "Textures", "Qty : 1", "Size : 33-44'", "Rs 1500"));
        cartData.add(new CartData(R.drawable.colour, "Mandala Art", "Colour", "Qty : 1", "Size : 33-44'", "Rs 2500"));

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rv_cart.setLayoutManager(linearLayoutManager);
        CartAdapter objCustomAdapter = new CartAdapter(cartData);
        rv_cart.setAdapter(objCustomAdapter);

        imageView1 = (ImageView) findViewById(R.id.imgBackIcon);
        imageView2 = (ImageView) findViewById(R.id.imgFilterSearch);
        imageView3 = (ImageView) findViewById(R.id.imgFilterFav);
        imageView4 = (ImageView) findViewById(R.id.imgFilterCart);

        TextView textView = findViewById(R.id.txtCreate);
        textView.setText("Cart");

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

        Button button = findViewById(R.id.btnn1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Cart.this, Checkout.class);
                startActivity(i);
            }
        });


    }
}
