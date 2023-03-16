package com.example.recipeapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.GridView;

import com.example.recipeapp.R;
import com.example.recipeapp.adapter.CustomAdapter;
import com.example.recipeapp.model.Constant;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    int condition;
    Intent intent;
    GridView gridView;
    CustomAdapter customAdapter;
    List<Constant> constantList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView= findViewById(R.id.gridView);
        constantList= new ArrayList<>();
        intent =getIntent();
        condition= intent.getIntExtra("condition",00);

        if(condition==1)
        {
            appetizerRecipes();
        }
        else if(condition==2)
        {
            MainCourseRecipes();
        }
        else if(condition==3)
        {
            DessertRecipes();
        }
        customAdapter = new CustomAdapter(MainActivity.this,constantList);
        gridView.setAdapter(customAdapter);

    }


    void DessertRecipes() {
        constantList.add(new Constant(R.drawable.t,getResources().getString(R.string.Dessert1),getResources().getString(R.string.Dessertsingredients1),getResources().getString(R.string.Dessertserving1),getResources().getString(R.string.Desserttime1),getResources().getString(R.string.Dessertdirections1)));
        constantList.add(new Constant(R.drawable.u,getResources().getString(R.string.Dessert2),getResources().getString(R.string.Dessertsingredients2),getResources().getString(R.string.Dessertserving2),getResources().getString(R.string.Desserttime2),getResources().getString(R.string.Dessertdirections2)));
        constantList.add(new Constant(R.drawable.v,getResources().getString(R.string.Dessert3),getResources().getString(R.string.Dessertsingredients3),getResources().getString(R.string.Dessertserving3),getResources().getString(R.string.Desserttime3),getResources().getString(R.string.Dessertdirections3)));
        constantList.add(new Constant(R.drawable.w,getResources().getString(R.string.Dessert4),getResources().getString(R.string.Dessertsingredients4),getResources().getString(R.string.Dessertserving4),getResources().getString(R.string.Desserttime4),getResources().getString(R.string.Dessertdirections4)));
        constantList.add(new Constant(R.drawable.x,getResources().getString(R.string.Dessert5),getResources().getString(R.string.Dessertsingredients5),getResources().getString(R.string.Dessertserving5),getResources().getString(R.string.Desserttime5),getResources().getString(R.string.Dessertdirections5)));
        constantList.add(new Constant(R.drawable.y,getResources().getString(R.string.Dessert6),getResources().getString(R.string.Dessertsingredients6),getResources().getString(R.string.Dessertserving6),getResources().getString(R.string.Desserttime6),getResources().getString(R.string.Dessertdirections6)));
        constantList.add(new Constant(R.drawable.z,getResources().getString(R.string.Dessert7),getResources().getString(R.string.Dessertsingredients7),getResources().getString(R.string.Dessertserving7),getResources().getString(R.string.Desserttime7),getResources().getString(R.string.Dessertdirections7)));
        constantList.add(new Constant(R.drawable.zz,getResources().getString(R.string.Dessert8),getResources().getString(R.string.Dessertsingredients8),getResources().getString(R.string.Dessertserving8),getResources().getString(R.string.Desserttime8),getResources().getString(R.string.Dessertdirections8)));
        constantList.add(new Constant(R.drawable.yy,getResources().getString(R.string.Dessert9),getResources().getString(R.string.Dessertsingredients9),getResources().getString(R.string.Dessertserving9),getResources().getString(R.string.Desserttime9),getResources().getString(R.string.Dessertdirections9)));


    }

    void MainCourseRecipes() {
        constantList.add(new Constant(R.drawable.j,getResources().getString(R.string.Main1),getResources().getString(R.string.Mainingredients1),getResources().getString(R.string.Mainserving1),getResources().getString(R.string.Maintime1),getResources().getString(R.string.Maindirections1)));
        constantList.add(new Constant(R.drawable.k,getResources().getString(R.string.Main2),getResources().getString(R.string.Mainingredients2),getResources().getString(R.string.Mainserving2),getResources().getString(R.string.Maintime2),getResources().getString(R.string.Maindirections2)));
        constantList.add(new Constant(R.drawable.l,getResources().getString(R.string.Main3),getResources().getString(R.string.Mainingredients3),getResources().getString(R.string.Mainserving3),getResources().getString(R.string.Maintime3),getResources().getString(R.string.Maindirections3)));
        constantList.add(new Constant(R.drawable.m,getResources().getString(R.string.Main4),getResources().getString(R.string.Mainingredients4),getResources().getString(R.string.Mainserving4),getResources().getString(R.string.Maintime4),getResources().getString(R.string.Maindirections4)));
        constantList.add(new Constant(R.drawable.n,getResources().getString(R.string.Main5),getResources().getString(R.string.Mainingredients5),getResources().getString(R.string.Mainserving5),getResources().getString(R.string.Maintime5),getResources().getString(R.string.Maindirections5)));
        constantList.add(new Constant(R.drawable.o,getResources().getString(R.string.Main6),getResources().getString(R.string.Mainingredients6),getResources().getString(R.string.Mainserving6),getResources().getString(R.string.Maintime6),getResources().getString(R.string.Maindirections6)));
        constantList.add(new Constant(R.drawable.p,getResources().getString(R.string.Main7),getResources().getString(R.string.Mainingredients7),getResources().getString(R.string.Mainserving7),getResources().getString(R.string.Maintime7),getResources().getString(R.string.Maindirections7)));
        constantList.add(new Constant(R.drawable.q,getResources().getString(R.string.Main8),getResources().getString(R.string.Mainingredients8),getResources().getString(R.string.Mainserving8),getResources().getString(R.string.Maintime8),getResources().getString(R.string.Maindirections8)));
        constantList.add(new Constant(R.drawable.r,getResources().getString(R.string.Main9),getResources().getString(R.string.Mainingredients9),getResources().getString(R.string.Mainserving9),getResources().getString(R.string.Maintime9),getResources().getString(R.string.Maindirections9)));
        constantList.add(new Constant(R.drawable.s,getResources().getString(R.string.Main10),getResources().getString(R.string.Mainingredients10),getResources().getString(R.string.Mainserving10),getResources().getString(R.string.Maintime10),getResources().getString(R.string.Maindirections10)));

    }

    @SuppressLint("ResourceType")
    private void appetizerRecipes() {

        constantList.add(new Constant(R.drawable.a,getResources().getString(R.string.appetizer1),getResources().getString(R.string.ingredients1),getResources().getString(R.string.serving1),getResources().getString(R.string.time1),getResources().getString(R.string.directions1)));
        constantList.add(new Constant(R.drawable.b,"Cranberry Brie Bites",getResources().getString(R.string.ingredients2),getResources().getString(R.string.serving1),getResources().getString(R.string.time1),getResources().getString(R.string.directions2)));
        constantList.add(new Constant(R.drawable.c,"Cheese Ball Bites",getResources().getString(R.string.ingredients3),getResources().getString(R.string.serving1),getResources().getString(R.string.time1),getResources().getString(R.string.directions3)));
        constantList.add(new Constant(R.drawable.d,"Baked Brie In Puff Pastry",getResources().getString(R.string.ingredients4),getResources().getString(R.string.serving1),getResources().getString(R.string.time1),getResources().getString(R.string.directions4)));
        constantList.add(new Constant(R.drawable.e,"Black-Eyed Pea Bruschetta",getResources().getString(R.string.ingredients5),getResources().getString(R.string.serving1),getResources().getString(R.string.time1),getResources().getString(R.string.directions5)));
        constantList.add(new Constant(R.drawable.f,"Ham & Cheese Pinwheels",getResources().getString(R.string.ingredients6),getResources().getString(R.string.serving1),getResources().getString(R.string.time1),getResources().getString(R.string.directions6)));
        constantList.add(new Constant(R.drawable.g,"Baked Feta Bites",getResources().getString(R.string.ingredients7),getResources().getString(R.string.serving1),getResources().getString(R.string.time1),getResources().getString(R.string.directions7)));
        constantList.add(new Constant(R.drawable.h,"Sausage Balls",getResources().getString(R.string.ingredients8),getResources().getString(R.string.serving1),getResources().getString(R.string.time1),getResources().getString(R.string.directions8)));
        constantList.add(new Constant(R.drawable.i,"Stuffed Mushrooms",getResources().getString(R.string.ingredients9),getResources().getString(R.string.serving9),getResources().getString(R.string.time9),getResources().getString(R.string.directions9)));



    }
}