package com.example.paint.otpscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.paint.dashboard.HomeScreen;
import com.example.paint.R;

public class OtpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        ImageView imageView =findViewById(R.id.img6);

        Glide.with(this)
                .load(R.drawable.three)
                .placeholder(R.drawable.three)
                .apply(RequestOptions.circleCropTransform())
                .into(imageView);
        ImageView imageView1 = findViewById(R.id.img7);

        Glide.with(this)
                .load(R.drawable.two)
                .placeholder(R.drawable.two)
                .apply(RequestOptions.circleCropTransform())
                .into(imageView1);
        ImageView imageView2 = findViewById(R.id.img8);

        Glide.with(this)
                .load(R.drawable.emt)
                .placeholder(R.drawable.emt)
                .apply(RequestOptions.circleCropTransform())
                .into(imageView2);

        ImageView imageView3 = findViewById(R.id.img9);

        Glide.with(this)
                .load(R.drawable.emt)
                .placeholder(R.drawable.emt)
                .apply(RequestOptions.circleCropTransform())
                .into(imageView3);

        Button button = findViewById(R.id.btn2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(OtpActivity.this, HomeScreen.class));
                finish();
            }
        });
    }
}
