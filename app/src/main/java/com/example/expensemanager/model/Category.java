package com.example.expensemanager.model;

import java.security.PrivateKey;

public class Category {

    private String categoryName;
    private int catrgoryImage;

    public Category() {
    }

    public Category(String categoryName, int catrgoryImage) {
        this.categoryName = categoryName;
        this.catrgoryImage = catrgoryImage;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public int getCatrgoryImage() {
        return catrgoryImage;
    }

    public void setCatrgoryImage(int catrgoryImage) {
        this.catrgoryImage = catrgoryImage;
    }
}
