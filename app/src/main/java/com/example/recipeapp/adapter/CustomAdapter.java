package com.example.recipeapp.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.example.recipeapp.R;
import com.example.recipeapp.activities.FullView;
import com.example.recipeapp.model.Constant;

import org.w3c.dom.Text;

import java.util.List;

public class CustomAdapter extends BaseAdapter{

Context context;
List<Constant>constantList;

    public CustomAdapter(Context context, List<Constant> constantList) {
        this.context = context;
        this.constantList = constantList;
    }

    @Override
    public int getCount() {
        return constantList.size();
    }

    @Override
    public Object getItem(int i) {
        return i;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @SuppressLint("ViewHolder")
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

    view= LayoutInflater.from(context).inflate(R.layout.item_list,viewGroup,false);

        String title = constantList.get(i).getTitle();
        String ingredients=  constantList.get(i).getIngredients() ;
        String servings= constantList.get(i).getServings();
        String cookTime= constantList.get(i).getcookTime();
        String directions= constantList.get(i).getDirections();
        int image = constantList.get(i).getImage();


        ImageView imageView= view.findViewById(R.id.thumbnail);
        TextView textView= view.findViewById(R.id.title);
        CardView cardView= view.findViewById(R.id.cardView);

        imageView.setImageResource(image);
        textView.setText(title);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(context, FullView.class);
                intent.putExtra("image",image);
                intent.putExtra("title",title);
                intent.putExtra("servings",servings);
                intent.putExtra("time",cookTime);
                intent.putExtra("ingredients",ingredients);
                intent.putExtra("directions",directions);
                context.startActivity(intent);
            }
        });
        return view;
    }
}