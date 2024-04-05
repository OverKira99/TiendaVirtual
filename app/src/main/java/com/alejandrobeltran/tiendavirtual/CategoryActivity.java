package com.alejandrobeltran.tiendavirtual;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class CategoryActivity extends AppCompatActivity {

    private ArrayList<Category> listCategory = new ArrayList<>();
    private RecyclerView rvCategorys;
    private FloatingActionButton ft_agregar_category;
    private Category iconCategory = new Category();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        loadFakeDataCategory();

        rvCategorys = findViewById(R.id.rv_category_main);
        CategoryActivity myAdapterCategory = new CategoryActivity(listCategory);
        rvCategorys.setAdapter(myAdapterCategory);

        ft_agregar_category = findViewById(R.id.btn_agregar_category);
        ft_agregar_category.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CategoryActivity.this, FormCategoryActivity.class);
                startActivity(intent);
            }
        });

    }
    private void loadFakeDataCategory() {
        Category category1 = new Category("Ropa y Moda","red" ,"https://github.com/DavidDIaz0504/imges/blob/main/ropa.png?raw=true\n" );
        Category category2 = new Category("Electronica","green" ,"https://raw.githubusercontent.com/DavidDIaz0504/imges/main/Electronica.png");
        Category category3 = new Category("Hogar y Jardin","blue" ,"https://raw.githubusercontent.com/DavidDIaz0504/imges/main/Hogar%20y%20Jardin.png" );
        Category category4 = new Category("Salud y Belleza","yellow" ,"https://github.com/DavidDIaz0504/imges/blob/main/Salud%20y%20Belleza.png?raw=true" );
        Category category5 = new Category("Deportes y Aire Libre","pink" ,"https://raw.githubusercontent.com/DavidDIaz0504/imges/main/Deportes%20y%20aire%20libre.png" );

        listCategory.add(category1);
        listCategory.add(category2);
        listCategory.add(category3);
        listCategory.add(category4);
        listCategory.add(category5);

    }


}