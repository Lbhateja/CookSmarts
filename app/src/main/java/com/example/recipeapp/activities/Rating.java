package com.example.recipeapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.recipeapp.R;

public class Rating extends AppCompatActivity {
    private RatingBar rBar;
    private TextView textView1,toastTextView;

    private Button btn;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);
        rBar = (RatingBar) findViewById(R.id.ratingBar1);
        textView1 = (TextView) findViewById(R.id.textview1);
        btn = (Button)findViewById(R.id.btnGet);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LayoutInflater inflater = getLayoutInflater();
                View layout = inflater.inflate(R.layout.toast_layout, (ViewGroup) findViewById(R.id.toast_layout_root));

                int noofstars = rBar.getNumStars();
                float getrating = rBar.getRating();
                textView1.setText("Rating: "+getrating+"/"+noofstars);

                Toast toast = new Toast(getApplicationContext());
                toast.setDuration(Toast.LENGTH_LONG); // set the duration for the Toast
                toast.setView(layout);
                toast.setGravity(Gravity.TOP| Gravity.START,200,1500);
                toast.show();

               //Toast.makeText(getApplicationContext(),"Thanks For Rating Us.",Toast.LENGTH_LONG).show();
            }
        });

    }
}