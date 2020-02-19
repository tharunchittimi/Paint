package com.example.paint;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;

import android.text.SpannableString;

import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
        getWindow().getAttributes().windowAnimations = R.anim.slide_in;
        showClickableSignUp();
    }

    private void showClickableSignUp() {
        String message = "I'm a new User, Sign Up";
        SpannableString ss = new SpannableString(message);

        ss.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.light_blue)),
                message.indexOf("Sign Up"), message.length(),
                Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);

        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View textView) {
                startActivity(new Intent(Login.this, SignUp.class));
            }

            @Override
            public void updateDrawState(TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(getResources().getColor(R.color.light_blue));
                ds.setUnderlineText(false);
            }
        };
        ss.setSpan(clickableSpan, message.indexOf("Sign Up"), message.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        TextView textView = findViewById(R.id.txt9);
        textView.setText(ss);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setHighlightColor(Color.TRANSPARENT);

        Button button = findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Login.this,OtpActivity.class));
                finish();
            }
        });
    }
}
