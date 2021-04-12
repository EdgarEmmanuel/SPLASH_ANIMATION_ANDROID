package com.example.car_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Animation topAnimation , bottomAnimation;
    ImageView imageView;
    TextView name_company;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.logo);
        name_company = findViewById(R.id.name_company);

        topAnimation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.top_animation);
        bottomAnimation = AnimationUtils.loadAnimation(MainActivity.this,R.anim.bottom_animation);


        imageView.setAnimation(topAnimation);
        name_company.setAnimation(bottomAnimation);
    }
}