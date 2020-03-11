package com.example.paint.hummingbirdscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.paint.R;
import com.example.paint.scanproduct.ScanProduct;
import com.example.paint.cartitem.Cart;

public class HummingBird extends AppCompatActivity {
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;

    public static final String EXTRA_MESSAGE = "IMG";
    public static final String EXTRA_POSTER = "IMGG";

    private SeekBar seekBar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_humming_bird);

        imageView1 = (ImageView) findViewById(R.id.imgBackIcon);
        imageView2 = (ImageView) findViewById(R.id.imgFilterSearch);
        imageView3 = (ImageView) findViewById(R.id.imgFilterFav);
        imageView4 = (ImageView) findViewById(R.id.imgFilterCart);

        TextView textView = findViewById(R.id.txtCreate);
        textView.setText("Humming Bird");

        imageView1.setVisibility(View.VISIBLE);
        imageView2.setVisibility(View.GONE);
        imageView3.setVisibility(View.GONE);
        imageView4.setVisibility(View.GONE);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        ImageView imageView = findViewById(R.id.imageView17);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(HummingBird.this, ScanProduct.class);
                startActivity(i);
            }
        });

        Button button = findViewById(R.id.btn22);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(HummingBird.this, Cart.class);
                startActivity(intent1);
            }
        });

        String title = getIntent().getStringExtra(EXTRA_MESSAGE);
        Integer poster = getIntent().getIntExtra(EXTRA_POSTER, 0);
        textView.setText(title);
        loadBackdrop(poster);

        final TextView textView11 = findViewById(R.id.textView11);
        final TextView textView12 = findViewById(R.id.textView12);
        final TextView textView13 = findViewById(R.id.textView13);
        seekBar1 = findViewById(R.id.seekbar1);
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                showToast("SeekBar Progress: " + progress);
                if (progress <= 12) {
                    textView11.setTextColor(getResources().getColor(R.color.actBar));
                } else {
                    textView11.setTextColor(getResources().getColor(R.color.Black));
                }
                if (progress > 12 && progress <= 80) {
                    textView12.setTextColor(getResources().getColor(R.color.actBar));
                } else {
                    textView12.setTextColor(getResources().getColor(R.color.Black));
                }
                if (progress <= 80) {
                    textView13.setTextColor(getResources().getColor(R.color.Black));
                } else {
                    textView13.setTextColor(getResources().getColor(R.color.actBar));
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
            }
        });

        textView11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBar1.setProgress(12);
            }
        });
        textView12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBar1.setProgress(45);
            }
        });
        textView13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBar1.setProgress(81);
            }
        });
    }

    private void showToast(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    private void loadBackdrop(int image) {
        final ImageView imageView15 = findViewById(R.id.imageView15);
        Glide.with(this)
                .load(image)
                .into(imageView15);
    }
}
