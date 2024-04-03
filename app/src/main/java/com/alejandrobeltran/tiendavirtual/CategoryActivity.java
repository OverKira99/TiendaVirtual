package com.alejandrobeltran.tiendavirtual;

import android.os.Bundle;

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

    private Category iconCategory = new Category();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        loadFakeDataCategory();

        //FloatingActionButton fab = findViewById(R.id.fab);
        //fab.setOnClickListener(new View.OnClickListener() {
            //@Override
           // public void onClick(View view) {
               // Intent intent = new Intent(CurrentActivity.this, FormCategoryActivity.class);
               // startActivity(intent);
           // }
       // });//


    }

    private void loadFakeDataCategory() {
        Category category1 = new Category("Ropa y Moda","red" ,"" );
        Category category2 = new Category("Electronica","green" ,"");
        Category category3 = new Category("Hogar y Jardin","blue" ,"" );
        Category category4 = new Category("Salud y Belleza","yellow" ,"" );
        Category category5 = new Category("Deportes y Aire Libre","pink" ,"" );

        listCategory.add(category1);
        listCategory.add(category2);
        listCategory.add(category3);
        listCategory.add(category4);
        listCategory.add(category5);

    }


}