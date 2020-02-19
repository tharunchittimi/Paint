package com.example.paint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

public class UserDetails extends AppCompatActivity {
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        imageView1 = (ImageView) findViewById(R.id.imgBackIcon);
        imageView2 = (ImageView) findViewById(R.id.imgFilterSearch);
        imageView3 = (ImageView) findViewById(R.id.imgFilterFav);
        imageView4 = (ImageView) findViewById(R.id.imgFilterCart);

        TextView textView = findViewById(R.id.txtCreate);
        textView.setText("User Details");

        imageView1.setVisibility(View.VISIBLE);
        imageView2.setVisibility(View.GONE);
        imageView3.setVisibility(View.VISIBLE);
        imageView4.setVisibility(View.VISIBLE);

        imageView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(UserDetails.this,Cart.class);
                startActivity(i);
            }
        });

        Button button =findViewById(R.id.btnn11);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(UserDetails.this,Payment.class);
                startActivity(intent);
            }
        });

        final TextView textView23 = findViewById(R.id.textView23);
        final TextView textView25 =findViewById(R.id.textView25);
        Switch aSwitch = findViewById(R.id.switch11);
        aSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    textView23.setTextColor(getResources().getColor(R.color.greyBrown));
                    textView25.setTextColor(getResources().getColor(R.color.Black));
                } else {
                    textView23.setTextColor(getResources().getColor(R.color.Black));
                    textView25.setTextColor(getResources().getColor(R.color.greyBrown));
                }
            }
        });
    }
}
