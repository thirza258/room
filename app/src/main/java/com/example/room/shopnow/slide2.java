package com.example.room.shopnow;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.room.Adapter;
import com.example.room.MainActivity;
import com.example.room.R;

import org.jetbrains.annotations.NotNull;

public class slide2 extends AppCompatActivity {

    private RelativeLayout relDis, relabout, relAngle;
    private ImageButton hamburger, angleLeft, angleRight;
    private ImageView hero1, logo, arrow, dark, light, right, left;
    private TextView discover, we, about, our, shop1, contact, aboutRel, home;
    private Button shop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
        ui();
    }

    @Override
    public void onConfigurationChanged(@NonNull @NotNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);

        if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT) {
            hero1.setImageResource(R.drawable.desktop_image_hero_2);
            discover.setText(R.string.are);
            we.setText(R.string.with);
        }

        else if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE) {
            hero1.setImageResource(R.drawable.mobile_image_hero_2);
            discover.setText(R.string.are);
            we.setText(R.string.with);
        }
    }



    public void ui() {

        hero1.setImageResource(R.drawable.desktop_image_hero_2);
        discover.setText(R.string.are);
        we.setText(R.string.with);

        angleRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(slide2.this, slide3.class);
                startActivity(intent);
            }
        });

        angleLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(slide2.this, MainActivity.class);
                startActivity(intent);
            }
        });

        shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(slide2.this, Adapter.class);
                startActivity(intent);
            }
        });
    }

    public void initView() {
        relDis = findViewById(R.id.Reldis);
        relabout = findViewById(R.id.Relabout);
        relAngle = findViewById(R.id.relAngle);
        hamburger = findViewById(R.id.hamburger);
        angleLeft = findViewById(R.id.angleLeft);
        angleRight = findViewById(R.id.angleRight);
        hero1 = findViewById(R.id.hero1);
        logo = findViewById(R.id.logo);
        arrow = findViewById(R.id.arrow);
        dark = findViewById(R.id.dark);
        light = findViewById(R.id.light);
        discover = findViewById(R.id.discover);
        we = findViewById(R.id.we);
        about = findViewById(R.id.about);
        our = findViewById(R.id.our);
        shop = findViewById(R.id.shop);
        right = findViewById(R.id.right);
        left = findViewById(R.id.left);
        aboutRel = findViewById(R.id.aboutRel);
        contact = findViewById(R.id.contact);
        shop1 = findViewById(R.id.shop1);
        home = findViewById(R.id.home);

    }
}