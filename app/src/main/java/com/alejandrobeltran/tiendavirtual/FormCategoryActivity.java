package com.alejandrobeltran.tiendavirtual;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class FormCategoryActivity extends AppCompatActivity {

    private Button btnCancel;

    private Toolbar topAppBarCategory;
    private Button btnAgregarCategoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form_category);
        btnCancel= findViewById(R.id.btn_cancel_category);
        btnAgregarCategoria = findViewById(R.id.btn_crear_category);
        topAppBarCategory = findViewById(R.id.top_app_bar_list_category);



        btnAgregarCategoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(FormCategoryActivity.this,   "Se Guardo La Categoria", Toast.LENGTH_SHORT).show();
            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              finish();
            }
        });


    }


}