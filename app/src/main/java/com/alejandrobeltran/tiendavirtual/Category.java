package com.alejandrobeltran.tiendavirtual;

import android.widget.ImageView;

public class Category {


    private String nameCategory;
    private String colorCategory;
    private String iconCategory;

    public Category() {
    }

    public Category(String nameCategory, String colorCategory, String iconCategory) {
        this.nameCategory = nameCategory;
        this.colorCategory = colorCategory;
        this.iconCategory = iconCategory;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getColorCategory() {
        return colorCategory;
    }

    public void setColorCategory(String colorCategory) {
        this.colorCategory = colorCategory;
    }

    public String getIconCategory() {
        return iconCategory;
    }

    public void setIconCategory(String iconCategory) {
        this.iconCategory = iconCategory;
    }
}
