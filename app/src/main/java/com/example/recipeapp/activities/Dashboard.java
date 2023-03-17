package com.example.recipeapp.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.MenuItem;
import android.view.View;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.recipeapp.R;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class Dashboard extends AppCompatActivity {

        List<SlideModel>slideModelList;
        List<SlideModel>slideModelList1;
        List<SlideModel>slideModelList2;
        ImageSlider imageSlider,imageSlider1,imageSlider2;
         DrawerLayout drawerLayout;
         NavigationView navigationView;
         ActionBarDrawerToggle actionBarDrawerToggle;

    @Override
    public void onBackPressed() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            finishAndRemoveTask();
        }
        this.finishAffinity();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        navigationView= findViewById(R.id.navigationView);
        drawerLayout= findViewById(R.id.drawer);

        actionBarDrawerToggle= new ActionBarDrawerToggle(Dashboard.this,drawerLayout,R.string.open,R.string.close);
        actionBarDrawerToggle.syncState();
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {
                    case R.id.account:
                        startActivity(new Intent(Dashboard.this,Account.class));
                        break;
                    case R.id.rate:
                        startActivity(new Intent(Dashboard.this,Rating.class));
                        break;

                    case R.id.privacy:
                        startActivity(new Intent(Dashboard.this,Privacy.class));

                        break;

                    case R.id.share:
                        Intent shareIntent =   new Intent(android.content.Intent.ACTION_SEND);
                        shareIntent.setType("text/plain");
                        shareIntent.putExtra(Intent.EXTRA_SUBJECT,"Download Recipes App");
                        String app_url = " https://play.google.com/store/apps/details?" + getPackageName() ;
                        shareIntent.putExtra(android.content.Intent.EXTRA_TEXT,app_url);
                        startActivity(Intent.createChooser(shareIntent, "Share via"));
                        break;

                    case R.id.logout:
                        startActivity(new Intent(Dashboard.this,LoginActivity.class));

                        break;

                }

                return true;
            }
        });

        imageSlider= findViewById(R.id.image_slider);
        imageSlider1= findViewById(R.id.image_slider1);
        imageSlider2= findViewById(R.id.image_slider2);

        addImages();
    }
    void addImages(){

        slideModelList= new ArrayList<>();
        slideModelList.add(new SlideModel(R.drawable.a,"Brie, Asparagus & Prosciutto Bundles", ScaleTypes.CENTER_CROP));
        slideModelList.add(new SlideModel(R.drawable.b,"Cranberry Brie Bites", ScaleTypes.CENTER_CROP));
        slideModelList.add(new SlideModel(R.drawable.c,"Cheese Ball Bites", ScaleTypes.CENTER_CROP));
        slideModelList.add(new SlideModel(R.drawable.d,"Baked Brie In Puff Pastry", ScaleTypes.CENTER_CROP));
        slideModelList.add(new SlideModel(R.drawable.e,"Black-Eyed Pea Bruschetta", ScaleTypes.CENTER_CROP));
        slideModelList.add(new SlideModel(R.drawable.f,"Ham & Cheese Pinwheels", ScaleTypes.CENTER_CROP));
        slideModelList.add(new SlideModel(R.drawable.g,"Baked Feta Bites", ScaleTypes.CENTER_CROP));
        slideModelList.add(new SlideModel(R.drawable.h,"Sausage Balls", ScaleTypes.CENTER_CROP));
        slideModelList.add(new SlideModel(R.drawable.i,"Stuffed Mushrooms", ScaleTypes.CENTER_CROP));
        imageSlider.setImageList(slideModelList,ScaleTypes.FIT);


        slideModelList1= new ArrayList<>();
        slideModelList1.add(new SlideModel(R.drawable.j,"Butter Chicken", ScaleTypes.CENTER_CROP));
        slideModelList1.add(new SlideModel(R.drawable.k,"Cuban Mojo Roast Chicken", ScaleTypes.CENTER_CROP));
        slideModelList1.add(new SlideModel(R.drawable.l,"Rogan Josh", ScaleTypes.CENTER_CROP));
        slideModelList1.add(new SlideModel(R.drawable.m,"Greek Style Lamb Meatballs", ScaleTypes.CENTER_CROP));
        slideModelList1.add(new SlideModel(R.drawable.n,"Salmon Chowder with Leeks and Potatoes", ScaleTypes.CENTER_CROP));
        slideModelList1.add(new SlideModel(R.drawable.o,"Greek Marinated Salmon", ScaleTypes.CENTER_CROP));
        slideModelList1.add(new SlideModel(R.drawable.p,"Easy Mexican Rice", ScaleTypes.CENTER_CROP));
        slideModelList1.add(new SlideModel(R.drawable.q,"Palak Paneer", ScaleTypes.CENTER_CROP));
        slideModelList1.add(new SlideModel(R.drawable.r,"Turkish Salad", ScaleTypes.CENTER_CROP));
        slideModelList1.add(new SlideModel(R.drawable.s,"Lasagna Rolls", ScaleTypes.CENTER_CROP));
        imageSlider1.setImageList(slideModelList1,ScaleTypes.FIT);


        slideModelList2= new ArrayList<>();
        slideModelList2.add(new SlideModel(R.drawable.t,"Vanilla-Cardamom Kulfi with citrus rose syrup", ScaleTypes.CENTER_CROP));
        slideModelList2.add(new SlideModel(R.drawable.u,"Banana Bread ", ScaleTypes.CENTER_CROP));
        slideModelList2.add(new SlideModel(R.drawable.v,"Strawberry french cake", ScaleTypes.CENTER_CROP));
        slideModelList2.add(new SlideModel(R.drawable.w,"Chocolate On Clouds ", ScaleTypes.CENTER_CROP));
        slideModelList2.add(new SlideModel(R.drawable.x,"Pumpkin spice latte tiramisu", ScaleTypes.CENTER_CROP));
        slideModelList2.add(new SlideModel(R.drawable.y,"Instant pot pumpkin spice crème brûlée", ScaleTypes.CENTER_CROP));
        slideModelList2.add(new SlideModel(R.drawable.z,"Broiled grapefruit ", ScaleTypes.CENTER_CROP));
        slideModelList2.add(new SlideModel(R.drawable.zz,"Raspberry Napoleon", ScaleTypes.CENTER_CROP));
        slideModelList2.add(new SlideModel(R.drawable.yy,"Lemon-glazed blueberry yogurt muffins", ScaleTypes.CENTER_CROP));
        imageSlider2.setImageList(slideModelList2,ScaleTypes.FIT);

    }

    public void ViewAll(View view){
        Intent intent= new Intent(Dashboard.this, MainActivity.class);
        switch(view.getId())
        {
            case R.id.Appetizers:
                intent.putExtra("condition",1);
                break;
            case R.id.MainCourse:
                intent.putExtra("condition",2);
                break;
            case R.id.Desserts:
                intent.putExtra("condition",3);
                break;



        }

        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        return actionBarDrawerToggle.onOptionsItemSelected(item)|| super.onOptionsItemSelected(item);
    }
}