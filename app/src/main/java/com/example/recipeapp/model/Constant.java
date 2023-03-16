package com.example.recipeapp.model;

public class Constant {

    int image;
    String title;
    String Ingredients;
    String Directions;
    String Servings;
    String cookTime;

    public Constant(int image, String title, String ingredients,String servings,String cookTime ,String directions ) {
        this.image = image;
        this.title = title;
        this.Ingredients = ingredients;
        this.Directions = directions;
        this.cookTime= cookTime;
        this.Servings=servings;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }

    public String getIngredients() {
        return Ingredients;
    }

    public String getDirections() {
        return Directions;
    }

    public String getServings() {
        return Servings;
    }

    public String getcookTime() {
        return cookTime;
    }
}
