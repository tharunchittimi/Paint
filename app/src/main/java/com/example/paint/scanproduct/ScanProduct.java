package com.example.paint.scanproduct;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.paint.R;

public class ScanProduct extends AppCompatActivity {
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    TextView txtCreate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_product);

        imageView1 = (ImageView) findViewById(R.id.imgBackIcon);
        imageView2 = (ImageView) findViewById(R.id.imgFilterSearch);
        imageView3 = (ImageView) findViewById(R.id.imgFilterFav);
        imageView4 = (ImageView) findViewById(R.id.imgFilterCart);
        txtCreate = (TextView) findViewById(R.id.txtCreate);

        imageView1.setVisibility(View.VISIBLE);
        imageView2.setVisibility(View.GONE);
        imageView3.setVisibility(View.GONE);
        imageView4.setVisibility(View.GONE);
        txtCreate.setVisibility(View.GONE);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
