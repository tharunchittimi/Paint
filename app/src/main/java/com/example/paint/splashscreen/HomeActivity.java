package com.example.paint.splashscreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import com.example.paint.onboardingscreen.MainActivity;
import com.example.paint.R;


public class HomeActivity extends AppCompatActivity {
    public static int SPLASh_TIME_OUT = 7000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

//        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.splash_screen_anim);
//        ImageView splash = (ImageView) findViewById(R.id.imageViewTwo);
//        splash.startAnimation(animation);

        Animation animation1 = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.text_anim);
        TextView textView =(TextView) findViewById(R.id.textViewSplash);
        textView.startAnimation(animation1);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent homeIntent = new Intent(HomeActivity.this, MainActivity.class);
                startActivity(homeIntent);
                finish();
            }
        }, SPLASh_TIME_OUT);
    }
}
