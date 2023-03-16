package com.example.recipeapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.recipeapp.R;

public class FullView extends AppCompatActivity {

    Intent intent;
    String title ;
    String ingredients;
    String servings;
    String cookTime;
    String directions;
    int image;

    TextView titleTxt,ingredientTitle,ingredientsTxt,serving,time,cookingDirections, steps;
    ImageView imageView;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_full_view);

        titleTxt= findViewById(R.id.titleFullView);
        ingredientTitle= findViewById(R.id.ingredientTitle);
        ingredientsTxt= findViewById(R.id.ingredients);
        serving=findViewById(R.id.serving);
        time= findViewById(R.id.time);
        cookingDirections= findViewById(R.id.CookingDirections);
        steps=findViewById(R.id.directions);
        imageView= findViewById(R.id.thumbnailFullView);

        intent= getIntent();
        image= intent.getIntExtra("image",00);
        title= intent.getStringExtra("title");
        ingredients= intent.getStringExtra("ingredients");
        servings= intent.getStringExtra("servings");
        cookTime= intent.getStringExtra("time");
        directions= intent.getStringExtra("directions");

        imageView.setImageResource(image);
        titleTxt.setText(title);
        ingredientTitle.setText("Ingredients List");
        ingredientsTxt.setText(ingredients);
        serving.setText("Number of Servings: "+servings);
        time.setText(cookTime);
        cookingDirections.setText("Cooking Directions");
        steps.setText(directions);


    }
}