package com.example.recipeapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.recipeapp.R;

public class Splashscreen extends AppCompatActivity {
    //variables
    Handler handler;
    Animation topAnim,bottomAnim;
    ImageView image1,image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreen2);

//Animations
        topAnim= AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim= AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        image1 = findViewById(R.id.image1);
        image2 = findViewById(R.id.image2);
        image1.setAnimation(topAnim);
        image2.setAnimation(bottomAnim);
// Handler
        handler= new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(Splashscreen.this,LoginActivity.class));
            }
        },3000);



    }
}