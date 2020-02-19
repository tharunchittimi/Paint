package com.example.paint;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeScreen extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    FragmentManager fr;
    TextView txtCreate;
    ImageView imageView1;
    ImageView imageView2;
    ImageView imageView3;
    ImageView imageView4;
    Layout layout;
    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        txtCreate = findViewById(R.id.txtCreate);
        imageView1 = (ImageView) findViewById(R.id.imgFilterSearch);
        imageView2 = (ImageView) findViewById(R.id.imgFilterFav);
        imageView3 = (ImageView) findViewById(R.id.imgFilterCart);
        imageView4 = (ImageView) findViewById(R.id.imgBackIcon);

        fr = getSupportFragmentManager();
        fragmentReplace(new FragmentHome());
        bottomNavigationView = findViewById(R.id.btmNav);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(HomeScreen.this,Cart.class);
                startActivity(i);
            }
        });
    }

    //    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.tool_icons, menu);
//        return true;
//    }

    public void visibleImageIconAll() {
        imageView1.setVisibility(View.VISIBLE);
        imageView2.setVisibility(View.VISIBLE);
        imageView3.setVisibility(View.VISIBLE);
        txtCreate.setVisibility(View.VISIBLE);
        imageView4.setVisibility(View.GONE);
    }
    public void hideImageIconAll() {
        imageView1.setVisibility(View.GONE);
        imageView2.setVisibility(View.GONE);
        imageView3.setVisibility(View.GONE);
        txtCreate.setVisibility(View.VISIBLE);
        imageView4.setVisibility(View.GONE);
    }
    public void hideImageIconSearch() {
        imageView1.setVisibility(View.GONE);
        imageView2.setVisibility(View.VISIBLE);
        imageView3.setVisibility(View.VISIBLE);
        txtCreate.setVisibility(View.VISIBLE);
        imageView4.setVisibility(View.GONE);

    }
    public void hidealliconswithtext() {
        imageView1.setVisibility(View.GONE);
        imageView2.setVisibility(View.GONE);
        imageView3.setVisibility(View.GONE);
        txtCreate.setVisibility(View.VISIBLE);
        imageView4.setVisibility(View.GONE);

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.nav_home:
                setTitleText("Home");
                fragmentReplace(new FragmentHome());
                return true;
            case R.id.nav_catalog:
                setTitleText("Catalouge");
                fragmentReplace(new FragmentCatalouge());
                return true;
            case R.id.nav_camera:
                setTitleText("Scan");
                fragmentReplace(new FragmentCamera());
                return true;
            case R.id.nav_cost:
                setTitleText("Cost Estimator");
                fragmentReplace(new FragmentCost());
                return true;
            case R.id.nav_person:
                setTitleText("Profile");
                fragmentReplace(new FragmentPerson());
                return true;
        }
        return false;
    }

    private void setTitleText(String title) {
        txtCreate.setText(title);
    }

    private void fragmentReplace(Fragment fragment) {
        FragmentTransaction fragmentTransaction = fr.beginTransaction();
        fragmentTransaction.replace(R.id.fragment_container, fragment).commitNow();
    }
}
